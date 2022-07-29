package kosgeb.entities;

import java.util.Date;
import java.util.List;

public class EnterPreneur extends Applicant {

    private String firstName;
    private String lastName;
    private Date birthDate;

    public EnterPreneur() {
    }

    public EnterPreneur(String firstName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public EnterPreneur(int id, Date date, String applicantNumber, String projectNumber, String firstName, String lastName,
    		Date birthDate,	List<BankUser> bankUsers,List<Application> applications,List<BlackList> blackLists) {
        super(id, date, applicantNumber, projectNumber,applications,blackLists);//user
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        
    }

    public EnterPreneur(int id, String email, String password, String address, int id1, Date date, String applicantNumber, String projectNumber, String firstName, String lastName, Date birthDate,	
    		List<BankUser> bankUsers) {
        super(id, email, password, address, id1, date, applicantNumber, projectNumber,bankUsers);//applicant
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

}
