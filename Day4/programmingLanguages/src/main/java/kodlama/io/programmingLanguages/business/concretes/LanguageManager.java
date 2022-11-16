package kodlama.io.programmingLanguages.business.concretes;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.programmingLanguages.business.abstracts.ILanguageService;
import kodlama.io.programmingLanguages.business.request.language.CreateLanguageRequest;
import kodlama.io.programmingLanguages.business.request.language.DeleteLanguageRequest;
import kodlama.io.programmingLanguages.business.request.language.UpdateLanguageRequest;
import kodlama.io.programmingLanguages.business.response.GetAllLanguageResponse;
import kodlama.io.programmingLanguages.dataAccess.abstracts.ILanguageRepository;
import kodlama.io.programmingLanguages.entities.Language;

@Service
public class LanguageManager implements ILanguageService {

	private ILanguageRepository languageRepository;

	@Autowired
	public LanguageManager(ILanguageRepository languageRepository) {

		this.languageRepository = languageRepository;
	}
	
	public List<GetAllLanguageResponse> getAll() {
		
		List<Language> languages = languageRepository.findAll();
		List<GetAllLanguageResponse> languageResponse = new ArrayList<GetAllLanguageResponse>();
		
		for (Language language : languageRepository.findAll()) {
			
			GetAllLanguageResponse responseItem = new GetAllLanguageResponse();
			responseItem.setLangId(language.getId());
			responseItem.setLangName(language.getName());
			
			languageResponse.add(responseItem);
			
		}
		
		return languageResponse;
	}

	
	
	public void add(CreateLanguageRequest createLanguageRequest) throws Exception {
		
		Language language = new Language();

		if (!isNameValid(createLanguageRequest.getName())) {
			throw new Exception("Name is invalid!! Name can't be same and can't be empty!!");
		}
		
		language.setName(createLanguageRequest.getName());
		

		languageRepository.save(language);
		System.out.println("New Language Added");

	}

	public void delete(DeleteLanguageRequest deleteLanguageRequest) {

		languageRepository.deleteById(deleteLanguageRequest.getId());

	}
	
	@Override
	@Transactional
	public void update(UpdateLanguageRequest updateLanguageRequest) throws Exception {
		
		if(!isNameValid(updateLanguageRequest.getName())) {
			throw new Exception("Name already exists!! Please try another!!");
		}
		
		Language language = languageRepository.findById(updateLanguageRequest.getId())
				.orElseThrow(()-> new EntityNotFoundException("Couldn't find the language to update"));
		
		language.setName(updateLanguageRequest.getName());

	}

	public Language getById(int id) {

		return languageRepository.getReferenceById(id);
	}

	public boolean isNameValid(String name) {
		if (name.isEmpty()) {
			return false;
		}
		for (Language lang : languageRepository.findAll()) {
			if (lang.getName().equalsIgnoreCase(name)) {
				return false;
			}

		}

		return true;
	}

	public boolean isIdValid(int id) {

		for (Language lang : languageRepository.findAll()) {
			if (lang.getId() == id) {
				return false;
			}
			if (lang.getId() < 0) {
				return false;
			}

		}

		return true;
	}

}
