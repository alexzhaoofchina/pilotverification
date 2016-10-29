package com.veris.omni.pilotVerification;

public abstract class BusinessObjectBase
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1787300302887133749L;
	private boolean _isValid = true;
	protected String _jsonSource;

	protected BusinessObjectBase()
	{
		System.out.print("hellop");
	}


	public boolean getIsValid()
	{
		return this._isValid;
	}
	public void setIsValid(boolean value)
	{
		this._isValid = value;
	}

}
