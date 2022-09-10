package EnterpriseJavaDevelopment42.Controller;

import EnterpriseJavaDevelopment42.Model.Employee;
import EnterpriseJavaDevelopment42.Model.Patient;
import EnterpriseJavaDevelopment42.Model.Status;
import EnterpriseJavaDevelopment42.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    //ejercicio 5
    @GetMapping("/patients")
    public List<Patient> list(){
        return patientService.list();
    }

    //ejercicio 6
    @GetMapping ("/patients/patientsId/{patientId}")
    public Patient get(@PathVariable(value = "patientId") int patientId) {
        return patientService.get(patientId);
    }

    //ejercicio 7
    @GetMapping("/patients/byDate")
    public List<Patient> findAllByDateOfBirthIsBetween(@RequestParam(value = "dateOfBirth") @DateTimeFormat(pattern="yyyy/MM/dd") Date dateOfBirth, @RequestParam(value = "dateOfBirth2") @DateTimeFormat(pattern="yyyy/MM/dd") Date dateOfBirth2){
        return patientService.get(dateOfBirth, dateOfBirth2);
    }

    //ejercicio 8
    @GetMapping("patients/department/{department}")
    public List<Patient> findAllByAdmittedByDepartment(@PathVariable(value = "department") String department){
        return patientService.patientsListByDoctorDepartment(department);
    }

    @GetMapping("patients/doctorOFF/{doctor}")
    public List<Patient> patientsListByDoctorOff(@PathVariable(value = "doctor") Status admittedBy_status){
        return patientService.patientsListByDoctorOff(admittedBy_status);
    }







}
