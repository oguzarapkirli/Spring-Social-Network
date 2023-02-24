package com.oguzarapkirli.springsocialnetwork.repository;


import com.oguzarapkirli.springsocialnetwork.model.Like;
import com.oguzarapkirli.springsocialnetwork.model.Post;
import com.oguzarapkirli.springsocialnetwork.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {
    Optional<Like> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}