package com.veris.omni.pilotVerification;

public abstract class BusinessObject<T extends BusinessObjectBase> extends BusinessObjectBase
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -810953504417542760L;

	protected BusinessObject()
	{
	}

	public abstract BusinessCollectionBase<T> CreateEmptyCollection();
	protected final boolean StringToBoolean(String value)
	{
		if (value.isEmpty())
		{
			return false;
		}
		
		return Boolean.parseBoolean(value);
	}

	protected final java.math.BigDecimal StringToDecimal(String value)
	{
		if (value.isEmpty())
		{
			return new java.math.BigDecimal("0");
		}
		
		return new java.math.BigDecimal(value);
	}

	protected final int StringToInt(String value)
	{
		if (value.isEmpty())
		{
			return 0;
		}

		return Integer.parseInt(value);
	}

}