package mao.reflex;

import mao.m5.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Project name(项目名称)：java设计模式_破坏单例模式
 * Package(包名): mao.reflex
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/12
 * Time(创建时间)： 19:58
 * Version(版本): 1.0
 * Description(描述)： 反射破坏单例模式
 */

public class Test
{
    public static void main(String[] args)
            throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException
    {
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println("-----");
        Class<Singleton> singletonClass = Singleton.class;
        //获取Singleton类的私有无参构造方法对象
        Constructor<Singleton> declaredConstructor = singletonClass.getDeclaredConstructor();
        //取消访问检查
        declaredConstructor.setAccessible(true);
        //创建对象
        System.out.println(declaredConstructor.newInstance());
        System.out.println(declaredConstructor.newInstance());
        System.out.println(declaredConstructor.newInstance());
        System.out.println(declaredConstructor.newInstance());
        System.out.println(declaredConstructor.newInstance());
    }
}
