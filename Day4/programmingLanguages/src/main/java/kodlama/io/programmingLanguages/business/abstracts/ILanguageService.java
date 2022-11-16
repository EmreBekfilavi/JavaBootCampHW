package kodlama.io.programmingLanguages.business.abstracts;

import java.util.List;

import kodlama.io.programmingLanguages.business.request.language.CreateLanguageRequest;
import kodlama.io.programmingLanguages.business.request.language.DeleteLanguageRequest;
import kodlama.io.programmingLanguages.business.request.language.UpdateLanguageRequest;
import kodlama.io.programmingLanguages.business.response.GetAllLanguageResponse;
import kodlama.io.programmingLanguages.entities.Language;

public interface ILanguageService {
	
	List<GetAllLanguageResponse> getAll();
	void add(CreateLanguageRequest createLanguageRequest) throws Exception;
	void delete(DeleteLanguageRequest deleteLanguageRequest);
	void update(UpdateLanguageRequest updateLanguageRequest) throws Exception;
	Language getById(int id);
	

}
