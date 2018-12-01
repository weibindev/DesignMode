package com.wbb.dp.chapter16;

import java.util.Random;

/**
 * 工程师
 *
 * @author vico
 * @date 2018-12-01
 */
public class Engineer extends Staff {
    public Engineer(String aName) {
        super(aName);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    //工程师这一年写的代码数量
    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
