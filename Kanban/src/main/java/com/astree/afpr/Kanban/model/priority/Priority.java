package com.astree.afpr.Kanban.model.priority;

import com.astree.afpr.Kanban.core.Identity;

public class Priority extends Identity<Long> {
  private Long id;
  private String label;

  @Override
  public Long getId() {
    return id;
  }

  @Override
  public void setId(Long id) {
    this.id = id;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }
}
