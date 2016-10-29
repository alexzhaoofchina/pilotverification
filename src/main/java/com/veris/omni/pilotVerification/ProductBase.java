package com.veris.omni.pilotVerification;

import java.util.ArrayList;
import java.util.List;

public abstract class ProductBase {

	private static final long serialVersionUID = 6329272403298261075L;
	protected String defaultProdOfferingId;
	protected OfferCollection offer;
	protected String prodModelId;
	protected String prodModelName;
	// pop stat splash 类型未确定 added by lizhen
	protected Object[] pop;
	protected Object[] stat;
	protected Object [] splash;
	
	public ProductBase()
	{
	}


	@SuppressWarnings("unchecked")
	public final <T extends OfferBase> ArrayList<T> GetOffers()
	{
		/*
		return (from o in this.getOffers() where o instanceof T select o).<T>Cast().<T>ToList();
		*/
		List<T> temp = new ArrayList<T>();
		
		for (OfferBase offerbase : this.getOffers())
		{		
			try
			{
				if (offerbase != null)
					temp.add((T)offerbase);
			}
			catch(Exception e)
			{}
			
		}
		
		return (ArrayList<T>) temp;
	}


	public final String getDefaultOfferId()
	{
		return this.defaultProdOfferingId;
	}

	public final String getId()
	{
		return this.prodModelId;
	}

	public final String getName()
	{
		return this.prodModelName;
	}

	public final OfferCollection getOffers()
	{
		return ((this.offer != null) ? this.offer : new OfferCollection());
	}

	
	//getter and setter add by lizhen
	public String getDefaultProdOfferingId() {
		return defaultProdOfferingId;
	}

	public void setDefaultProdOfferingId(String defaultProdOfferingId) {
		this.defaultProdOfferingId = defaultProdOfferingId;
	}

	public OfferCollection getOffer() {
		return offer;
	}

	public void setOffer(OfferCollection offer) {
		this.offer = offer;
	}

	public String getProdModelId() {
		return prodModelId;
	}

	public void setProdModelId(String prodModelId) {
		this.prodModelId = prodModelId;
	}

	public String getProdModelName() {
		return prodModelName;
	}

	public void setProdModelName(String prodModelName) {
		this.prodModelName = prodModelName;
	}

	public Object[] getPop() {
		return pop;
	}

	public void setPop(Object[] pop) {
		this.pop = pop;
	}

	public Object[] getStat() {
		return stat;
	}

	public void setStat(Object[] stat) {
		this.stat = stat;
	}

	public Object[] getSplash() {
		return splash;
	}

	public void setSplash(Object[] splash) {
		this.splash = splash;
	}
	
}
