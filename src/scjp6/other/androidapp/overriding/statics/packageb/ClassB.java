package scjp6.other.androidapp.overriding.statics.packageb;

import scjp6.other.androidapp.overriding.statics.packagea.ClassA;

import java.util.Date;

/**
 * Created by Yaroslav_Zabara on 4/8/2015.
 */
public class ClassB extends ClassA {

    public static String var = "var";

    public String a = "b";

    public ClassB(){
        display();
    }

    public static void display(){
        display(var);
    }

    protected static void display(String message){
        System.out.println(message + new Date().toString());
    }

    @Override
    public String someMethod() {
        return a + " : " + var;
    }
}
