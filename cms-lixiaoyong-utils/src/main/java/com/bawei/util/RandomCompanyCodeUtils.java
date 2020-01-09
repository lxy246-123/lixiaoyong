package com.bawei.util;
/**
 * startNumber:为前缀
 * 产生11位随机码
 * @author Administrator
 *
 */
public class RandomCompanyCodeUtils {
	/**
	 * 
	 * @param startNumber 企业码前缀
	 * @param k产生k位随机整数字符串
	 * @return
	 */
	public static String getCompanyCode(String startNumber,int k) {
	StringBuffer buffer=new StringBuffer();
	int num[] = new int[k];
	for (int i = 0; i <num.length; i++) {
		num[i] = (int) (10 * (Math.random()));
		buffer.append(num[i]);
	}
	return startNumber + buffer.toString();
	}
}
