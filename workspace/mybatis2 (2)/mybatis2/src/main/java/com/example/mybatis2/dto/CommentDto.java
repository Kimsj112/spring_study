package com.example.mybatis2.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CommentDto {
    private Long commentId;
    private String content;
    private String writer;
}
