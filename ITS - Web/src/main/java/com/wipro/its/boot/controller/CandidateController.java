package com.wipro.its.boot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.its.boot.bean.CandidateBean;
import com.wipro.its.boot.repository.CandidateBeanRepository;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class CandidateController {

	@Autowired
	CandidateBeanRepository candidateBeanRepository;

	// @PostMapping("users/login")
	// public LoginResponse login(@RequestBody LoginRequest loginRequest) {
	// return UserService.login(loginRequest);
	// }

	@GetMapping("message")
	public String message() {
		return "Test Message";
	}

	@GetMapping("candidates")
	public List<CandidateBean> getCandidates() {
		return candidateBeanRepository.findAll();
	}

	// Get-user By Id

	@GetMapping("candidates/{id}")
	public CandidateBean getCandidate(@PathVariable(value = "id") String id) {
		return candidateBeanRepository.getCandidateById(id);
	}

	// Delete-Candidate
	@DeleteMapping("candidates/{id}")
	public int deleteCandidate(@PathVariable(value = "id") String id) {
		return candidateBeanRepository.deleteCandidateById(id);
	}

	// Add-candidates
	@PostMapping("candidates")
	public void insertRecord(@RequestBody CandidateBean candidateBean) {
		candidateBeanRepository.save(candidateBean);
	}

	// no-disturb(update Candidate)

	@PutMapping("candidates/{id}")
	public void updateCandidate(@RequestBody CandidateBean candidateBean) {
		// User user = userRepository.findById(id).get();
		// CandidateBean cBean=candidateBeanRepository.findById(id);;
		candidateBeanRepository.save(candidateBean);
	}

	// View-selected candidates
	@GetMapping("candidates/{skills}/{experience}/{qualification}")
	ArrayList<CandidateBean> viewCandidate(@PathVariable String skills, @PathVariable Integer experience,
			@PathVariable String qualification) {
		ArrayList<CandidateBean> arrayList = candidateBeanRepository.getCandidate(skills, experience, qualification);
		return arrayList;

	}

}
