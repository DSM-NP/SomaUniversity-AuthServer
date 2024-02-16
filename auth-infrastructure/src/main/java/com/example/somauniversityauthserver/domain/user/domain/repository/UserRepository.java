package com.example.somauniversityauthserver.domain.user.domain.repository;

import com.example.somauniversityauthserver.domain.user.domain.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
