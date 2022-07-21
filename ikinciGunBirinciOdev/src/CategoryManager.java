import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
	private List<Category> categories;
	
	
	 public CategoryManager() {
		 categories = new ArrayList<>();
	}
	public void add(Category category) {
		categories.add(category);
		System.out.println("Eklendi");
	}
	public List<Category> getAll(){
		
		return categories ;
	}

}
