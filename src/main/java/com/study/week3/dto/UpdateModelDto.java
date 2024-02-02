package com.study.week3.dto;

import lombok.Data;

@Data
public class UpdateModelDto {
    private int id;
    private String title;
    private String content;
    private String modName;
}
