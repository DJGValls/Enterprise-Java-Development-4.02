package EnterpriseJavaDevelopment42.Service;

import EnterpriseJavaDevelopment42.Model.Patient;
import EnterpriseJavaDevelopment42.Model.Status;
import EnterpriseJavaDevelopment42.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<Patient> list() {
        return patientRepository.findAll();
    }

    @Override
    public Patient get(int patientId) {
        return patientRepository.findById(patientId).get();
    }

    @Override
    public Patient get(Date dateOfBirth) {
        return patientRepository.findAllByDateOfBirthIsBetween(dateOfBirth);
    }

    @Override
    public Optional<Patient> patientsListByDoctorDepartment(String department) {
        return patientRepository.findAllByAdmitedBy_Department(department);
    }

    @Override
    public Optional<Patient> patientsListByDoctorOff(Status status) {
        return patientRepository.findAllByAdmitedBy_Status_Off(Status.OFF);
    }
}
