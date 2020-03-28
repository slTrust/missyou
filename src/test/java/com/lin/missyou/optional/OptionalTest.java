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

    @Test
    public void testOption3(){
        // Optional 使用方式


        //  isPresent 返回一个布尔值  有值 true ,空值 false
        // 这就很没意义，没有体现精髓
        /*
        Optional<String> t2 = Optional.ofNullable(null);
        if(t2.isPresent()){

        }else{
            throw new RuntimeException("xxx");
        }
        */

        // 正确姿势  使用 ifPresent
        // 有值 执行一个 consumer
        // 空值 后面的 consumer不会执行
        Optional<String> t2 = Optional.ofNullable(null);
        t2.ifPresent(t->System.out.println("123")); // 此时不会打印 123

        Optional<String> t3 = Optional.ofNullable("aa");
        t3.ifPresent(t->System.out.println("456")); // 此时打印 456


        // 设置默认值
        /*
        String s = "";
        if(t2.isPresent()){
            s = t2.get();
        }else{
            s = "默认值";
        }
        */
        // orElse 设置默认值
        Optional<String> t4 = Optional.ofNullable(null);
        String s = t4.orElse("默认值");
        System.out.println(s); // 打印出 默认值

        Optional<String> t5 = Optional.ofNullable("aa");
        String s2 = t5.orElse("默认值");
        System.out.println(s2); // 打印出 aa

        // orElseThrow 空值就抛出异常
        Optional<String> t6 = Optional.ofNullable("bb");
        t6.orElseThrow(()-> new RuntimeException("空值")); // 如果是空 抛出异常
    }


}
