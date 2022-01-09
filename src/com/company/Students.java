package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Students {
    private static final ArrayList<String> students = new ArrayList<>();

    static {
        students.add("Базылюк");
        students.add("Войтюк");
        students.add("Ворон");
        students.add("Голякевич");
        students.add("Гутель");
        students.add("Дацкевич");
        students.add("Дудко");
        students.add("Залевская");
        students.add("Козак");
        students.add("Крупская");
        students.add("Кухарчик");
        students.add("Левшуков");
        students.add("Миткевич");
        students.add("Мороз");
        students.add("Нехень");
        students.add("Нущик");
        students.add("Оксенюк");
        students.add("Осипук");
        students.add("Прядка");
        students.add("Риндевич");
        students.add("Сергуц");
        students.add("Филипович");
        students.add("Шабанов");
        students.add("Шакун");
        students.add("Шпарло");
    }

    public static ArrayList<String> getStudentsShuffle() {
        Collections.shuffle(students);
        return students;
    }
}
