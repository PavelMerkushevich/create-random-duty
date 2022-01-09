package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Post {
    private static final HashMap<String, Integer> posts = new LinkedHashMap<>();

    static {
        posts.put("Звонки", 2);
        posts.put("Труды", 1);
        posts.put("Директор", 1);
        posts.put("Фойе 1-ого этажа", 2);
        posts.put("Крынiчка", 1);
        posts.put("Лестница между 1-ым и 2-ым этажом", 2);
        posts.put("Фойе 2-ого этажа", 2);
        posts.put("Лестница между 2-ым и 3-им этажом", 2);
        posts.put("40-51 кабинеты", 3);
        posts.put("30-31 кабинеты", 1);
        posts.put("36-38 кабинеты", 1);
        posts.put("Яблоко и напротив", 2);
        posts.put("19-29 кабинеты", 3);
        posts.put("13-18 кабинеты", 2);
    }

    public static HashMap<String, Integer> getPosts() {
        return posts;
    }


}
