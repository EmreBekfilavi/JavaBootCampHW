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

import kodlama.io.programmingLanguages.business.abstracts.ILanguageService;
import kodlama.io.programmingLanguages.business.request.language.CreateLanguageRequest;
import kodlama.io.programmingLanguages.business.request.language.DeleteLanguageRequest;
import kodlama.io.programmingLanguages.business.request.language.UpdateLanguageRequest;
import kodlama.io.programmingLanguages.business.response.GetAllLanguageResponse;
import kodlama.io.programmingLanguages.entities.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private ILanguageService languageService;

	@Autowired
	public LanguagesController(ILanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<GetAllLanguageResponse> getAll(){
		return languageService.getAll();
	}
	
	@PostMapping("/add")
	void add(@RequestBody CreateLanguageRequest createLanguageRequest) throws Exception {
		languageService.add(createLanguageRequest);
	}
	
	@DeleteMapping("/{id}")
	void delete(@PathVariable DeleteLanguageRequest deleteLanguageRequest) {
		languageService.delete(deleteLanguageRequest);
	}
	
	@PutMapping("/update")
	void update(@RequestBody UpdateLanguageRequest updateLanguageRequest) throws Exception {
		languageService.update(updateLanguageRequest);
	}
	
	@GetMapping("/{id}")
	Language getById(@PathVariable int id) throws Exception {
		return languageService.getById(id);
	}

}
