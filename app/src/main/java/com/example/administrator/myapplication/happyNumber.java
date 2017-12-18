package com.example.administrator.myapplication;

import java.util.HashSet;

/**
 * Created by Administrator on 2017/12/18.
 */

public class happyNumber {
    public static void main(String args[]) {
        happyNumber h = new happyNumber();
        h.isHappy(7);
    }

    public boolean isHappy(int n) {
        HashSet alreadyVisit = new HashSet();
        int ret = calculate(n);
        //alreadyVisit.add(ret);
        while (ret != 1 && ret != n && !alreadyVisit.contains(ret)) {
            alreadyVisit.add(ret);
            System.out.println(">>>"+debugLine()+ret);
            ret = calculate(ret);
        }

        if (1 == ret) {
            return true;
        } else if (ret == n) {
            return false;
        } else if (alreadyVisit.contains(ret)) {
            return false;
        }
        return false;

    }


    public int calculate(int val) {
        int sum = 0, decmi;

        System.out.println(">>>"+debugLine()+ val);
        while (val >= 10) {
            System.out.println(">>>"+debugLine()+ val);
            decmi = val % 10;
            sum += decmi * decmi;
            val = val / 10;
        }
        sum += val * val;

        return sum;
    }

    public String debugLine(){
        return Thread.currentThread().getStackTrace()[2].getLineNumber()+":";
    }
}
