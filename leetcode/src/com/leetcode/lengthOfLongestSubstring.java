package com.leetcode;

import java.util.HashMap;

public class lengthOfLongestSubstring {
	//������ظ��ַ�������Ӵ�����
	 public static int fun(String s) {
	        int left=0,max=0;
	        if(s.length()==0)return 0;
	         HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	        for(int i=0;i<s.length();i++)
	        {
	            if(map.containsKey(s.charAt(i))) 
	            {
	            	//ʵ��get����������Ϊleftָ��ƫ�ƶ���ʧ������leftָ�������ҽ��Ϊ������ֹabba���
	            	left=Math.max(left,map.get(s.charAt(i)) + 1);
	            }
	            
	            map.put(s.charAt(i),i);
	            max = Math.max(max,i-left+1);//�ⲿ�Ϳ��Խ��123456bb12���������ȡ��Ƕ� Ȼ������ظ��ľʹӳ����Ǳ���ծ
	            
	        }
	        
	        return max;
	    }



}
