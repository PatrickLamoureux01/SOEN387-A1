package com.example.a1;

import org.w3c.dom.Text;

public class Choice {

    String text;
    Text description;

    public Choice() {

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Text getDescription() {
        return description;
    }

    public void setDescription(Text description) {
        this.description = description;
    }

}
