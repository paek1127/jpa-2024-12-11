package com.ll.jpa.domain.post.post.repository;

import com.ll.jpa.domain.post.post.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// Post : 이 클래스로 다룰 엔티티 클래스와 연동된 테이블(post테이블)
// Long : Post 엔티티 클래스의 주키 타입

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByTitle(String title);

    List<Post> findByTitleAndContent(String title, String content);

    List<Post> findByTitleLike(String title);

    List<Post> findByTitleLikeOrderByIdDesc(String title);

    List<Post> findByOrderByIdDesc();

    List<Post> findTop2ByTitleLikeOrderByIdDesc(String title);

    List<Post> findTop2ByOrderByIdDesc();

    Page<Post> findByTitleLike(String title, Pageable pageable);

    List<Post> findByAuthorNickname(String authorNickname);

    List<Post> findByCommentsAuthorNickname(String authorNickname);
}
