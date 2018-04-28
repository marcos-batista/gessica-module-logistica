package com.agroall.gessica.logistica.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.agroall.gessica.controllers.GessicaDataObjectResourceController;
import com.agroall.gessica.logistica.dataobjects.EntregaVenda;
import com.agroall.gessica.logistica.services.EntregaVendaService;
import com.agroall.gessica.services.Service;

public class EntregaVendaResource extends GessicaDataObjectResourceController<EntregaVenda> {
	
	@Autowired private EntregaVendaService service;
	
	@Override
	protected Service<EntregaVenda> getService() {
		return this.service;
	}

}
