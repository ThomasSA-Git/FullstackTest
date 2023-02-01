package dat3.day1_2.repositories;

import dat3.day1_2.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
  Player findPlayerByName(String name);

}
