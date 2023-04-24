package med.voll.api.medico;

public record DadosListagemMedico(long Id,String nome, String email, String crm, Especialidade especialidade) {
    public DadosListagemMedico(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(),medico.getEspecialidade());
    }
}