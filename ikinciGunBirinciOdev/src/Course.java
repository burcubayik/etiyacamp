

public class Course {
	private int id;
	private String name;
	private int percentageOfProgress;
	private Instructor instructor;
	private Category category;
	
	public Course() {
		super();
	}


	public Course(int id, String name, int percentageOfProgress, Instructor instructor, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.percentageOfProgress = percentageOfProgress;
		this.instructor = instructor;
		this.category = category;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPercentageOfProgress() {
		return percentageOfProgress;
	}


	public void setPercentageOfProgress(int percentageOfProgress) {
		this.percentageOfProgress = percentageOfProgress;
	}


	public Instructor getInstructor() {
		return instructor;
	}


	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


}