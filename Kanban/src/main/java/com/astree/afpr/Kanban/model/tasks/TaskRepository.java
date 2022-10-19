package com.astree.afpr.Kanban.model.tasks;

import com.astree.afpr.Kanban.core.RestRepositoryImpl;
import org.springframework.stereotype.Repository;

@Repository
public class TaskRepository extends RestRepositoryImpl<Task, Long> {

}
