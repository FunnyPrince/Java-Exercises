package com.day14;

/**
 * @author FunnyPrince_
 * @date 2021/4/9 - 0:58
 */
public interface CompareB {
    default void method3(){//省略了public，并不是权限变成default
        System.out.println("CompareB接口中的method3()");
    }
}
