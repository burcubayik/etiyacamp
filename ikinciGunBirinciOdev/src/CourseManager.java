
import java.util.ArrayList;
import java.util.List;

public class CourseManager {
	private List<Course> courses;

	public CourseManager() {
		courses = new ArrayList<>();
	}

	public void add(Course course) {
		courses.add(course);
		System.out.println("Eklendi");
	}

	public void update(Course course) {

		System.out.println("Güncellendi");
	}

	public void delete(Course course) {

		System.out.println("Silindi");
	}

	public List<Course> getAll() {

		return courses;
	}

}
