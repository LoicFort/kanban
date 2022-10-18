package com.astree.afpr.Kanban.model.priority;

import com.astree.afpr.Kanban.model.generics.IRepository;

import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class PriorityRepository implements IRepository<Priority> {

  HashMap<Long, Priority> priorityMap = new HashMap<>();

  private static Long generatedId = 1L;


  @Override
  public Priority insert(Priority priority) {
    return null;
  }

  @Override
  public List<Priority> findAll() {
    return null;
  }

  @Override
  public Priority find(Long id) {
    return null;
  }

  @Override
  public void delete(Long id) {

  }

  @Override
  public Priority update(Long id, Priority type) {
    return null;
  }

  /*


  public Priority Insert(Priority priority) {
    priority.setId(generatedId++);
    priorityMap.put(priority.getId(), priority);
    return priority;
  }


  public List<Priority> FindAll() {
    return new ArrayList<>(priorityMap.values());
  }

  public Priority Find(final Long id) {
    return priorityMap.get(id);

  }

  public Priority Update(Long id, Priority priority) {
    return priorityMap.put(id, priority);
  }


  public void Delete(final Long id) {
    priorityMap.remove(id);
  }
   */
}
