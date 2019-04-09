package com.wipro.its.boot.repository;

import com.wipro.its.boot.bean.InterviewScheduleBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public abstract interface InterviewScheduleBeanRepository
  extends JpaRepository<InterviewScheduleBean, String>
{
  @Modifying
  @Transactional
  @Query("update InterviewScheduleBean i set i.empHRID =:empHRID where i.candidateID =:candidateID ")
  public abstract int updateHR(@Param("candidateID") String paramString1, @Param("empHRID") String paramString2);
  
  @Modifying
  @Transactional
  @Query("update InterviewScheduleBean i set i.techID =:empTechID where i.interviewID =:interviewID ")
  public abstract int updateTR(@Param("interviewID") String paramString1, @Param("empTechID") String paramString2);
  
  @Modifying
  @Transactional
  @Query("update InterviewScheduleBean i set i.result =:result where i.candidateID =:candidateID ")
  public abstract int sendResults(@Param("candidateID") String paramString1, @Param("result") String paramString2);
  
  @Modifying
  @Transactional
  @Query("update InterviewScheduleBean i set i.result = :empHRrating where i.interviewID = :interviewID")
  public abstract int submitRatings(@Param("interviewID") String paramString1, @Param("empHRrating") String paramString2);
}