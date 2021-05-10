import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hospital {

    private String hospitalLocation;
    private List<Patient> patients;

    Hospital() {
        patients = new ArrayList<>();
        hospitalLocation = "Bangalore";

    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }

    public ArrayList<Patient> filterOutPatient()
    {
        return (ArrayList<Patient>)  patients.stream().filter(Patient::getisOutPatient).collect(Collectors.toList());
    }

    public ArrayList<Patient> filterListOfPatientByDateRange(LocalDate startDate, LocalDate endDate, ArrayList<Patient> listOfPatients)
    {
          return (ArrayList<Patient>) listOfPatients.stream().filter(patient -> patient.getListOfVisits().iterator().next().getVisitedDate().compareTo(startDate)>=0 && patient.getListOfVisits().iterator().next().getVisitedDate().compareTo(endDate)<=0).collect(Collectors.toList());
    }

    public ArrayList<Patient> filterOutStationPatient(ArrayList<Patient> listOfPatients)
    {
        return (ArrayList<Patient>) listOfPatients.stream().filter(p-> !p.getPatientLocation().toString().equals(hospitalLocation)).collect(Collectors.toList());
    }

    public ArrayList<Patient> filterLocalPatient(ArrayList<Patient> listOfPatients)
    {
        return (ArrayList<Patient>) listOfPatients.stream().filter(p-> p.getPatientLocation().toString().equals(hospitalLocation)).collect(Collectors.toList());
    }


    double findOutPatientPercentage(LocalDate startDate, LocalDate endDate) {
        int localOutPatient;
        int outPatientTotal;
        double percentage;

        ArrayList<Patient> outPatientList=filterOutPatient();
        ArrayList<Patient> outPatientListForNDays=filterListOfPatientByDateRange(startDate,endDate,outPatientList);
        outPatientTotal = outPatientListForNDays.size();
        localOutPatient=filterLocalPatient(outPatientListForNDays).size();
        filterLocalPatient(outPatientListForNDays);

        percentage = (double) (localOutPatient * 100) / outPatientTotal;
        return percentage;
    }


    int findLocalOutPatientVisitedInLastNDays(int n) {

        LocalDate endDate = LocalDate.now();
        LocalDate startDate = endDate.minusDays(n-1);

        System.out.println(startDate);
        System.out.println(endDate);
        ArrayList<Patient> outPatientList=filterOutPatient();
        ArrayList<Patient> outPatientListForNDays=filterListOfPatientByDateRange(startDate,endDate,outPatientList);
        return filterLocalPatient(outPatientListForNDays).size();

    }

}
