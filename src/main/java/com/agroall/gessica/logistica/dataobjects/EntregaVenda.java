package com.agroall.gessica.logistica.dataobjects;

import java.util.Collection;

import com.agroall.gessica.dataobjects.aspects.Persistent;

public class EntregaVenda implements Persistent {
	
	private Integer id;
	private Collection<String> controleLogistico;
	
	@Override
	public Integer getId() {
		return id;
	}
	
	@Override
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Collection<String> getControleLogistico() {
		return controleLogistico;
	}
	
	public void setControleLogistico(Collection<String> controleLogistico) {
		this.controleLogistico = controleLogistico;
	}
	
}
