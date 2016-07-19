package ro.teamnet.zth.appl.controller;

import ro.teamnet.zth.api.annotations.MyBodyParam;
import ro.teamnet.zth.api.annotations.MyController;
import ro.teamnet.zth.api.annotations.MyRequestMethod;
import ro.teamnet.zth.api.annotations.MyRequestParam;
import ro.teamnet.zth.appl.Service.EmployeeService;
import ro.teamnet.zth.appl.Service.EmployeeServiceImpl;
import ro.teamnet.zth.appl.Service.JobService;
import ro.teamnet.zth.appl.Service.JobServiceImpl;
import ro.teamnet.zth.appl.domain.Employee;
import ro.teamnet.zth.appl.domain.Job;

import java.util.List;

@MyController(urlPath = "/jobs")
public class JobController {

   JobService jobService = new JobServiceImpl();

    @MyRequestMethod(urlPath = "/all")
    public List<Job> getAllJobs(){
        return jobService.findAllJobs();
    }

    @MyRequestMethod(urlPath = "/one")
    public Job getOneJob(@MyRequestParam(name="id") String id){
        return jobService.findOneJob(id);
    }

    @MyRequestMethod(urlPath = "/delete",methodType = "DELETE")
    public void deleteOneJob(@MyRequestParam(name="id") String id){
        jobService.deleteOneJob(id);
    }

    @MyRequestMethod(urlPath = "/create",methodType = "POST")
    public Job insertJob(@MyBodyParam(name="job") Job job){
        return jobService.insertJob(job);
    }

    @MyRequestMethod(urlPath = "/edit",methodType = "PUT")
    public Job updateJob(@MyBodyParam(name="job") Job job){
        return jobService.updateJob(job);
    }
}