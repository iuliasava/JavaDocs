package ro.teamnet.zth.appl.controller;

import org.codehaus.jackson.map.ObjectMapper;
import org.omg.CORBA.Request;
import ro.teamnet.zth.api.annotations.MyController;
import ro.teamnet.zth.api.annotations.MyRequestMethod;
import ro.teamnet.zth.api.annotations.MyRequestParam;
import ro.teamnet.zth.appl.Service.EmployeeService;
import ro.teamnet.zth.appl.Service.EmployeeServiceImpl;
import ro.teamnet.zth.appl.domain.Employee;

import java.util.List;

/**
 * Created by user on 7/15/2016.
 */
@MyController(urlPath = "/employees")
public class EmployeeController {
    EmployeeService employeeService = new EmployeeServiceImpl();

    @MyRequestMethod(urlPath = "/all")
    public List<Employee> getAllEmployees(){
        return employeeService.findAllEmployees();
    }

    @MyRequestMethod(urlPath = "/one")
    public Employee getOneEmployee(@MyRequestParam(name="id") Long id){
        return employeeService.findOneEmployee(id);
    }

    @MyRequestMethod(urlPath = "/delete")
    public Employee deleteOneEmployee(@MyRequestParam(name="id") Long id){
        return employeeService.findOneEmployee(id);
    }
}
