package scjp6.other.androidapp.enumtest;

/**
 * Created by Yaroslav_Zabara on 3/11/2015.
 */
public enum SomeEnum {

    VALUE1, VALUE2, VALUE3;
    // ; - is optional

    public static void main(String[] args) {
        SomeEnum val = SomeEnum.VALUE3;

        if (val == SomeEnum.VALUE2 || val == SomeEnum.VALUE1 || val == SomeEnum.VALUE3) {
            System.out.println("equals");
        }
    }
}
