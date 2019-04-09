package com.wipro.its.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.its.boot.bean.CandidateBean;
import com.wipro.its.boot.bean.InterviewScheduleBean;
import com.wipro.its.boot.repository.TechPanelBeanRepository;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class TechController {

	@Autowired
	TechPanelBeanRepository techPanelBeanRepository;

	@GetMapping("/viewtechcandidates/{TechID}")
	public List<CandidateBean> getCandidates(@PathVariable String TechID) {
		return techPanelBeanRepository.viewCandidates(TechID);
	}

	@PostMapping("/submittechresults/{interviewID}/{techRating}")
	public int submitR(@PathVariable String interviewID, @PathVariable Integer techRating) {
		return techPanelBeanRepository.submitRatings(interviewID, techRating);
	}

	@GetMapping("/viewtechresults/{interviewID}")
	public InterviewScheduleBean viewFinalResults(@PathVariable String interviewID) {
		return techPanelBeanRepository.getFinalResults(interviewID);
	}

	@GetMapping("/viewtechinterviews/{techID}")
	public List<InterviewScheduleBean> getInterviews(@PathVariable String techID) {
		return techPanelBeanRepository.viewInterviews(techID);
	}
}
