import java.util.*;

public class MapArray {
    public static Map<Integer, Integer> getCounts(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer key:list) {
            if (map.get(key)==null){
                map.put(key,0);
            } else {
                map.put(key, map.get(key).intValue()+1);
            }

        }
        return map;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            list.add(random.nextInt(30));
        }
        Map<Integer, Integer> map = getCounts(list);
        System.out.println(map);
    }
}
