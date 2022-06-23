package pe.edu.upeu.app;

import java.io.Console;

import pe.edu.upeu.modelo.UsuarioTO;
import pe.edu.upeu.util.LeerTeclado;

public class MenuOpciones {

    LeerTeclado leerT=new LeerTeclado();
    UsuarioTO user;


    public void login() {
        System.out.println("**********validar sus Credenciales**********");
        user=new UsuarioTO();
        user.setUsuario(leerT.leer("","ingrese su Usuario"))
        Console cons=System.console();
        System.out.println("Ingrese su clave");
        char[] clavex=cons.readPassword();
        user.setClave(String.valueOf(clavex));
        if (user.getUsuario().equals("davidmp")) && user.getClave().equals("123456") {
            menuPrincipal();
        }else{
            System.out.println("intente otra vez!");
            login();
            
        }
    }


    public void menuPrincipal() {
        System.out.println("*******Bienvenidos al Sistema de Ventas**********");
        String valorx="1=Registrar Producto\n"+"2=Registrar cliente\n"+"3=Registrar Venta\n",
        int opciones=0;
        
        
    }
}
