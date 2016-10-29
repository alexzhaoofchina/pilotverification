package com.veris.omni.pilotVerification;

public class DeviceOffer extends OfferBase
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1579300556149036208L;

	public DeviceOffer()
	{
	}


//ORIGINAL LINE: public DeviceOffer(string name, string id, string identifyCode, int commitmentPeriod, OfferStatus status, string showOrder, IList<Price> prices, IList<SellingPoint> sellingPoint = null)

	public final boolean getDeliveryPriceExists()
	{
//C# TO JAVA CONVERTER TODO TASK: Lambda expressions and anonymous methods are not converted by C# to Java Converter:
		/*
		return (super.getPrices().size()<Price>(x => (x.BackEndType == BackEndPriceType.Delivery)) == 1);
		*/
		return true;
	}


	public final boolean getIsImeiRequired()
	{
		/*
		String attributeValue = super.getAttributeGroups().GetAttributeValue(OfferAttributeType.DeviceImeiRequiredFromUPC);
		return (!DotNetToJavaStringHelper.isNullOrEmpty(attributeValue) && attributeValue.equals("y", StringComparison.InvariantCultureIgnoreCase));
		*/
		return true;
	}


	public final boolean getUpfrontPriceExists()
	{
//C# TO JAVA CONVERTER TODO TASK: Lambda expressions and anonymous methods are not converted by C# to Java Converter:
		/*
		return (super.getPrices().size()<Price>(x => (x.BackEndType == BackEndPriceType.OneTime)) == 1);
		*/
		return true;
	}
}
