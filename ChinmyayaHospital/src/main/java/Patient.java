import java.util.ArrayList;

class Patient
{
    private String name;
    private String location;
    private String registeredDate;
    private Boolean isOutPatient;

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


