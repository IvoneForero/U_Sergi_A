package com.ieforero.inventarioAPP;

import com.ieforero.inventarioAPP.controlador.ControladorProducto;
import com.ieforero.inventarioAPP.modelo.RepositorioProducto;
import com.ieforero.inventarioAPP.vista.actualizar;
import com.ieforero.inventarioAPP.vista.inventario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventarioAppApplication {
    
    @Autowired
    RepositorioProducto repositorio;

	public static void main(String[] args) {
            new SpringApplicationBuilder(InventarioAppApplication.class).headless(false).run(args);
	}
        
    @Bean
    void applicationRunner(){
        ControladorProducto p = new ControladorProducto(repositorio, new inventario(), new actualizar());        
    }

}
