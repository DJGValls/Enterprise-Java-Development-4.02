package EnterpriseJavaDevelopment42.Controller;


import EnterpriseJavaDevelopment42.Model.Employee;
import EnterpriseJavaDevelopment42.Model.Status;
import EnterpriseJavaDevelopment42.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/doctors")
    public List<Employee> list(){
        return employeeService.list();
    }

    @GetMapping("/doctors/{employeeId}")
    public Employee get(@PathVariable int employeeId){
        return employeeService.get(employeeId);
    }

    @GetMapping("/doctors/{status}")
    public Employee get(@PathVariable Status status ){
        return employeeService.get(status);
    }

}
