package com.gestaoSala.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gestaoSala.model.Convidado;
import com.gestaoSala.repository.Convidados;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {
	
	@Autowired
	private Convidados convidados;
	
	@GetMapping
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("listaConvidados");
		mv.addObject("convidados", convidados.findAll());
		mv.addObject(new Convidado());
		return mv;
		}

	@PostMapping
	public String salvar(Convidado convidado) {
		this.convidados.save(convidado);
		return "redirect:/convidados";
	}
	

	
}
