package telcoProject.entities.concretes;


import java.time.LocalDate;

public class Payment {
	  private int id;
	    private LocalDate date;
	    private Canal canal;
	    private Invoice invoice;

	    public Payment() {
	    }

	    public Payment(int id, LocalDate date, Canal canal, Invoice invoice) {

	        this.id = id;
	        this.date = date;
	        this.canal = canal;
	        this.invoice = invoice;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public LocalDate getDate() {
	        return date;
	    }

	    public void setDate(LocalDate date) {
	        this.date = date;
	    }

	    public Canal getCanal() {
	        return canal;
	    }

	    public void setCanal(Canal canal) {
	        this.canal = canal;
	    }

	    public Invoice getInvoice() {
	        return invoice;
	    }

	    public void setInvoice(Invoice invoice) {
	        this.invoice = invoice;
	    }

}
