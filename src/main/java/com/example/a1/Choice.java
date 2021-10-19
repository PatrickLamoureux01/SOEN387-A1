package com.example.a1;

import org.w3c.dom.Text;

public class Choice {

    String text;
    String description;


    public Choice(String t, String d) {

        text = t;
        description = d;
    }

    public Choice(String t) {
        text = t;
        description = null;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
