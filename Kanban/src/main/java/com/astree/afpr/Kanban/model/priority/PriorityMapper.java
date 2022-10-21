package com.astree.afpr.Kanban.model.priority;

import com.astree.afpr.Kanban.model.entity.PriorityEntity;
import com.astree.afpr.Kanban.model.tasks.TaskMapper;
import com.astree.afpr.Kanban.model.tasks.TaskRepository;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriorityMapper {

  @Autowired
  private TaskMapper taskMapper;

  @Autowired
  private TaskRepository repository;


  public Priority map(PriorityEntity entity) {
    Priority priority = new Priority();
    priority.setId(entity.getId());
    priority.setLabel(entity.getLabel());
    if (entity.getTask() != null) {
      priority.setTask(entity.getTask()
          .stream()
          .map(taskMapper::map).collect(Collectors.toList())) ;
    } else {
      priority.setTask(null);
    }
    return priority;

  }

  public PriorityEntity update(PriorityEntity toUpdate, Priority priority) {
    toUpdate.setLabel(priority.getLabel());
    return toUpdate;

  }



}
