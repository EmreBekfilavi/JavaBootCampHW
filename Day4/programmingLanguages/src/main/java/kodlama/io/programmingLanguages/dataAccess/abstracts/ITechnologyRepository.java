package kodlama.io.programmingLanguages.dataAccess.abstracts;

import java.util.List;

import kodlama.io.programmingLanguages.entities.Technology;

public interface ITechnologyRepository {

	List<Technology> getAll();
	void add(Technology technology) throws Exception;
	void delete(int id);
	void update(Technology technology, int id);
	Technology getById(int id);

}
