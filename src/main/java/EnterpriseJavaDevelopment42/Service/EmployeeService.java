package EnterpriseJavaDevelopment42.Service;

import EnterpriseJavaDevelopment42.Model.Employee;
import EnterpriseJavaDevelopment42.Model.Status;

import java.util.List;

public interface EmployeeService {

    List<Employee> list(); //metodo para devolver una lista de todos los doctores, punto 1

    Employee get(int employeeId); //metodo para devolver employees por su employee_id

    Employee get(Status status); //metodo para devolver employees por su estado



}
