package br.com.nuvemapp.jsfspring;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

// ESTA CLASSE INICIALIZA O SPRING VIA ANOTAÇÃO, PODE TER QUALQUER NOME.
public class SpringWebApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();

        applicationContext.scan(SpringWebApplicationInitializer.class.getPackage().getName()); //pacote raiz no qual o Spring irá procurar por suas classes. Como temos somente um pacote, então já foi colocado diretamente o pacote em que está classe aqui está inserida.

        servletContext.addListener(new ContextLoaderListener(applicationContext));
        servletContext.addListener(new RequestContextListener());
    }
}
