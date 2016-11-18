package com.ugur.yeter.struts.action;

import com.ugur.yeter.struts.service.TutorialFinderService;

public class TutorialAction {
	private String bestTutorialSite;

	public String execute() {
		TutorialFinderService service = new TutorialFinderService();
		bestTutorialSite = service.getBestTutorialSite();
		// System.out.println("Returend value" + retVal);
		return "success";

	}

	public String getBestTutorialSite() {
		return bestTutorialSite;
	}

	public void setBestTutorialSite(String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}

}
