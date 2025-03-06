package br.senai.sp.escolamvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/responsavel")
public class ResponsavelController {

    //@Autowired
    //private ResponsavelRepository responsavelRepository;

    @GetMapping
    public String listagem(Model model){

        //List<Responsavel> listaDeResponsaveis = responsavelRepository.findAll();

        //model.addAttribute("responsaveis", listaDeResponsaveis);

        return "/responsavel/listagem";
    }
}
