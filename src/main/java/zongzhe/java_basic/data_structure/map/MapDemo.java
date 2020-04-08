package zongzhe.java_basic.data_structure.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        checkAddFunc(); // 增
        checkDelFunc(); // 删
        checkQueryFunc(); // 查
        checkSetFunc(); // 改
    }

    private static void checkAddFunc() {
        Map map = new HashMap();
        map.put(1, "first");
        map.put(1, "first");
        map.put(2, "second");
        checkIterMap(map);
    }

    private static void checkDelFunc() {
        Map map = new HashMap();
        map.put(1, "first");
        map.remove(1);
        map.put(2, "second");
        checkIterMap(map);
    }

    private static void checkQueryFunc() {
        Map map = new HashMap();
        map.put(1, "first");
        map.put(2, "second");
        System.out.println("value of key 1? " + map.get(1));
        System.out.println("contains key 1? " + map.containsKey(1));
        System.out.println("contains value 2? " + map.containsValue(2));
    }

    private static void checkSetFunc() {
        Map map = new HashMap();
        map.put(1, "first");
        map.put(1, "updated first");
        map.put(2, "second");
        checkIterMap(map);
    }

    private static void checkIterMap(Map map) {
        System.out.println("printing Map");
        for (Object key : map.keySet()) {
            System.out.println("key: " + key + ", value: " + map.get(key));
        }

        for (Object value : map.values()) {
            System.out.println(value);
        }

        Set entrySet = map.entrySet();
        for (Object entry : entrySet) {
            System.out.println(entry);
        }
    }
}
