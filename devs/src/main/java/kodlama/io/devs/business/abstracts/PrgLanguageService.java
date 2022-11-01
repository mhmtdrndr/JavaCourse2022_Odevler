package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.entity.concretes.PrgLanguage;

public interface PrgLanguageService {
	void pLanguageAdd(PrgLanguage language) throws Exception;
	void pLanguageDelete(int id) throws Exception;
	void pLanguageUpdate(PrgLanguage language, int id) throws Exception;
	List<PrgLanguage> getAll();
	PrgLanguage getLanguage(int id);

}
