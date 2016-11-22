package com.ugur.yeter.struts.action;

import com.ugur.yeter.struts.service.TutorialFinderService;

public class TutorialAction {
	private String bestTutorialSite;
	private String language;

	public String execute() {
		TutorialFinderService service = new TutorialFinderService();
		bestTutorialSite = service.getBestTutorialSite(language);
		// System.out.println("Returend value" + retVal);
		System.out.println("language:"+language );
		return "success";

	}

	public String getBestTutorialSite() {
		return bestTutorialSite;
	}

	public void setBestTutorialSite(String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
