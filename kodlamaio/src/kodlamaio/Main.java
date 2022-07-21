package kodlamaio;

public class Main {

	public static void main(String[] args) {
		String a = "Yazılım Geliştirici Yetiştirme Kampı";
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ", "Yazılım");
		Instructor instructor2 = new Instructor(2, "Murat", "Yücedağ", "Yazılım");
		Category category1 = new Category(1,"programlama");
		
		Course course1 = new Course(1, a + "(C# + ANGULAR)", 90, instructor1, category1);
		Course course2 = new Course(2, a + "(JAVA + REACT)", 100, instructor1, category1);
		Course course3 = new Course(3, a + "(JavaScript)", 0, instructor2, category1);
		Course course4 = new Course(4, "Programlamaya Giriş İçin Temel Kurs", 100, instructor1,category1);
		Course course5 = new Course(4, "Programlamaya Giş İçin Temel Kurs", 100, instructor1,category1);
		Course course6 = new Course(4, "Programmaya Giriş İçin Temel Kurs", 100, instructor1,category1);
		
		
		
	
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		courseManager.add(course4);
		courseManager.add(course5);
		courseManager.add(course6);
		
		
		
		
		for(int i = 0; i <= courseManager.getAll().size(); i++) {
			courseManager.deleteByInstructor(course1);
			
		}
		
		
		//courseManager.deleteById(course5);
		for (Course course : courseManager.getAll()) {
			System.out.println(course.getName());
			
		}
		

	}

}
