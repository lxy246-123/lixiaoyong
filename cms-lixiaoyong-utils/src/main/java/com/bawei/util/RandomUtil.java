package com.bawei.util;

import java.util.Random;

public class RandomUtil {
	
	private static long count = 1;
	/**
	 * 产生小于n的随机整数
	 * @param n
	 * @return
	 */
	public static int getRandomInt(int n) {
		Random random=new Random();
		int rn=random.nextInt(n);
		return rn;
	}
	
	/**
	 * 随机生成任意长度的数字
	 * @param num
	 * @return
	 */
	public static long getRandom(int num) {
		double random = Math.random();
		for (int i = 0; i < num; i++) {
			count *= 10;
		}
		return (long)(random*count);
	}
	
	public static void main(String[] args) {
		System.out.println(getRandom(11));
	}
	
}
