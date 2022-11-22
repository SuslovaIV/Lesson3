import java.util.*;
public class MapKey {
    public static <K, V> Map<V, Collection<K>> exchange(Map<K, V> map) {
        Map<V, Collection<K>> map1 = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (map1.get(entry.getValue()) == null) {
                map1.put(entry.getValue(), new ArrayList<>());
            }
            map1.get(entry.getValue()).add(entry.getKey());

        }
        return map1;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < 10; i++) {
            map.put(i, i*10);
        }
        System.out.println(map);
        System.out.println(exchange(map));
    }
}
