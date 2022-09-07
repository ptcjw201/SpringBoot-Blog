package com.spring.blog.service.impl;

import com.spring.blog.domain.Post;
import com.spring.blog.dto.PostDto;
import com.spring.blog.mapper.PostMapper;
import com.spring.blog.repository.PostRepository;
import com.spring.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    private PostRepository postRepository;

    //생성자가 하나인 경우 DI가 자동으로 적용됨, Autowired 불필요
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<PostDto> findAllPosts() {
        List<Post> posts = postRepository.findAll();
        return posts.stream().map((post) -> PostMapper.mapToPostDto(post))
                .collect(Collectors.toList());
    }
}
