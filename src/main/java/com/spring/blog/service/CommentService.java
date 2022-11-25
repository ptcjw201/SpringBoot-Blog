package com.spring.blog.service;

import com.spring.blog.dto.CommentDto;

import java.util.List;
import java.util.concurrent.CompletionException;

public interface CommentService {
    void createComment(String postUrl, CommentDto commentDto);
    List<CommentDto> findAllComments();
}
