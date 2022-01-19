package com.pfe.madrasati.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.pfe.madrasati.model.Activite;
import com.pfe.madrasati.service.ActiviteService;

@RestController
public class ActiviteController {
	@Autowired
	private ActiviteService activiteService;
	
	@RequestMapping (value = "/activiteEnseignant", method = RequestMethod.GET)
	@ResponseBody
     public List<Activite> getActivites(@RequestParam("idEnseignant") Integer idEnseignant) {
		return (List<Activite>) activiteService.getActivites(idEnseignant);
	} 

   
}