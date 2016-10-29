package com.veris.omni.pilotVerification;

public class OfferBase extends BusinessObject<OfferBase>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2982543966075037022L;
	protected String agentDescription;
	protected String catalogId;
	protected String categoryId;
	protected String description;
	protected java.util.Date effectiveDate = new java.util.Date(0);
	protected java.util.Date expireDate = new java.util.Date(0);
	protected String identifyCode;
	protected boolean isDefault;
	protected String longName;
	protected String payType;
	protected String prodOfferingId;
	protected String prodOfferingName;
	protected String shortName;
	protected String showOrder;
	protected String type;

	protected String offerCode;
	protected String pageReference;
	protected String prodModelId;
	

	public OfferBase()
	{
	
	}



	@Override
	public BusinessCollectionBase<OfferBase> CreateEmptyCollection()
	{
		return new OfferCollection();
	}


	public final String getAgentDescription()
	{
		return this.agentDescription;
	}


	public final String getCategoryId()
	{
		return this.categoryId;
	}


	public final String getDescription()
	{
		return this.description;
	}

	public String getId()
	{
		return this.prodOfferingId;
	}

	public final String getIdentifyCode()
	{
		return this.identifyCode;
	}

	public final boolean getIsDefault()
	{
		return this.isDefault;
	}

	public final String getLongName()
	{
		return this.longName;
	}


	public final String getName()
	{
		return this.prodOfferingName;
	}

	public final Iterable<String> getSellingPoints()
	{
		/*
		SellingPointCollection points = (this.sellingPointDefineList != null) ? this.sellingPointDefineList : new SellingPointCollection();
		return (from x in points select x.Content).<String>ToList();
		*/
		return null;
	}

	public final String getShortName()
	{
		return this.shortName;
	}

	public final int getShowOrder()
	{
		return super.StringToInt(this.showOrder);
	}


	public String getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}


	public java.util.Date getEffectiveDate() {
		return effectiveDate;
	}
	

	public java.util.Date getExpireDate() {
		return expireDate;
	}

	//getter and setter added by lizhen
	public String getProdOfferingId() {
		return prodOfferingId;
	}

	public void setProdOfferingId(String prodOfferingId) {
		this.prodOfferingId = prodOfferingId;
	}

	public String getProdOfferingName() {
		return prodOfferingName;
	}

	public void setProdOfferingName(String prodOfferingName) {
		this.prodOfferingName = prodOfferingName;
	}

	public void setAgentDescription(String agentDescription) {
		this.agentDescription = agentDescription;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setIdentifyCode(String identifyCode) {
		this.identifyCode = identifyCode;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}


	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public void setShowOrder(String showOrder) {
		this.showOrder = showOrder;
	}

	public void setType(String type) {
		this.type = type;
	}


	public String getOfferCode() {
		return offerCode;
	}

	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
	}

	public String getPageReference() {
		return pageReference;
	}

	public void setPageReference(String pageReference) {
		this.pageReference = pageReference;
	}

	public String getProdModelId() {
		return prodModelId;
	}

	public void setProdModelId(String prodModelId) {
		this.prodModelId = prodModelId;
	}
	
	
	
}