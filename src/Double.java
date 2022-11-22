import java.util.*;
import java.util.stream.Collectors;

public class Double {
    public static Collection<Integer> collectionsWithoutDublicate(Collection<Integer> MyCollection) {
        return MyCollection.stream().collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        Collection<Integer> MyCollection = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            MyCollection.add(random.nextInt(20));
        }
        var set = collectionsWithoutDublicate(MyCollection);
        System.out.println(MyCollection);
        System.out.println(set);
    }
}

