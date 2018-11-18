package com.wbb.dp.chapter06;

/**
 * @author vico
 * @date 2018-10-20
 */
public class Client {
    public static void main(String[] args) {
        //构造一个生产Q3的工厂
        CarFactory factoryQ3=new Q3Factory();
        factoryQ3.createTire().tire();
        factoryQ3.createEngine().engine();
        factoryQ3.createBrake().brake();

        System.out.println("---------------");

        //构造一个生产Q7的工厂
        CarFactory factoryQ7=new Q7Factory();
        factoryQ7.createTire().tire();
        factoryQ7.createEngine().engine();
        factoryQ7.createBrake().brake();
    }
}
