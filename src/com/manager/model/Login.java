package com.manager.model;

import java.util.List;

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
@TableBind(tableName= "shop_total",pkName="id")
public class Login  extends Model<Login>{
	  public   static final Login dao = new Login();
	  Page<Login>list;
	  public List<Login> gettotal(){
	      List<Login>  list1 = dao.find("select  *  from  shop_total");
		  return list1;
	  }

}
