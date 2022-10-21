package com.astree.afpr.Kanban.model.user;

import com.astree.afpr.Kanban.model.entity.TaskEntity;
import com.astree.afpr.Kanban.model.entity.UserEntity;
import com.astree.afpr.Kanban.model.tasks.Task;
import com.astree.afpr.Kanban.model.tasks.TaskMapper;
import com.astree.afpr.Kanban.model.tasks.TaskRepository;
import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {

  @Autowired
  private TaskMapper taskMapper;

  @Autowired
  private TaskRepository repository;

  public User map(UserEntity entity) {
    User user = new User();
    user.setId(entity.getId());
    user.setName(entity.getName());
    if (entity.getTask() != null) {
      user.setTask(taskMapper.map(entity.getTask()));
    }
    return user;
  }

  public UserEntity update(UserEntity toUpdate, User user) {
    toUpdate.setName(user.getName());
    if (user.getTask() != null) {
      toUpdate.setTask(repository.findById(user.getTask().getId())
          .orElseThrow(() -> new EntityNotFoundException()));

    } else {
      toUpdate.setTask(null);
    }
    return toUpdate;
  }

}
