package co.edu.uniquindio.redsocial.database;
import co.edu.uniquindio.redsocial.model.Usuario;

import java.util.HashMap;

public class Database {

    private HashMap<String,Usuario> baseDatos;

    private static Database instance;
    private Database(){this.baseDatos = new HashMap<>();}
    public static Database getInstance(){
        if(instance==null){
            instance = new Database();
        }
        return instance;
    }

    public void guardarBase(HashMap<String, Usuario> baseDatos){

        this.baseDatos = baseDatos;

    }

    public Usuario getVendedor(String key) {
        if(this.baseDatos.containsKey(key)){
            return this.baseDatos.get(key);
        }else{

            return null;
        }

    }

    public Usuario validarCredenciales(String usuario, String clave){

        for (HashMap.Entry<String, Usuario> entry : baseDatos.entrySet()) {

            if(entry.getValue().getUsuario().equalsIgnoreCase(usuario) && entry.getValue().getClave().equalsIgnoreCase(clave)){
                return entry.getValue();
            }
        }

        return null;

    }
}
