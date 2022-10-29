package kodlama.io.devs.webAPI.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.PrgLanguageService;
import kodlama.io.devs.entity.concretes.PrgLanguage;

@RestController
@RequestMapping("api/prglanguages")
public class PrgLanguagesController {
	
	private PrgLanguageService languageService;

	public PrgLanguagesController(PrgLanguageService languageService) {
		this.languageService = languageService;
	}
	
	@PostMapping("/addLanguage")
	public void pLanguageAdd(@RequestBody PrgLanguage language) throws Exception {
		languageService.pLanguageAdd(language);
	}
	
	@DeleteMapping("/deleteLanguage")
	public void pLanguageDelete(@RequestParam int id) {
		languageService.pLanguageDelete(id);
	}
	
	@PutMapping("/updateLanguage")
	public void pLanguageUpdate(@RequestBody PrgLanguage language) {
		languageService.pLanguageUpdate(language);
	}
	
	@GetMapping("/getAll")
	public List<PrgLanguage> getAll(){
		return languageService.getAll();
	}
	
	@GetMapping("/getId")
	public PrgLanguage getLanguage(@RequestParam int id) {
		return languageService.getLanguage(id);
	}

}
