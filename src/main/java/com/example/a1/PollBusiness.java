package com.example.a1;

import org.w3c.dom.Text;

import java.io.PrintWriter;
import java.util.HashMap;

public class PollBusiness {



    public static Poll CreatePoll(String name, String question, Choice[] choices) {

        Poll newPoll;

        try {
            newPoll = new Poll(name, question, choices);
            newPoll.status = Poll.PollStatus.CREATED;
            return newPoll;
        }
        catch(Exception ex){

        }
        return null;
    }

    public static void UpdatePoll(Poll poll, String name, String question, Choice[] choices) {
        if(poll.status == Poll.PollStatus.RUNNING || poll.status == Poll.PollStatus.CREATED)
        {
            //CLEAR CURRENT POLL RESULTS HERE ALSO
            poll.setName(name);
            poll.setQuestion(question);
            poll.setChoices(choices);
        }
    }

    public static void ClearPoll(Poll poll) {
        if(poll.status == Poll.PollStatus.RUNNING){
            //CLEAR CURRENT POLL RESULTS HERE ALSO
        } else if(poll.status == Poll.PollStatus.RELEASED){
            //CLEAR CURRENT POLL RESULTS HERE ALSO
            poll.status = Poll.PollStatus.CREATED;
        }
    }

    public static void ClosePoll(Poll poll) {

    }

    public static void RunPoll(Poll poll) {
        poll.status = Poll.PollStatus.RUNNING;
    }

    public static void ReleasePoll(Poll poll) {
        poll.status = Poll.PollStatus.RELEASED;
    }

    public static void UnreleasePoll(Poll poll) {
        poll.status = Poll.PollStatus.RUNNING;
    }

    public static void Vote(Participant user, String choice) {

    }

    public static HashMap<String[],Integer> GetPollResults(Poll poll) {
        return null;
    }

    public static void DownloadPollDetails(Poll poll, PrintWriter output, String filename) {

    }

}
