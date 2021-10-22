package com.example.a1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;



@WebServlet(name = "com.example.a1.PollServlet", value = "/PollServlet")
public class PollServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession(true);
        String parameterType = request.getParameter("type");

        Poll thePoll = (Poll) session.getAttribute("poll");

        switch (parameterType) {
            case "run":
                PollBusiness.RunPoll(thePoll);
                break;
            case "close":
                PollBusiness.ClosePoll(thePoll);
                break;
            case "release":
                PollBusiness.ReleasePoll(thePoll);
                break;
            case "unrelease":
                PollBusiness.UnreleasePoll(thePoll);
                break;
            case "update":
                request.getRequestDispatcher("update_poll.jsp").forward(request, response);
                break;
            case "clear":
                PollBusiness.ClearPoll(thePoll);
                break;

        }
        System.out.println(thePoll.getStatus());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession(true);

        String name = request.getParameter("pollName");
        String question =  request.getParameter("pollQuestion");
        String choices = request.getParameter("pollChoices");
        String[] choicesTemp = choices.split(",");
        ArrayList<Choice> pollChoices = new ArrayList<>();

        for (String c : choicesTemp) {
            if (c.contains(":")) { // if there is a description
                String[] descTemp = c.split(":");
                Choice ch = new Choice(descTemp[0],descTemp[1]);
                pollChoices.add(ch);
            } else {
                Choice ch = new Choice(c);
                pollChoices.add(ch);
            }
        }
        Poll newPoll = new Poll();
        PollBusiness.CreatePoll(newPoll,name,question,pollChoices);
        request.setAttribute("poll", newPoll);
        session.setAttribute("poll",newPoll);
        request.getRequestDispatcher("manager_index.jsp").forward(request, response);
    }

}
