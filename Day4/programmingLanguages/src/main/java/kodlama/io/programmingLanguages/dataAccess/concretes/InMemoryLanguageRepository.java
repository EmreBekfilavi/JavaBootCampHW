package kodlama.io.programmingLanguages.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.programmingLanguages.dataAccess.abstracts.ILanguageRepository;
import kodlama.io.programmingLanguages.entities.Language;

@Repository
public class InMemoryLanguageRepository implements ILanguageRepository {

	List<Language> languages;

	public InMemoryLanguageRepository() {

		languages = new ArrayList<>();
		languages.add(new Language(1, "Python"));
		languages.add(new Language(2, "C++"));
		languages.add(new Language(3, "C#"));
		languages.add(new Language(4, "Java"));
		languages.add(new Language(5,"Kotlin"));

	}

	public List<Language> getAll() {

		return languages;
	}

	public void add(Language language) {

		languages.add(language);

	}

	public void delete(int id){

		for (Language language : languages) {

			if (language.getId() == id) {
				languages.remove(language);
			}

		}

	}

	public void update(Language language,int id) {

		getById(id).setName(language.getName());

	}

	public Language getById(int id) {

		for (Language language : languages) {

			if (language.getId() == id) {
				return language;
			}

		}

		return null;

	}

	
	

}
