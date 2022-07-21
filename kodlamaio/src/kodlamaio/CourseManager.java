package kodlamaio;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
	Course courseToFind;
	
	List<Course> courses = new ArrayList<Course>();
	List<Course> courses2;
	public void add(Course course) {
		if(!checkIfCourseNameExist(course.getName())) {
			courses.add(course);
		}
		else {
			System.out.println("Kurs Mevcut!");
		}
	
	}
	
	public void deleteByInstructor(Course course) {
		
		courses.remove(getByInstructor(course.getInstructor()));
	}
	public void deleteById(Course course) {
		courses.remove(getById(course.getId()));
		
	}
	private Course getByInstructor(Instructor instructor) {
		courseToFind = null;
		for(Course course: courses) {
			if(course.getInstructor() == instructor) {
				courseToFind = course;
				break;
			}
		}
		return courseToFind;
	}
	
	private Course getById(int id) {
		courseToFind = null;
		for(Course course:courses) {
			if(course.getId()==id) {
				courseToFind = course;
			}
		}
		return courseToFind;
		
	}
	private boolean checkIfCourseNameExist(String courseName) {
		boolean exist = false;
		for(Course course : courses) {
			if(course.getName()==courseName) {
				exist = true;
			}
		}
		return exist;
		
	}
	
	public void update(Course course) {
		Course courseToUpdate = getById(course.getId());
		courseToUpdate.setCategory(course.getCategory());
		courseToUpdate.setInstructor(course.getInstructor());
		courseToUpdate.setName(course.getName());
		courseToUpdate.setPercentageOfProgress(course.getPercentageOfProgress());
	}
	public List<Course> getAll(){
		return courses;
	}
	
	public List<Course> getByInstructorName(Instructor instructor){
		courses2 = new ArrayList<Course>();
		for (Course course : courses) {
			if(course.getInstructor()==instructor) {
				courses2.add(course);
				
			}
			
		}
		
		return courses2;
		
		
		
	}
	List<Course> getByCategoryName(Category category) {
		courses2 = new ArrayList<Course>();

		for (Course course : courses) {
			if (course.getCategory() == category) {
				courses2.add(course);
			}
		}
		return courses2;
	}

}
