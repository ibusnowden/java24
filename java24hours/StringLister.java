package java24hours.java24hours;

import java.util.*;

public class StringLister {
    String[] names = new String[]{"Dell", "Omar", "Aziz", "Cris", "Sam", "Thomas", "Adam", "Sonny", "Jason", "Lora"};

    public StringLister(String[] moreNames) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < names.length; i++) list.add(names[i]);
        for (int i = 0; i < moreNames.length; i++) list.add(moreNames[i]);
        Collections.sort(list);
        for (String name : list) System.out.println(name);

    }

    public static void main(String[] arguments) {
        StringLister lister = new StringLister(arguments);
    }
}
