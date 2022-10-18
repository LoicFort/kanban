package com.astree.afpr.Kanban.model.priority;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class PriorityRepository {

  HashMap<Long, Priority> priorityMap = new HashMap<>();
  private static Long generatedId = 1L;

  public Priority createPriority(Priority priority) {
    priority.setId(generatedId++);
    priorityMap.put(priority.getId(), priority);
    return priority;

  }

  public List<Priority> findAll() {
    return new ArrayList<>(priorityMap.values());
  }

  public Priority findById(final Long id) {
    return priorityMap.get(id);

  }

  public Priority updatePriority(Long id, Priority priority) {
    return priorityMap.put(id, priority);
  }

  public void deleteById(final Long id) {
    priorityMap.remove(id);
  }


}
