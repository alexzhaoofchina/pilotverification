package com.veris.omni.pilotVerification;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.commons.lang.StringUtils;

public class EnumMapper {

	private static HashMap<String, String> _enumMemberAttributeValues = new HashMap<String, String>();

	@SuppressWarnings("rawtypes")
	private static void InitializeEnumMemberAttributeValues(Class enumClazz)
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

	@SuppressWarnings("rawtypes")
	public static <T> T Parse2(String enumValue, T enumClass) throws Exception
	{
		T local = null;
		local = EnumMapper.<T>TryParseInternal(enumValue, enumClass);		
		if (local == null)
		{
			throw new Exception(String.format("{0} is not a defined value for enum type {1}", enumValue, ((Enum)enumClass).getClass().getName()));
		}
		return local;
	}

	@SuppressWarnings("rawtypes")
	public static <T> T Parse(String enumValue, T defaultValue)
	{
		EnumMapper.InitializeEnumMemberAttributeValues(((Enum)defaultValue).getClass());
		
		T local = EnumMapper.<T>TryParseInternal(enumValue, defaultValue);		

		if (local == null){
			return defaultValue;
		}
		
		return local;
	}

	public <T> T ParseLong(String enumValue, T defaultValue)
	{
		T local = defaultValue;
		return local;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public <T> T ParseNullable(String enumValue, T defaultValue)
	{
		String enumName = EnumMapper.ResolveEnumName(enumValue);
		
		if (StringUtils.isNotBlank(enumName)){
			return (T) Enum.valueOf(((Enum)defaultValue).getClass(), enumName);
		}
		
		return null;
	}

	private static String ResolveEnumName(String enumText)
	{
      for (Entry<String, String> entry : _enumMemberAttributeValues.entrySet()) {    	  
    	  if (entry.getValue().equals(enumText)){
    		  return entry.getKey();    		  
    	  }
      }
		return StringUtils.EMPTY;
	}

	@SuppressWarnings({ "rawtypes" })
	public static <T> String ToEnumString(T enumValue)
	{
		EnumMapper.InitializeEnumMemberAttributeValues(((Enum)enumValue).getClass());
		return EnumMapper._enumMemberAttributeValues.getOrDefault(enumValue.toString(), "");		
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static <T> T TryParseInternal(String enumText, T enumValue)
	{
		if (StringUtils.isBlank(enumText))
		{
			return null;
		}
		
		String enumName = EnumMapper.ResolveEnumName(enumText);
		if (StringUtils.isNotBlank(enumName)){
			return (T) Enum.valueOf(((Enum)enumValue).getClass(), enumName);
		}	
		return null;
	}
}
