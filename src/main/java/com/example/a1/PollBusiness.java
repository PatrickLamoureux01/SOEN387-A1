package com.example.a1;

import org.w3c.dom.Text;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class PollBusiness {



    public static void CreatePoll(Poll poll, String name, String question, ArrayList<Choice> choices) {



        try {
            poll.setName(name);
            poll.setQuestion(question);
            poll.setChoices(choices);
            poll.setStatus(Poll.PollStatus.CREATED);

        }
        catch(Exception ex){

        }
    }

    public static void UpdatePoll(Poll poll, String name, String question, ArrayList<Choice> choices) {
        if(poll.getStatus() == Poll.PollStatus.RUNNING || poll.getStatus() == Poll.PollStatus.CREATED)
        {
            //CLEAR CURRENT POLL RESULTS HERE ALSO
            poll.setName(name);
            poll.setQuestion(question);
            poll.setChoices(choices);
        }
    }

    public static void ClearPoll(Poll poll) {
        if(poll.getStatus() == Poll.PollStatus.RUNNING){
            //CLEAR CURRENT POLL RESULTS HERE ALSO
        } else if(poll.getStatus() == Poll.PollStatus.RELEASED){
            //CLEAR CURRENT POLL RESULTS HERE ALSO
            poll.setStatus(Poll.PollStatus.CREATED);
        }
    }

    public static void ClosePoll(Poll poll) {

    }

    public static void RunPoll(Poll poll) {
        poll.setStatus(Poll.PollStatus.RUNNING);
    }

    public static void ReleasePoll(Poll poll) {
        poll.setStatus(Poll.PollStatus.RELEASED);
    }

    public static void UnreleasePoll(Poll poll) {
        poll.setStatus(Poll.PollStatus.RUNNING);
    }

    public static void Vote(Participant user, String choice) {

    }

    public static HashMap<String[],Integer> GetPollResults(Poll poll) {
        return null;
    }

    public static void DownloadPollDetails(Poll poll, PrintWriter output, String filename) {

    }

}
