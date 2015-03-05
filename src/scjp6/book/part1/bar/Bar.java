package scjp6.book.part1.bar;

import scjp6.book.part1.foo.Foo;

/**
 * Created by Yaroslav on 05.03.2015.
 */
public class Bar implements Foo{

    @Override
    public void go() {
        //cannot change final static variable - becouse interface
        //variable = 10;
    }
}
