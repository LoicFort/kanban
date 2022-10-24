package com.astree.afpr.Kanban.model.priority;

import com.astree.afpr.Kanban.model.entity.PriorityEntity;
import com.astree.afpr.Kanban.model.tasks.TaskMapper;
import com.astree.afpr.Kanban.model.tasks.TaskRepository;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class PriorityMapper  {
  private TaskMapper mapper;
  @Autowired
  public PriorityMapper(@Lazy TaskMapper mapper) {
    this.mapper = mapper;
  }

  @Autowired
  private TaskRepository repository;


  public Priority map(PriorityEntity entity) {
    Priority priority = new Priority();
    priority.setId(entity.getId());
    priority.setLabel(entity.getLabel());
//    if (entity.getTask() != null) {
//      priority.setTask(entity.getTask()
//          .stream()
//          .map(mapper::map)
//          .collect(Collectors.toList()));
//    }
    return priority;

  }

  public PriorityEntity update(PriorityEntity toUpdate, Priority priority) {
    toUpdate.setLabel(priority.getLabel());
    return toUpdate;

  }


}
