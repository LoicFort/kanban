package com.astree.afpr.Kanban.model.user;

import com.astree.afpr.Kanban.core.Identity;

public class User extends Identity<Long> {
  private Long id;
  private String name;

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
