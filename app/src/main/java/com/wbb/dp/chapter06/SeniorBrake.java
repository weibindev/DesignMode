package com.wbb.dp.chapter06;

/**
 * @author vico
 * @date 2018-10-20
 */
public class SeniorBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("高级制动");
    }
}
