import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Patient {
    private String name;
    private String patientId;
    private Location location;
    private List<Visit> listOfVisits;
    private boolean isOutPatient;

    Patient(String name, String patientId, Location location, boolean isOutPatient) {
        this.name = name;
        this.patientId = patientId;
        this.location = location;
        this.isOutPatient = isOutPatient;
        this.listOfVisits=new ArrayList<>();

    }

    public enum Location {
        Bangalore, Mumbai, Coimbatore, Mangalore
    }

    public boolean getisOutPatient() {

        return isOutPatient;
    }

    public Location getPatientLocation() {
        return location;
    }

    public List<Visit> getListOfVisits() {
        return listOfVisits;
    }


    public String getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return name;
    }

    public void addVisit(Visit... visits)
    {
        listOfVisits.addAll(Arrays.asList(visits));
    }

}


