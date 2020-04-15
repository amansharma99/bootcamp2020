package com.Bootcamp2020Project.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
public class ProjectApplication {

	@Autowired
	private TokenStore tokenStore;

	@GetMapping("/Logout")
	public String logout(HttpServletRequest request){
		String authHeader = request.getHeader("Authorization");
		if (authHeader != null) {
			String tokenValue = authHeader.replace("Bearer", "").trim();
			OAuth2AccessToken accessToken = tokenStore.readAccessToken(tokenValue);
			tokenStore.removeAccessToken(accessToken);
		}
		return "Logged out successfully";
	}

	@GetMapping("/")
	public String index(){
		return "Index";
	}

	@GetMapping("/admin/home")
	public String adminHome(){
		return "Admin's Home";
	}

	@GetMapping("/users/home")
	public String userHome(){
		return "User's Home";
	}

	@GetMapping("/customer/home")
	public String customerHome(){
		return "Customer's Home";
	}

	@GetMapping("/seller/home")
	public String sellerHome(){
		return "Seller's Home";
	}


	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

}
