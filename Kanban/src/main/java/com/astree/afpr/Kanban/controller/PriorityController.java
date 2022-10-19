package com.astree.afpr.Kanban.controller;

import com.astree.afpr.Kanban.core.RestControllerImpl;
import com.astree.afpr.Kanban.model.priority.Priority;
import com.astree.afpr.Kanban.model.priority.PriorityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/priorities")
public class PriorityController extends RestControllerImpl<Priority, Long> {

  public PriorityController(PriorityService service) {
    super(service);
  }
}
