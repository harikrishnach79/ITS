package com.wipro.its.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.its.boot.bean.CandidateBean;
import com.wipro.its.boot.bean.InterviewScheduleBean;
import com.wipro.its.boot.bean.TechPanelBean;

public interface TechPanelBeanRepository extends JpaRepository<TechPanelBean, String> {

	@Query("select p from CandidateBean p where p.candidateID IN (select s.candidateID from InterviewScheduleBean s where s.techID = :TechID)")
	public List<CandidateBean> viewCandidates(@Param("TechID") String TechID);

	@Modifying
	@Transactional
	@Query("update InterviewScheduleBean i set i.techRating = :techRating where i.interviewID = :interviewID")
	public int submitRatings(@Param("interviewID") String interviewID, @Param("techRating") Integer techRating);

	@Query("select i from InterviewScheduleBean i where i.interviewID = :interviewID")
	public InterviewScheduleBean getFinalResults(@Param("interviewID") String interviewID);

	@Query("select s from InterviewScheduleBean s where s.techID =:techID")
	public List<InterviewScheduleBean> viewInterviews(@Param("techID") String techID);
}
