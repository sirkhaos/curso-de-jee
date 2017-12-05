/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.sga.cliente;

import java.util.List;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaServiceRemote;

/**
 *
 * @author Tata
 */
public class ClientePersonaServiceConIP {
    
    public static void main(String[] args){
        
        System.out.println("Iniciando llamada EJB al cliente/n");
        try{
            Properties props = new Properties();
            props.setProperty("java.naming.factory.initial", "com.sum.enterprise.naming.SerialInitContextFactory");
            props.setProperty("java.naming.factory.url.pkgs", "com.sum.enterprise.naming");
            props.setProperty("java.naming.state", "com.sum.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
            //opcional. localhost por defecto . Aqui se cambia la IP del servidor donde esta Glassfish
            props.setProperty("org.omg.CORBA.ORBInitialhost", "127.0.0.1");
            //opcional. puerto por defecto 3700. Solo se necesita cambiar si el puerto es distinto
            //props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
            Context jndi = new InitialContext(props);
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee/PersonaServiceImpl!mx.com.gm.sga.servicio.PersonaServiceRemote");
            
            List<Persona> personas = personaService.listarPersonas();
            
            for (Persona persona : personas){
                System.out.println(persona);
            }
        }catch(NamingException e){
            e.printStackTrace();
        }
    }
}
