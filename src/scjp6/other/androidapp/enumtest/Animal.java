package scjp6.other.androidapp.enumtest;

/**
 * Created by Yaroslav_Zabara on 3/31/2015.
 */
public enum Animal {

    DOG("woof"), CAT("meow"), FISH("burble");
    String sound;

    Animal(String s) {
        sound = s;
    }
}

class TestEnum {
    static Animal a;

    public static void main(String[] args) {
        Boolean[] ba[];
        long[] x[] = new long[1][1];
        System.out.println(a.DOG.sound + " " + a.FISH.sound);
    }
}

class TestDays {
    public enum Days {MON, TUE, WED}

    public static void main(String[] args) {
        for (Days d : Days.values())
            ;
        Days[] d2 = Days.values();
        System.out.println(d2[2]);
    }
}

