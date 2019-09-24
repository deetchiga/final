package Example.Repository;
import Example.Model.mammoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface mammoRepository extends JpaRepository<mammoModel, Long> {



}
