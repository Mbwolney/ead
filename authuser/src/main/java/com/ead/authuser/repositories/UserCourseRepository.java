package com.ead.authuser.repositories;

import com.ead.authuser.models.UserCourseModel;
import com.ead.authuser.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface UserCourseRepository extends JpaRepository<UserCourseModel, UUID>, JpaSpecificationExecutor<UserCourseModel> {

    boolean existsByUserAndCourseId(UserModel userModel, UUID courseId);

    @Query(value = "SELECT * FROM tb_users_courses WHERE user_user_id", nativeQuery = true)
    List<UserCourseModel> findAllUserCourseIntoUser(UUID userId);
}
