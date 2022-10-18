package com.astree.afpr.Kanban.model.priority;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriorityService {

  @Autowired
  private PriorityRepository priorityRepository;

  public Priority createPriority(Priority priority) {
    Priority newPriority = new Priority(priority.getLabel());
    return priorityRepository.createPriority(newPriority);
  }

  public List<Priority> getPriority() {
    return priorityRepository.findAll();
  }

  public Priority getOnePriority(final Long id) {
    return priorityRepository.findById(id);
  }

  public void deletePriority(final Long id) {
    priorityRepository.deleteById(id);
  }

  public Priority updatePriority(Long id, Priority priority) {
    Priority priorityToUpdate = priorityRepository.findById(id);
    System.out.println(priorityToUpdate);
    priorityToUpdate.setLabel(priority.getLabel());
    return priorityRepository.updatePriority(id, priorityToUpdate);
  }

}



