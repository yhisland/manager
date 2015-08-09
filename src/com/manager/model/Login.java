package com.manager.model;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.jfinal.ext.plugin.tablebind.TableBind;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;

/**   
 * 类名称：Login   
 * 类描述：jfinal测试类
 * 创建人：Administrator    
 * 创建时间：2015年1月28日 下午7:41:48   
 * 修改人：Administrator    
 * 修改时间：2015年1月28日 下午7:41:48   
 * 修改备注：        
 *    
 */ 
@TableBind(tableName= "student",pkName="id")
public class Login extends Model<Login>{
	private static final long serialVersionUID = 1L;
	public static final Login dao = new Login();
	Page<Login>list;
	public List<Login> gettotal(){
		List<Login>  list1 = dao.find("select  *  from  student");
		System.out.println(list1);
		return list1;
	}
	
	//图形	
	public List<Login> getList(int page,int pagesize,JSONObject jObject,String sortname,String sortorder){
		List<Login> list = new ArrayList<Login>();
		String select="select id,name,age ";
		
		String sqlExceptSelect=" from  student "
						 +" where 1=1 ";

		StringBuffer  sb=new StringBuffer();
		sb.append(sqlExceptSelect);
		list = Login.dao.find(select+sb.toString());
		System.out.println(list);
		return  list;		
	}		

}
