package com.astree.afpr.Kanban.controller;


import com.astree.afpr.Kanban.core.IController;
import com.astree.afpr.Kanban.model.tasks.Task;
import com.astree.afpr.Kanban.model.tasks.TaskService;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
public class TaskController implements IController<Task, Long> {

  private TaskService service;

  public TaskController(TaskService service) {
    this.service = service;
  }

  @PostMapping
  public Task create(@RequestBody Task object) {
    System.out.println(object.getTitle() + " " + object.getDescription());
    return service.create(object);
  }

  @GetMapping
  public List<Task> read() {
    return service.read();
  }

  @GetMapping("{id}")
  public Task read(@PathVariable Long id) {
    return service.read(id);
  }

  @PostMapping("{id}")
  public Task update(@PathVariable Long id, @RequestBody Task object) {
    return service.update(id, object);
  }

  @DeleteMapping("{id}")
  public void delete(@PathVariable Long id) {
    service.delete(id);
  }
}



