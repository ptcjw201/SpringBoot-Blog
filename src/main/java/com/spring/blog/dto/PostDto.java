package com.spring.blog.dto;
//DTO 클래스는 VIEW와 CONTROLLER 사이에서 사용
//MVC에서는 Model에 속함

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {
    private Long id;
    private String title;
    private String url;
    private String content;
    private String shortDescription;
    private LocalDateTime createdOn;
    private LocalDateTime modifiedOn;
}
