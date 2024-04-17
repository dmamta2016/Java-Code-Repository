import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
 
public class PredicateNegateDemo 
{
    public static void main(String[] args) 
    {
        List<Integer> sampleList = Arrays.asList(2020, 2021, 2022, 2023, 2024, 2025, 2026, 2027, 2028, 2029);
         //This is to check whether the predicate is leap or not
        Predicate<Integer> isLeap = i -> i % 4 == 0;
         
        Predicate<Integer> isNotLeap = isLeap.negate();
 
        List<Integer> leapList = sampleList.stream()
                    .filter(isLeap)
                    .collect(Collectors.toList());
         
        List<Integer> notLeapList = sampleList.stream().filter(isNotLeap)
                .collect(Collectors.toList());
         //print both the lists
        System.out.println("Leap Years are "+ leapList);
        System.out.println("Not Leap Years are "+ notLeapList );
    }

}

