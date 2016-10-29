package com.veris.omni.pilotVerification;

public enum BackEndPriceType
{

	//[EnumMember(Value="4")]
	@EnumValue("4")
	Delivery(3),

	//[EnumMember(Value="12")]
	@EnumValue("12")
	DepositPrice(11),

	//[EnumMember(Value="99")]
	@EnumValue("99")
	Installment(12),

	//[EnumMember(Value="3")]
	@EnumValue("3")
	MinimumPrice(2),

	//[EnumMember(Value="10")]
	@EnumValue("10")
	NormalPrice(9),

	//[EnumMember(Value="1")]
	@EnumValue("1")
	OneTime(0),

	//[EnumMember(Value="2")]
	@EnumValue("2")
	Recurring(1),

	//[EnumMember(Value="5")]
	@EnumValue("5")
	Technician(4),

	//[EnumMember(Value="6")]
	@EnumValue("6")
	Timeslot1(5),

	//[EnumMember(Value="7")]
	@EnumValue("7")
	Timeslot2(6),

	//[EnumMember(Value="8")]
	@EnumValue("8")
	Timeslot3(7),

	//[EnumMember(Value="9")]
	@EnumValue("9")
	Timeslot4(8),

	//[EnumMember(Value="11")]
	@EnumValue("11")
	TransactionFee(10),
	Unknown(13);

	private int intValue;
	private static java.util.HashMap<Integer, BackEndPriceType> mappings;
	private synchronized static java.util.HashMap<Integer, BackEndPriceType> getMappings()
	{
		if (mappings == null)
		{
			mappings = new java.util.HashMap<Integer, BackEndPriceType>();
		}
		return mappings;
	}

	private BackEndPriceType(int value)
	{
		intValue = value;
		BackEndPriceType.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static BackEndPriceType forValue(int value)
	{
		return getMappings().get(value);
	}
}