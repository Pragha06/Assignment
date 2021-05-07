import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Hospital {

    private static String hospitalLocation;
    private ArrayList<Patient> patients;

    Hospital() {
        patients = new ArrayList<>();
        hospitalLocation = "Bangalore";
    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }


    double findOutPatientPercentage(LocalDate startDate, LocalDate endDate) {
        double percentage;
        int localOutPatient = 0;
        int outOfStationOutPatient = 0;
        int outPatientTotal;

        for (Patient patient : patients) {
            String patientLocation = patient.getPatientLocation().toString();
            LocalDate patientRegisteredDate = patient.getRegisteredDate();
            boolean isOutPatient = patient.getisOutPatient();
            if (isOutPatient) {
                /* Filter with Date */
                if (patientRegisteredDate.compareTo(startDate) >= 0 && patientRegisteredDate.compareTo(endDate) <= 0) {
                    if (patientLocation.equals(hospitalLocation))
                        localOutPatient++;

                    else
                        outOfStationOutPatient++;

                }
            }
        }
        outPatientTotal = localOutPatient + outOfStationOutPatient;
        percentage = (localOutPatient * 100) / outPatientTotal;
        return percentage;
    }


    int findLocalOutPatientVisitedInLastthreeDays() {

        LocalDate todayDate = LocalDate.now();
        LocalDate dateFromThreeDaysPast = todayDate.minusDays(2);
        HashMap<String,String> patientVisitedInLastThreeDays=new HashMap<>();

        for (Patient patient : patients) {
            boolean isOutPatient = patient.getisOutPatient();
            LocalDate patientRegisteredDate = patient.getRegisteredDate();
            String patientLocation = patient.getPatientLocation().toString();

            if (isOutPatient) {
                if (patientLocation.equals(hospitalLocation)) {
                    if (patientRegisteredDate.compareTo(dateFromThreeDaysPast) >= 0 && patientRegisteredDate.compareTo(todayDate) <= 0) {
                        patientVisitedInLastThreeDays.put(patient.getPatientId(),patient.getPatientName());
                    }
                }
            }
        }
        return patientVisitedInLastThreeDays.size();
    }


//    void findLocalOutPatient() {
//        LocalDate todayDate = LocalDate.now();
//        LocalDate dateFromThreeDaysPast = todayDate.minusDays(2);
//        patients.stream().filter(patient -> patient.getPatientLocation().equals(hospitalLocation)).
//                filter(patient -> patient.getRegisteredDate().compareTo(dateFromThreeDaysPast) >= 0 && patient.getRegisteredDate().compareTo(todayDate) <= 0).
//                collect(Collectors.toMap(patient -> patient.getPatientId(), patient -> patient.getPatientName()));


//    }

}
