package us.feras.cl.demo;

import us.feras.cl.ClientLogin;

public class Main {
	public static void main(String[] args) {
		String auth = ClientLogin.getAuthToken("name@example.com", "password", "cl"/* Google Calendar */, "www.site.com");
		if (auth != null) {
			System.out.println("AuthToken is : " + auth);
		} else {
			System.out.println("An error has occurred.");
		}
	}

}
