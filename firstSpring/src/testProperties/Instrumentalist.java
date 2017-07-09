package testProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Yangyang Deng on 17-7-7.
 */
public class Instrumentalist implements Performer {
    public Instrumentalist(){};


    private String song;

//    注解可以直接标注属性(beam的引用)，并删除setter的方法
//    @Qualifier可以在@Autowired的基础上解决歧义性问题
    @Autowired
    @Qualifier("piano")
    private Instrument instrument;

    public void perform(){
        System.out.println("Playing "+song+" : ");
        instrument.play();
    }
//    必须要有setter getter的方法，否则不能使用属性的方法赋值
    public void setSong(String song){
        this.song = song;
  }

    public String getSong(){
        return this.song;
    }

//    由于属性被@Autowired直接注解，因此setter方法可以省略
//    public void setInstrument(Instrument instrument){
//        this.instrument = instrument;
//    }

}

