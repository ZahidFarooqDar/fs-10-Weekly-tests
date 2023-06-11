package com.org.geekster;
public class GeeksterApplication {

	public static void main(String[] args) {

		//prepare to send mail
		HandleMail mailer = new HandleMail();
		mailer.sendMail();
		System.out.println("Email send successfully!!!");
	}

}
