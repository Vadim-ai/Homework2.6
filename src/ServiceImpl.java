import java.util.*;

public class ServiceImpl implements Service {

    public Set <Integer> getEvenNumbers(List<Integer> myList) {
        Set <Integer> resultSet = new TreeSet<>();
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) % 2 == 0) {
                resultSet.add(myList.get(i));
            }
        }
       return resultSet;
    }

    public List <Integer> getOddNumbers (List <Integer> myList) {
        List <Integer> resultList = new ArrayList<>();
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) % 2 == 1) {
                resultList.add(myList.get(i));
            }
        }
        return resultList;
    }

    public Set <String> getUniqueWords (List <String> myWords) {
        Set <String> resultList = new HashSet<>(myWords);
        return resultList;
    }

    public int getDuplicateWords (List<String> myWords) {
        int calculateSizeOfLists = 0;
        Set <String> resultSet = new HashSet<>(myWords);
        List <String> resultList = new ArrayList<>(resultSet);

        for (int i = 0; i < resultList.size(); i++) {
            if(Collections.frequency(myWords,resultList.get(i)) > 1) {
                calculateSizeOfLists += Collections.frequency(myWords,resultList.get(i));
            }
        }

        return calculateSizeOfLists;
    }
}
