/********* Implementation of Predicate.not() method in Java *******/
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNotDemo {
	public static void main(String[] args)
	{
		List<Integer> sampleList
			= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		/* Let us create a predicate for negation */
		Predicate<Integer> findEven = i -> i % 2 == 0;

		/* Now, we create a predicate object which is negation of supplied predicate*/
		Predicate<Integer> findOdd = Predicate.not(findEven);

		/* start filtering the even number using even predicate */
		List<Integer> evenNumbers
			= sampleList.stream().filter(findEven).collect(
				Collectors.toList());

		/* start filtering the odd number using odd predicate */
		List<Integer> oddNumbers
			= sampleList.stream().filter(findOdd).collect(
				Collectors.toList());
		/* Try to print the Lists for odd or even numbers */
		System.out.println("Here is the list of even numbers "+evenNumbers);
		System.out.println("Here is the list of odd numbers "+oddNumbers);
	}
}

