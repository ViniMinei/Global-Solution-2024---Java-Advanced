package br.com.fiap.exemploMVC.SusEarth.controller;

import br.com.fiap.exemploMVC.SusEarth.domainmodel.Coleta;
import br.com.fiap.exemploMVC.SusEarth.service.ColetaServiceImpl;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/coleta")
public class ColetaController {

    @Autowired
    private @Setter ColetaServiceImpl service;

    @GetMapping("/addNew")
    public String addNewColeta( Model model ){
        Coleta coleta = new Coleta();
        model.addAttribute("coleta", coleta);
        return "newColeta";
    }

    @PostMapping("/save")
    public String save( @ModelAttribute("coleta") Coleta coleta) {
        this.service.save(coleta);
        return "redirect:/";
    }

    @GetMapping("/deleteColeta/{id}")
    public String deleteThroughId( @PathVariable("id") Long id){
        this.service.deleteById( id );
        return "redirect:/";
    }

    @GetMapping("/listAll")
    public String viewAsList(Model model){
        List<Coleta> coletaList = this.service.findAllColeta();
        model.addAttribute("allColetaList", coletaList);
        return "listColeta";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showUpdateForm(@PathVariable("id") Long id, Model model){
        Optional<Coleta> coleta  = this.service.findById(id);
        if(coleta.isPresent())
            model.addAttribute("coleta", coleta.get());
        else
            System.out.println("Dados insuficientes para coleta");
        return "updateColeta";
    }

    @PostMapping("/update")
    public String update( @ModelAttribute("coleta") Coleta coleta){
        this.service.save(coleta);
        return "redirect:/";
    }

    @GetMapping("/show/{id}")
    public String showColeta( @PathVariable("id") Long id, Model model){
        Optional<Coleta> coleta = this.service.findById(id);

        if( coleta.isPresent() )
            model.addAttribute("coleta", coleta.get());
        else
            System.out.println("Coleta inválida");
        return "showColeta";
    }


}
