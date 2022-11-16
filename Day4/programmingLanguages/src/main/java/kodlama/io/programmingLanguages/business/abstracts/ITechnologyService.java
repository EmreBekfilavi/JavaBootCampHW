package kodlama.io.programmingLanguages.business.abstracts;

import java.util.List;

import kodlama.io.programmingLanguages.business.request.technology.CreateTechnologyRequest;
import kodlama.io.programmingLanguages.business.request.technology.DeleteTechnologyRequest;
import kodlama.io.programmingLanguages.business.request.technology.UpdateTechnologyRequest;
import kodlama.io.programmingLanguages.business.response.GetAllTechnologyResponse;
import kodlama.io.programmingLanguages.entities.Technology;

public interface ITechnologyService {
	
	List<GetAllTechnologyResponse> getAll();
	void add(CreateTechnologyRequest createTechnologyRequest) throws Exception;
	void delete(DeleteTechnologyRequest deleteTechnologyRequest);
	void update(UpdateTechnologyRequest updateTechnologyRequest) throws Exception;
	Technology getById(int id);
	

}
