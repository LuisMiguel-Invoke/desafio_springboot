package cl.escalab.springboot.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.escalab.springboot.model.Categoria;
import cl.escalab.springboot.repo.ICategoriaRepo;
import cl.escalab.springboot.service.ICategoriaService;


@Service
public class CategoriaServiceImpl implements ICategoriaService{

	@Autowired
	private ICategoriaRepo repo;
	
	@Override
	public Categoria registrar(Categoria pac) {
		return repo.save(pac);
	}
	
	@Override
	public Categoria modificar(Categoria pac) {
		return repo.save(pac);
	}
	
	@Override
	public List<Categoria> listar() {
		return repo.findAll();
	}
	
	@Override
	public Categoria leerPorId(Integer id) {
		Optional<Categoria> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Categoria();
	}
	
	@Override
	public boolean eliminar(Integer id) {
		 repo.deleteById(id);
		 return true;
	}
}
