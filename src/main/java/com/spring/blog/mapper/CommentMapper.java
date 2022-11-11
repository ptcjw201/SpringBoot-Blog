package com.spring.blog.mapper;

import com.spring.blog.domain.Comment;
import com.spring.blog.dto.CommentDto;

public class CommentMapper {
    public static CommentDto mapToCommentDto(Comment comment){
        CommentDto commentDto = CommentDto.builder()
                .id(comment.getId())
                .name(comment.getName())
                .email(comment.getEmail())
                .content(comment.getContent())
                .createdOn(comment.getCreatedOn())
                .modifiedOn(comment.getModifiedOn())
                .build();
        return commentDto;
    }

    public static Comment mapToComment(CommentDto commentDto){
        Comment comment = Comment.builder()
                .id(commentDto.getId())
                .name(commentDto.getName())
                .email(commentDto.getEmail())
                .content(commentDto.getContent())
                .createdOn(commentDto.getCreatedOn())
                .modifiedOn(commentDto.getModifiedOn())
                .build();
        return comment;
    }
}
