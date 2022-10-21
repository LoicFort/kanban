package com.astree.afpr.Kanban.model.priority;


import com.astree.afpr.Kanban.model.tasks.Task;
import java.util.ArrayList;
import java.util.List;

public class Priority {

  private Long id;
  private String label;

  private List<Task> task = new ArrayList<>();

  public List<Task> getTask() {
    return task;
  }

  public void setTask(List<Task> task) {
    this.task = task;
  }

  public Priority() {
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

