package com.example.a1;

import org.w3c.dom.Text;

public class Poll {

    enum PollStatus {
        CREATED,
        RUNNING,
        RELEASED
    }

    String name;
    Text question;
    PollStatus status;
    Choice[] choices;

    public Poll(String _name,Text _question,PollStatus _status,Choice[] _choices) {
        name = _name;
        question = _question;
        status = _status;
        choices = _choices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Text getQuestion() {
        return question;
    }

    public void setQuestion(Text question) {
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
