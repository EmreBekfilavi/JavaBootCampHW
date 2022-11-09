package kodlama.io.programmingLanguages.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.programmingLanguages.dataAccess.abstracts.ITechnologyRepository;
import kodlama.io.programmingLanguages.entities.Language;
import kodlama.io.programmingLanguages.entities.Technology;

@Repository
public class TechnologyRepository implements ITechnologyRepository {

	List<Technology> technologies;
	
	public TechnologyRepository() {
		
		technologies = new ArrayList<>();
		
		technologies.add(new Technology(3, "Spring",new Language(6,"Java")));
		technologies.add(new Technology(4,"JSP",new Language(6,"Java")));
		
	}

	public List<Technology> getAll() {
		
		return technologies;
	}

	
	public void add(Technology technology) throws Exception {
		
		technologies.add(technology);
		
	}

	
	public void delete(int id) {
		
		getAll().remove(getById(id));
		
	}

	
	public void update(Technology technology, int id) {
		
		getById(id).setName(technology.getName());
		
	}

	
	public Technology getById(int id) {
		
		for (Technology technology : technologies) {
			
			if(technology.getId() == id) {
				return technology;
			}
			
		}
		
		return null;
	}

}
