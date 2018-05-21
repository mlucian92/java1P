/**
 * Consumer<T>
 * BiConsumer<T,G>
 * Supplier<T>
 * Predicate<T>
 * BiPredicate<T,G>
 * Function<T,R>
 * BiFunction<T,G,R>
 * UnaryOperator<T> ~ Function<T,T>
 * BinaryOperator<T> ~ Function<T,T,T>
 * 
 */

package java1PCurs3;

import java.util.function.*;

public class Exemplu3 {
	public static void main(String[] args) {
		
		Consumer<String> c1 = x -> System.out.println(x);
		BiConsumer<Integer, String> c2 = (a, b) -> System.out.println(a + "b");
		Predicate<String> p1 = s -> s.length() % 2 == 0;
		Function<String, Integer> f1 = s -> s.length();
		
	}
}
