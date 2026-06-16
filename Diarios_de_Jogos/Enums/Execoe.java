package Diarios_de_Jogos.Enums;

public enum Execoe {
    CONFIRMADO ("Escrita com sucesso"),
    ERRO ("erro tente novamente");

    private final String mensagemUsuario;

    Execoe(String mensagemUsuario){
        this.mensagemUsuario = mensagemUsuario;
    }

    public String getMensagemUsuario() {
        return mensagemUsuario;
    }
}
