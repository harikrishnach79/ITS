package com.wipro.its.boot.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.its.boot.bean.CandidateBean;

public interface CandidateBeanRepository extends JpaRepository<CandidateBean, String> {

	@Query("Select p from CandidateBean p where p.primaryskills=:skills and p.experience=:experience and p.qualification=:qualification")
	ArrayList<CandidateBean> getCandidate(@Param("skills") String skills, @Param("experience") Integer experience,
			@Param("qualification") String qualification);

	// @Query("update p from CandidateBean p where p.")
	@Query("Select p from CandidateBean p where p.candidateID=:id")
	CandidateBean getCandidateById(@Param(value = "id") String id);

	@Transactional
	@Modifying
	@Query("delete from CandidateBean p where p.candidateID=:id")
	int deleteCandidateById(@Param(value = "id") String id);
}
