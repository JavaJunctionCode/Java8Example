package com.myown.java.optional;

import java.util.Optional;

public class Optional1 {
	/*
	 * 🟢 Creation Methods:
	 * 
	 * Optional.empty()
	 * 
	 * Optional.of(T value)
	 * 
	 * Optional.ofNullable(T value)
	 * 
	 * 🟢 Check & Access Methods:
	 * 
	 * isPresent()
	 * 
	 * isEmpty() (Java 11+)
	 * 
	 * get()
	 * 
	 * 🟢 Action Methods:
	 * 
	 * ifPresent(Consumer<? super T> action)
	 * 
	 * ifPresentOrElse(Consumer<? super T>, Runnable) (Java 9+)
	 * 
	 * 🟢 Default Value Methods:
	 * 
	 * orElse(T other)
	 * 
	 * orElseGet(Supplier<? extends T>)
	 * 
	 * orElseThrow()
	 * 
	 * orElseThrow(Supplier<? extends X>)
	 * 
	 * 🟢 Transformation Methods:
	 * 
	 * map(Function<? super T, ? extends U>)
	 * 
	 * flatMap(Function<? super T, Optional<U>>)
	 * 
	 * filter(Predicate<? super T>)
	 * 
	 */

	public static void main(String[] args) {
		Optional<String> emptyOpt = Optional.empty();

		System.out.println(emptyOpt.isPresent()); // false
		System.out.println(emptyOpt.empty().orElse("Default"));
//		System.out.println(emptyOpt.get());

		/*
		 * Optional.empty() Returns an empty Optional instance.
		 */
		Optional<String> emptyOpt1 = Optional.empty();
		System.out.println(emptyOpt1.isPresent()); // false

		/*
		 * 2. Optional.of(T value) Wraps a non-null value.
		 */

		Optional<String> opt = Optional.of("Rajveer");
		System.out.println(opt.get()); // Rajveer
//		❗ Throws NullPointerException if value is null.

		/*
		 * 3. Optional.ofNullable(T value) Wraps a value, allows null.
		 */

		Optional<String> opt71 = Optional.ofNullable(null);
		System.out.println(opt71.isPresent()); // false

		/*
		 * 4. isPresent() Returns true if value is present.
		 */

		Optional<String> opt5 = Optional.of("Hello");
		System.out.println(opt5.isPresent()); // true

		/*
		 * 5. isEmpty() (Java 11+) Returns true if value is absent.
		 */

		Optional<String> opt1 = Optional.empty();
		System.out.println(opt1.isEmpty()); // true

//		6. get()
//		Returns the value if present. ⚠️ Unsafe if used without checking.

		Optional<String> opt2 = Optional.of("Raj");
		System.out.println(opt2.get()); // Raj

		/*
		 * 7. ifPresent(Consumer<? super T> action) Performs an action if value is
		 * present.
		 */

		Optional<String> opt3 = Optional.of("Data");
		opt5.ifPresent(val -> System.out.println("Value is: " + val)); // Value is: Data

		/*
		 * 8. ifPresentOrElse(Consumer, Runnable) (Java 9+) Runs one of two actions
		 * based on presence.
		 */

		Optional<String> opt4 = Optional.empty();
		opt4.ifPresentOrElse(val -> System.out.println("Present: " + val), () -> System.out.println("Value is absent")); // Output:
																															// Value
																															// is
																															// absent

		/*
		 * 9. orElse(T other) Returns the value or a default if absent.
		 */

		String name = (String) Optional.ofNullable(null).orElse("Default");
		System.out.println(name); // Default

		/*
		 * 10. orElseGet(Supplier) Returns value or computes a fallback lazily.
		 */

		String result = (String) Optional.ofNullable(null).orElseGet(() -> "Generated at runtime");
		System.out.println(result); // Generated at runtime

		/*
		 * 11. orElseThrow() (Java 10+) Throws NoSuchElementException if no value.
		 */

		Optional<String> opt51 = Optional.empty();
//		String val = opt51.orElseThrow(); // ❗ Throws NoSuchElementException

		/*
		 * 12. orElseThrow(Supplier<Exception>) Custom exception when no value present.
		 */

//		String val1 = (String) Optional.ofNullable(null).orElseThrow(() -> new IllegalArgumentException("Missing value"));

		/*
		 * 13. map(Function) Applies transformation if value present.
		 */

		Optional<String> name1 = Optional.of("raj");
		Optional<String> upper = name1.map(String::toUpperCase);
		System.out.println(upper.get()); // RAJ

		/*
		 * 14. flatMap(Function) Like map, but avoids nested Optionals.
		 */

		Optional<String> name6= Optional.of("john");
		Optional<String> result1 = name6.flatMap(n -> Optional.of(n.toUpperCase()));
		System.out.println(result1.get()); // JOHN

		/*
		 * 15. filter(Predicate) Keeps the value if predicate is true, else returns
		 * empty.
		 */

		Optional<String> name8 = Optional.of("Alex");
		Optional<String> valid = name8.filter(n -> n.startsWith("A"));
		System.out.println(valid.isPresent()); // true

		/*
		 * 🧠 Bonus Tips for Interviews Prefer orElseGet() over orElse() when the
		 * default is expensive.
		 * 
		 * Avoid using get() without isPresent() (or use orElseThrow()).
		 * 
		 * flatMap() is useful when chaining Optionals (nested Optional resolution). Use
		 * filter() to validate Optional values.
		 */

	}
}
