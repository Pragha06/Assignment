import java.time.LocalDate;

class Patient
{
    private String name;
    private String patientId;
    private Location location;
    private LocalDate registeredDate;
    private boolean isOutPatient;

    Patient(String name, String patientId, Location location, LocalDate registeredDate, boolean isOutPatient)
    {
        this.name=name;
        this.patientId=patientId;
        this.location=location;
        this.registeredDate=registeredDate;
        this.isOutPatient=isOutPatient;
    }
    enum Location{
        Bangalore, Mumbai, Coimbatore, Mangalore
}

    public boolean getisOutPatient()
    {
        return isOutPatient;
    }

    public Location getPatientLocation()
    {
        return location;
    }

    public LocalDate getRegisteredDate()
    {
        return registeredDate;
    }

    public String getPatientId() {return patientId;}

    public String getPatientName() {return name;}

}


