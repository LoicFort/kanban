package com.astree.afpr.Kanban.model.generics;

import java.util.List;


public interface HanbanInterface<C> {


   C createOne(C type);

   List<C> getPriority();

   C getOne(final Long id);

   void deletePriority(final Long id);

   C update(Long id, C type);



}
