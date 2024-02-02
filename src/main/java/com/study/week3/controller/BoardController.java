package com.study.week3.controller;

import com.study.week3.dto.InsertRequestDto;
import com.study.week3.dto.SelectResponseDto;
import com.study.week3.dto.UpdateRequestDto;
import com.study.week3.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @PostMapping("/board")
    public void insert(@RequestBody InsertRequestDto requestDto) {
        boardService.insert(requestDto);
    }

    @GetMapping("/board")
    public List<SelectResponseDto> selectAll() {
        return boardService.selectAll();
    }

    @GetMapping("/board/{id}")
    public SelectResponseDto selectOne(@PathVariable(name="id") int id) {
        return boardService.selectOne(id);
    }

    @PutMapping("/board")
    public void update(@RequestBody UpdateRequestDto requestDto) {
        boardService.update(requestDto);
    }

    @DeleteMapping("/board/{id}")
    public void delete(@PathVariable(name = "id") int id) {
        boardService.delete(id);
    }
}
