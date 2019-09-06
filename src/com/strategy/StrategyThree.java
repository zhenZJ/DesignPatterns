/** 
 * Project Name:DesignPatterns 
 * File Name:StrategyThree.java 
 * Package Name:com.strategy 
 * Date:2019年9月4日下午4:13:25 
 * Copyright (c) 2019, www.bizwingroup.com All Rights Reserved. 
 * 
 */  
package com.strategy;

import java.util.Arrays;

/**
 * @author zhangzhen
 */
public class StrategyThree implements ComputableStrategy {

  @Override
  public double computableScore(double[] a) {
    double score = 0, sum = 0;
    if (a.length <= 2)
      return 0;
    Arrays.sort(a);
    for (int i = 1; i < a.length - 1; i++) {
      sum += a[i];
    }
    score = sum / (a.length - 2);
    return score;
  }

}
