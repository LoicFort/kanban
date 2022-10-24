package com.astree.afpr.Kanban.core;

import java.util.List;

public abstract class RestServiceImpl<D extends Identity<I>, I> implements IService<D,I>{

  private final RestRepositoryImpl<D,I> repository;

  public RestServiceImpl(RestRepositoryImpl<D,I> repository) {
    this.repository = repository;
  }

  @Override
  public D create(D object) {
    return repository.save(object);
  }

  @Override
  public List<D> read() {
    return repository.findAll();
  }

  @Override
  public D read(I id) {
    return repository.findById(id);
  }

  @Override
  public D update(I id, D object) {
    D toUpdate = repository.findById(id);
    update(toUpdate, object);
    return repository.save(object);
  }

  public abstract D update(D toUpdate, D newObject);

  @Override
  public void delete(I id) {
    repository.deleteById(id);

  }
}
