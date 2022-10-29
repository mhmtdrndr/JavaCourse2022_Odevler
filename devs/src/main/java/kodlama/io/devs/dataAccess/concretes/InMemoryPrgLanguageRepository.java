package kodlama.io.devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kodlama.io.devs.dataAccess.abstracts.PrgLanguageRepository;
import kodlama.io.devs.entity.concretes.PrgLanguage;

@Repository
public class InMemoryPrgLanguageRepository implements PrgLanguageRepository{
	
	List<PrgLanguage> prgLanguages;
	
	@Autowired
	public InMemoryPrgLanguageRepository() {
		prgLanguages = new ArrayList<PrgLanguage>();
		prgLanguages.add(new PrgLanguage(1, "Java"));
		prgLanguages.add(new PrgLanguage(2, "C#"));
		prgLanguages.add(new PrgLanguage(3, "Python"));
	}

	@Override
	public void pLanguageAdd(PrgLanguage language) {
		this.prgLanguages.add(language);		
	}

	@Override
	public void pLanguageDelete(int id) {
		this.prgLanguages.remove(id);
		
	}

	@Override
	public void pLanguageUpdate(PrgLanguage language) {
		for (PrgLanguage lng:prgLanguages) {
			if(language.getId() == lng.getId()) {
				language.setLanguageName(lng.getLanguageName());
			}
		}
		
	}

	@Override
	public List<PrgLanguage> getAll() {
		return prgLanguages;
	}

	@Override
	public PrgLanguage getLanguage(int id) {
		for (PrgLanguage lng:prgLanguages) {
			if(lng.getId() == id) {
				return lng;
			}
		}
		return null;
	}
	
	
}
