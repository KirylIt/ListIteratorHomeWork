import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        //Создайте ArrayList, используя ListIterator,
        //обойдите коллекцию в обратном порядке и выведите все элементы в консоль,
        // после вывода удалите каждый элемент.
        //Проверьте коллекцию на пустоту, используя метод isEmpty().
        List<String> arrayList = Arrays.asList("Cat", "Dog", "Frog", "Elk", "Cow", "Duck");
        ListIterator <String> listIterator = arrayList.listIterator();

        while (listIterator.hasNext()){
            String element = listIterator.next();
            listIterator.set(element + " ");
        }
        while (listIterator.hasPrevious()){
            String element = listIterator.previous();
            System.out.print(element + " ");
        }
        while (listIterator.hasPrevious()){
            String element = listIterator.previous();
            listIterator.remove();
        }
        System.out.println();
        boolean empty = arrayList.isEmpty();
        if (empty == true){
            System.out.println("List is empty");
        }
        System.out.println("list is not empty");
    }
}