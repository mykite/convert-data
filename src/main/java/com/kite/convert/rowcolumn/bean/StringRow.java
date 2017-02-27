package com.kite.convert.rowcolumn.bean;


/**
 * 
 * 类StringRow的实现描述：基于String的属性名属性值字段 
 * @author pengliang 2017年2月27日 上午10:41:33
 */
public class StringRow extends Row<String>  {
	
	public StringRow() {
		super();
	}
	public StringRow(String fieldName, String fieldValue) {
		super();
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	/**
	 * 属性名称
	 */
	private String fieldName;
	
	/**
	 * 属性值
	 */
	private String fieldValue;
	
	public String getName() {
		return this.fieldName;
	}

	public String getValue() {
		return this.fieldValue;
	}

	
}
