package javaCourseDay3HomeWork.dataAccess;

import java.util.ArrayList;
import java.util.List;

import javaCourseDay3HomeWork.Entities.Category;

public class HibernateCategoryDao implements CategoryDao {
	
	List<Category> categories = new ArrayList<Category>();

	@Override
	public void add(Category category) {		
		categories.add(category);
		System.out.println("Kategori kaydı Hibernate ile eklendi " + category.getCategoryName());
	}

	@Override
	public List<Category> getAll() {		
		return this.categories;
	}

}
