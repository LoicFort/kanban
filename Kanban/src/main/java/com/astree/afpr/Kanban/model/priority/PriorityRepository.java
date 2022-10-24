package com.astree.afpr.Kanban.model.priority;

import com.astree.afpr.Kanban.model.entity.PriorityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriorityRepository extends JpaRepository<PriorityEntity, Long> {

}
