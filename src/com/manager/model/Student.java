package com.manager.model;

import com.jfinal.ext.plugin.tablebind.TableBind;
import com.jfinal.plugin.activerecord.Model;

@TableBind(tableName= "student",pkName="id")
public class Student extends Model<Student> {
	private static final long serialVersionUID = 1L;
//	public static final Login dao = new Login();
    public static final Student dao = new Student();
}