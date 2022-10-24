package com.astree.afpr.Kanban.core;

import java.util.List;

public interface IController<D extends Identity<I>, I> {

  D create(D object);

  List<D> read();

  D read(I id);

  D update(I id, D object);

  void delete(I id);

}
