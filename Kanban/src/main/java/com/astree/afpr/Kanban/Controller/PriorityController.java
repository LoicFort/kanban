package com.astree.afpr.Kanban.Controller;

import com.astree.afpr.Kanban.model.priority.Priority;
import com.astree.afpr.Kanban.model.priority.PriorityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriorityController {

  @Autowired
  private PriorityService priorityService;

  @GetMapping("/priority")
  public List<Priority> find() {
    return priorityService.find();
  }

  @GetMapping("/priority/{id}")
  public Priority find(@PathVariable("id") final Long id) {
    return priorityService.find(id);
  }

  @DeleteMapping("/priority/{id}")
  public void delete(@PathVariable("id") final Long id) {
    priorityService.delete(id);
  }

  @PostMapping("/priority")
  public Priority insert(@RequestBody Priority priority) {
    System.out.println(priority);
    return priorityService.Insert(priority);
  }

  @PutMapping("/priority/{id}")
  public Priority update(@PathVariable("id") final Long id,
      @RequestBody Priority priority) {
    return priorityService.update(id, priority);

  }



}



