package scjp6.book.part1.finalvariables;

/**
 * Created by Yaroslav_Zabara on 3/31/2015.
 *
 * FINAL variables test
 */
public class FinalVariable {

    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        final SomeClass finalClass = someClass;
        someClass.someVar = 11;

        //output is 11
        System.out.println(finalClass.someVar);
    }
}

class SomeClass {

    final int finalInt;
    final int finalIntInit = 1;
    final String finalStr;
    final String finalString = "";
    int someVar = 10;

    SomeClass() {
        finalInt = 0;
        finalStr = "";
        //compile error
        //finalString = "";
        //finalIntInit = 1;
    }
}
