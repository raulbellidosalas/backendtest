package com.acme.arquitech.platform.projects.infrastructure.persistence.jpa.repositories;

import com.acme.arquitech.platform.projects.domain.model.aggregates.Project;
import com.acme.arquitech.platform.users.domain.model.valueobjects.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    @Query("SELECT p FROM Project p WHERE p.user.id = :userId AND p.user.role = :role")
    List<Project> findByUserIdAndRole(@Param("userId") Long userId, @Param("role") Role role);
}