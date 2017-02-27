package com.kite.convert.rowcolumn.util;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kite.convert.rowcolumn.annotation.ConvertField;
import com.kite.convert.rowcolumn.exception.ConvertException;

/**
 * 
 * 类RowMapConvertUtil的实现描述：针对多行为Map转javaBean工具类</br> 针对目前很多数据库设计考虑到后期增加字段，用新表采用行转列的方式添加字段设计
 * @author pengliang 2017年2月27日 上午11:33:51
 */
public class RowMapConvertUtil {

	private static final Logger LOG = LoggerFactory.getLogger(RowMapConvertUtil.class);
	
	public static <T> T rowConvertBean(Map<String, Object> rowMap, Class<T> clazz) {
		if (rowMap == null) {
			throw new NullPointerException("rowMap is null");
		}
		if (clazz == null) {
			throw new NullPointerException("clazz is null");
		}
		try {
			T result = clazz.newInstance();
			Field[] declaredFields = clazz.getDeclaredFields();
			if(declaredFields == null || declaredFields.length == 0) {
				return result;
			}
			for(Field field : declaredFields) {
				field.setAccessible(true);
				//是否包含指定注解
				ConvertField convertField = field.getAnnotation(ConvertField.class);
				//获得属性名称
				String fieldName = convertField != null ? convertField.fieldName() : field.getName();
				Object value = findValueByFieldName(fieldName, rowMap);
				field.set(result, value);
			}
			return result;
		} catch (InstantiationException | IllegalAccessException
				| SecurityException e) {
			LOG.error("rowConvertBean error:{}", e);
			throw new ConvertException(e);
		}
	}

	
	/**
	 * 根据字段名称获取
	 * @param fieldName	字段名称
	 * @param rows	         数据库对应行
	 * @return			字段名称对应的值
	 */
	private static Object findValueByFieldName(String fieldName,
			Map<String, Object> rowMap) {
		Set<Entry<String, Object>> entrySet = rowMap.entrySet();
		for(Entry<String, Object> entry : entrySet) {
			if(fieldName.equals(entry.getKey())) {
				return entry.getValue();
			}
		}
		return null;
	}
}
