package kodlama.io.programmingLanguages.wepApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.programmingLanguages.business.abstracts.ITechnologyService;
import kodlama.io.programmingLanguages.business.request.technology.CreateTechnologyRequest;
import kodlama.io.programmingLanguages.business.request.technology.DeleteTechnologyRequest;
import kodlama.io.programmingLanguages.business.request.technology.UpdateTechnologyRequest;
import kodlama.io.programmingLanguages.business.response.GetAllTechnologyResponse;
import kodlama.io.programmingLanguages.entities.Technology;

@RestController
@RequestMapping("/api/technologies")
public class TechnologiesController {
	
	private ITechnologyService technologyService;

	@Autowired
	public TechnologiesController(ITechnologyService technologyService) {
		this.technologyService = technologyService;
	}
	
	@GetMapping("/getall")
	public List<GetAllTechnologyResponse> getAll(){
		return technologyService.getAll();
	}
	
	@PostMapping("/addtech")
	void add(@RequestBody CreateTechnologyRequest createTechnologyRequest) throws Exception {
		technologyService.add(createTechnologyRequest);
	}
	
	@DeleteMapping("/{id}")
	void delete(@PathVariable DeleteTechnologyRequest deleteTechnologyRequest) {
		technologyService.delete(deleteTechnologyRequest);
	}
	
	@PutMapping("/updatetech")
	void update(@RequestBody UpdateTechnologyRequest updateTechnologyRequest) throws Exception {
		technologyService.update(updateTechnologyRequest);
	}
	
	@GetMapping("/{id}")
	Technology getById(@PathVariable int id) throws Exception {
		return technologyService.getById(id);
	}
	

}
