package scjp6.question39;

/**
 * Created by Yaroslav_Zabara on 2/16/2015.
 * <p/>
 * QUESTION NO: 39
 * Given:
 * 31. // some code here
 * 32. try {
 * 33. // some code here
 * 34. } catch (SomeException se) {
 * 35. // some code here
 * 36. } finally {
 * 37. // some code here
 * 38. }
 * 24
 * Under which three circumstances will the code on line 37 be executed? (Choose three.)
 * A. The instance gets garbage collected.
 * B. The code on line 33 throws an exception.
 * C. The code on line 35 throws an exception.
 * D. The code on line 31 throws an exception.
 * E. The code on line 33 executes successfully.
 * Answer: B,C,E
 */
public class Question39 {

    public static void main(String[] args) {
        int x = 0;
        try {
            try {
                x = 1;
                throw new SomeException("someException");
            } catch (SomeException someE) {
                x = 2;
                throw new Exception("new Exception");
            } finally {
                x = 3;
            }
        } catch (Exception ex) {
            System.out.println(x);
            x = 4;
        } finally {
            System.out.println(x);
        }
    }
}
