package com.example.a1;

import org.w3c.dom.Text;

import java.io.Serializable;
import java.util.ArrayList;

public class Poll implements Serializable {

    enum PollStatus {
        CREATED,
        RUNNING,
        RELEASED
    }

    private String name;
    private String question;
    private PollStatus status;
    private ArrayList<Choice> choices;

    public Poll() {

    }

    public Poll(String _name,String _question,ArrayList<Choice> _choices) {
        this.name = _name;
        this.question = _question;
        this.choices = _choices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public PollStatus getStatus() {
        return status;
    }

    public void setStatus(PollStatus status) {
        this.status = status;
    }

    public ArrayList<Choice> getChoices() {
        return choices;
    }

    public void setChoices(ArrayList<Choice> choices) {
        this.choices = choices;
    }

    public void upvote(int index) { this.choices.get(index).incrementVotes(); }

}
