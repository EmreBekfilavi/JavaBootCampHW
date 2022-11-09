package kodlama.io.programmingLanguages.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.programmingLanguages.business.abstracts.ITechnologyService;
import kodlama.io.programmingLanguages.dataAccess.abstracts.ITechnologyRepository;
import kodlama.io.programmingLanguages.entities.Technology;

@Service
public class TechnologyManager implements ITechnologyService {

	ITechnologyRepository technologyRepository;
	
	@Autowired
	public TechnologyManager(ITechnologyRepository technologyRepository) {
		this.technologyRepository = technologyRepository;
	}


	public List<Technology> getAll() {
		
		return technologyRepository.getAll();
	}

	
	public void add(Technology technology) throws Exception {
		
		if (!isIdValid(technology.getId())) {
			throw new Exception("Id for technology is invalid!! Id's can't be same and can't be negative!!");
		}

		if (!isNameValid(technology.getName())) {
			throw new Exception("Technology name is invalid!! Name can't be same and can't be empty!!");
		}

		technologyRepository.add(technology);
		System.out.println("New Technology Added");
		
	}

	
	public void delete(int id) {
		
		technologyRepository.delete(id);
		
	}

	
	public void update(Technology technology, int id) throws Exception {
		
		if(!isNameValid(technology.getName())) {
			throw new Exception("Name already exists!! Please try another!!");
		}
		
		technologyRepository.update(technology, id);
		
	}

	
	public Technology getById(int id) throws Exception {
		
		return null;
	}
	
	public boolean isNameValid(String name) {
		if (name.isEmpty()) {
			return false;
		}
		for (Technology tech : getAll()) {
			if (tech.getName().equalsIgnoreCase(name)) {
				return false;
			}

		}

		return true;
	}
	
	public boolean isIdValid(int id) {

		for (Technology tech : getAll()) {
			if (tech.getId() == id) {
				return false;
			}
			if (tech.getId() < 0) {
				return false;
			}

		}

		return true;
	}


}
