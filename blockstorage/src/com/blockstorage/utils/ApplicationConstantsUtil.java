package com.blockstorage.utils;

public final class ApplicationConstantsUtil {
	


	public static String LOYLTY_AGRMNT_SELECT= "loyaltyAgreementSelect";

	public static String FILEPATH="C:\\Users\\abc\\Desktop\\temp\\";
	
	public static String EXCELPATH="C:\\Users\\abc\\Desktop\\temp\\excel\\";

	public static String IMAGE_PATH="E:\\BEprojects\\Assignmentworkspace2018-10\\blockchain\\appanalysis\\WebContent\\resources\\img\\";
	
	public static String ADK_COMMAND="C:\\Users\\abc\\AppData\\Local\\Android\\Sdk\\build-tools\\28.0.3\\aapt d permissions ";
	
	private ApplicationConstantsUtil() {
	}

	public final static String ERROR = "error";
	
	public final static String USER_ROLES = "userRoles";
	public final static char CHAR_Y = 'Y';
	public final static String STRING_Y = "Y";
	public final static String STRING_N = "N";
	public final static String YES = "Yes";
	public final static String NO = "No";

	// Match Criteria
	public final static String MC_BEGINS_WITH = "BeginsWith";
	public final static String MC_EQUAL = "Equal";
	public final static String MC_NOT_EQUAL = "NotEqual";
	public final static String MC_CONTAINS = "Contains";
	public final static String MC_NOT_CONTAINS = "NotContains";
	public final static String MC_IS_NULL = "IsNull";
	public final static String MC_IS_NOT_NULL = "IsNotNull";
	public final static String MC_BETWEEN = "Between";
	public final static String MC_IN = "In";
	public static final String MC_LESS_THAN = "lessThan";
	public static final String MC_GREATER_THAN = "GreaterThan";

	public final static String CANNOT_DEACTIVATE = "canNotDeactivate";
	public final static String FILE_ATTACHED = "attached";
	public final static String IMPORT_SUCCESS = "success";
	public final static String IMPORT_FAILED = "failed";
	public final static String SUCCESSFULL = "SUCCESSFUL";
	public final static String FAILED = "FAILED";
	public final static String FINALIZED = "FINALIZED";
	public final static String NO_RECORDS_FOUND = "NO_RECORDS_FOUND";
	public final static String PROCEDURE_ERR_MESSAGE = "NO_ERROR";
	public final static String FILE_IMPORTED = "IMPORTED";

	public final static String NUMBER_PATTERN = "[+-]?[\\d,]+\\.?\\d+";

	public final static String NUMERIC_PATTERN = "^([0-9]*|\\d*\\.\\d{1}?\\d*)$";

	
	// common
	public static final String ASCENDING = "ascending";
	public static final String DESCENDING = "descending";
	public static final String COUNTRY = "Country";
	public static final String NORMAL = "Normal";
	public static final String MC_LESS_THAN_EQUAL = "LessThanOrEqual";
	public static final String MC_GREATER_THAN_EQUAL = "GreaterThanOrEqual";
	
	

	//System Roles
	
	public static final Integer ADMIN_ROLE = new Integer(1);
	public static final Integer USER_ROLE = new Integer(2);
	public static final Integer OFFICER_ROLE = new Integer(3);

	//Admin role
	public static final String SELECTED_ROLE_ID = "selectedRoleId";
	// Source Type
	public static final Integer SOURCE_SELF_REPORTEED = 59;
	public static final Integer RELATIONSHIP_TYPE_PHY_BIO_INFO = 62;
	public static final Integer ROLE_TYPE_PARTICIPANT = 8;
	public static final Integer UNITED_STATES_CODE = 293;
	public static final String TIMEZONE = "TimeZone";
	public static final String Y = "Y";
	public static final String DATE_FORMAT = "MM/dd/yyyy";
	public static final String MC_LIKE = "Like";

	// Common VIEW Name
	public static final String FAILURE = "failure";

	public static final String ACTIVE = "Active";
	public static final String INACTIVE = "InActive";
	public static final String APPROVED = "Approved";
	public static final String REJECT = "Reject";
	public static final String APPLIED = "Applied";
	public static final String REQUESTED = "Requested";
	public static final String GRANTED = "Granted";
	public static final String SENT = "Sent";


	public static final String COMMONPROPBO_ACTIVE = "commonPropBo.active";
	public static final String COMMONPROPBO_CREATED_DATE = "commonPropBo.createdDate";
	
	public final static Integer INT_CONSTANT_ONE = 1;
	public final static Integer INT_CONSTANT_ZERO = 0;

	public static final String OPEN = "Open";

	public static final String ACKNOWLEDGE = "Seen";
	public static final String USER_ACTIVATION_SUBJECT = "Account Activation Confirmation";
	public static final String		USER_CODE_EMAIL_BODY	= "<html></body>Dear FirstName ,"
			+ "<p>You are now official User with us."
			+"<br>Username is: <b>userid</b>."
			+ "<br>Your Password is: <b>PAASWORD</b>."
			+ "<br><br>Should you require any assistance, please do not hesitate to contact us on admin@ecops.com"
			+ "<p>Regards,<br/>Ecops Team</p>"
			+ "<p><em>Note: This is automated email notification from ecops Portal. Please do not reply to this email.</em></p></body></html>";

}
