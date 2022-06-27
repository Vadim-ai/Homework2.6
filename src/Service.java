import java.util.List;
import java.util.Set;

public interface Service {
    Set<Integer> getEvenNumbers(List<Integer> myList);
    List <Integer> getOddNumbers (List <Integer> myList);
    Set <String> getUniqueWords (List <String> myWords);
    int getDuplicateWords (List <String> myWords);

}
