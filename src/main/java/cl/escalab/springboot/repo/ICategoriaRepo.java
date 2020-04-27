package cl.escalab.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.escalab.springboot.model.Categoria;

public interface ICategoriaRepo extends JpaRepository<Categoria,Integer> {

}
