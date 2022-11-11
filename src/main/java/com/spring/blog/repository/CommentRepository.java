package com.spring.blog.repository;

import com.spring.blog.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository annotation이 필요치 않음
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
