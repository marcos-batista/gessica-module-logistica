package com.agroall.gessica.logistica.services;

import com.agroall.gessica.logistica.dataobjects.EntregaVenda;

public class EntregaVendaService extends LogisticaService<EntregaVenda> {

	@Override
	public EntregaVenda factoryNewDataObject() {
		return new EntregaVenda();
	}

}
