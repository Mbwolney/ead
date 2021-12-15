package com.ead.course.repositories;

import com.ead.course.models.ModuleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ModuleRepository  extends JpaRepository<ModuleModel, UUID> {

//    @Modifying // Com essa anotação vou poder atualizar e deletar
    @Query(value = "SELECT * FROM tb_modules WHERE course_course_id = :courseId", nativeQuery = true)
    List<ModuleModel> findAllLModulesInToCourse(@Param("courseId") UUID courseId);

    @Query(value = "SELECT * FROM tb_modules WHERE course_course_id = :courseId AND module_id = :moduleId", nativeQuery = true)
    Optional<ModuleModel> findModuleIntoCourse(@Param("courseId") UUID courseId, @Param("moduleId") UUID moduleId);

//    @EntityGraph(attributePaths = {"course"}) // Essa anotação traz de forma Eagy, mas rápido
//    ModuleModel findByTitle(String title);
}
