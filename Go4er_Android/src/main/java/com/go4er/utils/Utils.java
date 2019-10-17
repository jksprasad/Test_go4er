package com.go4er.utils;

public class Utils {
	
	//Welcome Screen and Skip Options
	public static String welcome_Next = "//android.widget.Button[@resource-id='go4er.llc.user:id/next']";
	public static String welcome_Header = "//android.widget.TextView[@resource-id='go4er.llc.user:id/header']";
	public static String welcome_Skip = "//android.widget.TextView[@resource-id='go4er.llc.user:id/skip']";
	public static String allow_Loc = "//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']";
	public static String loc_Permission = "//android.widget.TextView[@resource-id='com.android.packageinstaller:id/permission_message']";
	
	//Login Screen ENvironment Selection
	public static String app_Logo = "//android.widget.ImageView[@resource-id='go4er.llc.user:id/logo']";
	public static String sel_DevEnv = "//android.widget.LinearLayout[@resource-id='go4er.llc.user:id/ll_dev_env']";
	public static String sel_ProdEnv = "//android.widget.LinearLayout[@resource-id='go4er.llc.user:id/ll_prod_env']";
	
	//Links on Login Screen
	public static String email_Field = "//android.widget.EditText[@resource-id='go4er.llc.user:id/email_edit_text']";
	public static String psw_Field = "//android.widget.EditText[@resource-id='go4er.llc.user:id/password_edit_text']";
	public static String signin_button = "//android.widget.Button[@resource-id='go4er.llc.user:id/sign_in']";
	public static String signup_Link = "//android.widget.TextView[@resource-id='go4er.llc.user:id/sign_up']";
	public static String forgotpwd_link = "//android.widget.TextView[@resource-id='go4er.llc.user:id/forgot_password']";
	public static String skip4now_link = "//android.widget.TextView[@resource-id='go4er.llc.user:id/skip_for_login']";
	
	//Create Package Screen Links
	public static String packscreen_Header = "//android.widget.TextView[@resource-id='go4er.llc.user:id/quote_label']";
	public static String package_Name = "//android.widget.EditText[@resource-id='go4er.llc.user:id/packageDetail']";
	public static String fragile = "//android.widget.LinearLayout[@resource-id='go4er.llc.user:id/fragile_layout']";
	public static String select_Pieces = "//android.widget.LinearLayout[@resource-id='go4er.llc.user:id/packagesize_layout']";
	public static String est_Value = "//android.widget.EditText[@resource-id='go4er.llc.user:id/estimated_value']";
	public static String Pack_Size = "//android.widget.LinearLayout[@resource-id='go4er.llc.user:id/title_layout']";
	public static String max_PackSize = "//android.widget.TextView[contains(text(),'Approximate Package Weight')]";
	public static String pack_Weight = "//android.widget.TextView[@resource-id='go4er.llc.user:id/package_weight']";
	public static String pack_Length = "//android.widget.EditText[@resource-id='go4er.llc.user:id/package_length']";
	public static String pack_Width = "//android.widget.EditText[@resource-id='go4er.llc.user:id/package_width']";
	public static String pack_Height = "//android.widget.EditText[@resource-id='go4er.llc.user:id/package_height']";
	public static String resp_LoadYes = "//android.widget.RadioButton[@resource-id='go4er.llc.user:id/rb_load_yes']";
	public static String resp_LoadNo = "//android.widget.RadioButton[@resource-id='go4er.llc.user:id/rb_load_no']";
	public static String resp_UnloadYes = "//android.widget.RadioButton[@resource-id='go4er.llc.user:id/rb_unload_yes']";
	public static String resp_UnloadNo = "//android.widget.RadioButton[@resource-id='go4er.llc.user:id/rb_unload_no']";
	public static String upload_Image = "//android.widget.ImageView[@resource-id='go4er.llc.user:id/package_image']";
	public static String pack_Next1 = "//android.widget.TextView[@resource-id='go4er.llc.user:id/step_1_next']";
	
	
}
