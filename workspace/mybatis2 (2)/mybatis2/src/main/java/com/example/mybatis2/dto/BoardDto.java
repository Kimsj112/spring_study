package com.example.mybatis2.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//BOARD_ID NUMBER,
//TITLE VARCHAR2(1000),
//CONTENT VARCHAR2(1000),
//WRITER VARCHAR2(1000),

@Getter @Setter @ToString
@NoArgsConstructor
public class BoardDto {
    private Long boardId;
    private String title;
    private String content;
    private String writer;
}
