package com.astree.afpr.Kanban.model.task;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

  @Autowired
  private TaskRepository taskRepository;

  public Task Insert(Task task) {
    Task newTask = new Task(task.getTitle(), task.getDescription());
    return (Task) taskRepository.insert(newTask);
  }

  public List<Task> getTasks() {
    return taskRepository.findAll();
  }

  public Task Find(final Long id) {
    return (Task) taskRepository.find(id);
  }

  public void Delete(final Long id) {
    taskRepository.delete(id);
  }

  public Task Update(Long id, Task task) {
    Task taskToUpdate = (Task) taskRepository.find(id);
    taskToUpdate.setDescription(task.getDescription());
    taskToUpdate.setTitle(task.getTitle());
    return taskRepository.update(id, taskToUpdate);
  }

}



