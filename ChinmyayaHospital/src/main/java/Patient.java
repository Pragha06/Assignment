import java.util.Date;

class Patient
{
    private String name;
    private String location;
    private Date registeredDate;
    private Boolean isOutPatient;

    Patient(String name, String location, Date registeredDate, Boolean isOutPatient)
    {
        this.name=name;
        this.location=location;
        this.registeredDate=registeredDate;
        this.isOutPatient=isOutPatient;
    }

    public Boolean getisOutPatient()
    {
        return isOutPatient;
    }

    public String getPatientLocation()
    {
        return location;
    }

    public Date getRegisteredDate()
    {
        return registeredDate;
    }
}


