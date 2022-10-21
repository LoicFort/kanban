package com.astree.afpr.Kanban.model.priority;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class PriorityService {

  private PriorityRepository repository;
  private PriorityMapper mapper;

  public PriorityService(PriorityRepository repository, PriorityMapper mapper) {
    this.repository = repository;
    this.mapper = mapper;
  }

  public List<Priority> read() {
    return repository.findAll()
        .stream()
        .map(mapper::map)
        .collect(Collectors.toList());
  }

}
