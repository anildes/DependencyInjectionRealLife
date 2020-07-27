<%@page import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Bulb Status!</title>
</head>
<body>
    <h2 class="hello-title">Bulb is ${status}!</h2>

     
 <FORM NAME="form1" METHOD="POST" Action="BulbStatus" id="BulbForm">
 <INPUT TYPE="BUTTON" VALUE="GroundFloorSwitch" ONCLICK="button1()"/>
 <INPUT TYPE="hidden" id="GroundFloorSwitch1" name="GroundFloorSwitch1" value="true"/>
 <INPUT TYPE="BUTTON" VALUE="TopFloorSwitch" ONCLICK="button2()"/>
 <INPUT TYPE="hidden" id="TopFloorSwitch1" name="TopFloorSwitch1" value="true"/>
 
 
    </FORM>

    <SCRIPT LANGUAGE="JavaScript">
        function button1()
        {
           document.getElementById("GroundFloorSwitch1").value=true;
           document.getElementById("BulbForm").submit();
       
          
        } 
        
        function button2()
        {
           document.getElementById("TopFloorSwitch1").value=false;
           document.getElementById("BulbForm").submit();
          
        } 
        
     </SCRIPT>
 </body>
</html>