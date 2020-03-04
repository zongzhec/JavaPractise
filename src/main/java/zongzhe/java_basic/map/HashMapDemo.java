package zongzhe.java_basic.map;

import java.util.HashMap;

public class HashMapDemo {

    static int mapCounter = 0;

    public static void main(String args[]) {
        HashMapDemo hMapDemo = new HashMapDemo();
        HashMap<Integer, String> hMap1 = hMapDemo.createHashMap();
        hMap1.put(mapCounter, "");
    }

    public HashMap<Integer, String> createHashMap() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        return hashMap;
    }

//    @Override
//    public boolean equals(HashMap<Integer, String> a, Object b) {
//        if (b == null) return false;
//        if (b instanceof HashMap) {
//            HashMap<Integer, String> hashMapB = (HashMap<Integer, String>) b;
//            if (hashMapB.size() != a.size()) return false;
//            Set keys = hashMapB.keySet();
//            keys.forEach(k -> {
//                if (!a.containsKey(k) || !a.get(k).equals(hashMapB.get(k))) return false;
//            });
//        } else return false;
//        return true;
//    }
}
