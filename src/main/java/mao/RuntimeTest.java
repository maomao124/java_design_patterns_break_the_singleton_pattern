package mao;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Project name(项目名称)：java设计模式_破坏单例模式
 * Package(包名): mao
 * Class(类名): RuntimeTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/12
 * Time(创建时间)： 20:29
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class RuntimeTest
{
    public static void main(String[] args) throws IOException
    {


        System.out.println(Runtime.getRuntime());
        System.out.println(Runtime.getRuntime());
        System.out.println(Runtime.getRuntime());
        Runtime runtime = Runtime.getRuntime();

        //注册一个新的虚拟机关闭挂钩
        runtime.addShutdownHook(new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("java虚拟机即将关闭!!!");
            }
        }));

        Process process = runtime.exec("java --help");
        InputStream inputStream = process.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "GBK");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String str;
        while ((str = bufferedReader.readLine()) != null)
        {
            System.out.println(str);
        }

        long totalMemory = runtime.totalMemory();
        System.out.println(totalMemory);
        long freeMemory = runtime.freeMemory();
        System.out.println(freeMemory);
        long maxMemory = runtime.maxMemory();
        System.out.println(maxMemory);
    }
}
