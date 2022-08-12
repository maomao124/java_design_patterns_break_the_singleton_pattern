package mao.serialization;

import mao.m5.Singleton;

/**
 * Project name(项目名称)：java设计模式_破坏单例模式
 * Package(包名): mao.serialization
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/12
 * Time(创建时间)： 19:49
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    private static final String PATH = "./Singleton.txt";

    public static void main(String[] args)
    {
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println("-----");
        SingletonIO.write(Singleton.getInstance(), PATH);
        System.out.println(SingletonIO.read(PATH));
        System.out.println(SingletonIO.read(PATH));
        System.out.println(SingletonIO.read(PATH));
        System.out.println(SingletonIO.read(PATH));
        System.out.println(SingletonIO.read(PATH));
    }
}
