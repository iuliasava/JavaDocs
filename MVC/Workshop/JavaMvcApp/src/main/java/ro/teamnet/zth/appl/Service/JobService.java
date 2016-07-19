package ro.teamnet.zth.appl.Service;

import ro.teamnet.zth.appl.domain.Employee;
import ro.teamnet.zth.appl.domain.Job;

import java.util.List;

/**
 * Created by user on 7/19/2016.
 */
public interface JobService {
    public List<Job> findAllJobs();
    public Job findOneJob(String id);
    public void deleteOneJob(String id);
    public Job insertJob(Job job);
    public Job updateJob(Job job);
}
