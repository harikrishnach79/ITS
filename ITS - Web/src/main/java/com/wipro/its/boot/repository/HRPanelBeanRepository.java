package com.wipro.its.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.its.boot.bean.CandidateBean;
import com.wipro.its.boot.bean.HRPanelBean;
import com.wipro.its.boot.bean.InterviewScheduleBean;

public interface HRPanelBeanRepository extends JpaRepository<HRPanelBean, String> {

	@Query("select p from CandidateBean p where p.candidateID IN (select s.candidateID from InterviewScheduleBean s where s.empHRID = :empHRID)")
	public List<CandidateBean> viewCandidates(@Param("empHRID") String empHRID);

	@Modifying
	@Transactional
	@Query("update InterviewScheduleBean i set i.empHRrating = :empHRrating where i.interviewID = :interviewID")
	public int submitRatings(@Param("interviewID") String interviewID, @Param("empHRrating") Integer empHRrating);

	@Query("select i from InterviewScheduleBean i where i.interviewID = :interviewID")
	public InterviewScheduleBean getFinalResults(@Param("interviewID") String interviewID);

	@Query("select s from InterviewScheduleBean s where s.empHRID = :empHRID")
	public List<InterviewScheduleBean> viewInterviews(@Param("empHRID") String empHRID);
}
