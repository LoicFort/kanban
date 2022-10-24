package com.astree.afpr.Kanban.model.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity {

  private Long id;
  private String name;

  private List<TaskEntity> task = new ArrayList<>();

  public UserEntity() {
  }
  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "user_id")
  public List<TaskEntity> getTask() {
    return task;
  }

  public void setTask(List<TaskEntity> task) {
    this.task = task;
  }



  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long getId() { return id; }

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
