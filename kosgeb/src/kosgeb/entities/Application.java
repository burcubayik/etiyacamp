package kosgeb.entities;
public class Application {
    private int id;
    private Credit credit;
    private Applicant applicant;

    private State state;


    public Application() {
    }

    public Application(int id, Credit credit, Applicant applicant, State state) {
        this.id = id;
        this.credit = credit;
        this.applicant = applicant;
        this.state = state;
    }

    public Application(int id, Credit credit, Applicant applicant) {
        this.id = id;
        this.credit = credit;
        this.applicant = applicant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
