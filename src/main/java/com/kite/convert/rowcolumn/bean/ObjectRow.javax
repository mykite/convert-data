package com.kite.convert.rowcolumn.bean;

/**
 * 
 * 类ObjectRow的实现描述：针对属性值不确定类型使用 
 * @author pengliang 2017年2月27日 上午11:26:23
 */
public class ObjectRow extends Row<Object>{

	private String fieldName;
	
	private Object fieldValue;
	

	public ObjectRow(String fieldName, Object fieldValue) {
		super();
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public ObjectRow() {
		super();
	}

	@Override
	public String getName() {
		return this.fieldName;
	}

	@Override
	public Object getValue() {
		return this.fieldValue;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public Object getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(Object fieldValue) {
		this.fieldValue = fieldValue;
	}
	
	

}
