package com.itboy.DACNPM.Service.Interface;

import java.util.List;
import com.itboy.DACNPM.models.*;
import com.itboy.DACNPM.dtos.*;

public interface ICategoryService {
    Category createCategory(CategoryDTO category);
    Category getCategoryById(long id);
    List<Category> getAllCategories();
    Category updateCategory(long categoryId, CategoryDTO category);
    void deleteCategory(long id);
}