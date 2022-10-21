package com.astree.afpr.Kanban.model.tasks;

import com.astree.afpr.Kanban.model.entity.PriorityEntity;
import com.astree.afpr.Kanban.model.entity.TaskEntity;

import com.astree.afpr.Kanban.model.priority.Priority;
import com.astree.afpr.Kanban.model.priority.PriorityMapper;
import com.astree.afpr.Kanban.model.priority.PriorityRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskMapper {

  private PriorityRepository repository;
  private PriorityMapper mapper;


  public Task map(TaskEntity entity) {
    if(entity == null){
      return null;
    }
    Task task = new Task();
    task.setId(entity.getId());
    task.setTitle(entity.getTitle());
    task.setDescription(entity.getDescription());
    if(entity.getPriority() != null) {
      PriorityEntity priorityEntity = entity.getPriority();
      Priority dto = mapper.map(priorityEntity);
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
