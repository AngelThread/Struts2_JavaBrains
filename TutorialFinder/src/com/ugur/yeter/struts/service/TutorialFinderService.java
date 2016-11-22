package com.ugur.yeter.struts.service;

public class TutorialFinderService {
	
	public String getBestTutorialSite(String language){
		String retVal =null;
		if(language.equalsIgnoreCase("Java")){
			retVal  ="Java Brains";
		}else{
			retVal = "Language is not supported yet ";
		}
		return retVal;
	}

}
