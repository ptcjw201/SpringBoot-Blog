package com.spring.blog.repository;

import com.spring.blog.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;


//@Repository annotation이 필요치 않음
public interface PostRepository extends JpaRepository<Post, Long> {
    Optional<Post> findByUrl(String url);
    @Query("SELECT p from Post p WHERE " +
            " p.title LIKE CONCAT('%', :query, '%') OR " +
            " p.shortDescription LIKE CONCAT('%', :query, '%')")
    List<Post> searchPosts(String query);

}
