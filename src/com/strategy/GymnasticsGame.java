/** 
 * Project Name:DesignPatterns 
 * File Name:GymnasticsGame.java 
 * Package Name:com.strategy 
 * Date:2019年9月4日下午4:21:09 
 * Copyright (c) 2019, www.bizwingroup.com All Rights Reserved. 
 * 
 */  
package com.strategy;

/**
 * @author zhangzhen
 */
public class GymnasticsGame {

  ComputableStrategy strategy;

  public void setStrategy(ComputableStrategy strategy) {
    this.strategy = strategy;
  }

  public double getPersonScore(double a[]) {
    if (strategy != null) {
      return strategy.computableScore(a);
    } else {
      return 0;
    }
  }
}
