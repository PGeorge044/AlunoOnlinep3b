package br.com.alunoonline.api_monitoria.controller;

import br.com.alunoonline.api_monitoria.model.Professor;
import br.com.alunoonline.api_monitoria.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    @Autowired
    ProfessorService professorService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarProfessor(@RequestBody Professor professor){
        professorService.criarProfessor(professor);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Professor> listarTodosProfessores(){
        return professorService.listarTodosProfessores();
    }

    @GetMapping("/{idProfessor}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Professor> listarProfessoresPorId(@PathVariable Long idProfessor){
        return professorService.listarProfessorPorId(idProfessor);
    }

    @DeleteMapping("/{idProfessor}")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void deletarProfessor(@PathVariable Long idProfessor){
        professorService.deletarProfessor(idProfessor);
    }

    @PutMapping("/{idProfessor}")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void atualizarProfessor(@PathVariable Long idProfessor, @RequestBody Professor professor){
        professorService.atualizarProfessor(idProfessor, professor);
    }
}
