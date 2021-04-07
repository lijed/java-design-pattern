package com.java.desginpattern.strategy.general;

//具体策略类 ConcreteStrategy
public class ConcreteStrategyB implements IStrategy {
    @Override
    public void algorithm() {
        System.out.println("Strategy B");
    }
}