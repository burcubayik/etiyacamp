package kosgeb.entities;
public class BlackList {
    private int id;
    private Applicant applicant;

    public BlackList(int id, Applicant applicant) {
        this.id = id;
        this.applicant = applicant;
    }

    public BlackList() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }
}
