package com.silverabel.resultsAPI.answer;

import javax.persistence.*;

@Entity
@Table(name = "answer")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer question_id;
    private String name;

    public Answer() {
    }

    public Answer(Integer question_id, String name) {
        this.question_id = question_id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(Integer question_id) {
        this.question_id = question_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", question_id=" + question_id +
                ", name='" + name + '\'' +
                '}';
    }
}
