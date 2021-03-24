package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, HashSet<String>> map;

    PhoneBook() {
        this.map = new HashMap<>();
    }

    void add(String secondName, String phone) {
        HashSet<String> numbers;

        if (map.containsKey(secondName)) {
            numbers = map.get(secondName);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(phone);
        map.put(secondName, numbers);

    }

    Set<String> get(String lastName) {
        return map.get(lastName);
    }
}
