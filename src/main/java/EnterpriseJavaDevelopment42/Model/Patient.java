package EnterpriseJavaDevelopment42.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue
    private int patientId;

    private String name;

    private Date dateOfBirth;

    @ManyToOne
    private Employee admitedBy;

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Employee getAdmitedBy() {
        return admitedBy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAdmitedBy(Employee admitedBy) {
        this.admitedBy = admitedBy;
    }
}
