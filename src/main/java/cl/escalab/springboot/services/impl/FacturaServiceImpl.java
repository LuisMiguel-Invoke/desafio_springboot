package cl.escalab.springboot.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import cl.escalab.springboot.model.Factura;
import cl.escalab.springboot.repo.IFacturaRepo;
import cl.escalab.springboot.service.IFacturaService;

public class FacturaServiceImpl implements IFacturaService {

	
	@Autowired
	private IFacturaRepo repo;
	
	@Override
	public Factura registrar(Factura pac) {
		return repo.save(pac);
	}
	
	@Override
	public Factura modificar(Factura pac) {
		return repo.save(pac);
	}
	
	@Override
	public List<Factura> listar() {
		return repo.findAll();
	}
	
	@Override
	public Factura leerPorId(Integer id) {
		Optional<Factura> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Factura();
	}
	
	@Override
	public boolean eliminar(Integer id) {
		 repo.deleteById(id);
		 return true;
	}
}
