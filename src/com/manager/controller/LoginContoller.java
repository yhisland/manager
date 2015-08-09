package com.manager.controller;

import java.lang.reflect.Method;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
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
			List<Login> list = Login.dao.gettotal();
//			renderJson(JsonKit.listToJson(list, 3));
		}
			
		//图形
		public void getList() throws Exception{
			String str="{}";
			JSONObject obj = new JSONObject();
		    obj=JSONObject.parseObject(getPara("where",str));
			int page=getParaToInt("page",1);
			int pagesize=getParaToInt("pagesize",20);
			String sortname = getPara("sortname");
			String sortorder = getPara("sortorder");
			List<Login> list = Login.dao.getList(page, pagesize, obj,sortname,sortorder);
			//反调listToJson
			Method method = JsonKit.class.getDeclaredMethod("listToJson", new Class[]{String.class,String.class});  
			method.setAccessible(true);
			Object data = method.invoke(new JsonKit(), list, 3);
		//	Object data = JsonKit.listToJson(list, 3);
			renderJson(data);
		}		
}
