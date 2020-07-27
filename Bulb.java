package com.realworld.dependencyIn;

import org.springframework.stereotype.Component;

@Component
public class Bulb {
	
	public GroundFloorSwitch groundFloorSwitch;
	public TopFloorSwitch topFloorSwitch;
	
	
	//When you set by property in xml it looks for a setter method  as shown below then we need the set<classname of the bean>
	
	
	/*
	 * <bean id="Bulb" class="com.realworld.dependencyIn.Bulb"> <property
	 * name="groundFloorSwitch" > <ref local="GrndFlrSwitch"/> </property> </bean>
	 */
	

	public void setGroundFloorSwitch(GroundFloorSwitch groundFloorSwitch){
	this.groundFloorSwitch =groundFloorSwitch;
	}
	
	
	public void setTopFloorSwitch(TopFloorSwitch topFloorSwitch){
		this.topFloorSwitch =topFloorSwitch;
		}
		
	
	
    public boolean isBulbstatus() {
		return bulbstatus;
	}

	public void setBulbstatus(boolean bulbstatus) {
		this.bulbstatus = groundFloorSwitch.setStatus(bulbstatus);
	}

	boolean bulbstatus;
    
    
}