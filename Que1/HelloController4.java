//Develop an application using SpringMVC.
//
//try to read employee Information(empno,name,designation,sal ..etc) from the keyboard
//
//and display on webpage


package com.java;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class HelloController4{

 
  //Model m

  @RequestMapping("/hello")
  public String display(@RequestParam("empno") String empno, @RequestParam("name") String name ,@RequestParam("designation") String  designation ,@RequestParam("sal") Double sal, @RequestParam("userName") String userName,@RequestParam("pass") String pass,Model m)

  {
	  
    if(pass.equals("admin"))

    {

      String msg=empno;
      String msg0=name;
      String msg1=" "+designation;
     String msg2=""+sal;
    

      //add a message to the model

      m.addAttribute("empno", msg);
      m.addAttribute("name",msg0);
      m.addAttribute("designation",msg1);
      m.addAttribute("sal",msg2);
      
      return "viewpage";

    }

    else

    {

      String msg="Sorry "+name+". You entered an incorrect password";

      m.addAttribute("message", msg);

      return "errorpage";

    }

  }

}



