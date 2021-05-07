import org.testng.annotations.Test;
import java.time.LocalDate;

public class CheckNewBranchFeasibility {

    @Test
    public void moreNumberOfLocalOutPatient()
    {
        Patient p1=new Patient("Joe","Bangalore",LocalDate.of(2021,05,01),true);
        Patient p2=new Patient("Durai","Bangalore",LocalDate.of(2021,05,01),true);
        Patient p3=new Patient("Priya","Bangalore",LocalDate.of(2021,05,02),true);
        Patient p4=new Patient("Sowmia","Bangalore",LocalDate.of(2021,05,03),true);
        Patient p5=new Patient("Johnson","Mangalore",LocalDate.of(2021,05,04),true);
        Patient p6=new Patient("Janani","Coimbatore",LocalDate.of(2021,05,04),true);
        Patient p7=new Patient("Mark","Coimbatore",LocalDate.of(2021,05,05),false);
        Patient p8=new Patient("Hari","Coimbatore",LocalDate.of(2021,05,06),false);

        Hospital chinmayaHospital= new Hospital();

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
        Patient p1=new Patient("Joe","Bangalore",LocalDate.of(2021,05,01),true);
        Patient p2=new Patient("Durai","Bangalore",LocalDate.of(2021,05,01),true);
        Patient p3=new Patient("Priya","Bangalore",LocalDate.of(2021,05,02),true);
        Patient p4=new Patient("Sowmia","Mumbai",LocalDate.of(2021,05,03),true);
        Patient p5=new Patient("Johnson","Mangalore",LocalDate.of(2021,05,04),true);
        Patient p6=new Patient("Janani","Coimbatore",LocalDate.of(2021,05,04),true);
        Patient p7=new Patient("Mark","Coimbatore",LocalDate.of(2021,05,05),true);
        Patient p8=new Patient("Hari","Coimbatore",LocalDate.of(2021,05,06),true);

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
        Patient p1=new Patient("Joe","Bangalore",LocalDate.of(2021,05,01),true);
        Patient p2=new Patient("Durai","Bangalore",LocalDate.of(2021,05,01),true);
        Patient p3=new Patient("Priya","Bangalore",LocalDate.of(2021,05,02),true);
        Patient p4=new Patient("Sowmia","Bangalore",LocalDate.of(2021,05,03),true);
        Patient p5=new Patient("Johnson","Mangalore",LocalDate.of(2021,05,04),true);
        Patient p6=new Patient("Janani","Coimbatore",LocalDate.of(2021,05,04),true);
        Patient p7=new Patient("Mark","Coimbatore",LocalDate.of(2021,05,05),true);
        Patient p8=new Patient("Hari","Coimbatore",LocalDate.of(2021,05,06),true);

        Hospital ChinmayaHospital= new Hospital();

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

