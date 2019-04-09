package com.wipro.its.boot.controller;

import com.wipro.its.boot.bean.CredentialsBean;
import com.wipro.its.boot.bean.LoginRequest;
import com.wipro.its.boot.bean.LoginResponse;
import com.wipro.its.boot.repository.CredentialsBeanRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.web.bind.annotation.CrossOrigin(origins = { "http://localhost:4200" }, maxAge = 3600L)
@RestController
public class LoginController {
	@org.springframework.beans.factory.annotation.Autowired
	CredentialsBeanRepository credentialsBeanRepository;

	public LoginController() {
	}

	@PostMapping({ "/login" })
	public LoginResponse login(@RequestBody LoginRequest loginRequest) {
		LoginResponse loginResponse = new LoginResponse(404, "F", 0);
		String username = loginRequest.getUserID();
		String password = loginRequest.getPassword();
		CredentialsBean cb = credentialsBeanRepository.validate(username, password);
		String loginType = cb.getUserType();
		int loginStatus = cb.getLoginStatus();
		if ((loginType.equals("A")) || (loginType.equals("T")) || (loginType.equals("H"))) {
			loginResponse.setStatus(200);
			loginResponse.setLoginType(loginType);
			loginResponse.setLoginStatus(loginStatus);
		}
		return loginResponse;
	}

	@PostMapping({ "/changepassword" })
	public void changePassword(@RequestBody LoginRequest loginRequest) {
		credentialsBeanRepository.changePwd(loginRequest.getUserID(), loginRequest.getPassword());
	}
}