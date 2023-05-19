// ----------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.
// Licensed under the MIT license.
// ----------------------------------------------------------------------------

package com.embedsample.appownsdata.config;

/**
 * Configuration class
 */
public abstract class Config {
	
	// Set this to true, to show debug statements in console
	public static final boolean DEBUG =  true;
	
	//	Two possible Authentication methods: 
	//	- For authentication with master user credential choose MasterUser as AuthenticationType.
	//	- For authentication with app secret choose ServicePrincipal as AuthenticationType.
	//	More details here: https://aka.ms/EmbedServicePrincipal
//	public static final String authenticationType = "MasterUser";
//	
//	//	Common configuration properties for both authentication types
//	// Enter workspaceId / groupId
//	public static final String workspaceId = "e38000fa-a016-4b35-bf39-c0412561d6ba";
//
//	// The id of the report to embed.
//	public static final String reportId = "02e03cc7-82cb-4463-9d7a-61ace2cd9901";
//
//	// Enter Application Id / Client Id
//	public static final String clientId = "ab6b2d8f-21db-43c1-b73b-004ff24968d8";
//
//	// Enter MasterUser credentials
//	public static final String pbiUsername = "userpowerbi@powerbiembedfortest.onmicrosoft.com";
//	public static final String pbiPassword = "Tuwa7121";
//
//	// Enter ServicePrincipal credentials
//	public static final String tenantId = "ae55bc92-c749-417d-a485-da6585b3d923";
//	public static final String appSecret = "Btu8Q~pnbU.niLKtgMs-dxron19oYd7cQyTnUbIc";
	
	
	public static final String authenticationType = "ServicePrincipal";
	
	//	Common configuration properties for both authentication types
	// Enter workspaceId / groupId
	public static final String workspaceId = "aa268e53-dfbd-4a98-a664-1dfbfe6993bf";

	// The id of the report to embed.
	public static final String reportId = "a234afb0-7edd-462c-bbe6-bded980e9250";

	// Enter Application Id / Client Id
	public static final String clientId = "90aa49f7-00c5-423a-88f9-a5bb3c08deb8";


	// Enter ServicePrincipal credentials
	public static final String tenantId = "396b38cc-aa65-492b-bb0e-3d94ed25a97b";
	public static final String appSecret = "s9m8Q~sDjTm16Lg4HsH-y4ArWLIqq649pkGE2bDz";
	
 	public static final String pbiUsername = "";
	public static final String pbiPassword = "";
		
	//	DO NOT CHANGE
	public static final String authorityUrl = "https://login.microsoftonline.com/";
	public static final String scopeBase = "https://analysis.windows.net/powerbi/api/.default";
	
	
	private Config(){
		//Private Constructor will prevent the instantiation of this class directly
		throw new IllegalStateException("Config class");
	}
	
}