package com.realworld.dependencyIn;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BulbController 
{
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
	Bulb bulb = ctx.getBean(Bulb.class);
	GroundFloorSwitch groundFloorSwitch = ctx.getBean(GroundFloorSwitch.class);
	TopFloorSwitch topFloorSwitch = ctx.getBean(TopFloorSwitch.class);
	 

	@RequestMapping(value="/BulbDetails")
	 public String Bulb()
	{	
     return "Bulb";
    }
	
	
	@PostMapping(value="/BulbStatus")
	public String BulbStat( Model model, @RequestParam("GroundFloorSwitch1")boolean status, @RequestParam("TopFloorSwitch1")boolean status1,HttpServletRequest request)
	//public String BulbStat( Model model, @RequestParam("TopFloorSwitch1")boolean status1,HttpServletRequest request)
	{
		
		Enumeration enumeration = request.getParameterNames();
        Map<String, Object> modelMap = new HashMap<>();
        while(enumeration.hasMoreElements()){
            String parameterName = (String) enumeration.nextElement();
            System.out.println("Request parametres ........."+parameterName);
            modelMap.put(parameterName, request.getParameter(parameterName));
        }
		
		
		if(status)
		{
			model.addAttribute("status",status);
			groundFloorSwitch.setStatus(status);
			bulb.setGroundFloorSwitch(groundFloorSwitch);
			System.out.println("GroundFloorSwitch1 is pressed.........................");
			
		}
				
		
		
		if(!status1)
		{
			System.out.println("TopFloorSwitch1 is pressed...............");
			status=false;
			bulb.setTopFloorSwitch(topFloorSwitch);
			topFloorSwitch.setStatus(status1);
			//if the status was set by Ground floor switch we have to set it False
			if(status)
			{
				status=false;
			}
			
			model.addAttribute("status",status);
		}
		
		return "Bulb";
	}
	
	
	
	@ModelAttribute("status")
	public boolean bulbstatus() {
       boolean status=false;
	    return status;
	}
	
	


}