package com.astree.afpr.Kanban.model.tasks;
import com.astree.afpr.Kanban.core.IService;
import com.astree.afpr.Kanban.model.entity.TaskEntity;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class TaskService implements IService<Task, Long> {

  private TaskRepository repository;
  private TaskMapper mapper;

  public TaskService(TaskRepository taskrepository, TaskMapper mapper) {
    this.repository = taskrepository;
    this.mapper = mapper;
  }


  public Task update(Long id, Task object) {
    TaskEntity tasktoUpdate = repository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException());
    tasktoUpdate = mapper.update(tasktoUpdate, object);
    repository.save(tasktoUpdate);
    return mapper.map(tasktoUpdate);

  }


  public Task create(Task object) {
    TaskEntity entity = mapper.update(new TaskEntity(), object);
    repository.save(entity);
    return mapper.map(entity);
  }


  public List<Task> read() {
    return repository.findAll()
        .stream()
        .map(mapper::map)
        .collect(Collectors.toList());
  }

  public Task read(Long id) {
    TaskEntity entity = repository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException());
    return mapper.map(entity);
  }


  public void delete(Long id) {
    repository.deleteById(id);
  }
}
