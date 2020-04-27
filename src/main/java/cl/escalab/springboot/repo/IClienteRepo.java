package cl.escalab.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.escalab.springboot.model.Cliente;

public interface IClienteRepo extends JpaRepository<Cliente,Integer> {

}
