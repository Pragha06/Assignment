import java.util.ArrayList;

public class Hospital {

    private ArrayList<Patient> patients = new ArrayList<Patient>();

    void addPatient(Patient patient)
    {
        patients.add(patient);
    }

    int findOutPatientPercentage()
    {
        int percentage=0;
        int localOP=0;
        int outOfStationOP=0;
        int outPatientTotal=0;
        for(Patient patient:patients)
        {
            String Location=patient.getLocation();
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
