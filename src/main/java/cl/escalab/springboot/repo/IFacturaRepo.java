package cl.escalab.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.escalab.springboot.model.Factura;

public interface IFacturaRepo extends JpaRepository<Factura,Integer>{

}
