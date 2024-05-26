package co.edu.uniquindio.redsocial.factory;

import co.edu.uniquindio.redsocial.model.Usuario;

public class Login {

    Usuario usuarioLogeado;


    private static Login instance;
    private Login(){}
    public static Login getInstance(){
        if(instance==null){
            instance = new Login();
        }
        return instance;
    }


    public Usuario getUsuarioLogeado() {
        return usuarioLogeado;
    }

    public void setUsuarioLogeado(Usuario usuarioLogeado) {
        this.usuarioLogeado = usuarioLogeado;
    }
}
