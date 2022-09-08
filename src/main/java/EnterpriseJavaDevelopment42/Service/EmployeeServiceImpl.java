package EnterpriseJavaDevelopment42.Service;

import EnterpriseJavaDevelopment42.Model.Employee;
import EnterpriseJavaDevelopment42.Model.Status;
import EnterpriseJavaDevelopment42.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> list() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee get(int employeeId) {
        return (Employee) employeeRepository.findById(employeeId).get();
    }

    @Override
    public Employee get(Status status) {
        return employeeRepository.findAllByStatus(status);
    }


}
