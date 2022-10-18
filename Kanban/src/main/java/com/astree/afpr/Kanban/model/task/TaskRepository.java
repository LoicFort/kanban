package com.astree.afpr.Kanban.model.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class TaskRepository {

  HashMap<Long, Task> taskMap = new HashMap<>();
  private static Long generatedId = 1L;

  public Task createTask(Task task) {
    task.setId(generatedId++);
    taskMap.put(task.getId(), task);
    return task;

  }

  public List<Task> findAll() {
    return new ArrayList<>(taskMap.values());
  }

  public Task findById(final Long id) {
    return taskMap.get(id);

  }

  public Task updateTask(Long id, Task task) {
    return taskMap.put(id, task);
  }

  public void deleteById(final Long id) {
    taskMap.remove(id);
  }


}
