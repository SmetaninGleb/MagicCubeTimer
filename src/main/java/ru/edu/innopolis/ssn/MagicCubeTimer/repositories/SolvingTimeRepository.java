package ru.edu.innopolis.ssn.MagicCubeTimer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.edu.innopolis.ssn.MagicCubeTimer.models.SolvingTime;
import ru.edu.innopolis.ssn.MagicCubeTimer.models.User;

import java.util.List;
import java.util.UUID;

@Repository
public interface SolvingTimeRepository extends JpaRepository<SolvingTime, UUID> {
    List<SolvingTime> findAllByUser(User user);
}
