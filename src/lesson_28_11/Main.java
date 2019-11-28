package lesson_28_11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hello");
        list.add(1);

        System.out.println(list.get(1));
    }
}
