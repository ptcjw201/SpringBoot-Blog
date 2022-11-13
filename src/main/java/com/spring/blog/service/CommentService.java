package com.spring.blog.service;

import com.spring.blog.dto.CommentDto;

public interface CommentService {
    void createComment(String postUrl, CommentDto commentDto);

}
