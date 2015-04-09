package scjp6.other.androidapp.overriding.statics;

import scjp6.other.androidapp.overriding.statics.packagea.ClassA;
import scjp6.other.androidapp.overriding.statics.packageb.ClassB;

/**
 * Created by Yaroslav_Zabara on 4/8/2015.
 */
public class Main {

    public static void main(String[] args) {

        ClassB classB = new ClassB();
        ClassA classA = new ClassA();
        ClassA.display();
        ClassB.display();

        System.out.println(classB.a);
        System.out.println(classB.getA());

        System.out.println(classA.someMethod());
        System.out.println(classB.someMethod());

        System.out.println(classB instanceof ClassA);
        System.out.println(classB instanceof ClassB);
        System.out.println(classA instanceof ClassA);
        System.out.println(classA instanceof ClassB);

    }
}

