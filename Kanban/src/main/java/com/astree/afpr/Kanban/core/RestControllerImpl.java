package com.astree.afpr.Kanban.core;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class RestControllerImpl<D extends Identity<I>, I> implements IController<D, I> {

  private final RestServiceImpl<D, I> service;

  public RestControllerImpl(RestServiceImpl<D, I> service) {
    this.service = service;
  }


  @Override
  @PostMapping
  public D create(@RequestBody D object) {
    return service.create(object);
  }

  @Override
  @GetMapping
  public List<D> read() {
    return service.read();
  }

  @Override
  @GetMapping("{id}")
  public D read(@PathVariable I id) {
    return service.read(id);
  }

  @Override
  @PutMapping("{id}")
  public D update(@PathVariable I id, @RequestBody D object) {
    return service.update(id, object);
  }

  @Override
  @DeleteMapping("{id}")
  public void delete(@PathVariable I id) {
    service.delete(id);

  }
}


