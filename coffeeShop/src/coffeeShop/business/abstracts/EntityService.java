package coffeeShop.business.abstracts;

import java.util.List;

public interface EntityService<T> {
	void add(T t);

	void update(T t);

	void delete(T t);

	List<T> getAll();

	T getById(int id);
}
