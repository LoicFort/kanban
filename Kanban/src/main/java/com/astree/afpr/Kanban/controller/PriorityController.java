package com.astree.afpr.Kanban.controller;

import com.astree.afpr.Kanban.model.priority.Priority;
import com.astree.afpr.Kanban.model.priority.PriorityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/priorities")
public class PriorityController {

  private PriorityService service;

  @Autowired
  public PriorityController(PriorityService service) {
    this.service = service;
  }

  @GetMapping
  public List<Priority> read() {
    return service.read();
  }
}
