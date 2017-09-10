package com.shiming.andrioddesignpattern.singleton_model;

/**
 * Created by shiming on 2017/9/10.
 * 饿汉式，这种在项目中基本上没有使用到
 */

public class SingletonFourth {
    private SingletonFourth(){
        System.out.println("shiming SingletonFourth");
    }
    //还没有用到这个类就已经初始化了
    private static SingletonFourth mSingletonFourth=new SingletonFourth();

    public static SingletonFourth getSingleton(){
        return mSingletonFourth;
    }
}
