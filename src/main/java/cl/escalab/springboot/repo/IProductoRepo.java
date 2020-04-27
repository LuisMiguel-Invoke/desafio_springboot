package cl.escalab.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.escalab.springboot.model.Producto;

public interface IProductoRepo extends JpaRepository<Producto,Integer> {

}
