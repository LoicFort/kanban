package com.astree.afpr.Kanban.core;

import java.util.List;

public interface IRespository<D extends Identity<I>, I > {
  List<D> findAll();

  D findById(I id);

  void deleteById(I id);

  D save(D object);

}
