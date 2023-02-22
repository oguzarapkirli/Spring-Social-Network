package com.oguzarapkirli.springsocialnetwork.repository;

import com.oguzarapkirli.springsocialnetwork.model.Post;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}