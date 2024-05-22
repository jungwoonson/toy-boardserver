package com.boardserver.service.impl;

import com.boardserver.dto.CategoryDTO;
import com.boardserver.mapper.CategoryMapper;
import com.boardserver.service.CategoryService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class CategoryServiceImpl implements CategoryService {

    private CategoryMapper categoryMapper;

    public CategoryServiceImpl(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    @Override
    public void register(String accountId, CategoryDTO categoryDTO) {
        if (accountId != null) {
            categoryMapper.register(categoryDTO);
            return;
        }
        log.error("register ERROR! {}", categoryDTO);
        throw new RuntimeException("register ERROR! 게시글 카테고리 등록 메서드를 확인해주세요\n" + "Params : " + categoryDTO);
    }

    @Override
    public void update(CategoryDTO categoryDTO) {
        if (categoryDTO != null) {
            categoryMapper.update(categoryDTO);
            return;
        }
        log.error("update ERROR! {}", categoryDTO);
        throw new RuntimeException("update ERROR! 게시글 카테고리 수정 메서드를 확인해주세요\n" + "Params : " + categoryDTO);
    }

    @Override
    public void delete(int categoryId) {
        if (categoryId != 0) {
            categoryMapper.delete(categoryId);
            return;
        }
        log.error("delete ERROR! {}", categoryId);
        throw new RuntimeException("update ERROR! 게시글 카테고리 삭제 메서드를 확인해주세요\n" + "Params : " + categoryId);
    }
}
