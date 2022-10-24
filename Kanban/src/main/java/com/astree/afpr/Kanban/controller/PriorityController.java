package com.astree.afpr.Kanban.controller;

import com.astree.afpr.Kanban.model.priority.Priority;
import com.astree.afpr.Kanban.model.priority.PriorityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

  @PostMapping
  public Priority create(@RequestBody Priority priority) {
    return service.create(priority);
  }

  @GetMapping
  public List<Priority> read() {
    return service.read();
  }

  @GetMapping("{id}")
  public Priority read(@PathVariable Long id) {
    return service.read(id);
  }

  @PostMapping("{id}")
  public Priority update(@PathVariable Long id, @RequestBody Priority priority){
    return service.update(id, priority);
  }

  @DeleteMapping("{id}")
  public void delete(@PathVariable Long id) {
    service.delete(id);
  }
}
