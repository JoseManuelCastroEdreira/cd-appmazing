package com.campusdual.appmazing.api;

import java.util.List;

import com.campusdual.appmazing.model.dto.CategoryDTO;


public interface iCategoryService {

    CategoryDTO queryCategory(CategoryDTO categoryDTO);

    List<CategoryDTO> queryAllCategories();

    int insertCategory(CategoryDTO category);


    int updateCategory(CategoryDTO category);

    int deleteCategory(CategoryDTO categoryDTO);

}


