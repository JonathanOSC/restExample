package REST.restExample.repository;


import REST.restExample.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Hereda automáticamente el método findAll()
}