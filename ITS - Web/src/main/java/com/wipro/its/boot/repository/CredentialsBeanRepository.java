package com.wipro.its.boot.repository;

import com.wipro.its.boot.bean.CredentialsBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public abstract interface CredentialsBeanRepository
  extends JpaRepository<CredentialsBean, String>
{
  @Query("select p from CredentialsBean p where p.userID =:userID and p.password=:password")
  public abstract CredentialsBean validate(@Param("userID") String paramString1, @Param("password") String paramString2);
  
  @Modifying
  @Transactional
  @Query("update CredentialsBean p set p.password=:password, p.loginStatus=1 where p.userID =:userID")
  public abstract void changePwd(@Param("userID") String paramString1, @Param("password") String paramString2);
}