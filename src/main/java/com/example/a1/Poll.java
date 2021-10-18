package com.example.a1;

import org.w3c.dom.Text;

public class Poll {

    enum PollStatus {
        CREATED,
        RUNNING,
        RELEASED
    }

    String name;
    String question;
    PollStatus status;
    Choice[] choices;

    public Poll(String _name,String _question,Choice[] _choices) {
        name = _name;
        question = _question;
        choices = _choices;
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

    public Choice[] getChoices() {
        return choices;
    }

    public void setChoices(Choice[] choices) {
        this.choices = choices;
    }

}
