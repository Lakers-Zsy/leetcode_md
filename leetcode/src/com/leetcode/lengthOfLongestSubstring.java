package com.leetcode;

import java.util.HashMap;

public class lengthOfLongestSubstring {
	//求出无重复字符串中最长子串长度
	 public static int fun(String s) {
	        int left=0,max=0;
	        if(s.length()==0)return 0;
	         HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	        for(int i=0;i<s.length();i++)
	        {
	            if(map.containsKey(s.charAt(i))) 
	            {
	            	//实质get函数不会因为left指针偏移而消失，所以left指针以最右结果为主，防止abba情况
	            	left=Math.max(left,map.get(s.charAt(i)) + 1);
	            }
	            
	            map.put(s.charAt(i),i);
	            max = Math.max(max,i-left+1);//这部就可以解决123456bb12的情况长度取最长那段 然后后面重复的就从长的那边讨债
	            
	        }
	        
	        return max;
	    }



}
