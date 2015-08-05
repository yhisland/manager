package com.manager.controller;

import com.jfinal.core.Controller;
import com.jfinal.ext.route.ControllerBind;

@ControllerBind(controllerKey = "hello")  //绑定 http://localhost/hello
public class HelloWorldController extends Controller{
	  
    public void index() {  
		String msg ="welcome to JFinal World!!!2 ";
		setAttr("HelloWorld", msg);
		renderFreeMarker("helloworld.html");
		
//       render("/hello.html");  
    }  
  
    public void hello() {  
    	//http://localhost/hello/hello
        renderText("hello() Hello JFinal World.");  
    } 
}
