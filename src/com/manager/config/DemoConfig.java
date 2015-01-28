package com.manager.config;

import org.bee.tl.ext.jfinal.BeetlRenderFactory;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.ext.route.AutoBindRoutes;

/**   
 * 类名称：DemoConfig   
 * 类描述：jfinal配置
 * 创建人：chenjun    yhisland@163.com
 * 创建时间：2015年1月28日 下午7:41:12   
 * 修改人：chenjun    yhisland@163.com    
 * 修改时间：2015年1月28日 下午7:41:12   
 * 修改备注：        
 *    
 */ 

	/**
	 * API引导式配置
	 */
public class DemoConfig extends JFinalConfig {
	
	/**
	 * 配置常量
	 */
	public void configConstant(Constants me) {
		// 加载少量必要配置，随后可用getProperty(...)获取值
		loadPropertyFile("a_little_config.txt");
		//  加载 beetl 
		me.setMainRenderFactory(new BeetlRenderFactory());
		me.setDevMode(true);  
	//	me.setDevMode(getPropertyToBoolean("devMode",true));//效果同上
	}
	
	/**
	 * 配置路由   自动绑定路由
	 */
	public void configRoute(Routes me) {
		me.add(new AutoBindRoutes());
//      me.add("/hello", com.manager.controller.HelloWorldController.class);  		
	}
	
	/**
	 * 配置插件
	 */
	public void configPlugin(Plugins me) {
/*		// 配置C3p0数据库连接池插件
		C3p0Plugin c3p0Plugin = new C3p0Plugin(
				getProperty("jdbcUrl"),
				getProperty("user"),
				getProperty("password").trim(),"oracle.jdbc.driver.OracleDriver");
		me.add(c3p0Plugin);
		
		// 添加自动绑定model与表插件
		AutoTableBindPlugin atbp = new AutoTableBindPlugin(c3p0Plugin,SimpleNameStyles.LOWER);   
		atbp.setShowSql(true);		
		atbp.setDialect(new OracleDialect());
		atbp.setContainerFactory(new CaseInsensitiveContainerFactory());// 配置属性名(字段名)大小写不敏感容器工厂
		me.add(atbp);*/
	}
	
	/**
	 * 配置全局拦截器
	 */
	public void configInterceptor(Interceptors me) {
		//登录全局拦截器
		//me.add(new LoginInterceptor());  
	}
	
	/**
	 * 配置处理器
	 */
	public void configHandler(Handlers me) {
		//me.add(new SessionHandler());
	}
	
	/**
	 * 建议使用 JFinal 手册推荐的方式启动项目
	 * 运行此 main 方法可以启动项目，此main方法可以放置在任意的Class类定义中，不一定要放于此
	 */
	public static void main(String[] args) {
		JFinal.start("WebRoot", 80, "/", 5);
	}
}
