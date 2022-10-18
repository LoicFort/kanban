package com.astree.afpr.Kanban.model.priority;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriorityService {

  @Autowired
  private PriorityRepository priorityRepository;

  public Priority Insert(Priority priority) {
    Priority newPriority = new Priority(priority.getLabel());
    return priorityRepository.insert(newPriority);
  }

  public List<Priority> find() {
    return priorityRepository.findAll();
  }

  public Priority find(final Long id) {
    return priorityRepository.find(id);
  }

  public void delete(final Long id) {
    priorityRepository.delete(id);
  }

  public Priority  update(Long id, Priority priority) {
    Priority priorityToUpdate = priorityRepository.find(id);
    priorityToUpdate.setLabel(priority.getLabel());
    return priorityRepository.update(id, priorityToUpdate);
  }

}



