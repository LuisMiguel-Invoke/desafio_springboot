package cl.escalab.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.escalab.springboot.model.Detalle;

public interface IDetalleRepo extends JpaRepository<Detalle,Integer> {

}
