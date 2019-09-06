/** 
 * Project Name:DesignPatterns 
 * File Name:StrategyOne.java 
 * Package Name:com.strategy 
 * Date:2019年9月4日下午4:12:01 
 * Copyright (c) 2019, www.bizwingroup.com All Rights Reserved. 
 * 
 */  
package com.strategy;

/**
 * @author zhangzhen
 */
public class StrategyOne implements ComputableStrategy {

  @Override
  public double computableScore(double[] a) {
    double avg = 0, sum = 0;
    for (double d : a) {
      sum += d;
    }
    avg = sum / a.length;
    return avg;
  }

}
