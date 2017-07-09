package testProperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.instrument.classloading.InstrumentationLoadTimeWeaver;

/**
 * Created by Yangyang Deng on 17-7-7.
 */
public class Main {
    public static void main(String[] args){
//        apc首先指定好xml文件
        ApplicationContext apc = new ClassPathXmlApplicationContext("springXML/Prop.xml");
        Performer performer = apc.getBean("kenny",Instrumentalist.class);

        performer.perform();
        
    }
}
