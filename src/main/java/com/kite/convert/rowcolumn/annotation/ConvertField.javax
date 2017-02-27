package com.kite.convert.rowcolumn.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * 类ConvertField的实现描述：用于标注行转bean是针对属性名称不对应使用 
 * @author pengliang 2017年2月27日 上午10:54:18
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ConvertField {
	
	/**
	 * 
	 * @return 数据库字段名称
	 */
	public String fieldName();

}
