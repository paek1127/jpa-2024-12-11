package com.ll.jpa.domain.post.post.repository;

import com.ll.jpa.domain.post.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

// Post : 이 클래스로 다룰 엔티티 클래스와 연동된 테이블(post테이블)
// Long : Post 엔티티 클래스의 주키 타입

public interface PostRepository extends JpaRepository<Post, Long> {
}
