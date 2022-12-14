package com.astree.afpr.Kanban.model.tasks;

import com.astree.afpr.Kanban.core.Identity;
import com.astree.afpr.Kanban.model.entity.PriorityEntity;
import com.astree.afpr.Kanban.model.priority.Priority;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


public class Task extends Identity<Long> {

  private Long id;
  private String title;
  private String description;

  private Priority priority;

  public Priority getPriority() {
    return priority;
  }

  public void setPriority(Priority priority) {
    this.priority = priority;
  }



  @Override
  public Long getId() {
    return id;
  }

  @Override
  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
