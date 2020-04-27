package cl.escalab.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.escalab.springboot.model.ModoPago;

public interface IModoPagoRepo extends JpaRepository<ModoPago,Integer> {

}
