package com.kdTalents.TalentPool.repository;


import com.kdTalents.TalentPool.entity.UserT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserTRepository extends JpaRepository <UserT, Long> {
    Optional<UserT> findUserByUsername(String username);


}
