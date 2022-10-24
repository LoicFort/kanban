package com.astree.afpr.Kanban.controller;

import com.astree.afpr.Kanban.core.IController;
import com.astree.afpr.Kanban.model.user.User;
import com.astree.afpr.Kanban.model.user.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController implements IController<User, Long> {

  private UserService service;

  @Autowired
  public UserController(UserService service) {
    this.service = service;
  }

  @PostMapping
  public User create(@RequestBody User object) {
    return service.create(object);
  }

  @GetMapping
  public List<User> read() {
    return service.read();
  }

  @GetMapping("{id}")
  public User read(@PathVariable Long id) {
    return service.read(id);
  }

  @PutMapping("{id}")
  public User update(@PathVariable Long id,@RequestBody User object) {
    return service.update(id, object);
  }

  @DeleteMapping("{id}")
  public void delete(@PathVariable Long id) {
    service.delete(id);

  }
}
