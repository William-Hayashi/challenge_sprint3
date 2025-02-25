package com.springSprint.spring_mvc_application_sprint.Controllers;

import com.springSprint.spring_mvc_application_sprint.Model.Cadastro;
import com.springSprint.spring_mvc_application_sprint.Service.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CadastroProfissionalController {

    @Autowired
    private CadastroService cadastroService;


    @GetMapping("/IndexEnergia") // Rota inicial do Profissional
    public String indexEnergia(Model model) {
        model.addAttribute("listProfissional", cadastroService.getallCadastro());
        return "cadastrarProfissional";
    }

    @GetMapping("/showProfissionalForm")
    public String showProfissionalForm(Model model) {
        Cadastro cadastro = new Cadastro();
        model.addAttribute("cadastro", cadastro);
        return "novo_profissional";
    }

    /*@PostMapping("/saveCadastro")
    public String saveCadastro(@ModelAttribute("cadastro") Cadastro cadastro) {
        cadastroService.saveCadastro(cadastro);
        return "redirect:/IndexCadastro";
    }

    @GetMapping("/MostrarFormUpdate/{id}")
    public String MostrarFormUpdate(@PathVariable(value = "id") Long id,Model model){
        Cadastro cadastro = cadastroService.getCadastroById(id);
        model.addAttribute("cadastro", cadastro);
        return "update_cadastro";
    }

    @GetMapping("/DeletarCadastro/{id}")
    public String DeletarCadastro(@PathVariable(value = "id") Long id){
        this.cadastroService.DeletarCadastroporId(id);
        return "redirect:/IndexCadastro";
    }*/
}