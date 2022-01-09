package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import static javax.swing.JOptionPane.showMessageDialog;

public class Duty {
    private HashMap<String, String> dutyMap = new LinkedHashMap<>();
    private String[][] dutyArray = new String[14][4];
    private HashMap<String, Integer> posts;
    private ArrayList<String> students;

    Duty() {
        this.posts = Post.getPosts();
        generateDutyMap();
        generateDutyArray();
    }

    private void generateDutyMap() {
        this.students = Students.getStudentsShuffle();
        int studentsCount = 0;
        for (HashMap.Entry<String, Integer> post : this.posts.entrySet()) {
            int count = post.getValue() + studentsCount;
            StringBuilder studentsList = new StringBuilder();
            for (; studentsCount < count; studentsCount++) {
                if (studentsCount + 1 < count) {
                    studentsList.append(this.students.get(studentsCount)).append(", ");
                } else {
                    studentsList.append(this.students.get(studentsCount));
                }
            }
            this.dutyMap.put(post.getKey(), studentsList.toString());
        }
    }

    private void generateDutyArray() {
        this.students = Students.getStudentsShuffle();
        int studentsCount = 0;
        int postsCount = 0;
        for (HashMap.Entry<String, Integer> post : this.posts.entrySet()) {
            int i = 0;
            dutyArray[postsCount][i] = post.getKey();
            for (i = 1; i < post.getValue() + 1; i++) {
                dutyArray[postsCount][i] = this.students.get(studentsCount);
                studentsCount++;
            }
            postsCount++;
        }
    }

    public HashMap<String, String> getDutyMap() {
        return this.dutyMap;
    }

    public String[][] getDutyArray() {
        return this.dutyArray;
    }

    public void viewDutyMap(){
        StringBuilder postsWithStudentsList = new StringBuilder();
        for (HashMap.Entry<String, String> postWithStudents : this.dutyMap.entrySet()) {
            postsWithStudentsList.append(postWithStudents.getKey()).append(": ").append(postWithStudents.getValue()).append("\n");
        }
        showMessageDialog(null, postsWithStudentsList.toString(), "Дежурство", JOptionPane.PLAIN_MESSAGE);
    }

}
