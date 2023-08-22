import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class FindOdd {
    public static int findIt(int[] a) {
        Map<String, Integer> map = new HashMap<>();
        for (int j : a) {
            String key = Integer.toString(j);
            if (map.containsKey(key)) {
                int p = map.get(key) + 1;
                map.put(key, p);
            } else {
                map.put(key, 1);
            }
        }
        System.out.println(map);
        int maxVal = 0;
        for (String key : map.keySet()) {
            if (Integer.parseInt(key) > maxVal && map.get(key) % 2 == 1) {
                maxVal = Integer.parseInt(key);
            }
        }
        return maxVal;
    }
}
