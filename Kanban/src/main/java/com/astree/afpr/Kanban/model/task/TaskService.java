package com.astree.afpr.Kanban.model.task;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

  @Autowired
  private TaskRepository taskRepository;

  public Task createTask(Task task) {
    Task newTask = new Task(task.getTitle(), task.getDescription());
    return taskRepository.createTask(newTask);
  }

  public List<Task> getTasks() {
    return taskRepository.findAll();
  }

  public Task getOneTask(final Long id) {
    return taskRepository.findById(id);
  }

  public void deleteTask(final Long id) {
    taskRepository.deleteById(id);
  }

  public Task updateTask(Long id, Task task) {
    Task taskToUpdate = taskRepository.findById(id);
    System.out.println(taskToUpdate);
    taskToUpdate.setDescription(task.getDescription());
    taskToUpdate.setTitle(task.getTitle());
    return taskRepository.updateTask(id, taskToUpdate);
  }

}



