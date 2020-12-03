function dateValidaton(date)
{
   date=document.getElementById(date).value;
   alert(date);
   var dateRegEx=/^[0-9.]+@[A-Z0-9.-]+\.[A-Z]{2,4}$/i;
   

}
function mobileValidity()
{
  
  mobno=document.editmanagerprofileform.mno.value;
  
  if(mobno=="")
  {
      document.getElementById("mspan").innerHTML="<font color='red' >Its Required</font>";
      document.editmanagerprofileform.mno.focus();
  }
  else if(isNaN(mobno)==true)
  {
     document.getElementById("mspan").innerHTML="<font color='red' >Mobile No can't be Alphabet</font>";
     document.editmanagerprofileform.mno.focus();
  }
  else if(mobno.length!=10)
  {
     document.getElementById("mspan").innerHTML="<font color='red' >Should be 10 digits</font>";
     document.editmanagerprofileform.mno.focus();
  }
   else
   {
    document.getElementById("mspan").innerHTML="<font color='red' ></font>";
   }
}
function numberValidity(number,span)
{
    //alert("number");
    num=document.getElementById(number).value;
    alert(num);
    if(isNaN(num)==true)
    {
       document.getElementById(span).innerHTML="<font color='red' >Alphabets are not Allowed</font>";
       document.getElementById(number).focus();
    }
    else
    {
       document.getElementById(span).innerHTML="<font color='red' >8888888888888888</font>";
    }
}
function emailValidity(email,span)
{
    var emailRegEx=/^[A-Z0-9.+%+-]+@[A-Z0-9.-]+\.[A-Z]{2,4}$/i;
    var emaill=document.getElementById(email).value;
    //alert(emaill);
    if(emaill=="")
    {
       	    document.getElementById(span).innerHTML="<font color='red' >Its Required, Fill it</font>";
            document.getElementById(email).focus();
    }
    else if(emaill.search(emailRegEx)==-1)
    {
      	    document.getElementById(span).innerHTML="<font color='red' >Enter Valid Email Id</font>";
            document.getElementById(email).focus();
    }
    else
    {
      	    document.getElementById(span).innerHTML="<font color='red' ></font>";
    }
}

function onlyAlphabets(e, t,span)
 {
       // alert("1");
            try 
            {
                if (window.event) 
                {
                    var charCode = window.event.keyCode;
                }
                else if (e) 
                {
                    var charCode = e.which;
                }
                else { return true; }
                if ((charCode > 64 && charCode < 91) || (charCode > 96 && charCode < 123)|| (charCode==255))
                {
                 document.getElementById(span).innerHTML="";
                  return true;
                  }
                else
                {
                 document.getElementById(span).innerHTML="<font color='red' >Should be alphabetic</font>";
             
                 return false;
            }
            }
            catch (err)
             {
                alert(err.Description);
            }
}

function setFocusOn(text)
{
   t=document.getElementById(text);
   t.focus();
}

function fill(text,span)
{
   t=document.getElementById(text);
   if(t.value=="")
   {   
       	    document.getElementById(span).innerHTML="<font color='red' >Its Required, Fill it</font>";
       	    //t.focus();
   }
   else
   {
            document.getElementById(span).innerHTML="";
   }
   
 }

function getObject()
{
	var obj;
	if(window.XMLHttpRequest)
		{
		obj=new XMLHttpRequest();
		}
	else if(window.ActiveXObject())
		{
		obj=new ActiveXObject("Microsoft.XMLHTTP");
		}
	return obj;
}


function userLoginMethod()
{
//alert("inside js in user login method");
	    var ut=document.loginform.ut.value;
	    var un=document.loginform.un.value;
	    var up=document.loginform.up.value;
	    alert(ut);
	    if(un=="" || up=="" || ut=="select")
	    {
	     document.getElementById("loginspan").innerHTML="";
	    
		 if(up=="")
	     {
	         document.getElementById("passspan").innerHTML="Its Required";
	           document.loginform.up.focus();
	     }
	     if(un=="")
	      {
	                    document.getElementById("unspan").innerHTML="Its Required";
	                    document.loginform.un.focus();
	      }
	      if(ut=="select")
	      {
	                   document.getElementById("utspan").innerHTML="Its Required";
	                    document.loginform.ut.focus();
	      }
	   }
	   
	   else
	   {
		obj=getObject();
		obj.onreadystatechange=handleUserLogin;
		
		obj.open("post","LoginServlet?ut="+ut+"&un="+un+"&up="+up,true);
		obj.send();
	    }
}
function handleUserLogin()
{
	if(obj.readyState==4 || obj.readyStatus==200)
		{
		if(obj.responseText=="1")
			{
			   document.location="AdminHome.jsp";
			}
		else if(obj.responseText=="2")
			{
			    document.location="ManagerHome.jsp";
			}
		else if(obj.responseText=="3")
		     {
	        	document.location="EmployeeHome.jsp";
		     }
		else
      		 {
			    document.getElementById("loginspan").innerHTML="<font color='red'>Wrong UserName Or Password</font>";
			    document.loginform.un.focus();
			    document.getElementById("unspan").innerHTML="";
	            document.getElementById("passspan").innerHTML="";
	                    
		     }
		}
}
function managerRegisterMethod()
{
	
	var mn=document.managerregistrationform.mn.value;
	var meid=document.managerregistrationform.meid.value;
	var department=document.managerregistrationform.department.value;
	if(mn==""|| meid==""|| department=="")
	{
			   document.getElementById("managerregistrationspan").innerHTML="Fill Each Field";
			   if(mn=="")
			   {
			     document.managerregistrationform.mn.focus();
			   }
			   else if(meid=="")
			   {
			      document.managerregistrationform.meid.focus();
			  }
			  else
			  {
			  document.managerregistrationform.department.focus();
			  }
	}
	else
	{
	obj=getObject();
	obj.onreadystatechange=handleManagerRegistration;
	obj.open("post","ManagerRegistrationServlet?mn="+mn+"&meid="+meid+"&department="+department,true);
	obj.send();
	}
}
function handleManagerRegistration()
{
	if(obj.readyState==4 || obj.readyStatus==200)
		{
		  k=parseInt(obj.responseText);
		  if(k==1)
			  {
			   document.getElementById("managerregistrationspan").innerHTML="<font color='green'>Manager Registered.........</font>";
	            document.managerregistrationform.mn.value="";
				document.managerregistrationform.meid.value="";
				document.managerregistrationform.department.value="";
				document.getElementById("espan").innerHTML="";
				document.managerregistrationform.department.focus();			
			  }
		  else
			  {
			  document.getElementById("managerregistrationspan").innerHTML="Manager not Registered";
			  }
		}
		
} 
	function goingToEventServletViaJS()
	{
	   //  alert("I am Event");
	    var dt=document.eventshomeform.date.value;
		var t=document.eventshomeform.title.value;
		var v=document.eventshomeform.venue.value;
		var ti=document.eventshomeform.time.value;
		var dura=document.eventshomeform.duration.value;
		var des=document.eventshomeform.description.value;
		if(dt=="" || t==""||v=="" ||ti==""||dura==""||des=="")
		{
		       document.getElementById("addeventspan").innerHTML="Fill Each Field";
		}	 
		else
		{
		var k="";
		if(document.getElementById("admin").checked)
		{
		    k=k+" admin";
		}
		if(document.getElementById("manager").checked)
		{
		    k=k+" manager";
		}
		if(document.getElementById("employee").checked)
		{
		    k=k+" employee";
		}
		alert(dt+" "+t+" "+v+" "+ti+" "+dura+" "+des+" "+k);
		
		obj=getObject();
		obj.onreadystatechange=handleAddEvents;
		obj.open("post","AddEventServlet?date="+dt+"&title="+t+"&venue="+v+"&time="+ti+"&dur="+dura+"&des="+des+"&k="+k,true);
		obj.send();
		}
	}
	function handleAddEvents()
	{
		if(obj.readyState==4 || obj.readyStatus==200)
		{
		  k=parseInt(obj.responseText);
		  if(k==1)
			  {
			   document.getElementById("addeventspan").innerHTML="<font color='green'>Event Added........</font>";
			   document.eventshomeform.date.value="";
	           document.eventshomeform.title.value="";
            	document.eventshomeform.venue.value="";
            	document.eventshomeform.time.value="";
	            document.eventshomeform.duration.value="";
            	document.eventshomeform.description.value="";
			   
			  }
		  else
			  {
			  document.getElementById("addeventspan").innerHTML="Event is not Added";
			  }
	   }
	}
	function goingToUpdateEventServletViaJS()
	{
		var eid=document.modifyeventform.eid.value;
		var dt=document.modifyeventform.date.value;
		var t=document.modifyeventform.title.value;
		var v=document.modifyeventform.venue.value;
		var ti=document.modifyeventform.time.value;
		var dura=document.modifyeventform.duration.value;
		var des=document.modifyeventform.description.value;
		if(eid=="" || dt=="" || t=="" || v=="" || ti=="" || dura=="" || des=="")
		{
		  document.getElementById("updateeventspan").innerHTML="Each Field is Required";
		}
		else
		{
		obj=getObject();
		obj.onreadystatechange=handleUpdateEvent;
		obj.open("post","UpdateEventServlet?eid="+eid+"&date="+dt+"&title="+t+"&venue="+v+"&time="+ti+"&dur="+dura+"&des="+des,true);
		obj.send();
		}
	}
	function handleUpdateEvent()
	{
		if(obj.readyState==4 || obj.readyStatus==200)
		{
		  k=parseInt(obj.responseText);
		  if(k==1)
			  {
			   document.getElementById("updateeventspan").innerHTML="Event is Updated";
			  }
		  else
			  {
			  document.getElementById("updateeventspan").innerHTML="Event is not Updated";
			  }
	   }
	}
	function goingToAddVacancyServletViaJS()
	{
	//alert("Add Vacancy");
		var jt=document.addvacancyform.jtitle.value;
		var q=document.addvacancyform.qual.value;
		var e=document.addvacancyform.exp.value;
		var nov=document.addvacancyform.noofvac.value;
		var p=document.addvacancyform.pkg.value;
		var lastdate=document.addvacancyform.lastdate.value;
		if(jt==""|| q==""|| e==""||nov==""|| p==""||lastdate=="")
		{
		    if(jt=="")
		    {
			   document.getElementById("tspan").innerHTML="Its Required";
			   document.addvacancyform.jtitle.focus();
			}
			else if(q=="")
		    {
			   document.getElementById("qspan").innerHTML="Its Required";
			   document.addvacancyform.qual.focus();
			}
			else if(e=="")
		    {
			   document.getElementById("espan").innerHTML="Its Required";
			   document.addvacancyform.exp.focus();
			}
			else if(nov=="")
		    {
			   document.getElementById("nspan").innerHTML="Its Required";
			   document.addvacancyform.noofvac.focus();
			}
			else if(p=="")
		    {
			   document.getElementById("pspan").innerHTML="Its Required";
			   document.addvacancyform.pkg.focus();
			}
		
			else
			{
			   document.getElementById("dspan").innerHTML="Its Required";
			   document.addvacancyform.lastdate.focus();
			}
		}
		else
		{
		obj=getObject();
		obj.onreadystatechange=handleAddVacancy;
		obj.open("post","AddVacancyServlet?jt="+jt+"&qual="+q+"&exp="+e+"&noofvac="+nov+"&pkg="+p+"&date="+lastdate,true);
		obj.send();
		}
	}
	function handleAddVacancy()
	{
		if(obj.readyState==4 || obj.readyStatus==200)
		{
		  k=parseInt(obj.responseText);
		  if(k==1)
			  {
			  document.getElementById("addvacancyspan").innerHTML="<font color='green'>Vacancy Added.....</font>";
			  document.addvacancyform.jtitle.value="";
		      document.addvacancyform.qual.value="";
		      document.addvacancyform.exp.value="";
		      document.addvacancyform.noofvac.value="";
		      document.addvacancyform.pkg.value="";
		      document.addvacancyform.lastdate.value="";
		
			  }
		  else
			  {
			  document.getElementById("addvacancyspan").innerHTML="Vacancy is not Added";
			  }
	   }
	}
	function goingToModifyVacancyServletViaJS()
	{
	   alert("Modify Vacancy");
		var vid=document.addvacancyform.jid.value;
	
		var jt=document.addvacancyform.jtitle.value;
		var q=document.addvacancyform.qual.value;
		var e=document.addvacancyform.exp.value;
		var nov=document.addvacancyform.noofvac.value;
		var p=document.addvacancyform.pkg.value;
		var lastdate=document.addvacancyform.lastdate.value;
		if(jt==""|| q==""|| e==""||nov==""|| p==""||lastdate=="")
		{
		    if(jt=="")
		    {
			   document.getElementById("tspan").innerHTML="Its Required";
			   document.addvacancyform.jtitle.focus();
			}
			else if(q=="")
		    {
			   document.getElementById("qspan").innerHTML="Its Required";
			   document.addvacancyform.qual.focus();
			}
			else if(e=="")
		    {
			   document.getElementById("espan").innerHTML="Its Required";
			   document.addvacancyform.exp.focus();
			}
			else if(nov=="")
		    {
			   document.getElementById("nspan").innerHTML="Its Required";
			   document.addvacancyform.noofvac.focus();
			}
			else if(p=="")
		    {
			   document.getElementById("pspan").innerHTML="Its Required";
			   document.addvacancyform.pkg.focus();
			}
			else
			{
			   document.getElementById("dspan").innerHTML="Its Required";
			   document.addvacancyform.lastdate.focus();
			}
		}
		else
		{
		obj=getObject();
		obj.onreadystatechange=handleModifyVacancy;
		
		obj.open("post","ModifyVacancyServlet?vid="+vid+"&jt="+jt+"&qual="+q+"&exp="+e+"&noofvac="+nov+"&pkg="+p+"&date="+lastdate,true);
		obj.send();
	    }
	}
	function handleModifyVacancy()
	{
		if(obj.readyState==4 || obj.readyStatus==200)
		{
		  k=parseInt(obj.responseText);
		  if(k==1)
			  {
			   document.getElementById("addvacancyspan").innerHTML="<font color='green'>Vacancy Modified........</font>";
			  }
		  else
			  {
			  document.getElementById("addvacancyspan").innerHTML="Vacancy not Modified......";
			  }
	   }
	}
	function goingToAddBulletinServletViaJS()
	{

   	   var bt=document.addbulletinform.bul.value;
   	   if(bt=="")
   	    {
   	    	   document.getElementById("addbulletinspan").innerHTML="Enter Bulletin";
   	    	   document.addbulletinform.bul.focus();
		 }
		 else
		 {
		obj=getObject();
		obj.onreadystatechange=handleAddBulletin;
		
		obj.open("post","AddBulletinServlet?bulletin="+bt,true);
		obj.send();
		}
	}
	function handleAddBulletin()
	{
		if(obj.readyState==4 || obj.readyStatus==200)
		{
		  k=parseInt(obj.responseText);
		  if(k==1)
			  {
			   document.getElementById("addbulletinspan").innerHTML="<font color='green'>Bulletin Added......</font>";
			   document.addbulletinform.bul.value="";
			   document.addbulletinform.bul.focus();
			  }
		  else
			  {
			  document.getElementById("addbulletinspan").innerHTML="Bulletin is not Added";
			  }
	   }
	}
	function goingTOEmployeeRegisterationServletViaJS()
	{
		alert("inside js in emp registration");
		var en=document.employeeregistrationform.empn.value;
		var eid=document.employeeregistrationform.empeid.value;
		var department=document.employeeregistrationform.department.value;
		if(en==""|| eid==""|| department=="")
	{
			   document.getElementById("employeeregistrationspan").innerHTML="Fill Each Field";
			   if(en=="")
			   {
			     document.employeeregistrationform.en.focus();
			   }
			   else if(eid=="")
			   {
			      document.employeeregistrationform.eid.focus();
			  }
			  else
			  {
			  document.employeeregistrationform.department.focus();
			  
			  }
			 
	}
	else
	{
		
		obj=getObject();
		obj.onreadystatechange=handleEmployeeRegistration;
		
		obj.open("post","EmployeeRegistrationServlet?ename="+en+"&empeid="+eid+"&department="+department,true);
		obj.send();
		
	}
	}
	function handleEmployeeRegistration()
	{
		//alert("hello in ajajaj");
		if(obj.readyState==4 || obj.readyStatus==200)
			{
			  k=parseInt(obj.responseText);
			  if(k==1)
				  {
				  // alert("response come 1");
				  document.getElementById("employeeregistrationspan").innerHTML="<font color='green'>Employee Registered.......</font>";
				  document.employeeregistrationform.empn.value="";
	              document.employeeregistrationform.empeid.value="";
		          document.employeeregistrationform.department.value="";
	
				  }
			  else
				  {
				  document.getElementById("employeeregistrationspan").innerHTML="Employee not Registered";
				  }
			}
	}
function goingToAddMessageServletThroughJS()
	{
	//alert("hiiiiiiiiii");
	var u=document.sendmessageform.uname.value;
	var mt=document.sendmessageform.msgtit.value;
	var md=document.sendmessageform.msgdes.value;
	if(u=="")
	{
	         document.getElementById("uspan").innerHTML="<font color='red' > Its Required.....</font>";
	         document.sendmessageform.uname.focus();
	         
	}
	else
	{
    obj=getObject();
	obj.onreadystatechange=handleSendMessage;
	
	obj.open("post","SendMessageByAdminServlet?uname="+u+"&msgtit="+mt+"&msgdes="+md,true);
	obj.send();
	}
}
function handleSendMessage()
{
	if(obj.readyState==4 || obj.readyStatus==200)
	{
	  k=parseInt(obj.responseText);
	  if(k==1)
		  {
		     document.sendmessageform.uname.value="";
		     document.sendmessageform.msgtit.value="";
		     document.sendmessageform.msgdes.value="";
		     document.getElementById("mspan").innerHTML="";
		      document.getElementById("tspan").innerHTML="";
		       document.getElementById("uspan").innerHTML="";
		       //document.location="ManagerMessage.jsp";
		     document.getElementById("addmessagespan").innerHTML="<font color='green' >&#x2714; Message Sent.....</font>";
		     
		  }
	  else
		  {
		      document.getElementById("addmessagespan").innerHTML="<font color='red'>&#x2718; Wrong Username.....</font>";
		           document.getElementById("uspan").innerHTML="<font color='red'>&#x2718; </font>";
		           document.sendmessageform.uname.focus();
		  
		  }
	}
}

	function goingToRegisterAsBloodDonorByManagerServletViaJS()
	{
		alert("inside register as blood donor in js");
		var n=document.blooddonorregistrationbymanagerform.name.value;
		var c=document.blooddonorregistrationbymanagerform.cno.value;
		var d=document.blooddonorregistrationbymanagerform.dis.value;
		var b=document.blooddonorregistrationbymanagerform.bg.value;
		
		obj=getObject();
		obj.onreadystatechange=handleRegisterAsBloodDonorByManager;
		
		obj.open("post","RegisterAsBloodDonorByManagerServlet?n="+n+"&c="+c+"&d="+d+"&b="+b,true);
		obj.send();
	}
	function handleRegisterAsBloodDonorByManager()
	{
		if(obj.readyState==4 || obj.readyStatus==200)
		{
		  k=parseInt(obj.responseText);
		  if(k==1)
			  {
			   document.getElementById("registerasblooddonorspan").innerHTML="Registered succesfuly";
			  }
		  else
			  {
			  document.getElementById("registerasblooddonorspan").innerHTML="not Registered succesfuly";
			  }
		}
	}
	function goingToRegisterAsBloodDonorByEmployeeServletViaJS()
	{
		alert("inside register as blood donor in js");
		var n=document.blooddonorregistrationbyemployeeform.name.value;
		var c=document.blooddonorregistrationbyemployeeform.cno.value;
		var d=document.blooddonorregistrationbyemployeeform.dis.value;
		var b=document.blooddonorregistrationbyemployeeform.bg.value;
		
		obj=getObject();
		obj.onreadystatechange=handleRegisterAsBloodDonorByEmployee;
		
		obj.open("post","RegisterAsBloodDonorByEmployeeServlet?n="+n+"&c="+c+"&d="+d+"&b="+b,true);
		obj.send();
	}
	function handleRegisterAsBloodDonorByEmployee()
	{
		if(obj.readyState==4 || obj.readyStatus==200)
		{
		  k=parseInt(obj.responseText);
		  if(k==1)
			  {
			   document.getElementById("registerasblooddonorbyempspan").innerHTML="Registered succesfuly";
			  }
		  else
			  {
			  document.getElementById("registerasblooddonorbyempspan").innerHTML="not Registered succesfuly";
			  }
		}
	}
	function goingToApplyForLeaveServletViaJS()
	{
		alert("inside apply for leave in js");
		var f=document.leavebyemployeeform.from.value;
		var t=document.leavebyemployeeform.to.value;
	    var d=document.leavebyemployeeform.days.value;
		var r=document.leavebyemployeeform.reason.value;
		obj=getObject();
		obj.onreadystatechange=handleApplyForLeaveByEmployee;
		obj.open("post","ApplyForLeaveServlet?f="+f+"&t="+t+"&d="+d+"&r="+r,true);
		obj.send();
	}
	function handleApplyForLeaveByEmployee()
	{
		if(obj.readyState==4 || obj.readyStatus==200)
		{
		  k=parseInt(obj.responseText);
		  if(k==1)
			  {
			  document.getElementById("applyleavespan").innerHTML="aplied succesfuly.....";
			  document.leavebyemployeeform.from.value="";
		      document.leavebyemployeeform.to.value="";
	          document.leavebyemployeeform.days.value="";
		      document.leavebyemployeeform.reason.value="";
			  }
		  else if(k==2)
			  {
			  document.getElementById("applyleavespan").innerHTML="You cannot take more leaves.....";
			  }
		  else
		     {
		      document.getElementById("applyleavespan").innerHTML="Not applied......";
			 }
		}
	}
	function calculateNoOfDaysViaJS()
	{
		alert("inside calculate no of days in js");
		var f=document.leavebyemployeeform.from.value;
		var t=document.leavebyemployeeform.to.value;
	
		
		obj=getObject();
		obj.onreadystatechange=handleCalculateNoOfDays;
		
		obj.open("post","CalculateNoOfDaysServlet?f="+f+"&t="+t,true);
		obj.send();
	}
	function handleCalculateNoOfDays()
	{
		if(obj.readyState==4 || obj.readyStatus==200)
		{
		 document.leavebyemployeeform.days.value=obj.responseText;
		}
	}
	
	
	function goingToEditManagerProfileServletViaJS()
	{
		var n=document.editmanagerprofileform.n.value;
		var e=document.editmanagerprofileform.eid.value;
		var f=document.editmanagerprofileform.fn.value;
		var d=document.editmanagerprofileform.dob.value;
		var m=document.editmanagerprofileform.mno.value;
		var l1=document.editmanagerprofileform.l1.value;
		var l2=document.editmanagerprofileform.l2.value;
		var c=document.editmanagerprofileform.city.value;
		var s=document.editmanagerprofileform.st.value;
		var p=document.editmanagerprofileform.pcode.value;
		var bg=document.editmanagerprofileform.bg.value;
		if(n=="" || e==""||f==""||d==""||m==""||l1==""||l2==""||c==""||s==""||p==""||bg=="")
		{
		 document.getElementById("updatemanagerprofilespan").innerHTML="Each Field is Required";	  
        }
        else
        {
        obj=getObject();
		obj.onreadystatechange=handleUpdateManagerProfile;
		obj.open("post","EditManagerProfileServlet?n="+n+"&e="+e+"&f="+f+"&d="+d+"&m="+m+"&l1="+l1+"&l2="+l2+"&c="+c+"&s="+s+"&p="+p+"&bg="+bg,true);
		obj.send();
		}
	}
	function handleUpdateManagerProfile()
	{
		if(obj.readyState==4 || obj.readyStatus==200)
		{
		  k=parseInt(obj.responseText);
		  if(k==1)
			  {
			   document.getElementById("updatemanagerprofilespan").innerHTML="<font color='green'>Profile Updated.......</font>";

			  }
		  else
			  {
			  document.getElementById("updatemanagerprofilespan").innerHTML="Profile  is not Updated";
			  }
	   }
	}
	function goingToAddTechnicalDroughtsViaJS()
	{
	      var comment=document.commentform.comment.value;
	      if(comment=="")
	      {
	          document.getElementById("tspan").innerHTML="<font color='red'>Enter Comment</font>";
	          document.commentform.comment.focus();
	      }
	      else
	      {
	      obj=getObject();
	      obj.onreadystatechange=handleAddTechnicalDrought;
	      obj.open("post","AddTechnicalDroughtsServlet?comment="+comment,true);
	      obj.send();
	      }
	}
	function handleAddTechnicalDrought()
	{
		if(obj.readyState==4 || obj.readyStatus==200)
		{
	      document.getElementById("droughtsarea").innerHTML=obj.responseText;
	      document.getElementById("tspan").innerHTML="";
	      document.commentform.comment.value="";
	      document.commentform.comment.focus();
	    }
	}
	function fetchTechnicalDroughts()
	{
	//alert("1");
	    obj=getObject();
	    obj.onreadystatechange=handleFetchTechnicalDrought;
	    obj.open("post","FetchTechnicalDroughtServlet",true);
	    obj.send();
	}
	function handleFetchTechnicalDrought()
	{
		if(obj.readyState==4 || obj.readyStatus==200)
		{
		       document.getElementById("droughtsarea").innerHTML=obj.responseText;
		}
	}
		
	function goingToViewBulletinServletViaJS()
	{
	 //alert("hi");
	    obj=getObject();
	    obj.onreadystatechange=handleViewBulletin;
	    obj.open("post","ViewBulletinServlet",true);
	    obj.send();
	}
	function handleViewBulletin()
	{
		if(obj.readyState==4 || obj.readyStatus==200)
	     {
		       document.getElementById("bulletinarea").innerHTML=obj.responseText;
	     }
	}
	function goingToViewInboxServletViaJS()
	{
	//    alert("Inbox js");
	    obj=getObject();
	    obj.onreadystatechange=handleInbox;
	    obj.open("post","InboxServlet",true);
	    obj.send();
	}
	function handleInbox()
	{
		if(obj.readyState==4 || obj.readyStatus==200)
	     {
		       document.getElementById("inboxarea").innerHTML=obj.responseText;
	     }
	}
	function goingToViewSentItemsServletViaJS()
	{
	//    alert("Inbox js");
	    obj=getObject();
	    obj.onreadystatechange=handleSentItems;
	    obj.open("post","SentItemsServlet",true);
	    obj.send();
	}
	function handleSentItems()
	{
		if(obj.readyState==4 || obj.readyStatus==200)
	     {
		       document.getElementById("sentitemsarea").innerHTML=obj.responseText;
	     }
	}
	function checkNewMessagesViaJS()
	{
	    obj=getObject();
	    obj.onreadystatechange=handleCheckMessages;
	    obj.open("post","CheckMessageServlet",true);
	    obj.send(); 
	}
	function handleCheckMessages()
	{
	 if(obj.readyState==4 || obj.readyStatus==200)
	     {
	        
		       document.getElementById("messagecountarea").innerHTML=obj.responseText;
	     }
	}
	function viewEventsViaJS()
	{
	    obj=getObject();
	    obj.onreadystatechange=handleViewEvents;
	    obj.open("post","ViewEventServlet",true);
	    obj.send(); 
	}
	function handleViewEvents()
	{
     	if(obj.readyState==4 || obj.readyStatus==200)
	     {
	        
		       document.getElementById("eventsdiv").innerHTML=obj.responseText;
	     }
	}
	function viewAddEventsJsp()
	{
        //	alert("11111111");
		  document.location="AddEvents.jsp";
	}
	function modifyEventJsp()
	{
	//alert("111");
	    obj=getObject();
	    obj.onreadystatechange=handleViewModifyEvents;
	    obj.open("post","ViewModifyEventsServlet",true);
	    obj.send(); 
	}
	function handleViewModifyEvents()
	{
     	if(obj.readyState==4 || obj.readyStatus==200)
	     {
	        
		       document.getElementById("eventsdiv").innerHTML=obj.responseText;
	     }
	}
	function changeImage()
	{

	 document.getElementById("picuploader").style.visibility="visible";
	 document.getElementById("picuploadbt").style.visibility="visible";  
	}
    function maximumleaves()
    {
      //alert("max Leave");
        var maxleave=document.maxleaveform.maxleave.value;
        obj=getObject();
	    obj.onreadystatechange=handleMaximumLeave;
	    obj.open("post","MaximumLeaveServlet?maxleave="+maxleave,true);
	    obj.send(); 
	}
	function handleMaximumLeave()
	{
		if(obj.readyState==4 || obj.readyStatus==200)
		{
		  k=parseInt(obj.responseText);
		  if(k==1)
			  {
			   document.getElementById("maxarea").innerHTML="Leaves Updated.....";
			  }
		  else
			  {
			  document.getElementById("maxarea").innerHTML="Leaves not Updated......";
			  }
	   }
	}
	function deleteMessagesViaJs()
	{
	
	}
	function changeColor()
	{
	   //alert("222");
	   document.getElementById("color").style.color="red";
	}
function viewDonor()
{
//alert("view donor");
        var donor=document.viewdonorform.donor.value;
        obj=getObject();
	    obj.onreadystatechange=handleViewDonor;
	    obj.open("post","ViewDonorServlet?donor="+donor,true);
	    obj.send(); 
}
function handleViewDonor()
{
		if(obj.readyState==4 || obj.readyStatus==200)
		{
				       document.getElementById("donorarea").innerHTML=obj.responseText;
	    }  
}
function uploadCareerJs()
{
        obj=getObject();
	    obj.onreadystatechange=handleCareer;
	    obj.open("post","UploadCareerServlet",true);
	    obj.send(); 
    
}
function handleCareer()
	{
		if(obj.readyState==4 || obj.readyStatus==200)
		{
		  k=parseInt(obj.responseText);
		  if(k==1)
			  {
			   document.getElementById("carrerarea").innerHTML="Carrier Uploaded.....";
			  }
		  else
			  {
			  document.getElementById("carrerarea").innerHTML="Carrier not Uploaded......";
			  }
	   }
}
function yes()
{
//alert("Gallery");
	if(window.XMLHttpRequest)
    {
      xmlhttp=new XMLHttpRequest();
    }
    else
    {
       xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
    }    
    xmlhttp.onreadystatechange=handleImageRequest;
    xmlhttp.open("POST","FetchImage",true);
	xmlhttp.send();
}
function handleImageRequest()
{
	if(xmlhttp.readyState==4 && xmlhttp.status==200)
     {
		details=xmlhttp.responseText;
		var a="<table width='70%' align='center' cellpadding='1' cellspacing='1'><tr>";
        for(i=1;i<=details;i++)		 
		 {	
			a+="<td align='center' width='170'>";	 
			a+="<a class='example-image-link' data-lightbox='example-set' href='temp/A("+i+").png'>";
			a+="<img class='example-image' src='thumb/A("+i+").png' width='150' height='150'/>"; 	
			a+="</a>";
			a+="</td>";	 
			if(i%4==0)
			{
				 a+="</tr><tr>";
			}  
		 }
        a+="</tr></table>";
        document.getElementById("img-gallery").innerHTML=a;
	  }
}
function fileDownloadViaJs()
{
//alert("downloads");
        obj=getObject();
	    obj.onreadystatechange=handleDownload;
	    obj.open("post","ShowCareerFileServlet",true);
	    obj.send(); 
}
function handleDownload()
	{
		if(obj.readyState==4 || obj.readyStatus==200)
		{
			document.getElementById("careerspan").innerHTML=obj.responseText;
	    }
}
function clear()
{
//alert("claear");
    document.getElementById("area").innerHTML="";
    document.getElementById("area1").innerHTML="";
}
