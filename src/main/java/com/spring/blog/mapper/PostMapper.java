package com.spring.blog.mapper;

import com.spring.blog.domain.Post;
import com.spring.blog.dto.PostDto;

import java.util.stream.Collectors;

public class PostMapper {

    //Post를 PostDto로 매핑
    public static PostDto mapToPostDto(Post post){
        PostDto postDto = PostDto.builder()
                .id(post.getId())
                .title(post.getTitle())
                .url(post.getUrl())
                .content(post.getContent())
                .shortDescription(post.getShortDescription())
                .createdOn(post.getCreatedOn())
                .modifiedOn(post.getModifiedOn())
                .comments(post.getComments().stream().map((comment) -> CommentMapper.mapToCommentDto(comment))
                        .collect(Collectors.toSet()))
                .build();
        return postDto;
    }

    //PostDto를 Post로 매핑
    public static Post mapToPost(PostDto postDto){
        Post post = Post.builder()
                .id(postDto.getId())
                .title(postDto.getTitle())
                .url(postDto.getUrl())
                .content(postDto.getContent())
                .shortDescription(postDto.getShortDescription())
                .createdOn(postDto.getCreatedOn())
                .modifiedOn(postDto.getModifiedOn())
                .build();
        return post;

    }
}
