package jrout.tutorial.springbootservletjsp.controller;

import jrout.tutorial.springbootservletjsp.dao.Commons;
import jrout.tutorial.springbootservletjsp.dao.SimpleTestWithDB;
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

@WebServlet(urlPatterns = { "/pollControllerServlet" })
public class PollControllerServlet extends HttpServlet {

    // We are tightly coupling these dependencies..
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fname = req.getParameter("fname");
        String empId = req.getParameter("empId");

        SimpleTestWithDB simpleTestWithDB = new SimpleTestWithDB();
        simpleTestWithDB.getDataInfors();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
