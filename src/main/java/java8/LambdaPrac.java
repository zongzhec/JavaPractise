package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class LambdaPrac {

    public static void main(String args[]) {

        LambdaPrac prac = new LambdaPrac();
        List<String> names = prac.initialNewList();
        prac.sortUsingJava7(names);
        names = prac.initialNewList();
        prac.sortUsingJava8(names);

        eval(names, name -> name.contains("G"));

    }

    public List<String> initialNewList() {
        List<String> names = new ArrayList<>();
        names.add("Sina");
        names.add("QQ");
        names.add("Alibaba");
        names.add("Goudong");
        names.add("GouDu");
        System.out.println("names(1): " + names.get(0));
        return names;
    }

    // Use Java7 Sorting
    private void sortUsingJava7(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("sorted using java7: " + names);
    }

    // Use Java8 Sorting
    private void sortUsingJava8(List<String> names) {
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
        System.out.println("sorted using java8: " + names);
    }

    // functional API
    public static void eval(List<String> names, Predicate<String> predicate){
        for (String name: names){
            if (predicate.test(name)){
                System.out.println(" " + name);
            }
        }
    }
}
