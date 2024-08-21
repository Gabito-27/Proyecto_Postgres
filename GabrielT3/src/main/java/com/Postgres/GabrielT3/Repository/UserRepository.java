package com.Postgres.GabrielT3.Repository;

import com.Postgres.GabrielT3.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
