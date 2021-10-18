package com.example.a1;

import com.sun.istack.internal.NotNull;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import javax.xml.soap.Text;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;



@WebServlet(name = "com.example.a1.PollServlet", value = "/PollServlet")
public class PollServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //out.println("GET request");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);

        //PollManager mn = new PollManager();

        String poll_Name = request.getParameter("name");
        String question =  request.getParameter("question");
        String choices_String = request.getParameter("choices");
        String pollCreation = request.getParameter("PollCreation");
        String PollStart = request.getParameter("PollStart");

        String PollClose = request.getParameter("PollClose");
        String PollRelease = request.getParameter("PollRelease");
        String PollStartUnrelease = request.getParameter("PollUn");
        String PollStartUpdate = request.getParameter("PollUp");

        if(pollCreation != null) {

            Choice some_Choices = new Choice();
            some_Choices.setText(choices_String);
            Choice[] ch_ls = {some_Choices};

            bs.CreatePoll(poll_Name, question, ch_ls);
            out.println("poll created");
        }
        else if(PollStart != null){
            out.println("poll has begun");
            bs.RunPoll();
            out.println(bs.newPoll.status);
        }
        else if(PollClose != null){
            out.println("poll has closed");
            bs.ClosePoll();
        }
        else if(PollRelease != null){
            out.println("poll has been released to public");
            bs.ReleasePoll();
        }
        else if(PollStartUnrelease != null){
            out.println("poll has been removed from public");
            bs.UnreleasePoll();
        }
        else if(PollStartUpdate != null){
            out.println("poll has been updated");

            Choice some_Choices = new Choice();
            some_Choices.setText(choices_String);
            Choice[] ch_ls = {some_Choices};

            bs.UpdatePoll(poll_Name, question, ch_ls);
            out.println(bs.newPoll.getName());
        }



    }

    PollBusiness bs = new PollBusiness();
}
