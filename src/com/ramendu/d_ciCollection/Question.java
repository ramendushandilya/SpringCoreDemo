package com.ramendu.d_ciCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question {

    private String id;
    private String name;
    private List<Answer> answers = new ArrayList<>();

    public Question() {
    }

    public Question(String id, String name, List<Answer> answers) {
        this.id = id;
        this.name = name;
        this.answers = answers;
    }

    void displayInfo() {

        System.out.println(id+" "+name);
        System.out.println("answers are:");
        Iterator<Answer> itr=answers.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
