package com.github_afternoon;

/**
 * Created by Windows on 2017/8/14.
 */

public class Demo03 {
    private static Demo03 demo03;
    private Demo03(){
    }

    public static Demo03 getInstance(){
        if(demo03==null){
            synchronized (Demo03.class){
                if (demo03==null){
                    demo03=new Demo03();
                }
            }
        }
        return demo03;
    }

}
