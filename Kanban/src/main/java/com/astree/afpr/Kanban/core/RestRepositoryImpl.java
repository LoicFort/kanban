package com.astree.afpr.Kanban.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RestRepositoryImpl<D extends Identity<I>, I> implements IRespository<D, I> {

  HashMap<I, D> database = new HashMap<>();

  @Override
  public List<D> findAll() {
    return new ArrayList<>(database.values());
  }

  @Override
  public D findById(I id) {
    D test = database.get(id);
    System.out.println(test);
    return database.get(id);
  }

  @Override
  public void deleteById(I id) {
    database.remove(id);
  }

  @Override
  public D save(D object) {
    database.put(object.getId(), object);
    return object;
  }

}
