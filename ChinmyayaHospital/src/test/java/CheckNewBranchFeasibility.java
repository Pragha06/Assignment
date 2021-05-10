import org.testng.annotations.Test;
import java.time.LocalDate;

public class CheckNewBranchFeasibility {

    @Test
    public void moreNumberOfLocalOutPatient()
    {
        Patient p1=new Patient("Joe","P1", Patient.Location.Bangalore,true);
        Patient p2=new Patient("Durai","P2",Patient.Location.Bangalore,true);
        Patient p3=new Patient("Priya","P3",Patient.Location.Bangalore,true);
        Patient p4=new Patient("Sowmia","P4",Patient.Location.Bangalore,true);
        Patient p5=new Patient("Johnson","P5",Patient.Location.Mangalore,true);
        Patient p6=new Patient("Janani","P6",Patient.Location.Coimbatore,true);
        Patient p7=new Patient("Mark","P7",Patient.Location.Coimbatore,false);
        Patient p8=new Patient("Hari","P8",Patient.Location.Coimbatore,false);

        Hospital chinmayaHospital= new Hospital();

        p1.addVisit(new Visit(LocalDate.of(2021,05,01)));
        p2.addVisit(new Visit(LocalDate.of(2021,05,02)));
        p3.addVisit(new Visit(LocalDate.of(2021,05,03)));
        p4.addVisit(new Visit(LocalDate.of(2021,05,04)));
        p5.addVisit(new Visit(LocalDate.of(2021,05,01)));
        p6.addVisit(new Visit(LocalDate.of(2021,05,02)));
        p7.addVisit(new Visit(LocalDate.of(2021,05,03)));
        p8.addVisit(new Visit(LocalDate.of(2021,05,04)));

        chinmayaHospital.addPatient(p1);
        chinmayaHospital.addPatient(p2);
        chinmayaHospital.addPatient(p3);
        chinmayaHospital.addPatient(p4);
        chinmayaHospital.addPatient(p5);
        chinmayaHospital.addPatient(p6);
        chinmayaHospital.addPatient(p7);
        chinmayaHospital.addPatient(p8);


        double localPatientPercentage = chinmayaHospital.findOutPatientPercentage(LocalDate.of(2021,04,30),LocalDate.of(2021,05,06));
        System.out.println(String.format("Local out patient: %.2f %c",localPatientPercentage,'%'));
        System.out.println(String.format("Outstation out patient: %.2f %c",(100-localPatientPercentage),'%'));



    }

    @Test
    public void moreNumberOfOutStationPatient()
    {
        Patient p1=new Patient("Joe","P1",Patient.Location.Bangalore,true);
        Patient p2=new Patient("Durai","P2",Patient.Location.Bangalore,true);
        Patient p3=new Patient("Priya","P3",Patient.Location.Bangalore,true);
        Patient p4=new Patient("Sowmia","P4",Patient.Location.Mumbai,true);
        Patient p5=new Patient("Johnson","P5",Patient.Location.Coimbatore,true);
        Patient p6=new Patient("Janani","P6",Patient.Location.Coimbatore,true);
        Patient p7=new Patient("Mark","P7",Patient.Location.Coimbatore,true);
        Patient p8=new Patient("Hari","P8",Patient.Location.Coimbatore,true);

        p1.addVisit(new Visit(LocalDate.of(2021,05,01)));
        p2.addVisit(new Visit(LocalDate.of(2021,05,01)));
        p3.addVisit(new Visit(LocalDate.of(2021,05,02)));
        p4.addVisit(new Visit(LocalDate.of(2021,05,03)));
        p5.addVisit(new Visit(LocalDate.of(2021,05,04)));
        p6.addVisit(new Visit(LocalDate.of(2021,05,04)));
        p7.addVisit(new Visit(LocalDate.of(2021,05,05)));
        p8.addVisit(new Visit(LocalDate.of(2021,05,06)));

        Hospital ChinmayaHospital= new Hospital();

        ChinmayaHospital.addPatient(p1);
        ChinmayaHospital.addPatient(p2);
        ChinmayaHospital.addPatient(p3);
        ChinmayaHospital.addPatient(p4);
        ChinmayaHospital.addPatient(p5);
        ChinmayaHospital.addPatient(p6);
        ChinmayaHospital.addPatient(p7);
        ChinmayaHospital.addPatient(p8);


        double localPatientPercentage = ChinmayaHospital.findOutPatientPercentage(LocalDate.of(2021,04,30), LocalDate.of(2021,05,06));
        System.out.println(String.format("Local out patient: %.2f %c",localPatientPercentage,'%'));
        System.out.println(String.format("Outstation out patient: %.2f %c",(100-localPatientPercentage),'%'));


    }

    @Test
    public void equalNumberOfOutPatients()
    {
        Patient p1=new Patient("Joe","P1",Patient.Location.Bangalore,true);
        Patient p2=new Patient("Durai","P2",Patient.Location.Bangalore,true);
        Patient p3=new Patient("Priya","P3",Patient.Location.Bangalore,true);
        Patient p4=new Patient("Sowmia","P4",Patient.Location.Bangalore,true);
        Patient p5=new Patient("Johnson","P5",Patient.Location.Coimbatore,true);
        Patient p6=new Patient("Janani","P6",Patient.Location.Coimbatore,true);
        Patient p7=new Patient("Mark","P7",Patient.Location.Coimbatore,true);
        Patient p8=new Patient("Hari","P8",Patient.Location.Coimbatore,true);

        Hospital ChinmayaHospital= new Hospital();

        p1.addVisit(new Visit(LocalDate.of(2021,05,01)));
        p2.addVisit(new Visit(LocalDate.of(2021,05,01)));
        p3.addVisit(new Visit(LocalDate.of(2021,05,02)));
        p4.addVisit(new Visit(LocalDate.of(2021,05,03)));
        p5.addVisit(new Visit(LocalDate.of(2021,05,04)));
        p6.addVisit(new Visit(LocalDate.of(2021,05,04)));
        p7.addVisit(new Visit(LocalDate.of(2021,05,05)));
        p8.addVisit(new Visit(LocalDate.of(2021,05,06)));

        ChinmayaHospital.addPatient(p1);
        ChinmayaHospital.addPatient(p2);
        ChinmayaHospital.addPatient(p3);
        ChinmayaHospital.addPatient(p4);
        ChinmayaHospital.addPatient(p5);
        ChinmayaHospital.addPatient(p6);
        ChinmayaHospital.addPatient(p7);
        ChinmayaHospital.addPatient(p8);


        double localPatientPercentage = ChinmayaHospital.findOutPatientPercentage(LocalDate.of(2021,04,30),LocalDate.of(2021,05,06));
        System.out.println(String.format("Local out patient: %.2f %c",localPatientPercentage,'%'));
        System.out.println(String.format("Outstation out patient: %.2f %c",(100-localPatientPercentage),'%'));

    }
}

