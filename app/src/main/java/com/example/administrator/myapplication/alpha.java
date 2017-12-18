package com.example.administrator.myapplication;
/**
 * Created by Administrator on 2017/12/18.
 */

public class alpha {
    private int mNum;
    private String mLogMsg;

    public static void main(String args[]){
        alpha a = new alpha();
        a.echo();
        a.mNum = 10;
        a.mLogMsg = "Hello";

        System.out.println(a.mNum);
        a.mNum = a.addOne(a.mNum);
        System.out.println(a.mNum);


        System.out.println(a.mLogMsg);
        a.mLogMsg =  a.appendStr(a.mLogMsg);
        System.out.println(a.mLogMsg);
    }
    private int echo(){
        System.out.println("From echo(), %s, %d");
        return  0;
    }

    private int addOne(int var)
    {
        return var+1;
    }

    private String appendStr(String s)
    {
        return s+"$";
    }
}
