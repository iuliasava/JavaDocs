package ro.teamnet.zth.appl.controller;

import ro.teamnet.zth.api.annotations.MyController;
import ro.teamnet.zth.api.annotations.MyRequestMethod;
import ro.teamnet.zth.api.annotations.MyRequestParam;
import ro.teamnet.zth.appl.domain.Employee;
import ro.teamnet.zth.appl.domain.Job;

/**
 * Created by user on 7/15/2016.
 */
@MyController(urlPath = "/departments")
public class DepartmentController {

    @MyRequestMethod(urlPath = "/all")
    public String getAllDepartments(){
        return "allDepartments";
    }

    @MyRequestMethod(urlPath = "/one")
    public String getOneDepartment(){
        return "oneRandomDepartment";
    }

}
