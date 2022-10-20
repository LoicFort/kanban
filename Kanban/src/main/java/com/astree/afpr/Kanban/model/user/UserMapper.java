package com.astree.afpr.Kanban.model.user;

import com.astree.afpr.Kanban.model.entity.UserEntity;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {

  public User map(UserEntity entity) {
    User user = new User();
    user.setName(entity.getName());
    user.setId(entity.getId());
    return user;
  }

  public UserEntity update(UserEntity toUpdate, User user) {
    toUpdate.setName(user.getName());
    return toUpdate;
  }

}
