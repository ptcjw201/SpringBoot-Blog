package com.spring.blog.controller;

import com.spring.blog.dto.PostDto;
import com.spring.blog.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.Locale;

@Controller
public class PostController {
    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/admin/posts")
    public String posts(Model model){
        List<PostDto> posts = postService.findAllPosts();
        model.addAttribute("posts", posts);
        System.out.println("herer");
        return "/admin/posts";
    }

    @GetMapping("/admin/posts/newposts")
    public String newPost(Model model){
        PostDto postDto = new PostDto();
        model.addAttribute("post", postDto);
        return "/admin/create_posts";
    }

    @PostMapping("/admin/posts")
    public String createPost(@Valid @ModelAttribute("post") PostDto postDto,
                             BindingResult result,
                             Model model){
        if(result.hasErrors()){
            model.addAttribute("post", postDto);
            return "admin/create_posts";
        }
        String title = postDto.getTitle();
        title = title.trim().toLowerCase();
        String url = title.replaceAll("//s+","-");
        url = url.replaceAll("[^A-Za-z0-9]","-");
        postDto.setUrl(url);
        postService.createPost(postDto);
        return "redirect:/admin/posts";
    }
}
