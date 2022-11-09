package kodlama.io.programmingLanguages.business.abstracts;

import java.util.List;

import kodlama.io.programmingLanguages.entities.Technology;

public interface ITechnologyService {
	
	List<Technology> getAll();
	void add(Technology technology) throws Exception;
	void delete(int id);
	void update(Technology technology,int id) throws Exception;
	Technology getById(int id) throws Exception;

}
