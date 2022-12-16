package jrout.tutorial.springbootservletjsp.service;

import jrout.tutorial.springbootservletjsp.dao.IEmployeeDAO;
import jrout.tutorial.springbootservletjsp.dao.impl.EmployeeDAOImpl;
import jrout.tutorial.springbootservletjsp.model.Employee;
import jrout.tutorial.springbootservletjsp.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PollControllerService {
    public ArrayList<Map> getList(Map params) {
        ArrayList<Map> list = new ArrayList<Map>();
        return list;
    }
}
