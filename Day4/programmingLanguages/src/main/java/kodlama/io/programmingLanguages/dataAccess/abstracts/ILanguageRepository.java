package kodlama.io.programmingLanguages.dataAccess.abstracts;

import java.util.List;

import kodlama.io.programmingLanguages.entities.Language;

public interface ILanguageRepository {
	
	List<Language> getAll();
	void add (Language language);
	void delete (int id);
	void update (Language language,int id);
	Language getById(int id);

}
