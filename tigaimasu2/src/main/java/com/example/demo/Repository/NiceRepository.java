package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Nice;

public interface NiceRepository extends JpaRepository<Nice, Long> {

	@Query("select n from Nice n where n.user_id = :user_id and n.post_id = :post_id")
	List<Nice> findByUser_IdAndPostId(@Param("user_id") String user_id, @Param("post_id") Long postId);
}
