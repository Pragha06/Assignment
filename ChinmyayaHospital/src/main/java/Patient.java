import java.time.LocalDate;

class Patient
{
    private String name;
    private String location;
    private LocalDate registeredDate;
    private boolean isOutPatient;

    Patient(String name, String location, LocalDate registeredDate, boolean isOutPatient)
    {
        this.name=name;
        this.location=location;
        this.registeredDate=registeredDate;
        this.isOutPatient=isOutPatient;
    }

    public boolean getisOutPatient()
    {
        return isOutPatient;
    }

    public String getPatientLocation()
    {
        return location;
    }

    public LocalDate getRegisteredDate()
    {
        return registeredDate;
    }
}


