package scjp6.question41;

/**
 * Question 41
 */
public class Donkey2 {
        public static void main(String[] args) {
            boolean assertsOn = true;
            assert (assertsOn) : assertsOn = true;
            if(assertsOn) {
                System.out.println("assert is on");
            }
        }
}
