package com.example.a1;

import org.w3c.dom.Text;

import java.io.PrintWriter;
import java.util.HashMap;

public class PollBusiness {

    public Poll CreatePoll(String name, Text question, Choice[] choices) {

        try {
            Poll newPoll = new Poll(name, question, choices);
            return newPoll;
        }
        catch(Exception ex){

        }
        return null;
    }

    public void UpdatePoll(String name, String question, String[] choices) {

    }

    public void ClearPoll() {

    }

    public void ClosePoll() {

    }

    public void RunPoll() {

    }

    public void ReleasePoll() {

    }

    public void UnreleasePoll() {

    }

    public void Vote(Participant user, String choice) {

    }

    public HashMap<String[],Integer> GetPollResults() {
        return null;
    }

    public void DownloadPollDetails(PrintWriter output, String filename) {

    }

}
