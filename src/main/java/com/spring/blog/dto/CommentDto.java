package com.spring.blog.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommentDto {
    private Long id;
    private String name;
    private String email;
    private String content;
    private LocalDateTime createdOn;
    private LocalDateTime modifiedOn;

}
