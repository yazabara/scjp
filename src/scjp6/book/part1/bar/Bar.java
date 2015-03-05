package scjp6.book.part1.bar;

import scjp6.book.part1.foo.Foo;

/**
 * Created by Yaroslav on 05.03.2015.
 */
public class Bar extends Roo implements Foo{

    @Override
    public void go() {
        //cannot change final static variable - because interface
        //variable = 10;
    }

    public Bar() {
        //private
        //doSomeAction();
        doSomeAction("Yeeee");//OK
    }

    public void doSomeAction() {
        //another method for Bar class
        System.out.println("Bar doSomeAction method");
    }

    /** Overriding method */
    @Override
    public void doSomeAction(String a) {
        System.out.println("Bar doSomeAction method with params");
    }
}
