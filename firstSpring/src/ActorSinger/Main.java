package ActorSinger;

/**
 * Created by hiptonese on 17-7-7.
 */

import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext apc = new ClassPathXmlApplicationContext("springXML/ActorSinger.xml");

        autoLight light = apc.getBean("autoLight",autoLight.class);
        Actor John = apc.getBean("actor_default",Actor.class);
        Actor Mike = apc.getBean("actor_input",Actor.class);
        Singer Amy = apc.getBean("singer_default",Singer.class);
        Singer Lee = apc.getBean("singer_input",Singer.class);
        ActorSinger AS_both = apc.getBean("actorSinger_both",ActorSinger.class);
        ActorSinger AS_Sing = apc.getBean("actorSinger_sing",ActorSinger.class);

//        disp(John.Act());
//        disp(Mike.Act());
//        disp(Amy.Sing());
//        disp(Lee.Sing());
//        disp(" ");

        AS_both.perform();
        AS_Sing.perform();

    }
    public static void disp(String s){
        System.out.println(s);
    }
}

