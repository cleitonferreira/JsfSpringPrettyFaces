package br.com.nuvemapp.jsfspring;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Junior
 */
@Component // substitui @ManagedBean
//@Scope("request") // substitui @RequestScope
@Scope("view") // substitui @ViewScoped
public class Main {
    
//    INSECAO DE DEPENDENCIA
    @Autowired
    DataHora dataHora;
    
    private String mensagem;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    @PostConstruct
    private void contrucao(){
        System.out.println("Contruindo Classe main");
    }
    
    public void executar(){
        mensagem = "Olá, são " + dataHora.HoraAtual() + " do dia " + dataHora.DataAtual() + ".";
    }
    
}
