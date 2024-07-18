package stock.product.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stock.product.service.models.entity.Producer;

import java.util.Optional;

@Repository
public interface ProducerRepository  extends JpaRepository<Producer,Long> {

    Optional<Producer> findByCnpj(String cnpj);

}
