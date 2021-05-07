import org.testng.annotations.Test;

import java.time.LocalDate;

public class CheckLocalPatientCount {


    @Test
    public void samePatientVisitingTwiceInLastThreeDays()
    {
        Patient p1=new Patient("Joe","P1", Patient.Location.Bangalore, LocalDate.of(2021,05,01),true);
        Patient p2=new Patient("Durai","P2",Patient.Location.Mumbai,LocalDate.of(2021,05,01),true);
        Patient p3=new Patient("Priya","P3",Patient.Location.Mangalore,LocalDate.of(2021,05,02),true);
        Patient p4=new Patient("Sowmia","P4",Patient.Location.Coimbatore,LocalDate.of(2021,05,03),true);
        Patient p5=new Patient("Johnson","P5",Patient.Location.Mangalore,LocalDate.of(2021,05,04),true);
        Patient p6=new Patient("Janani","P6",Patient.Location.Bangalore,LocalDate.of(2021,05,05),true);
        Patient p7=new Patient("Shreya","P7",Patient.Location.Bangalore,LocalDate.of(2021,05,06),true);
        Patient p8=new Patient("Janani","P6",Patient.Location.Bangalore,LocalDate.of(2021,05,07),true);

        Hospital chinmayaHospital= new Hospital();

        chinmayaHospital.addPatient(p1);
        chinmayaHospital.addPatient(p2);
        chinmayaHospital.addPatient(p3);
        chinmayaHospital.addPatient(p4);
        chinmayaHospital.addPatient(p5);
        chinmayaHospital.addPatient(p6);
        chinmayaHospital.addPatient(p7);
        chinmayaHospital.addPatient(p8);

        int countOfPatitentFromLastThreeDays=chinmayaHospital.findLocalOutPatientVisitedInLastthreeDays();
        System.out.println(String.format("Local Patient Count from last three days: %s",countOfPatitentFromLastThreeDays));
    }

    @Test
    public void patientsWithSameName()
    {
        Patient p1=new Patient("Sowmia","P4",Patient.Location.Coimbatore,LocalDate.of(2021,05,03),true);
        Patient p2=new Patient("Johnson","P5",Patient.Location.Mangalore,LocalDate.of(2021,05,04),true);
        Patient p3=new Patient("Janani","P6",Patient.Location.Bangalore,LocalDate.of(2021,05,05),true);
        Patient p4=new Patient("Shreya","P7",Patient.Location.Bangalore,LocalDate.of(2021,05,06),true);
        Patient p5=new Patient("Janani","P8",Patient.Location.Bangalore,LocalDate.of(2021,05,07),true);


        Hospital chinmayaHospital= new Hospital();

        chinmayaHospital.addPatient(p1);
        chinmayaHospital.addPatient(p2);
        chinmayaHospital.addPatient(p3);
        chinmayaHospital.addPatient(p4);
        chinmayaHospital.addPatient(p5);


        int countOfPatitentFromLastThreeDays=chinmayaHospital.findLocalOutPatientVisitedInLastthreeDays();
        System.out.println(String.format("Local Patient Count from last three days: %s",countOfPatitentFromLastThreeDays));
    }

}

