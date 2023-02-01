package dat3.day1_2.repositories;

import dat3.day1_2.entity.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Integer> {

}
