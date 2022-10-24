package com.astree.afpr.Kanban.model.tasks;

import com.astree.afpr.Kanban.model.entity.TaskEntity;
import com.astree.afpr.Kanban.model.priority.Priority;
import com.astree.afpr.Kanban.model.priority.PriorityMapper;
import com.astree.afpr.Kanban.model.priority.PriorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class TaskMapper {

  @Autowired
  private PriorityRepository repository;

  private PriorityMapper priorityMapper;
  @Autowired
  public void setPriorityMapper(PriorityMapper priorityMapper) {
    this.priorityMapper = priorityMapper;
  }

  public Task map(TaskEntity entity) {
    if (entity == null) {
      return null;
    }
    Task task = new Task();
    task.setId(entity.getId());
    task.setTitle(entity.getTitle());
    task.setDescription(entity.getDescription());
    if (entity.getPriority() != null) {
      Priority dto = priorityMapper.map(entity.getPriority());
      task.setPriority(dto);
    } else {
      task.setId(null);
    }

    return task;
  }


  public TaskEntity update(TaskEntity toUpdate, Task task) {
    toUpdate.setTitle(task.getTitle());
    toUpdate.setDescription(task.getDescription());

    return toUpdate;
  }


}
