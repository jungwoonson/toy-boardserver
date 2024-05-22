package com.boardserver.mapper;

import com.boardserver.dto.CategoryDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper {

    void register(CategoryDTO categoryDTO);
    void update(CategoryDTO categoryDTO);
    void delete(int id);
}
