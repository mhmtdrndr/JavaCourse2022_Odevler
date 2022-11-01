package kodlama.io.devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.PrgLanguageService;
import kodlama.io.devs.dataAccess.abstracts.PrgLanguageRepository;
import kodlama.io.devs.entity.concretes.PrgLanguage;

@Service
public class PrgLanguageManager implements PrgLanguageService {

	private PrgLanguageRepository languageRepository;

	@Autowired
	public PrgLanguageManager(PrgLanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public void pLanguageAdd(PrgLanguage language) throws Exception {
		if(!isExistPrgLanguage(language)&&!checkPrgLanguageName(language)&&!checkPrgLanguageId(language)) {
			languageRepository.pLanguageAdd(language);
		}		
	}

	@Override
	public void pLanguageDelete(int id) throws Exception {
		languageRepository.pLanguageDelete(id);
	}

	@Override
	public void pLanguageUpdate(PrgLanguage language, int id) throws Exception {
		if(!isExistPrgLanguage(language)&&!checkPrgLanguageName(language)) {
			languageRepository.pLanguageUpdate(language, id);
		}
		
	}

	@Override
	public List<PrgLanguage> getAll() {
		return languageRepository.getAll();
	}

	@Override
	public PrgLanguage getLanguage(int id) {
		return languageRepository.getLanguage(id);
	}

	public boolean isExistPrgLanguage(PrgLanguage language) throws Exception {
		for (PrgLanguage lng : languageRepository.getAll()) {
			if (lng.getLanguageName().equalsIgnoreCase(language.getLanguageName())) {
				throw new Exception("Aynı Programlama Dilinden kayıt olduğundan işlem başarısız...");
			}
		}
		return false;
	}

	public boolean checkPrgLanguageId(PrgLanguage language) throws Exception {
		for (PrgLanguage lng : languageRepository.getAll()) {
			if (lng.getId() == language.getId()) {
				throw new Exception("Aynı ID'li kayıt olduğundan işlem başarısız...");
			}
		}
		return false;
	}

	public boolean checkPrgLanguageName(PrgLanguage language) throws Exception {
		if (language.getLanguageName().trim().length() == 0) {
			throw new Exception("Programlama dili boş geçilemez...");
		}
		return false;
	}

}
