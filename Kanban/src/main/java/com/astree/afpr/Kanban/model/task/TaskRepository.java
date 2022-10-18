package com.astree.afpr.Kanban.model.task;

import com.astree.afpr.Kanban.model.generics.IRepository;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public  class TaskRepository implements IRepository<Task> {

  private static Long generatedId = 1L;
  HashMap<Long, Task> taskMap = new HashMap<>();

  @Override
  public Task insert(Task task) {
    return null;
  }

  @Override
  public List findAll() {
    return null;
  }

  @Override
  public Task find(Long id) {
    return null;
  }

  @Override
  public void delete(Long id) {

  }

  @Override
  public Task update(Long id, Task task) {
    return null;
  }

//
//  public Object Insert(Task task) {
//    task.setId(generatedId++);
//    taskMap.put(task.getId(), task);
//    return task;
//  }
//
//
//  public List<Task> FindAll() {
//    return new ArrayList<>(taskMap.values());
//  }
//
//  public Task findById(final Long id) {
//    return taskMap.get(id);
//  }
//
//  public Task updateTask(Long id, Task task) {
//    return taskMap.put(id, task);
//  }
//
//  public void deleteById(final Long id) {
//    taskMap.remove(id);
//  }


}
