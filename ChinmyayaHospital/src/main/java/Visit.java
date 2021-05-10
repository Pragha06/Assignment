import java.time.LocalDate;

public class Visit {

    private LocalDate visitedDate;

    public Visit(LocalDate patientVisit) {
        this.visitedDate=patientVisit;
    }

    public LocalDate getVisitedDate()
    {
        return visitedDate;
    }
}