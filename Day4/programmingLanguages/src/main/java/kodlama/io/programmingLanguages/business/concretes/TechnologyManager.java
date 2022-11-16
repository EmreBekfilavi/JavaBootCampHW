package kodlama.io.programmingLanguages.business.concretes;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kodlama.io.programmingLanguages.business.abstracts.ITechnologyService;
import kodlama.io.programmingLanguages.business.request.technology.CreateTechnologyRequest;
import kodlama.io.programmingLanguages.business.request.technology.DeleteTechnologyRequest;
import kodlama.io.programmingLanguages.business.request.technology.UpdateTechnologyRequest;
import kodlama.io.programmingLanguages.business.response.GetAllTechnologyResponse;
import kodlama.io.programmingLanguages.dataAccess.abstracts.ILanguageRepository;
import kodlama.io.programmingLanguages.dataAccess.abstracts.ITechnologyRepository;
import kodlama.io.programmingLanguages.entities.Language;
import kodlama.io.programmingLanguages.entities.Technology;

@Service
public class TechnologyManager implements ITechnologyService {

	private ITechnologyRepository technologyRepository;
	private ILanguageRepository languageRepository;
	
	public TechnologyManager(ITechnologyRepository technologyRepository, ILanguageRepository languageRepository) {
		this.technologyRepository = technologyRepository;
		this.languageRepository = languageRepository;
	}


	public List<GetAllTechnologyResponse> getAll() {
		
		List<Technology> technologies = technologyRepository.findAll();
		List<GetAllTechnologyResponse> technologyResponse = new ArrayList<>();
		
		for (Technology tech : technologyRepository.findAll()) {
			
			GetAllTechnologyResponse responseItem = new GetAllTechnologyResponse();
			responseItem.setTechId(tech.getId());
			responseItem.setTechName(tech.getName());
			
			
			technologyResponse.add(responseItem);
			
		}
		
		return technologyResponse;
		
	}

	Technology technology = new Technology();
	
	public void add(CreateTechnologyRequest createTechnologyRequest) throws Exception {

		if (!isNameValid(createTechnologyRequest.getTechName())) {
			throw new Exception("Technology name is invalid!! Name can't be same and can't be empty!!");
		}
		
		Technology technology = new Technology();
		
		technology.setName(createTechnologyRequest.getTechName());

		Language language = languageRepository.findById(createTechnologyRequest.getLangId()).get();
		technology.setLanguage(language);
		technologyRepository.save(technology);
		System.out.println("New Technology Added");
		
	}

	
	public void delete(DeleteTechnologyRequest deleteTechnologyRequest) {
		
		technologyRepository.deleteById(deleteTechnologyRequest.getTechId());
		
	}

	@Override
	@Transactional
	public void update(UpdateTechnologyRequest updateTechnologyRequest) throws Exception {
		
		if(!isNameValid(updateTechnologyRequest.getTechName())) {
			throw new Exception("Name already exists!! Please try another!!");
		}
		
		Technology technology = technologyRepository.findById(updateTechnologyRequest.getTechId())
				.orElseThrow(()->new EntityNotFoundException("Couldn't find the Technology to update"));
		
		technology.setName(updateTechnologyRequest.getTechName());
		
		
	}

	
	public Technology getById(int id) {
		
		return technologyRepository.getReferenceById(id);
	}
	
	public boolean isNameValid(String name) {
		if (name.isEmpty()) {
			return false;
		}
		for (Technology tech : technologyRepository.findAll()) {
			if (tech.getName().equalsIgnoreCase(name)) {
				return false;
			}

		}

		return true;
	}
	
	public boolean isIdValid(int id) {

		for (Technology tech : technologyRepository.findAll()) {
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
