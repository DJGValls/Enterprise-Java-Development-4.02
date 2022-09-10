package EnterpriseJavaDevelopment42.Service;

import EnterpriseJavaDevelopment42.Model.Employee;
import EnterpriseJavaDevelopment42.Model.Status;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> list(); //metodo para devolver una lista de todos los doctores, ejercicio 1

    Employee get(int employeeId); //metodo para devolver employees por su employee_id, ejercicio 2

    List<Employee> getStatus(Status status); //metodo para devolver employees por su estado, ejercicio 3

    List<Employee> getDepartment(String department); //metodo para devolver employees por su departamento, ejercicio 4



}
