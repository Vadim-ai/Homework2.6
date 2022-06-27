import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List <String> myWords = new ArrayList<>(List.of("слон","клоп", "бегемот", "слон", "клоп", "пес"));

        ServiceImpl service = new ServiceImpl();

        System.out.println(service.getEvenNumbers(myList));
        System.out.println(service.getOddNumbers(myList));
        System.out.println(service.getUniqueWords(myWords));
        System.out.println(service.getDuplicateWords(myWords));
    }
}