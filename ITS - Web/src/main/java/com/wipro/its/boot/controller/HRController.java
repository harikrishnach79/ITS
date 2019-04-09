package com.wipro.its.boot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.its.boot.bean.CandidateBean;
import com.wipro.its.boot.bean.HRPanelBean;
import com.wipro.its.boot.bean.InterviewScheduleBean;
import com.wipro.its.boot.repository.HRPanelBeanRepository;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class HRController {

	@Autowired
	HRPanelBeanRepository hrPanelBeanRepository;

	@GetMapping("/viewcandidates/{empHRID}")
	public List<CandidateBean> getCandidates(@PathVariable String empHRID) {
		return hrPanelBeanRepository.viewCandidates(empHRID);
	}

	@PostMapping("/submitresults/{interviewID}/{empHRrating}")
	public int submitR(@PathVariable String interviewID, @PathVariable Integer empHRrating) {
		return hrPanelBeanRepository.submitRatings(interviewID, empHRrating);
	}

	@GetMapping("/viewresults/{interviewID}")
	public InterviewScheduleBean viewFinalResults(@PathVariable String interviewID) {
		return hrPanelBeanRepository.getFinalResults(interviewID);
	}

	@GetMapping("/viewinterviews/{empHRID}")
	public List<InterviewScheduleBean> getInterviews(@PathVariable String empHRID) {
		return hrPanelBeanRepository.viewInterviews(empHRID);
	}
	
	@PostMapping("inserthr")
	public void insertHR(@RequestBody HRPanelBean hRPanelBean){
		hrPanelBeanRepository.save(hRPanelBean);
	}
	
	@GetMapping("gethr/{id}")
	public Optional<HRPanelBean> getCandidate(@PathVariable(value = "id") String id) {
		return hrPanelBeanRepository.findById(id);
	}
}
