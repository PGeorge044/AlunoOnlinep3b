package br.com.alunoonline.api_monitoria.service;

import br.com.alunoonline.api_monitoria.model.Disciplina;
import br.com.alunoonline.api_monitoria.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {

    @Autowired
    DisciplinaRepository disciplinaRepository;

    public void criarDisciplina(Disciplina disciplina){
        disciplinaRepository.save(disciplina);
    }

    public List<Disciplina> listarDisciplinaPorIdProfessor(Long idProfessor){
        return disciplinaRepository.findByIdProfessor(idProfessor);
    }
}
