package kosgeb;


import java.util.*;

import kosgeb.entities.Applicant;
import kosgeb.entities.Application;
import kosgeb.entities.BankUser;
import kosgeb.entities.BlackList;
import kosgeb.entities.Credit;
import kosgeb.entities.CreditFeature;
import kosgeb.entities.Employee;
import kosgeb.entities.Feature;
import kosgeb.entities.State;
import kosgeb.entities.Title;
import kosgeb.entities.TitlePermission;

public class Main {

	public static void main(String[] args) {
		List<BlackList> blackLists = new ArrayList<>();
		List<Application> applications= new ArrayList<>();
		List<BankUser> bankUsers= new ArrayList<>();
		List<CreditFeature> creditFeatures= new ArrayList<>();
		List<Employee> employees= new ArrayList<>();
		List<TitlePermission> titlePermissions= new ArrayList<>();
		java.util.Date now = new java.util.Date();
		Applicant applicant1 = new Applicant(1,now, "12345", "34456", applications,blackLists);
		State state1 = new State(1, "başarılı");
		Credit credit1 = new Credit(1, "Erzurum Kredisi", now, applications, creditFeatures);
		Application application = new Application(1, credit1,  applicant1,  state1);
		Title title = new Title(1,"Müdür",employees,titlePermissions);
		Feature feature1 = new Feature(1,"il","Erzurum",creditFeatures);
		CreditFeature creditFeature = new CreditFeature(1,credit1,feature1);
		applications.add(application);
		creditFeatures.add(creditFeature);
		creditFeatures.add(creditFeature);
		
		
		System.out.println(application.getCredit().getApplications().get(0).getState().getStateName());
		System.out.println(feature1.getCreditFeatures().get(0).getCredit().getApplications().get(0).getApplicant().getApplicantNumber());
		

	}

}
