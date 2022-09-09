package EnterpriseJavaDevelopment42.Controller;


import EnterpriseJavaDevelopment42.Model.Employee;
import EnterpriseJavaDevelopment42.Model.Status;
import EnterpriseJavaDevelopment42.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping (value = "/doctors/{employeeId}", method = RequestMethod.GET)
    public Employee get(@PathVariable int employeeId){
        return employeeService.get(employeeId);
    }

    //Ejercicio 3
    @GetMapping("/doctors/OFF")
    public List<Employee> listStatusOff(){
        return employeeService.getStatus(Status.OFF);
    }
/*
    //Ejercicio 4
    @RequestMapping(value = "/doctors/{department}", method = RequestMethod.GET)
    public Employee get(@PathVariable String department){
        return employeeService.get(department);
    }
 */
}
