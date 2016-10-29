package com.veris.omni.pilotVerification;

import java.util.ArrayList;

public abstract class BusinessCollectionBase<T extends BusinessObjectBase> extends ArrayList<T>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1929608677373425701L;
	protected String _jsonSource;

	protected BusinessCollectionBase()
	{
	}

	protected BusinessCollectionBase(ArrayList<T> collection)
	//publiic BusinessCollectionBase(ArrayList<T> collection)
	{
		super(collection);
	}




}