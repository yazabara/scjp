package scjp6.other.androidapp.overriding;

/**
 * Created by Yaroslav on 22.03.2015.
 */
public class Inheritance {

    /**
     * Если у сына нету переопределенного метода - вызывается метод отца с ПОЛЯМИ ОТЦА.
     * Если у сына есть реализация метод - вызывается она с полями Сына и полями отца, если у сына они не определены
     */
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.say();

        Parent1 parent1 = new Child1();
        parent1.say();

        Parent parent = new Child();
        parent.say();
    }
}

class Parent1 {
    String message = "parent";

    public void say() {
        System.out.println(message);
    }
}

class Child1 extends Parent1{
    String message = "child";

//    public void say() {
//        System.out.println(message);
//    }
}

//will compile because uncatched exceptions
class Parent2 {
    void say() {
    }
}

class Child2 extends Parent2 {
    void say() throws ArrayIndexOutOfBoundsException,
            ClassCastException, NullPointerException {
    }
}


//why?!
class Parent {
    <T> void say() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void say() {
        System.out.println("Child");
    }
}


