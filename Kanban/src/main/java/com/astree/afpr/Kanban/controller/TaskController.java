package com.astree.afpr.Kanban.controller;


import com.astree.afpr.Kanban.core.RestControllerImpl;
import com.astree.afpr.Kanban.model.tasks.Task;
import com.astree.afpr.Kanban.model.tasks.TaskService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
public class TaskController extends RestControllerImpl<Task, Long> {

  public TaskController(TaskService service) {
    super(service);
  }

}
