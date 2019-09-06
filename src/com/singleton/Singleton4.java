/** 
 * Project Name:DesignPatterns 
 * File Name:Singleton2.java 
 * Package Name:com.singleton 
 * Date:2019年9月4日下午1:53:27 
 * Copyright (c) 2019, www.bizwingroup.com All Rights Reserved. 
 * 
 */  
package com.singleton;

/**
 * 静态内部类模式 <br>
 * JVM 保证单例
 * 
 * @author zhangzhen
 */
public class Singleton4 {

  private Singleton4() {
  }

  private static class Singleton5 {
    private final static Singleton4 INSTANCE = new Singleton4();
  }

  public static Singleton4 getInstance() {
    return Singleton5.INSTANCE;
  }
}
