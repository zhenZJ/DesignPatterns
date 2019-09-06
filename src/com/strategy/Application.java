/** 
 * Project Name:DesignPatterns 
 * File Name:Application.java 
 * Package Name:com.strategy 
 * Date:2019年9月4日下午4:26:52 
 * Copyright (c) 2019, www.bizwingroup.com All Rights Reserved. 
 * 
 */  
package com.strategy;

/**
 * @author zhangzhen
 */
public class Application {

  /**
   * @param args
   */
  public static void main(String[] args) {

    GymnasticsGame game = new GymnasticsGame();

    game.setStrategy(new StrategyOne());
    double[] a = { 8.5, 8.8, 9.5, 9.7, 10 };
    // 平均分
    System.out.println(game.getPersonScore(a));
    
    game.setStrategy(new StrategyTwo());
    // 几何分
    System.out.println(game.getPersonScore(a));

    game.setStrategy(new StrategyThree());
    // 去掉最大、最小后的平均分
    System.out.println(game.getPersonScore(a));
  }

}
