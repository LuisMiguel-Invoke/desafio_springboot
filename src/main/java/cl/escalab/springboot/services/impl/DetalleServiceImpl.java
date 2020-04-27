package cl.escalab.springboot.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import cl.escalab.springboot.model.Detalle;
import cl.escalab.springboot.repo.IDetalleRepo;
import cl.escalab.springboot.service.IDetalleService;

public class DetalleServiceImpl implements IDetalleService {
	
	@Autowired
	private IDetalleRepo repo;
	
	@Override
	public Detalle registrar(Detalle pac) {
		return repo.save(pac);
	}
	
	@Override
	public Detalle modificar(Detalle pac) {
		return repo.save(pac);
	}
	
	@Override
	public List<Detalle> listar() {
		return repo.findAll();
	}
	
	@Override
	public Detalle leerPorId(Integer id) {
		Optional<Detalle> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Detalle();
	}
	
	@Override
	public boolean eliminar(Integer id) {
		 repo.deleteById(id);
		 return true;
	}
}
