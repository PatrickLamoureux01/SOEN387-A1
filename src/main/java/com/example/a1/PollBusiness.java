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
            System.out.println(ex);
        }
    }

    public static void UpdatePoll(Poll poll, String name, String question, ArrayList<Choice> choices) {
        try {
            if(poll.getStatus() == Poll.PollStatus.RELEASED)
                throw new Exception("Error: This Poll has been released. Unrelease the Poll to update it.");

            if (poll.getStatus() == Poll.PollStatus.RUNNING || poll.getStatus() == Poll.PollStatus.CREATED) {
                poll.clear();
                poll.setName(name);
                poll.setQuestion(question);
                poll.setChoices(choices);
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }

    }

    public static void ClearPoll(Poll poll) {
        try {
            if(poll.getStatus() == Poll.PollStatus.CREATED)
                throw new Exception("Error: Poll must be Running or Release to be cleared.");

            if (poll.getStatus() == Poll.PollStatus.RUNNING) {
                poll.clear();
            } else if (poll.getStatus() == Poll.PollStatus.RELEASED) {
                poll.clear();
                poll.setStatus(Poll.PollStatus.CREATED);
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }

    public static void ClosePoll(Poll poll) {
        try {
            if(poll.getStatus() != Poll.PollStatus.RELEASED){
                throw new Exception("Error: Only Released Polls may be closed.");
            }

            //Remove the Polls Data from the system
            poll = null;
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }

    public static void RunPoll(Poll poll) {
        try {
            if(poll.getStatus() == Poll.PollStatus.RUNNING) {
                throw new Exception("Error: Poll is already Running.");
            }
            if(poll.getStatus() == Poll.PollStatus.RELEASED) {
                throw new Exception("Error: Poll has been Released. Clear Poll to reset it to be ran again.");
            }
            poll.setStatus(Poll.PollStatus.RUNNING);
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }

    public static void ReleasePoll(Poll poll) {
        try {
            if(poll.getStatus() == Poll.PollStatus.CREATED) {
                throw new Exception("Error: Poll must be Running before it can be Released.");
            }
            if(poll.getStatus() == Poll.PollStatus.RELEASED) {
                throw new Exception("Error: Poll has already been Released.");
            }
            poll.setStatus(Poll.PollStatus.RELEASED);
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void UnreleasePoll(Poll poll) {
        try {
            if(poll.getStatus() != Poll.PollStatus.RELEASED) {
                throw new Exception("Error: This Poll has not been Released.");
            }
            poll.setStatus(Poll.PollStatus.RUNNING);
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }

    public static void Vote(Participant user, String choice) {

    }

    public static HashMap<String[],Integer> GetPollResults(Poll poll) {
        return null;
    }

    public static void DownloadPollDetails(Poll poll, PrintWriter output, String filename) {

    }

}
