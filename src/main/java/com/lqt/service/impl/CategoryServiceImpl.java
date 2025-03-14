package com.lqt.service.impl;

import com.lqt.pojo.Category;
import com.lqt.repository.CategoryRepository;
import com.lqt.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    @Override
    public List<Category> getCategories() {
        return categoryRepository.getCategories();
    }
}
