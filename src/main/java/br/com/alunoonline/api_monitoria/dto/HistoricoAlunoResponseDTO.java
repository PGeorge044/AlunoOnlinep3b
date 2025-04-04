package br.com.alunoonline.api_monitoria.dto;

import lombok.Data;

import java.util.List;

@Data
public class HistoricoAlunoResponseDTO {
    private String nomeAluno;
    private String emailAluno;
    private String cpfAluno;
    private List<DisciplinasAlunoResponseDTO> disciplinasAlunoResponsesDTO;
}
