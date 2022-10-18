package com.astree.afpr.Kanban.model.generics;


import java.util.List;


public interface IRepository<T> {

  T insert(T type);

  List<T> findAll();


  T find(final Long id);

  void delete(final Long id);

  T update(Long id, T type);


}
