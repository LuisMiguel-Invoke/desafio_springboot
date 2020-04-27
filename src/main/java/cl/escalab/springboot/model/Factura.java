package cl.escalab.springboot.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FACTURA")
public class Factura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idFactura;

	@ManyToOne
	@JoinColumn(name = "id_cliente", nullable = false, foreignKey = @ForeignKey(name = "FK_factura_cliente"))
	private Cliente cliente;

	private LocalDateTime fecha;

	@ManyToOne
	@JoinColumn(name = "num_pago", nullable = false, foreignKey = @ForeignKey(name = "FK_factura_modo_pago"))
	private ModoPago modoPago;

	public Integer getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Integer idFactura) {
		this.idFactura = idFactura;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public ModoPago getModoPago() {
		return modoPago;
	}

	public void setModoPago(ModoPago modoPago) {
		this.modoPago = modoPago;
	}

}
