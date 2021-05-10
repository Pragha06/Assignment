import org.testng.annotations.Test;

import java.time.LocalDate;

public class CheckLocalPatientCount {


    @Test
    public void samePatientVisitingTwiceInLastThreeDays()
    {

        Patient p1=new Patient("Joe","P1", Patient.Location.Coimbatore,true);
        Patient p2=new Patient("Durai","P2",Patient.Location.Mumbai,true);
        Patient p3=new Patient("Priya","P3",Patient.Location.Bangalore,true);
        Patient p4=new Patient("Sowmia","P4",Patient.Location.Bangalore,true);
        Patient p5=new Patient("Johnson","P5",Patient.Location.Mangalore,true);


        Hospital chinmayaHospital= new Hospital();

        p1.addVisit(new Visit(LocalDate.of(2021,05,8)));
        p2.addVisit(new Visit(LocalDate.of(2021,05,9)));
        p3.addVisit(new Visit(LocalDate.of(2021,05,7)));
        p4.addVisit(new Visit(LocalDate.of(2021,05,8)));
        p5.addVisit(new Visit(LocalDate.of(2021,05,9)));

        chinmayaHospital.addPatient(p1);
        chinmayaHospital.addPatient(p2);
        chinmayaHospital.addPatient(p3);
        chinmayaHospital.addPatient(p4);
        chinmayaHospital.addPatient(p5);

        int countOfPatitentFromLastThreeDays=chinmayaHospital.findLocalOutPatientVisitedInLastNDays(3);
        System.out.println(String.format("Local Patient Count from last three days: %s",countOfPatitentFromLastThreeDays));
    }

}

