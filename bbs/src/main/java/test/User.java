package test;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Repository;

@Repository
public class User {

	private String id;
	private String pwd;

	public String getUserId() {
		return id;
	}

	public void setUserID(String id) {
		this.id = id;
	}

	public String getUserPwd() {
		return pwd;
	}

	public void setUserPwd(String pwd) {
		this.pwd = pwd;
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(User.class, args);
	}

}
