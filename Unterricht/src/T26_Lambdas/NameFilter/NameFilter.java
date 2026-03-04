package T26_Lambdas.NameFilter;

@FunctionalInterface
interface NameFilter {
    boolean test(String name);
}
