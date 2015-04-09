package scjp6.other.androidapp.overriding.statics.packagea;

/**
 * Created by Yaroslav_Zabara on 4/8/2015.
 */
public class ClassA {

    public static String variable = "String";
    public String a = "a";

    public static void display(){
        display(variable);
    }

    protected static void display(String message){
        System.out.println(message);
    }

    public String getA(){
        return a;
    }

    public String someMethod(){
        return variable + " : " + a;
    }
}
