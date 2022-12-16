package jrout.tutorial.springbootservletjsp.controller;

import jrout.tutorial.springbootservletjsp.daos.Commons;
import jrout.tutorial.springbootservletjsp.daos.Surveys;
import jrout.tutorial.springbootservletjsp.model.Employee;
import jrout.tutorial.springbootservletjsp.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Statement;
import java.util.List;

@WebServlet(urlPatterns = { "/pollController" })
public class PollControllerServlet extends HttpServlet {

    @Autowired
    private IEmployeeService employeeService;

    // We are tightly coupling these dependencies..
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fname = req.getParameter("fname");
        String empId = req.getParameter("empId");

        
        Commons commons = new Commons();
        Statement statement = (Statement) commons.getStatement();
        
        Surveys surveys = new Surveys();
        surveys.getSurvey(statement);     
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
