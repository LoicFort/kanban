package com.astree.afpr.Kanban.model.user;

import com.astree.afpr.Kanban.model.entity.TaskEntity;
import com.astree.afpr.Kanban.model.entity.UserEntity;
import com.astree.afpr.Kanban.model.tasks.TaskMapper;
import com.astree.afpr.Kanban.model.tasks.TaskRepository;
import java.util.stream.Collectors;
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
      user.setTask(entity.getTask()
          .stream()
          .map(taskMapper::map).collect(Collectors.toList())) ;
    } else {
      user.setTask(null);
    }
    return user;
  }

  public UserEntity update(UserEntity toUpdate, User user) {
    toUpdate.setName(user.getName());
    try {
      if (user.getTask() != null) {
        toUpdate.setTask(user.getTask()
            .stream()
            .map((t -> taskMapper.update(new TaskEntity(), t))).collect(Collectors.toList()));

      } else {
        toUpdate.setTask(null);
      }
    } catch (Error e) {
      System.out.println(e);

    }
    return toUpdate;
  }

}
