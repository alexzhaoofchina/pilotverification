package com.veris.omni.pilotVerification;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.commons.lang.StringUtils;

public class OmniEnumMapper<T> {

	private HashMap<String, String> _enumMemberAttributeValues = new HashMap<String, String>();
	private Class _clazz;

	public OmniEnumMapper(Class enumClazz)
	{
		_clazz = enumClazz;
		this.InitializeEnumMemberAttributeValues(enumClazz);
	}

	public T DefinedCast(Object enumValue)
	{
		return (T)enumValue;
	}

	private void InitializeEnumMemberAttributeValues(Class enumClazz)
	{
        Field[] fields = enumClazz.getFields();       
        for(int i = 0; i<fields.length; i++){  	
        	EnumValue enumValue = (EnumValue)fields[i].getAnnotation(EnumValue.class);
        	
        	if (enumValue != null && StringUtils.isNotBlank(enumValue.value()))
        	{
        		_enumMemberAttributeValues.put(fields[i].getName(), enumValue.value());
        	}
        }
	}

	public boolean IsDefined(Object enumValue)
	{
		return true;
	}

	public T Parse(String enumValue) throws Exception
	{
		T local = null;
		local = this.TryParseInternal(enumValue);		
		if (local == null)
		{
			throw new Exception(String.format("{0} is not a defined value for enum type {1}", enumValue, _clazz.getName()));
		}
		return local;
	}

	public T Parse(String enumValue, T defaultValue)
	{
		T local = null;
		local = this.TryParseInternal(enumValue);		
		if (local == null)
		{
			return defaultValue;
		}
		return local;
	}

	public T ParseLong(String enumValue, T defaultValue)
	{
		T local = defaultValue;
		return local;
	}

	public T ParseNullable(String enumValue, T defaultValue)
	{
		String enumName = this.ResolveEnumName(enumValue);
		
		if (StringUtils.isNotBlank(enumName)){
			return (T) Enum.valueOf(_clazz, enumName);
		}
		
		return null;
	}

	private String ResolveEnumName(String enumText)
	{
      for (Entry<String, String> entry : _enumMemberAttributeValues.entrySet()) {    	  
    	  if (entry.getValue().equals(enumText)){
    		  return entry.getKey();    		  
    	  }
      }
		return StringUtils.EMPTY;
	}

	public String ToEnumString(Object enumValue)
	{
		return this._enumMemberAttributeValues.getOrDefault(enumValue.toString(), "");		
	}

	public String ToEnumString2(Object enumValue)
	{
		//请求方需把枚举类型的具体值传入
		if (enumValue != null){
			return this.ToEnumString(enumValue);
		}
		
		return StringUtils.EMPTY;
	}

	
	@SuppressWarnings("unchecked")
	private T TryParseInternal(String enumText)
	{
		if (StringUtils.isBlank(enumText))
		{
			return null;
		}
		
		String enumName = this.ResolveEnumName(enumText);
		if (StringUtils.isNotBlank(enumName)){
			return (T) Enum.valueOf(_clazz, enumName);
		}
		
		return null;
	}
	
}
