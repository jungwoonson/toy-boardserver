package com.boardserver.service;

import com.boardserver.dto.CategoryDTO;

public interface CategoryService {

    void register(String accountId, CategoryDTO categoryDTO);
    void update(CategoryDTO categoryDTO);
    void delete(int categoryId);
}
