package scjp6.other.androidapp.overriding;

/**
 * Created by Yaroslav_Zabara on 3/31/2015.
 */
class Frodo extends Hobbit {
    public static void main(String[] args) {
        Short myGold = 7;
        //don't compile
       // System.out.println(countGold(myGold, 6));
    }
}

public class Hobbit {
    int countGold(int x, int y) {
        return x + y;
    }
}
