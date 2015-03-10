package scjp6.other.androidapp;

/**
 * Created by Yaroslav on 10.03.2015.
 */
public class B extends A{

    public int value = 11;

    @Override
    public void print() {
        System.out.println(value);
        System.out.println("B");
    }
}
