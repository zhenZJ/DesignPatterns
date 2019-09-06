/** 
 * Project Name:DesignPatterns 
 * File Name:Singleton.java 
 * Package Name:com.singleton 
 * Date:2019年9月4日下午1:50:01 
 * Copyright (c) 2019, www.bizwingroup.com All Rights Reserved. 
 * 
 */  
package com.singleton;

/**
 *
 * @author zhangzhen
 */
public class Singleton {

  // 私有构造器
  private Singleton() {
  }

  private static final Singleton INSTANCE = new Singleton();

  public static Singleton getInstance() {
    return INSTANCE;
  }
}
