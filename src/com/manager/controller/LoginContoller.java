package com.manager.controller;

import java.util.List;

import com.jfinal.core.Controller;
import com.jfinal.ext.route.ControllerBind;
import com.jfinal.kit.JsonKit;
import com.manager.model.Login;

/**   
 * 类名称：LoginContoller   
 * 类描述：jfinal测试类
 * 创建人：Administrator    
 * 创建时间：2015年1月28日 下午7:41:29   
 * 修改人：Administrator    
 * 修改时间：2015年1月28日 下午7:41:29   
 * 修改备注：        
 *    
 */ 
@ControllerBind(controllerKey = "login")
public class LoginContoller extends Controller {
		public void index (){
	        render("/login.htm");
        }
		public void searchAll(){
			List<Login> list	 = Login.dao.gettotal();
			renderJson(JsonKit.listToJson(list, 3));
		}
}
