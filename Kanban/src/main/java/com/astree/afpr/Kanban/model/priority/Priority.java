package com.astree.afpr.Kanban.model.priority;

public class Priority {

  private Long id;
  private String label;

  public Priority() {
  }

  public Priority(String label) {
    this.label = label;
  }

  public Long getId() {
    return id;
  }

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
