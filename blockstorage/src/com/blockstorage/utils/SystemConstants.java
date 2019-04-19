package com.blockstorage.utils;

public abstract class SystemConstants {

	public static final String BENEFICIARY_INACTIVE_STATUS ="INACTIVE";
	public static final String BENEFICIARY_ACTIVE_STATUS ="ACTIVE";
	
	public static final String AUTHENTICATION_FAILED ="Invalid UserName or Password";
	public static final String INPROGRESS="IN PROGRESS";
	
	public static final Boolean USER_DISABLED=false;
	public static final Integer ROLE_USER = new Integer(2);
	
	public static final String USER_ACTIVE_STATUS ="ACTIVE";
	public static final String USER_REJECT_STATUS="REJECT";
	public static final String USER_PENDING_STATUS ="PENDING";
	
	public static final String TRANSFER_PENDING_STATUS="PENDING";
	
	public static final String USER_ROLE="ROLE_USER";
	public static final String USER_ADMIN ="ROLE_ADMIN";
	public static final String USER_OFFICER="ROLE_OFFICER";
	
	public static final String		VERIFICATION_CODE_EMAIL_BODY	= "<html></body>Dear FirstName ,"
			+ "<p>Your Registration request has been processed."
			+"<br>Username is: <b>userid</b>."
			+ "<br>Your Verification code is: <b>autoGenCode</b>."
			+"<br> <a href='http://localhost:8080/appanalysis/useractivation.html'>Click here to activate</a>"
			+ "<br><br>Should you require any assistance, please do not hesitate to contact us on admin@shoppingmania.com"
			+ "<p>Regards,<br/>Shopping Mania Team</p>"
			+ "<p><em>Note: This is automated email notification from App Analysis Portal. Please do not reply to this email.</em></p></body></html>";
	
	public static final String 		VERIFICATION_CODE_EMAIL_SUBJECT = "User Registration Verification Code";
	
	
	
}
