package epicode.u5d4.DAO;

import epicode.u5d4.superclass.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ItemDAO extends JpaRepository<Item, Integer> {


}
