package com.astree.afpr.Kanban.model.user;

import com.astree.afpr.Kanban.core.RestRepositoryImpl;
import com.astree.afpr.Kanban.core.RestServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserService extends RestServiceImpl<User, Long> {

  public UserService(RestRepositoryImpl<User, Long> repository) {
    super(repository);
  }

  @Override
  public User update(User toUpdate, User newObject) {
    toUpdate.setName(newObject.getName());
    return newObject;
  }
}
