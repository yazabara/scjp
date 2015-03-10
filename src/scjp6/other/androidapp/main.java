package scjp6.other.androidapp;

/**
 * Created by Yaroslav on 10.03.2015.
 */
public class main {

    /**
     * Методы - виртуальные, поля - нет
     */
    public static void main(String[] args) {
        A a = new B();
        A b = new B();
        a.print();
        System.out.println(a.value);

        b.print();
        System.out.println(b.value);
    }
}
