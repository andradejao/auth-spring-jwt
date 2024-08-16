package br.com.authjwt.responses;

public class LoginResponse {

	private String token;
	private long expiresIn;

	public String getToken() {
		return token;
	}

	public LoginResponse setToken(String token) {
		this.token = token;
		return this;
	}
	public long getExpiresIN() {
		return expiresIn;
	}
	
	public LoginResponse setExpiresIn(long expiresIn) {
		this.expiresIn = expiresIn;
		return this;
	}
	
	public String toString() {
		return "LoginResponse{token='"+token+"',expiresIn='"+expiresIn+"'}";
	}
}
