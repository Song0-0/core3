package com.study.week3.mapper;

import com.study.week3.dto.InsertModelDto;
import com.study.week3.dto.SelectResponseDto;
import com.study.week3.dto.UpdateModelDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    void insert(InsertModelDto modelDto);
    List<SelectResponseDto> selectAll();
    SelectResponseDto selectOne(int id);
    void update(UpdateModelDto modelDto);
    void delete(int id);
}
