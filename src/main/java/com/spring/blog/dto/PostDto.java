package com.spring.blog.dto;
//DTO 클래스는 VIEW와 CONTROLLER 사이에서 사용
//MVC에서는 Model에 속함

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.LastModifiedDate;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {
    private Long id;
    @NotEmpty
    private String title;
    private String url;
    @NotEmpty
    private String content;
    @NotEmpty
    private String shortDescription;
    private LocalDateTime createdOn;
    private LocalDateTime modifiedOn;
    private Set<CommentDto> comments;
}
