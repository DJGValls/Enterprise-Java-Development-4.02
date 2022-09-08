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

    //Ejercicio 1
    @GetMapping("/doctors")
    public List<Employee> list(){
        return employeeService.list();
    }

    //Ejercicio 2
    @GetMapping("/doctors/{employeeId}")
    public Employee get(@PathVariable int employeeId){
        return employeeService.get(employeeId);
    }

    //Ejercicio 3
    @GetMapping("/doctors/{status}")
    public Employee get(@PathVariable Status status){
        return employeeService.get(status);
    }

    //Ejercicio 4
    @GetMapping("/doctors/{department}")
    public Employee get(@PathVariable String department){
        return employeeService.get(department);
    }

}
