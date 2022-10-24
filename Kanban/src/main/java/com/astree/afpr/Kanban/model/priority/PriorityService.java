package com.astree.afpr.Kanban.model.priority;

import com.astree.afpr.Kanban.model.entity.PriorityEntity;
import com.astree.afpr.Kanban.model.entity.UserEntity;
import com.astree.afpr.Kanban.model.user.User;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriorityService {

  @Autowired
  private PriorityRepository repository;
  @Autowired
  private PriorityMapper mapper;

  @Autowired
  public PriorityService(PriorityRepository repository, PriorityMapper mapper) {
    this.repository = repository;
    this.mapper = mapper;
  }

  public Priority create(Priority priority) {
    PriorityEntity entity = mapper.update(new PriorityEntity(), priority);
    repository.save(entity);
    return mapper.map(entity);
  };

  public List<Priority> read() {
    return repository.findAll()
        .stream()
        .map(mapper::map)
        .collect(Collectors.toList());
  }

  public Priority read(Long id) {
    PriorityEntity user = repository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException());
    return mapper.map(user);
  }

  public Priority update(Long id, Priority priority){
    PriorityEntity toUpdate = mapper.update(new PriorityEntity(), priority);
    repository.save(toUpdate);
    return priority;

  }


  public void delete(Long id) {
    repository.deleteById(id);
  }


}
