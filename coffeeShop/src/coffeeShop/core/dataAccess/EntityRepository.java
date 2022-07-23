package coffeeShop.core.dataAccess;

import java.util.List;

public interface EntityRepository<T> {
	void add(T t);

	void update(T t);

	void delete(T t);

	List<T> getAll();

	T getById(int id);
}
