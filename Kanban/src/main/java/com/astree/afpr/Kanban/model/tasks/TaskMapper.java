package com.astree.afpr.Kanban.model.tasks;

import com.astree.afpr.Kanban.model.entity.TaskEntity;
import org.springframework.stereotype.Service;

@Service
public class TaskMapper {

  public Task map(TaskEntity entity) {
    if(entity == null){
      return null;
    }
    Task task = new Task();
    task.setId(entity.getId());
    task.setTitle(entity.getTitle());
    task.setDescription(entity.getDescription());
    return task;
  }

  public TaskEntity update(TaskEntity toUpdate, Task task) {
    toUpdate.setTitle(task.getTitle());
    toUpdate.setDescription(task.getDescription());
    return toUpdate;
  }




}
