package main.java.com.sommer.learn;

/**
 * Created by hiptonese on 17-7-7.
 */
public class HelloWorldImpl2 implements HelloWorld {
    private String str="Hello";

    public HelloWorldImpl2(){

    }
    public HelloWorldImpl2(String s) {
        this.str = this.str+s;
    }


    public String sayHi(){
        return this.str;
    }

}
