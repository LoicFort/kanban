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
  public Task Insert(@PathVariable("id") final Long id) {
    return taskService.Find(id);
  }

  @DeleteMapping("/tasks/{id}")
  public void Delete(@PathVariable("id") final Long id) {
    taskService.Delete(id);
  }

  @PostMapping("/tasks")
  public Task Insert(@RequestBody Task task) {
      return taskService.Insert(task);
  }

  @PutMapping("/tasks/{id}")

   public Task updateTask(@PathVariable("id") final Long id, @RequestBody Task task) {
    return taskService.Update(id, task);


  }

}



