package com.spring.blog.service.impl;

import com.spring.blog.domain.Comment;
import com.spring.blog.domain.Post;
import com.spring.blog.dto.CommentDto;
import com.spring.blog.mapper.CommentMapper;
import com.spring.blog.repository.CommentRepository;
import com.spring.blog.repository.PostRepository;
import com.spring.blog.service.CommentService;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Service;


@Service
public class CommentServiceImpl implements CommentService {
    private CommentRepository commentRepository;
    private PostRepository postRepository;

    public CommentServiceImpl(CommentRepository commentRepository, PostRepository postRepository){
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
    }

    @Override
    public void createComment(String postUrl, CommentDto commentDto) {
        Comment comment = CommentMapper.mapToComment(commentDto);
        Post post = postRepository.findByUrl(postUrl).get();
        comment.setPost(post);
        commentRepository.save(comment);
    }
}
