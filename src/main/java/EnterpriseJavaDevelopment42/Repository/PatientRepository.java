package EnterpriseJavaDevelopment42.Repository;

import EnterpriseJavaDevelopment42.Model.Patient;
import EnterpriseJavaDevelopment42.Model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

    Patient findAllByDateOfBirthIsBetween(Date dateOfBirth, Date dateOfBirth2);

    Optional<Patient> findAllByAdmittedByDepartment(String department);

    Optional<Patient> findByAdmittedByStatus(Status admittedBy_status);

}
