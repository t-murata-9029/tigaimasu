package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
	@Query("select p from Post p where p.user_id = :user_id")
	List<Post> findByUser_IdOrderByTimestampsDesc(@Param("user_id") String user_id);
}
