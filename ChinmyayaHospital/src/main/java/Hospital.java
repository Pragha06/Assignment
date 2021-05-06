import java.util.ArrayList;
import java.util.Date;

public class Hospital {

    private ArrayList<Patient> patients = new ArrayList<Patient>();

    void addPatient(Patient patient)
    {
        patients.add(patient);
    }

    int findOutPatientPercentage(Date startDate,Date endDate)
    {
        int percentage=0;
        int localOutPatient=0;
        int outOfStationOutPatient=0;
        int outPatientTotal=0;
        for(Patient patient:patients) {
            String patientLocation = patient.getPatientLocation();
            Date patientRegisteredDate = patient.getRegisteredDate();
            Boolean isOutPatient = patient.getisOutPatient();
            if (isOutPatient) {
                /* Filter with Date */
                if ((patientRegisteredDate.equals(startDate) || patientRegisteredDate.after(startDate)) && (patientRegisteredDate.equals(endDate) || patientRegisteredDate.before(endDate)))
                {
                    if (patientLocation.equals("Bangalore"))
                        localOutPatient++;

                    else
                        outOfStationOutPatient++;

                }
            }
        }
        outPatientTotal=localOutPatient+outOfStationOutPatient;
        percentage=(localOutPatient*100)/outPatientTotal;
        return percentage;
    }

}
