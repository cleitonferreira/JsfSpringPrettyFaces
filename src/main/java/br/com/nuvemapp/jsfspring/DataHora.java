package br.com.nuvemapp.jsfspring;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Service;

/**
 *
 * @author Junior
 */
//CLASSE PARA TESTAR A INJEÇAO DE DEPENDECIA
@Service
public class DataHora {
    
    SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat hora = new SimpleDateFormat("HH:mm:ss");
    
    public String DataAtual(){
        return data.format(new Date());
    }
    
    public String HoraAtual(){
        return hora.format(new Date());
    }
    
}
