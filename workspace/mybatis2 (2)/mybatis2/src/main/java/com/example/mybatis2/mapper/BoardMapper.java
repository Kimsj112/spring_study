package com.example.mybatis2.mapper;

import com.example.mybatis2.dto.BoardDto;
import com.example.mybatis2.dto.SearchDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    void insertBoard(BoardDto boardDto);

    BoardDto selectBoard(Long boardId);

    List<BoardDto> selectAll();

    void updateBoard(BoardDto boardDto);

    void deleteBoard(Long boardId);

    List<BoardDto>selectByKeyword(SearchDto searchDto);

}


















