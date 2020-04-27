package cl.escalab.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MODO_PAGO")
public class ModoPago {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPago;
	
	@Column(name = "nombre", nullable=false, length= 70)
	private String nombre;
	
	@Column(name = "otros_detalles", nullable=true, length= 150)
	private String otrosDetalles;

	public Integer getIdPago() {
		return idPago;
	}

	public void setIdPago(Integer idPago) {
		this.idPago = idPago;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOtrosDetalles() {
		return otrosDetalles;
	}

	public void setOtrosDetalles(String otrosDetalles) {
		this.otrosDetalles = otrosDetalles;
	}

}
