package com.astree.afpr.Kanban.model.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")
public class TaskEntity {

  private Long id;
  private String title;
  private String description;

  private PriorityEntity priority;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "priority_id", referencedColumnName = "id")
  public PriorityEntity getPriority() {
    return priority;
  }

  public void setPriority(PriorityEntity priority) {
    this.priority = priority;
  }

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
