package kodlama.io.devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.devs.entity.concretes.PrgLanguage;

public interface PrgLanguageRepository {
	void pLanguageAdd(PrgLanguage language);
	void pLanguageDelete(int id);
	void pLanguageUpdate(PrgLanguage language);
	List<PrgLanguage> getAll();
	PrgLanguage getLanguage(int id);
}
