package com.veris.omni.pilotVerification;

public enum OfferAttributeType
{
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
	//[EnumMember(Value="Available SIM card type")]
	@EnumValue("Available SIM card type")
	AvailableSimCardType(11),
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
	//[EnumMember(Value="duration")]
	@EnumValue("duration")
	ContractDuration(10),
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
	//[EnumMember(Value="OSE_AccessoriesType")]
	@EnumValue("OSE_AccessoriesType")
	DeviceAccessoriesType(4),
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
	//[EnumMember(Value="Brand")]
	@EnumValue("Brand")
	DeviceBrand(2),
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
	//[EnumMember(Value="Color")]
	@EnumValue("Color")
	DeviceColor(0),
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
	//[EnumMember(Value="Serial number relevant")]
	@EnumValue("Serial number relevant")
	DeviceImeiRequiredFromUPC(5),
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
	//[EnumMember(Value="Memory")]
	@EnumValue("Memory")
	DeviceMemory(1),
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
	//[EnumMember(Value="Model")]
	@EnumValue("Model")
	DeviceModel(3),
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
	//[EnumMember(Value="duration")]
	@EnumValue("duration")
	InstallmentCycleCount(9),
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
	//[EnumMember(Value="Offer Status")]
	@EnumValue("Offer Status")
	OfferStatus(8),
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
	//[EnumMember(Value="SubscriptionManagerCare Commitment")]
	@EnumValue("SubscriptionManagerCare Commitment")
	SubscriptionCommitmentPeriod(6),
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
	//[EnumMember(Value="SubscriptionManagerCare Commitment with Subsidy")]
	@EnumValue("SubscriptionManagerCare Commitment with Subsidy")
	SubscriptionCommitmentPeriodWithSubsidy(7);

	private int intValue;
	private static java.util.HashMap<Integer, OfferAttributeType> mappings;
	private synchronized static java.util.HashMap<Integer, OfferAttributeType> getMappings()
	{
		if (mappings == null)
		{
			mappings = new java.util.HashMap<Integer, OfferAttributeType>();
		}
		return mappings;
	}

	private OfferAttributeType(int value)
	{
		intValue = value;
		OfferAttributeType.getMappings().put(value, this);
	}

	public int getValue()
	{
		return intValue;
	}

	public static OfferAttributeType forValue(int value)
	{
		return getMappings().get(value);
	}
}
