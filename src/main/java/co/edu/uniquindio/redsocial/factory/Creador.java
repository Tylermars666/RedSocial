package co.edu.uniquindio.redsocial.factory;

import co.edu.uniquindio.redsocial.model.*;
import javafx.scene.image.Image;

public class Creador {

    public static void main(String[] args) {

        Admin admin = new Admin("admin","0000",new Muro(),"admin","root","main");
        Vendedor v1 = new Vendedor("Omar", "0000",new Muro(),"omar","0000","Santander","Piedrahita");
        Vendedor v2 = new Vendedor("Carlos", "1111",new Muro(),"carlos","1111","Fachada","Mancera");
        Vendedor v3 = new Vendedor("Eliana", "2222",new Muro(),"eliana","2222","Adiela","Ortiz");
        Vendedor v4 = new Vendedor("Robinson", "3333",new Muro(),"robin","3333","Mercedes Norte","Arias");
        Vendedor v5 = new Vendedor("Daniela", "4444",new Muro(),"dani","4444","Arcoiris","Lopez");
        Vendedor v6 = new Vendedor("Yerson", "5555",new Muro(),"yerson","5555","Rojas Pinilla","Muñoz");
        Vendedor v7 = new Vendedor("Camila", "6666",new Muro(),"camila","6666","Oro Negro","Henao");
        Vendedor v8 = new Vendedor("Monica", "7777",new Muro(),"monica","7777","Brasilia","Trujillo");
        Vendedor v9 = new Vendedor("Cristian", "8888",new Muro(),"cristian","8888","Villa Carolina","Cortes");
        Vendedor v10 = new Vendedor("Jenny", "9999",new Muro(),"jenny","9999","Clarita","Gomez");

        //V1
        Image img1 = new Image();  //TODO
        Image img2 = new Image();  //Usar el código de prueba imagenes para setearlas desde el explorador de archivos
        Producto p1 = new Producto();
        Producto p2 = new Producto();
        Post pt1 = new Post();
        Post pt2 = new Post();

        //V2
        Image img3 = new Image();
        Image img4 = new Image();
        Producto p3 = new Producto();
        Producto p4 = new Producto();
        Post pt3 = new Post();
        Post pt4 = new Post();

        //V3
        Image img5 = new Image();
        Image img6 = new Image();
        Producto p5 = new Producto();
        Producto p6 = new Producto();
        Post pt5 = new Post();
        Post pt6 = new Post();


        //V4
        Image img7 = new Image();
        Image img8 = new Image();
        Producto p7 = new Producto();
        Producto p8 = new Producto();
        Post pt7 = new Post();
        Post pt8 = new Post();

        //V5
        Image img9 = new Image();
        Image img10 = new Image();
        Producto p9 = new Producto();
        Producto p10 = new Producto();
        Post pt9 = new Post();
        Post pt10 = new Post();

        //V6
        Image img11 = new Image();
        Image img12 = new Image();
        Producto p11 = new Producto();
        Producto p12 = new Producto();
        Post pt11 = new Post();
        Post pt12 = new Post();

        //V7
        Image img13 = new Image();
        Image img14 = new Image();
        Producto p13 = new Producto();
        Producto p14 = new Producto();
        Post pt13 = new Post();
        Post pt14 = new Post();

        //V8
        Image img15 = new Image();
        Image img16 = new Image();
        Producto p15 = new Producto();
        Producto p16 = new Producto();
        Post pt15 = new Post();
        Post pt16 = new Post();

        //V9
        Image img17 = new Image();
        Image img18 = new Image();
        Producto p17 = new Producto();
        Producto p18 = new Producto();
        Post pt17 = new Post();
        Post pt18 = new Post();

        //V10
        Image img19 = new Image();
        Image img20 = new Image();
        Producto p19 = new Producto();
        Producto p20 = new Producto();
        Post pt19 = new Post();
        Post pt20 = new Post();

        //Crear grafo con matriz para hacer las respectivas conexiones
        //Un segundo grafo para el admin, que va a estar conectado a todos los vendedores


    }

}
