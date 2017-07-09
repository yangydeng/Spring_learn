package ActorSinger;

/**
 * Created by hiptonese on 17-7-7.
 */
public class ImpSing implements Singer {
    private String str = "I can sing";

    public ImpSing(){}
    public ImpSing(String s){
        this.str = this.str+s;
    }

    public String Sing(){
        return this.str;
    }
}
