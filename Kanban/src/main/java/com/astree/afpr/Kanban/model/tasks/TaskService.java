package com.astree.afpr.Kanban.model.tasks;

import com.astree.afpr.Kanban.core.RestRepositoryImpl;
import com.astree.afpr.Kanban.core.RestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService extends RestServiceImpl<Task, Long> {

  @Autowired
  public TaskService(RestRepositoryImpl<Task, Long> repository) {
    super(repository);
  }

  @Override
  public Task update(Task toUpdate, Task newObject) {
    toUpdate.setTitle(newObject.getTitle());
    toUpdate.setDescription(newObject.getDescription());
    return newObject;

  }


}
