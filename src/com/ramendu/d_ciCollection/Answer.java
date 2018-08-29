package com.ramendu.d_ciCollection;

public class Answer {

    private String id;
    private String answer;
    private String by;

    public Answer() {
    }

    public Answer(String id, String answer, String by) {
        this.id = id;
        this.answer = answer;
        this.by = by;
    }

    public String toString() {
        return "id = "+id+" answered = "+answer+" "+by;
    }
}
