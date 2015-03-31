package scjp6.other.androidapp.overriding;

/**
 * Created by Yaroslav_Zabara on 3/31/2015.
 */
public class Electronic implements Device {
    public void doIt() {}
}

abstract class Phone1 extends Electronic {
}

abstract class Phone2 extends Electronic {
    public void doIt(int x) {}
}

class Phone3 extends Electronic implements Device {
    public void doStuff() {}
}

interface Device {
    public void doIt();
}
