package com.astree.afpr.Kanban.model.user;

import com.astree.afpr.Kanban.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
