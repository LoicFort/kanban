package com.astree.afpr.Kanban.model.priority;

import com.astree.afpr.Kanban.core.RestRepositoryImpl;
import com.astree.afpr.Kanban.core.RestServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PriorityService extends RestServiceImpl<Priority, Long> {

  public PriorityService(RestRepositoryImpl<Priority, Long> repository) {
    super(repository);
  }

  @Override
  public Priority update(Priority toUpdate, Priority newObject) {
    toUpdate.setLabel(newObject.getLabel());
    return newObject;
  }
}
