package ro.teamnet.zth.appl.Service;

import ro.teamnet.zth.appl.domain.Employee;

import java.util.List;


/**
 * Created by user on 7/16/2016.
 */
public interface EmployeeService {
    public List<Employee> findAllEmployees();
    public Employee findOneEmployee(Long id);
    public void deleteOneEmployee(Long id);
}
