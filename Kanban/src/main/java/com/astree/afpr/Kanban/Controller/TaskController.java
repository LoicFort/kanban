package com.astree.afpr.Kanban.Controller;

import com.astree.afpr.Kanban.model.task.Task;
import com.astree.afpr.Kanban.model.task.TaskService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

  @Autowired
  private TaskService taskService;

  @GetMapping("/tasks")
  public List<Task> getTasks() {
    return taskService.getTasks();
  }

  @GetMapping("/tasks/{id}")
  public Task getOneTask(@PathVariable("id") final Long id) {
    return taskService.getOneTask(id);
  }

  @DeleteMapping("/tasks/{id}")
  public void deleteTask(@PathVariable("id") final Long id) {
    taskService.deleteTask(id);
  }

  @PostMapping("/tasks")
  public Task createTask(@RequestBody Task task) {
      return taskService.createTask(task);
  }

  @PutMapping("/tasks/{id}")

   public Task updateTask(@PathVariable("id") final Long id, @RequestBody Task task) {
    return taskService.updateTask(id, task);


  }

}



