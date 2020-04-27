package cl.escalab.springboot.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import cl.escalab.springboot.model.Producto;
import cl.escalab.springboot.repo.IProductoRepo;
import cl.escalab.springboot.service.IProductoService;

public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoRepo repo;
	
	@Override
	public Producto registrar(Producto pac) {
		return repo.save(pac);
	}
	
	@Override
	public Producto modificar(Producto pac) {
		return repo.save(pac);
	}
	
	@Override
	public List<Producto> listar() {
		return repo.findAll();
	}
	
	@Override
	public Producto leerPorId(Integer id) {
		Optional<Producto> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Producto();
	}
	
	@Override
	public boolean eliminar(Integer id) {
		 repo.deleteById(id);
		 return true;
	}
}
