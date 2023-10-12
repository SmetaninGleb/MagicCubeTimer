package ru.edu.innopolis.ssn.MagicCubeTimer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.edu.innopolis.ssn.MagicCubeTimer.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
