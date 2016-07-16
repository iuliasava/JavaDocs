package ro.teamnet.zth.appl.controller;

import ro.teamnet.zth.api.annotations.MyController;
import ro.teamnet.zth.api.annotations.MyRequestMethod;

@MyController(urlPath = "/jobs")
public class JobController {

    @MyRequestMethod(urlPath = "/all")
    public String getAllEmployees(){
        return "allJobs";
    }

    @MyRequestMethod(urlPath = "/one")
    public String getOneEmployee(){
        return "oneRandomJob";
    }
}