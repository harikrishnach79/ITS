package com.wipro.its.boot.controller;

import com.wipro.its.boot.bean.InterviewScheduleBean;
import com.wipro.its.boot.repository.InterviewScheduleBeanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins={"http://localhost:4200"}, maxAge=3600L)
@RestController
public class InterviewController
{
  @Autowired
  InterviewScheduleBeanRepository interviewScheduleBeanRepository;
  
  public InterviewController() {}
  
  @PostMapping({"assignScheduleHR"})
  public int assignScheduleHR(@RequestBody InterviewScheduleBean interviewScheduleBean)
  {
    return interviewScheduleBeanRepository.updateHR(interviewScheduleBean.getCandidateID(), 
      interviewScheduleBean.getEmpHRID());
  }
  
  @PostMapping({"assignScheduleTR"})
  public void assignScheduleTR(@RequestBody InterviewScheduleBean interviewScheduleBean) {
    interviewScheduleBeanRepository.save(interviewScheduleBean);
  }
  
  @PostMapping({"result/{candidateID}/{result}"})
  public int result(@PathVariable String candidateID, @PathVariable String result) {
    return interviewScheduleBeanRepository.sendResults(candidateID, result);
  }
  
  @PostMapping({"/submitfinalresults/{interviewID}/{empHRrating}"})
  public int submitR(@PathVariable String interviewID, @PathVariable String empHRrating)
  {
    return interviewScheduleBeanRepository.submitRatings(interviewID, empHRrating);
  }
  
  @GetMapping({"getinterviews"})
  public java.util.List<InterviewScheduleBean> getinterviews() {
    return interviewScheduleBeanRepository.findAll();
  }
}