package kodlama.io.devs.entity.concretes;

import kodlama.io.devs.entity.abstracts.IEntity;

public class PrgLanguage implements IEntity{
	private int id;
	private String languageName;
	
	public PrgLanguage() {
		
	}

	public PrgLanguage(int id, String languageName) {
		this.id = id;
		this.languageName = languageName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
	
	
	

}
