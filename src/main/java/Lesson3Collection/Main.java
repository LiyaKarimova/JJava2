package Lesson3Collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("F");
        arrayList.add("G");
        arrayList.add("S");
        arrayList.add("F");
        arrayList.add("H");
        arrayList.add("S");
        arrayList.add("S");
        arrayList.add("J");
        arrayList.add("A");
        System.out.println("Уникальные значения:" + arrayOnSet(arrayList));
        System.out.println("Количество одинаковых значений" + numberOfDublicate(arrayList));

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "123456");
        phoneBook.add("Петров","759303");
        phoneBook.add("Иванов", "123456740");

        List<String> numbers = phoneBook.get("Иванов1");
        if (numbers != null) {
            System.out.println(numbers);
        } else {
            System.out.println("Error");
        }
    }

    public static HashSet arrayOnSet(ArrayList<String> arrayList) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(arrayList);
        return (hashSet);
    }

    public static HashMap<String, Integer> numberOfDublicate(ArrayList<String> arrayList) {
        HashMap<String, Integer> hm = new HashMap<>();
        for (String string : arrayList) {
            if (hm.containsKey(string)) {
                int counter = hm.get(string);
                counter += 1;
                hm.put(string, counter);
            } else {
                hm.put(string, 1);
            }
        }
        return hm;
    }
}



