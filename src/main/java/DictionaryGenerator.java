import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DictionaryGenerator {
    public static void main(String[] args) {
        final String originalString = "С самого раннего детства я больше всего на свете любил море. Я завидовал каждому матросу, отправлявшемуся в дальнее плавание. По целым часам я простаивал на морском берегу и не отрывая глаз рассматривал корабли, проходившие мимо.";
        Stream.of (originalString)
                .forEach(x -> System.out.println(x));
        Stream.of (split(originalString))
                .forEach(x -> System.out.println(x));
    }

    public static List<String> split(String str) {
        return Stream.of(str.split(" "))
                .map(elem -> new String(elem))
                .map(elem -> elem.toLowerCase())
                .sorted()
                .distinct()
                .collect(Collectors.toList());
    }
}
//В программе присутствуют следующие отличительные черты функционального стиля:
//1) Использованны  final-переменные.
//2) Детерминированность функций (метод split Детерминирован).
//3) Использованны МОДАНЫ для минимизации побочных эффектов и хранения промежуточных результатов
