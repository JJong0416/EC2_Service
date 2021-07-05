package com.example.demo.service;


import com.example.demo.dto.BoardDto;
import com.example.demo.domain.repository.BoardRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Service
public class BoardService   {
    private BoardRepository boardRepository;

    @Transactional
    public Long savePost(BoardDto boardDto){
        return boardRepository.save(boardDto.toEntity()).getId();
    }
}
