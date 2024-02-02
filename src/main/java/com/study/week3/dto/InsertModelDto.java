package com.study.week3.dto;

import lombok.Data;

@Data
public class InsertModelDto {
    private int id;
    private int category;
    private String title;
    private String content;
    private String regName;
    private String regDt;
    private String modName;
    private String modDt;
}
