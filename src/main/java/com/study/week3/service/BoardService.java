package com.study.week3.service;

import com.study.week3.dto.*;
import com.study.week3.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardMapper;

    public void insert(InsertRequestDto requestDto) {
        InsertModelDto modelDto = new InsertModelDto();

        modelDto.setCategory(requestDto.getCategory());
        modelDto.setTitle(requestDto.getTitle());
        modelDto.setContent(requestDto.getContent());
        modelDto.setRegName(requestDto.getRegName());

        boardMapper.insert(modelDto);
    }

    public List<SelectResponseDto> selectAll() {
        return boardMapper.selectAll();
    }

    public SelectResponseDto selectOne(int id) {
        return boardMapper.selectOne(id);
    }

    public void update(UpdateRequestDto requestDto) {
        UpdateModelDto modelDto = new UpdateModelDto();
        modelDto.setId(requestDto.getId());
        modelDto.setTitle(requestDto.getTitle());
        modelDto.setContent(requestDto.getContent());
        modelDto.setModName(requestDto.getModName());
        boardMapper.update(modelDto);
    }

    public void delete(int id) {
        boardMapper.delete(id);
    }
}
