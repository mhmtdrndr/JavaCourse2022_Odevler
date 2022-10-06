package javaCourseDay3HomeWork.dataAccess;

import java.util.List;

import javaCourseDay3HomeWork.Entities.Category;

public interface CategoryDao {
	void add(Category category);
	List<Category> getAll();
}
