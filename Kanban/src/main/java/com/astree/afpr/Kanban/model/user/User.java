package com.astree.afpr.Kanban.model.user;

import com.astree.afpr.Kanban.core.Identity;
import com.astree.afpr.Kanban.model.tasks.Task;

public class User extends Identity<Long> {
  private Long id;
  private String name;

  private Task task;

  public Task getTask() {
    return task;
  }

  public void setTask(Task task) {
    this.task = task;
  }

  @Override
  public Long getId() {
    return id;
  }

  @Override
  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
