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

        BiPredicate<String,Integer> lengthMatches = (str,i) -> str!=null && i!=null && str.length()==i;
        System.out.println(lengthMatches.test("ABC",3)); // false
        System.out.println(lengthMatches.test("aBA4",3));
    }
}
