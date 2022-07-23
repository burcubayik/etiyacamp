import java.util.ArrayList;
import java.util.List;

public class InstructorManager {

	private List<Instructor> instructors;

	public InstructorManager() {
		instructors = new ArrayList<>();
	}

	public void add(Instructor instructor) {
		instructors.add(instructor);
		System.out.println("Eklendi");
	}

	public void update(Instructor instructor) {

		System.out.println("Güncellendi");
	}

	public void delete(Instructor instructor) {

		System.out.println("Silindi");
	}

	public List<Instructor> getAll() {

		return instructors;
	}

}
