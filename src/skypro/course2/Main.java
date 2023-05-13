package skypro.course2;

import java.util.*;

public class Main {
    public static List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    public static List<String> words = new ArrayList<>(List.of("ааааа", "ааааа", "я устала", "купите мне диплом"));
    public static List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

    public static void main(String[] args) {
        task1();
        task2();
        task4();
    }

    public static void task1() {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void task2() {
        Collections.sort(nums);
        Set<Integer> set = new HashSet<>(nums);
        for (Integer integer : set) {
            if (integer % 2 == 0) {
                System.out.print(integer + " ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
            }
        }
    }

    public static void task4() {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            int count = map.containsKey(string) ? map.get(string) : 0;
            map.put(string, count + 1);

        }
        System.out.println(map.values());
        System.out.println(map.keySet());
    }
}
