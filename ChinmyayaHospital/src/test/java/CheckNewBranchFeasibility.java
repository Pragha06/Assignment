import org.testng.annotations.Test;

import java.util.Date;

public class CheckNewBranchFeasibility {

    @Test
    public void moreNoOfLocalOutPatient()
    {
        Patient p1=new Patient("Joe","Bangalore",new Date(2021,05,01),true);
        Patient p2=new Patient("Durai","Bangalore",new Date(2021,05,01),true);
        Patient p3=new Patient("Priya","Bangalore",new Date(2021,05,02),true);
        Patient p4=new Patient("Sowmia","Bangalore",new Date(2021,05,03),true);
        Patient p5=new Patient("Johnson","Mangalore",new Date(2021,05,04),true);
        Patient p6=new Patient("Janani","Coimbatore",new Date(2021,05,04),true);
        Patient p7=new Patient("Mark","Coimbatore",new Date(2021,05,05),false);
        Patient p8=new Patient("Hari","Coimbatore",new Date(2021,05,06),false);

        Hospital ChinmayaHospital= new Hospital();

        ChinmayaHospital.addPatient(p1);
        ChinmayaHospital.addPatient(p2);
        ChinmayaHospital.addPatient(p3);
        ChinmayaHospital.addPatient(p4);
        ChinmayaHospital.addPatient(p5);
        ChinmayaHospital.addPatient(p6);
        ChinmayaHospital.addPatient(p7);
        ChinmayaHospital.addPatient(p8);


        int localPatientPercentage = ChinmayaHospital.findOutPatientPercentage(new Date(2021,04,30),new Date(2021,05,06));
        System.out.println("Local out patient: "+localPatientPercentage+"%");
        System.out.println("Outstation out patient: "+(100-localPatientPercentage+"%"));

    }

    @Test
    public void moreNoOfOutStationPatient()
    {
        Patient p1=new Patient("Joe","Bangalore",new Date(2021,05,01),true);
        Patient p2=new Patient("Durai","Bangalore",new Date(2021,05,01),true);
        Patient p3=new Patient("Priya","Bangalore",new Date(2021,05,02),true);
        Patient p4=new Patient("Sowmia","Mumbai",new Date(2021,05,03),true);
        Patient p5=new Patient("Johnson","Mangalore",new Date(2021,05,04),true);
        Patient p6=new Patient("Janani","Coimbatore",new Date(2021,05,04),true);
        Patient p7=new Patient("Mark","Coimbatore",new Date(2021,05,05),true);
        Patient p8=new Patient("Hari","Coimbatore",new Date(2021,05,06),true);

        Hospital ChinmayaHospital= new Hospital();

        ChinmayaHospital.addPatient(p1);
        ChinmayaHospital.addPatient(p2);
        ChinmayaHospital.addPatient(p3);
        ChinmayaHospital.addPatient(p4);
        ChinmayaHospital.addPatient(p5);
        ChinmayaHospital.addPatient(p6);
        ChinmayaHospital.addPatient(p7);
        ChinmayaHospital.addPatient(p8);


        int localPatientPercentage = ChinmayaHospital.findOutPatientPercentage(new Date(2021,04,30),new Date(2021,05,06));
        System.out.println("Local out patient: "+localPatientPercentage+"%");
        System.out.println("Outstation out patient: "+(100-localPatientPercentage+"%"));

    }

    @Test
    public void equalNoOfOutPatients()
    {
        Patient p1=new Patient("Joe","Bangalore",new Date(2021,05,01),true);
        Patient p2=new Patient("Durai","Bangalore",new Date(2021,05,01),true);
        Patient p3=new Patient("Priya","Bangalore",new Date(2021,05,02),true);
        Patient p4=new Patient("Sowmia","Bangalore",new Date(2021,05,03),true);
        Patient p5=new Patient("Johnson","Mangalore",new Date(2021,05,04),true);
        Patient p6=new Patient("Janani","Coimbatore",new Date(2021,05,04),true);
        Patient p7=new Patient("Mark","Coimbatore",new Date(2021,05,05),true);
        Patient p8=new Patient("Hari","Coimbatore",new Date(2021,05,06),true);

        Hospital ChinmayaHospital= new Hospital();

        ChinmayaHospital.addPatient(p1);
        ChinmayaHospital.addPatient(p2);
        ChinmayaHospital.addPatient(p3);
        ChinmayaHospital.addPatient(p4);
        ChinmayaHospital.addPatient(p5);
        ChinmayaHospital.addPatient(p6);
        ChinmayaHospital.addPatient(p7);
        ChinmayaHospital.addPatient(p8);


        int localPatientPercentage = ChinmayaHospital.findOutPatientPercentage(new Date(2021,04,30),new Date(2021,05,06));
        System.out.println("Local out patient: "+localPatientPercentage+"%");
        System.out.println("Outstation out patient: "+(100-localPatientPercentage+"%"));

    }
}

