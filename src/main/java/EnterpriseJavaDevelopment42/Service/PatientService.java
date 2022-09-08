package EnterpriseJavaDevelopment42.Service;

import EnterpriseJavaDevelopment42.Model.Employee;
import EnterpriseJavaDevelopment42.Model.Patient;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface PatientService {

    List<Patient> list(); //metodo para devolver una lista de todos los patients, ejercicio 5

    Patient get(int patientId); //metodo para devolver patients por su patient_id, ejercicio 6

    Patient get(Date dateOfBirth); //metodo para devolver patients por su date_of_birth, ejercicio 7

    Optional<Patient> patientsListByDoctorDepartment(); //metodo para devolver una lista de patients por el department de employee, ejercicio 8

    Optional<Patient> patientsListByDoctorOff(); //metodo para devolver una lista de patients por el status OFF de employee

}
