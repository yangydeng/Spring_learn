package ActorSinger;

/**
 * Created by hiptonese on 17-7-7.
 */
public class ActorSinger extends ImpAct {
    private Singer singer;

    public ActorSinger() {}

    public ActorSinger(Singer singer){
        this.singer = singer;
    }

    public ActorSinger(String s,Singer singer){
        super(s);
        this.singer = singer;
    }

    public void perform(){
        System.out.println(super.Act());
        System.out.println(singer.Sing());
    }


}
