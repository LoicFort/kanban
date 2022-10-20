package com.astree.afpr.Kanban.model.user;

import com.astree.afpr.Kanban.core.IService;
import com.astree.afpr.Kanban.model.entity.UserEntity;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IService<User, Long> {

  private UserRepository repository;
  private UserMapper mapper;


  public UserService(UserRepository repository, UserMapper mapper) {
    this.repository = repository;
    this.mapper = mapper;
  }


  public User create(User object) {
    UserEntity entity = mapper.update(new UserEntity(), object);
    repository.save(entity);
    return mapper.map(entity);
  }

  public List<User> read() {
    return repository.findAll()
        .stream()
        .map(mapper::map)
        .collect(Collectors.toList());
  }

  public User read(Long id) {
    UserEntity user = repository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException());
    return mapper.map(user);
  }

  public User update(Long id, User object) {
    UserEntity userToUpdate = repository.findById(id).
        orElseThrow(() -> new EntityNotFoundException());
    UserEntity toUpdate = mapper.update(userToUpdate, object);
    repository.save(toUpdate);
    return mapper.map(toUpdate);

  }

  public void delete(Long id) {
    repository.deleteById(id);

  }
}
