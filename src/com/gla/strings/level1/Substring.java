package com.gla.strings.level1;
import java.util.Scanner;
public class Substring{
    public static String makeSub(String s,int st,int en){
        String r="";
        for(int i=st;i<en;i++){
            r=r+s.charAt(i);
        }
        return r;
    }
    public static boolean compare(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int st=sc.nextInt();
        int en=sc.nextInt();
        String r1=makeSub(s,st,en);
        String r2=s.substring(st,en);
        System.out.println(compare(r1,r2));
    }
}