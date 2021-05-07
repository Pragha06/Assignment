import java.time.LocalDate;
import java.util.ArrayList;

public class Hospital {

    private static String hospitalLocation;
    private ArrayList<Patient> patients;

    Hospital()
    {
        patients = new ArrayList<Patient>();
        hospitalLocation="Bangalore";
    }
    void addPatient(Patient patient)
    {
        patients.add(patient);
    }


    double findOutPatientPercentage(LocalDate startDate, LocalDate endDate)
    {
        double percentage=0.0;
        int localOutPatient=0;
        int outOfStationOutPatient=0;
        int outPatientTotal=0;

        for(Patient patient:patients) {
            String patientLocation = patient.getPatientLocation();
            LocalDate patientRegisteredDate = patient.getRegisteredDate();
            boolean isOutPatient = patient.getisOutPatient();
            if (isOutPatient) {
                /* Filter with Date */
                if (patientRegisteredDate.compareTo(startDate)>=0 && patientRegisteredDate.compareTo(endDate)<=0)
                {
                    if (patientLocation.equals(hospitalLocation))
                        localOutPatient++;

                    else
                        outOfStationOutPatient++;

                }
            }
        }
        outPatientTotal=localOutPatient+outOfStationOutPatient;
        percentage= new Double((localOutPatient*100)/outPatientTotal);
        return percentage;
    }

}
