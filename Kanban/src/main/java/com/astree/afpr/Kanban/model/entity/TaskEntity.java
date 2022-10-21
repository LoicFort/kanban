package com.astree.afpr.Kanban.model.entity;

import com.astree.afpr.Kanban.core.Identity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")
public class TaskEntity extends Identity<Long> {

  private Long id;
  private String title;
  private String description;


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  public Long getId() {
    return id;
  }

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
