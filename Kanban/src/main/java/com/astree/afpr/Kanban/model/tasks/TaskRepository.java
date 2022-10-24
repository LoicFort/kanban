package com.astree.afpr.Kanban.model.tasks;

import com.astree.afpr.Kanban.model.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface TaskRepository extends JpaRepository<TaskEntity, Long> {

}
