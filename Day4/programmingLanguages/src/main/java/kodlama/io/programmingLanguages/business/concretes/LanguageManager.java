package kodlama.io.programmingLanguages.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.programmingLanguages.business.abstracts.ILanguageService;
import kodlama.io.programmingLanguages.dataAccess.abstracts.ILanguageRepository;
import kodlama.io.programmingLanguages.entities.Language;

@Service
public class LanguageManager implements ILanguageService {

	ILanguageRepository languageRepository;

	public LanguageManager(ILanguageRepository languageRepository) {

		this.languageRepository = languageRepository;
	}

	public List<Language> getAll() {

		return languageRepository.getAll();
	}

	public void add(Language language) throws Exception {

		if (!isIdValid(language.getId())) {
			throw new Exception("Id is invalid!! Id's can't be same and can't be negative!!");
		}

		if (!isNameValid(language.getName())) {
			throw new Exception("Name is invalid!! Name can't be same and can't be empty!!");
		}

		languageRepository.add(language);
		System.out.println("New Language Added");

	}

	public void delete(int id) {

		languageRepository.delete(id);

	}

	public void update(Language language, int id) throws Exception {
		
		if(!isNameValid(language.getName())) {
			throw new Exception("Name already exists!! Please try another!!");
		}
		
		languageRepository.update(language, id);

	}

	public Language getById(int id) {

		return languageRepository.getById(id);
	}

	public boolean isNameValid(String name) {
		if (name.isEmpty()) {
			return false;
		}
		for (Language lang : getAll()) {
			if (lang.getName().equalsIgnoreCase(name)) {
				return false;
			}

		}

		return true;
	}

	public boolean isIdValid(int id) {

		for (Language lang : getAll()) {
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
