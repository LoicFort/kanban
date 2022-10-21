package com.astree.afpr.Kanban.model.user;

import com.astree.afpr.Kanban.core.Identity;
import com.astree.afpr.Kanban.model.tasks.Task;
import java.util.ArrayList;
import java.util.List;

public class User extends Identity<Long> {
  private Long id;
  private String name;

  private List<Task> task = new ArrayList<>();

  public List<Task> getTask() {
    return task;
  }

  public void setTask(List<Task> task) {
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
