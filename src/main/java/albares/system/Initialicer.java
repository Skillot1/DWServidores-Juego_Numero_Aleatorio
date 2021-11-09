
package albares.system;


// Clase para que al inicializar la app, haga métodos al despliegue de la misma, y al repliegue del servidor
import albares.basic.RandomNumber;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;



@WebListener
public class Initialicer implements ServletContextListener {
  
 // Método al despliegue   
 @Override
 public void contextInitialized(ServletContextEvent sce) {
     
   
     
 }
 
 // Método al repliegue
 @Override
 public void contextDestroyed(ServletContextEvent sce) {
     
 
 }
 }