package com.example.a1;

import org.w3c.dom.Text;

import java.io.PrintWriter;
import java.util.HashMap;

public class PollBusiness {

    Poll newPoll;

    public Poll CreatePoll(String name, String question, Choice[] choices) {

        try {
            newPoll = new Poll(name, question, choices);
            newPoll.status = Poll.PollStatus.CREATED;
            return newPoll;
        }
        catch(Exception ex){

        }
        return null;
    }

    public void UpdatePoll(String name, String question, Choice[] choices) {
        if(newPoll.status == Poll.PollStatus.RUNNING || newPoll.status == Poll.PollStatus.CREATED)
        {
            //CLEAR CURRENT POLL RESULTS HERE ALSO
            newPoll.setName(name);
            newPoll.setQuestion(question);
            newPoll.setChoices(choices);
        }
    }

    public void ClearPoll() {
        if(newPoll.status == Poll.PollStatus.RUNNING){
            //CLEAR CURRENT POLL RESULTS HERE ALSO
        } else if(newPoll.status == Poll.PollStatus.RELEASED){
            //CLEAR CURRENT POLL RESULTS HERE ALSO
            newPoll.status = Poll.PollStatus.CREATED;
        }
    }

    public void ClosePoll() {

    }

    public void RunPoll() {
        newPoll.status = Poll.PollStatus.RUNNING;
    }

    public void ReleasePoll() {
        newPoll.status = Poll.PollStatus.RELEASED;
    }

    public void UnreleasePoll() {
        newPoll.status = Poll.PollStatus.RUNNING;
    }

    public void Vote(Participant user, String choice) {

    }

    public HashMap<String[],Integer> GetPollResults() {
        return null;
    }

    public void DownloadPollDetails(PrintWriter output, String filename) {

    }

}
