package ro.teamnet.zth.appl.Service;

import ro.teamnet.zth.api.em.EntityManager;
import ro.teamnet.zth.appl.dao.EmployeeDao;
import ro.teamnet.zth.appl.domain.Employee;

import java.util.List;

/**
 * Created by user on 7/16/2016.
 */
public class EmployeeServiceImpl implements EmployeeService{
    EmployeeDao employeeDao =new EmployeeDao();
    @Override
    public List<Employee> findAllEmployees() {
        return employeeDao.getAllEmployees();
    }

    @Override
    public Employee findOneEmployee(Long id) {
        return employeeDao.getEmployeeById(id);
    }

    @Override
    public void deleteOneEmployee(Long id) {
        employeeDao.deleteEmployee(employeeDao.getEmployeeById(id));
    }
}
