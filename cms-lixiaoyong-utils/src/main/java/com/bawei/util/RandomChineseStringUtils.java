package com.bawei.util;

import java.io.UnsupportedEncodingException;
import java.util.Random;

public class RandomChineseStringUtils {
    public static void main(String[] args) {
    	RandomChineseStringUtils d = new RandomChineseStringUtils();
        System.out.println(d.randomChineseString(20,40));//输出随机的中文名字
    }
/**
 * 
 * @param startName:公司名称前缀
 * @param min:汉字数量最小值
 * @param max:汉字数量最大值
 * @param endNames:存放公司类型数组
 * @return
 */
    public static String getCompanyName(String startName,int min,int max,String endNames[]) {
		String centerName=RandomChineseStringUtils.randomChineseString(min, max);
		Random random=new Random();
		int index=random.nextInt(endNames.length); //0<=index<3
		String endName=endNames[index];
		String name=startName+centerName+endName;
		return name;
    }
 
    /**
     * 产生给定范围个数的汉字
     * @param min 最小汉字数
     * @param max 最大汉字数
     * @return
     */
    public static String randomChineseString(int min,int max){
    
    	Random rand = new Random();
    	int count=rand.nextInt(max-min+1) + min;
    	
        String name = "";
        int chineseNameNum =  count;
        for(int i=1; i<=chineseNameNum;i++){
            name += new RandomChineseStringUtils().getChinese();
        }
        return name;
    }
 
    //获得单个汉字
    public String getChinese(){
        String chinese = "";
        int i = (int)(Math.random()*40 + 16);
        int j = (int)(Math.random()*94 + 1);
        if(i == 55){
            j = (int)(Math.random()*89 + 1);
        }
        byte[] bytes = {(byte) (i+160),(byte) (j+160)};
        try {
            chinese =  new String(bytes, "gb2312");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return chinese;
    }
}
