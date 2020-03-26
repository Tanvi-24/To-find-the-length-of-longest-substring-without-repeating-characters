package com.company.numbers;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s= sc.nextLine();
        int l=lengthOfLongestSubstring(s);
        System.out.println(l);
    }

    public  static int lengthOfLongestSubstring(String s) {

            Set<Character>s2=new HashSet<>();
            long  len=s.length();
            int i=0,cnt=0;
            String str;

            for(i=0;i<len;i++)
            {
                for(int count=i+2;count<=len;count++)
                {
                    str=s.substring(i,count);
                    for(int j=0;j<str.length();j++)
                        s2.add(str.charAt(j));
                    if(s2.size()<str.length())
                        continue;
                    else
                    {
                        if(cnt<str.length())
                            cnt=str.length();
                    }
                    str=null;

                    s2.clear();
                }

            }
            s2.clear();
            if(len==0)
                return 0;
            else if(cnt==0)
                return 1;
            else
                return cnt;
    }
}
