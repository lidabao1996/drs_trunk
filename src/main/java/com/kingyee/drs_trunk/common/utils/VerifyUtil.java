package com.kingyee.drs_trunk.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
* @Description:  手机号校验
* 				 身份证号码校验
* 				 邮箱校验
* @Author:  wangzhong 2019/1/7 17:06
* @Version: 1.0
*/
public class VerifyUtil {

	//private static String phone_regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$";
	private static String phone_regex = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$";
	private static String cardNum_regex = "^(\\d{15}$)|(^\\d{17}([0-9]|X))$";
	private static String email_regex = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$";
	//private static Pattern P = Pattern.compile(phone_Regex);

	/**
	 * 方法说明: 手机号校验
	 * @Author wangzhong 2019/1/8 10:04
	 **/
	public static boolean checkPhone(String phone) {
		Pattern P = Pattern.compile(phone_regex);
		if (phone == null || phone.length() != 11) {
			return Boolean.FALSE;
		}
		Matcher m = P.matcher(phone);
		return m.matches();
	}

	/**
	 * 方法说明: 身份证号校验
	 * @Author wangzhong 2019/1/8 10:06
	 **/
	public static boolean checkCardNum(String cardNum) {
		Pattern P = Pattern.compile(cardNum_regex);
		if (cardNum == null || (cardNum.length() != 15 || cardNum.length() != 18 )){
			return Boolean.FALSE;
		}
		Matcher m = P.matcher(cardNum);
		return m.matches();
	}

	/**
	 * 方法说明: 邮箱格式校验
	 * @Author wangzhong 2019/1/8 10:06
	 **/
	public static boolean checkEmail(String email) {
		Pattern P = Pattern.compile(email_regex);
		if (email == null){
			return Boolean.FALSE;
		}
		Matcher m = P.matcher(email);
		return m.matches();
	}
}
