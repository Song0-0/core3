package com.study.week3.dto;

import lombok.Data;

@Data
public class InsertRequestDto {
    private int category;
    private String title;
    private String content;
    private String regName;
    private String modName;
}
