package EnterpriseJavaDevelopment42.Service;

import EnterpriseJavaDevelopment42.Model.Employee;
import EnterpriseJavaDevelopment42.Model.Patient;
import EnterpriseJavaDevelopment42.Model.Status;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface PatientService {

    List<Patient> list(); //metodo para devolver una lista de todos los patients, ejercicio 5

    Patient get(int patientId); //metodo para devolver patients por su patient_id, ejercicio 6

    List<Patient> get(Date dateOfBirth, Date dateOfBirth2); //metodo para devolver patients por su date_of_birth, ejercicio 7

    List<Patient> patientsListByDoctorDepartment(String department); //metodo para devolver una lista de patients por el department de employee, ejercicio 8

    List<Patient> patientsListByDoctorOff(Status admittedBy_status); //metodo para devolver una lista de patients por el status OFF de employee

}
