package com.manager.controller;

import com.jfinal.core.Controller;
import com.jfinal.ext.route.ControllerBind;

@ControllerBind(controllerKey = "test")  //绑定 http://localhost/hello
public class TestController extends Controller{
	  
    public void index() {  
		String msg ="welcome to JFinal World!!!test ";
		setAttr("HelloWorld", msg);
		
        render("/hello.html");  
    }  
  
    public void hello() {  
    	//http://localhost/hello/hello
        renderText("hello() Hello JFinal World.");  
    } 
}
