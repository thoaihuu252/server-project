package com.itboy.DACNPM.Controller;

import com.itboy.DACNPM.Service.Imp.CategoryService;
import com.itboy.DACNPM.dtos.CategoryDTO;
import com.itboy.DACNPM.models.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("${api.prefix}/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
    @GetMapping("")
    public List<Category> getAllCategory() {
        return categoryService.getAllCategories();
    }
    @PostMapping("")
    public String addCategory(@RequestBody CategoryDTO category) {
        categoryService.createCategory(category);
        return "Successfully added category";
    }
    @DeleteMapping("/{id}")
    public String deleteCategory(@PathVariable int id) {
        categoryService.deleteCategory(id);
        return "Successfully deleted category";
    }
    @PutMapping("/{id}")
    public String updateCategory(@PathVariable int id, @RequestBody CategoryDTO category) {
        categoryService.updateCategory(id,category);
        return "Successfully updated category";
    }
}
