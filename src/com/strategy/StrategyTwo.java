/** 
 * Project Name:DesignPatterns 
 * File Name:StrategyTwo.java 
 * Package Name:com.strategy 
 * Date:2019年9月4日下午4:13:02 
 * Copyright (c) 2019, www.bizwingroup.com All Rights Reserved. 
 * 
 */  
package com.strategy;

/**
 * @author zhangzhen
 */
public class StrategyTwo implements ComputableStrategy {


  @Override
  public double computableScore(double[] a) {
    double score = 0, multi = 1;
    int n = a.length;
    for (double d : a) {
      multi = multi * d;
    }
    score = Math.pow(multi, 1.0 / n);
    return score;
  }

}
