package com.astree.afpr.Kanban.model.entity;

import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity {

  private Long id;
  private String name;
  private TaskEntity task;

  public UserEntity() {
  }


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long getId() {

    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "task_id")
  public TaskEntity getTask() {
    return task;
  }

  public void setTask(TaskEntity task) {
    this.task = task;
  }
}
