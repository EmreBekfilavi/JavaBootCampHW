package kodlama.io.programmingLanguages.business.abstracts;

import java.util.List;

import kodlama.io.programmingLanguages.entities.Language;

public interface ILanguageService {
	
	List<Language> getAll();
	void add(Language language) throws Exception;
	void delete(int id);
	void update(Language language,int id)throws Exception;
	Language getById(int id) throws Exception;
	

}
