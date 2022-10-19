package com.astree.afpr.Kanban.controller;

import com.astree.afpr.Kanban.core.RestControllerImpl;
import com.astree.afpr.Kanban.core.RestServiceImpl;
import com.astree.afpr.Kanban.model.user.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController extends RestControllerImpl<User,Long>{

  public UserController(RestServiceImpl<User, Long> service) {
    super(service);
  }
}
