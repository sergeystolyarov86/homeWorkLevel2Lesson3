package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {
       String [] arrWords={"Небо","Монитор","Дом","Работа","Небо","Зима","Монитор","Дом","Кот","Работа","Лето","Куб","Лето"};
        Map<String,Integer> words = new HashMap<>();
        for (String word : arrWords) {
            words.put(word, words.getOrDefault(word, 0) + 1);
        }
        System.out.println("Слово и колличество повторений: "+words);
       System.out.println("");
        Set<String> uniq= new HashSet(Arrays.asList(arrWords));
        System.out.println("Список слов массива: "+uniq);
        System.out.println("");

        PhoneBook pb = new PhoneBook();

        pb.add("Джавов", "123321");
        pb.add("Сиплюсов", "456654");
        pb.add("Джавов", "789987");

        System.out.println(pb.get("Джавов"));
    }
    }

