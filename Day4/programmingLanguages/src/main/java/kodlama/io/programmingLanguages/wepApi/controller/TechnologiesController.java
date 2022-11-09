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
	public List<Technology> getAll(){
		return technologyService.getAll();
	}
	
	@PostMapping("/addtech")
	void add(@RequestBody Technology technology) throws Exception {
		technologyService.add(technology);
	}
	
	@DeleteMapping("/{id}")
	void delete(@PathVariable int id) {
		technologyService.delete(id);
	}
	
	@PutMapping("/updatetech")
	void update(@RequestBody Technology technology,int id) throws Exception {
		technologyService.update(technology,id);
	}
	
	@GetMapping("/{id}")
	Technology getById(@PathVariable int id) throws Exception {
		return technologyService.getById(id);
	}
	

}
