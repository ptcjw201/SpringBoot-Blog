package com.spring.blog.repository;

import com.spring.blog.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//JpaRepository : 단순 반복 작업(CRUD, Paging) 들을 Spring Data JPA 구현체인 Hibernate가 애플리케이션 실행 시점에
//동적으로 자주 사용되는 쿼리 집합을 만들어 인터페이스를 구현해준다.

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
