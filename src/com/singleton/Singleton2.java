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
 * 懒汉式
 * 
 * @author zhangzhen
 */
public class Singleton2 {

  // 私有化构造器
  private Singleton2() {
  }

  private static Singleton2 INSTANCE;

  public static Singleton2 getInstance() {
    if (INSTANCE == null) {
      synchronized (Singleton2.class) {
        if (INSTANCE == null) {
          INSTANCE = new Singleton2();
        }
      }

    }
    return INSTANCE;
  }
}
