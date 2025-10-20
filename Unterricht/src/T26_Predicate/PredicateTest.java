package T26_Predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Aufbau des funktionalen Interfaces Predicate:
 *
 * @FunctionalInterface
 * public interface Predicate<T> {
 *
 *      Evaluates this predicate on the given argument.
 *
 *      *@param t the input argument
 *      *@return {@code true} if the input argument matches the predicate,
 *      otherwise {@code false}
 *
 *      boolean test(T t);
 * }
 */

public class PredicateTest {
    public static void main(String[] args) {
        //Predicate<Integer> isEven = number -> number % 2 == 0;

        /*Predicate<Integer> isEvenExpanded = new Predicate<Integer>() {
            @Override
            public boolean test(Integer number) {
                return number % 2 == 0;
            }
        };*/
        //System.out.println(isEven.test(25));


        //Predicate<Integer> isBiggerThan20 = x -> x > 20;
        //System.out.println(isBiggerThan20.test(19));

        //Predicate<String> beginWithA = str -> str != null && str.toLowerCase().startsWith("a");
        //System.out.println(beginWithA.test(null));

        BiPredicate<String, Integer> lengthMatches = (str, i) -> str!=null && str.length()==i;
        System.out.println(lengthMatches.test("Hallo", 6));

    }

}
