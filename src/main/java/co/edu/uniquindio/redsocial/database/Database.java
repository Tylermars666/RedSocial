package co.edu.uniquindio.redsocial.database;
import co.edu.uniquindio.redsocial.model.Usuario;
import co.edu.uniquindio.redsocial.model.Vendedor;

import java.util.HashMap;

public class Database {

    private HashMap<String, ? extends Usuario> baseDatos;

    private static Database instance;
    private Database(){this.baseDatos = new HashMap<>();}
    public static Database getInstance(){
        if(instance==null){
            instance = new Database();
        }
        return instance;
    }

    public void guardarBase(HashMap<String, ? extends Usuario> baseDatos){

        this.baseDatos = baseDatos;

    }

    public Usuario getVendedor(String key) {
        if(this.baseDatos.containsKey(key)){
            return this.baseDatos.get(key);
        }else{

            return null;
        }

    }
}
