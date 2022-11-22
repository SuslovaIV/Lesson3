import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Random;

public class AddElements {
    public static void add(List<Integer> list, int length) {
        for (int i = 0; i < length; i++) {
            list.add(i);
        }
    }
    public static Integer getRandomElement(List<Integer> list, Random random, int length) {
        return list.get(random.nextInt(length));
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        var timeS = System.currentTimeMillis();
        add(arrayList, 1000000);
        var timeF = System.currentTimeMillis();
        System.out.println("Заполнение ArrayList " + (timeF - timeS));
        List<Integer> linkedList = new LinkedList<Integer>();
        timeS = System.currentTimeMillis();
        add(linkedList, 1000000);
        timeF = System.currentTimeMillis();
        System.out.println("Заполнения LinkedList " + (timeF - timeS));
        Random random = new Random();
        timeS = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            Integer value = getRandomElement(arrayList, random, 100000);
        }
        timeF = System.currentTimeMillis();
        System.out.println();
        System.out.println("Получение элементов ArrayList " + (timeF - timeS));

        timeS = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            Integer value = getRandomElement(linkedList, random, 100000);
        }
        timeF = System.currentTimeMillis();
        System.out.println("Получение элементов  LinkedList " + + (timeF - timeS));
    }
}
