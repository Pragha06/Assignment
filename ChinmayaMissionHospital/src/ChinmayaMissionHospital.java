import java.util.ArrayList;

class Patient
        {
            String name;
            String location;
            String registeredDate;
            Boolean isOutPatient;

            Patient(String name,String location,String registeredDate,Boolean isOutPatient)
            {
                this.name=name;
                this.location=location;
                this.registeredDate=registeredDate;
                this.isOutPatient=isOutPatient;
            }

            public String getLocation()
            {
                return location;
            }

            public String getDate()
            {
                return registeredDate;
            }
        }


public class ChinmayaMissionHospital {

    public static void main(String args[])
    {
        Patient p1=new Patient("Joe","Bangalore","05/02/2021",true);
        Patient p2=new Patient("Durai","Bangalore","05/03/2021",true);
        Patient p3=new Patient("Priya","Bangalore","05/03/2021",true);
        Patient p4=new Patient("Sowmia","Bangalore","05/04/2021",true);
        Patient p5=new Patient("Johnson","Mangalore","05/04/2021",true);
        Patient p6=new Patient("Janani","Coimbatore","05/04/2021",true);


        ArrayList<Patient> patients =new ArrayList<Patient>();
        patients.add(p1);
        patients.add(p2);
        patients.add(p3);
        patients.add(p4);
        patients.add(p5);
        patients.add(p6);

        int localPatienPercentage=0;
        localPatienPercentage=findOutPatientPercentage(patients);
        System.out.println("Local out patient: "+localPatienPercentage);
        System.out.println("Outstation out patient: "+(100-localPatienPercentage));

    }

    public static int findOutPatientPercentage(ArrayList<Patient> patients)
    {
        int percentage=0;
        int localOP=0;
        int outOfStationOP=0;
        int outPatientTotal=0;
        for(Patient i:patients)
        {
            String Location=i.getLocation();
//            String Date=i.getDate();
            if(Location.equals("Bangalore"))
                localOP++;

            else
                outOfStationOP++;

        }
        outPatientTotal=localOP+outOfStationOP;
        percentage=(localOP*100)/outPatientTotal;
//        System.out.println("outPatientTotal: "+outPatientTotal);
//        System.out.println("localOP: "+localOP);
//        System.out.println("per: "+percentage);
        return percentage;
    }
}
