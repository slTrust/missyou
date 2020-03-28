package com.lin.missyou.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class OptionalTest {

    @Test
    public void testOption(){
        // 构建 Optional
        // 1.1 构建 一个 空值的 Optional 对象
        Optional<String> empty = Optional.empty();
        // 获取值，报错
        // empty.get();

        // 1.2 构建一个不允许传入空值的 Optional 对象
        // 如果直接传递 空值 也会报错 ，因为 of默认传入的值必须不能是空值
        // Optional<String> t1 = Optional.of(null);


        // 1.3 构建一个允许传入空值的 Optional 对象
        Optional<String> t2 = Optional.ofNullable(null);
    }

    @Test
    public void testOption2(){
        // 使用 Optional
        Optional<String> t2 = Optional.ofNullable(null);
        String s = t2.get(); // 如果 Optional 的值是空值 ，这里取值 就会报错

        /*
        这是一个非常好的机制

        假设 s 直接这样
        String s = null; // 赋值的时候就空的 ，而且没有异常产生。
        s 以后又传递给 其他函数 使用。
        此时就隐藏了一个 NullPointer bug

        NullPointer 隐藏在 函数调用栈， 随着 方法栈的变深， 当你出现错误的时候 更加难以 "溯源" ，要跟踪调试

        */
    }
}
