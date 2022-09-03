package com.spring.blog.domain;
//Lombok을 사용해 코드를 효율적으로 작성, 반복되는 메소드를 정의하는 번거로움을 덜어줌
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//Getter, Setter, ToString, RequiredArgsConstructor, EqualsAndHashCode 생성
//@RequiredArgsConstructor => final이나 NotNull이 붙은 필드의 생성자를 자동생성
@Data
@AllArgsConstructor //모든 필드를 파라미터로 받는 생성자 생성
@NoArgsConstructor  //파라미터가 없는 기본 생성자 생성


@Entity //객체 매핑
//테이블 매핑, 유니크 제약 조건을 만듬
@Table(
        name = "posts", uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})}
)
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "content", nullable = false)
    private String content;


}
