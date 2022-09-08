package EnterpriseJavaDevelopment42.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue
    private int id;


    @OneToMany
    @JoinColumn(name = "emplyoee_id")
    private List<Employee> employeeId;

    private String department;

    private String name;

    @Enumerated(EnumType.STRING)
    private Status status;

    public int getId() {
        return id;
    }

    public List<Employee> getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }

    public void setEmployeeId(List<Employee> employeeId) {
        this.employeeId = employeeId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
