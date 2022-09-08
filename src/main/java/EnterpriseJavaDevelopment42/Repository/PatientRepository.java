package EnterpriseJavaDevelopment42.Repository;

import EnterpriseJavaDevelopment42.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

    Patient findAllByDateOfBirthIsBetween(Date dateOfBirth);

    Optional<Patient> findAllByAdmitedBy_Department(String department);

    Optional<Patient> findAllByAdmitedBy_Status_Off(String status);

}
