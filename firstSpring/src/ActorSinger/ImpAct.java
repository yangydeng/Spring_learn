package ActorSinger;

/**
 * Created by hiptonese on 17-7-7.
 */
public class ImpAct implements Actor {
    private String str = "I can act ";

    public ImpAct(){}

    public ImpAct(String s){
        this.str = this.str+s;
    }

    @Override
    public String Act(){
        return str;
    }
}
