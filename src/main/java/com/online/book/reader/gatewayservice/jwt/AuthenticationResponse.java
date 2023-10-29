package com.online.book.reader.gatewayservice.jwt;

public class AuthenticationResponse {

	private String access_token;
	private String expiresIn;

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(String expiresIn) {
		this.expiresIn = expiresIn;
	}

	public AuthenticationResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AuthenticationResponse(String access_token, String expiresIn) {
		super();
		this.access_token = access_token;
		this.expiresIn = expiresIn;
	}
	

}
