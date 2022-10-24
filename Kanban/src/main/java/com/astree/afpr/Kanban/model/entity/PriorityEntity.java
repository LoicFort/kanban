package com.astree.afpr.Kanban.model.entity;

import com.astree.afpr.Kanban.model.tasks.Task;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "priorities")
public class PriorityEntity {

  private Long id;
  private String label;

//  private List<TaskEntity> task = new ArrayList<>();
//
//  @OneToMany
//  @JoinColumn(name = "priority_id")
//  public List<TaskEntity> getTask() {
//    return task;
//  }

//  public void setTask(List<TaskEntity> task) {
//    this.task = task;
//  }
//


  public PriorityEntity() {
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
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
