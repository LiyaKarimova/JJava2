package Lesson3Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook extends HashMap {
   HashMap <String, List<String>> hashMap;

    public PhoneBook () {
        this.hashMap = new HashMap<>();
    }

    public void add (String name, String number){
        if (hashMap.containsKey(name)) {
            hashMap.get(name).add(number);
        } else {
            ArrayList <String> numberArray = new ArrayList<>();
            numberArray.add(number);
            hashMap.put(name,numberArray);
        }
    }

    public List <String> get (String name) {
        return hashMap.get(name);
    }

}
