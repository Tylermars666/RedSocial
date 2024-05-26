package co.edu.uniquindio.redsocial.factory;

import co.edu.uniquindio.redsocial.database.Database;
import co.edu.uniquindio.redsocial.model.*;
import co.edu.uniquindio.redsocial.model.Enums.CategoriaProducto;
import co.edu.uniquindio.redsocial.model.Enums.EstadoProducto;
import co.edu.uniquindio.redsocial.structures.grafo.Grafo;
import javafx.scene.image.Image;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.HashMap;

public class Creador {

    private static Creador instance;
    private Creador(){}
    public static Creador getInstance(){
        if(instance==null){
            instance = new Creador();
        }
        return instance;
    }


    public void crearBase() throws IOException {

        HashMap<String, Usuario> base = new HashMap<>();

        Admin admin = new Admin("admin", "666", new Muro(), "admin", "root", "main");
        Vendedor v1 = new Vendedor("Omar", "0000", new Muro(), "omar", "0000", "Santander", "Piedrahita");
        Vendedor v2 = new Vendedor("Carlos", "1111", new Muro(), "carlos", "1111", "Fachada", "Mancera");
        Vendedor v3 = new Vendedor("Eliana", "2222", new Muro(), "eliana", "2222", "Adiela", "Ortiz");
        Vendedor v4 = new Vendedor("Robinson", "3333", new Muro(), "robin", "3333", "Mercedes Norte", "Arias");
        Vendedor v5 = new Vendedor("Daniela", "4444", new Muro(), "dani", "4444", "Arcoiris", "Lopez");
        Vendedor v6 = new Vendedor("Yerson", "5555", new Muro(), "yerson", "5555", "Rojas Pinilla", "Muñoz");
        Vendedor v7 = new Vendedor("Camila", "6666", new Muro(), "camila", "6666", "Oro Negro", "Henao");
        Vendedor v8 = new Vendedor("Monica", "7777", new Muro(), "monica", "7777", "Brasilia", "Trujillo");
        Vendedor v9 = new Vendedor("Cristian", "8888", new Muro(), "cristian", "8888", "Villa Carolina", "Cortes");
        Vendedor v10 = new Vendedor("Jenny", "9999", new Muro(), "jenny", "9999", "Clarita", "Gomez");



        //V1
        Image img1 = new Image(new ByteArrayInputStream(Files.readAllBytes(Paths.get("T:/Windows/DocumentosWin/tmp3/RedSocial/src/main/resources/co/edu/uniquindio/redsocial/productImg/v1/1.jpg"))));
        Image img2 = new Image(new ByteArrayInputStream(Files.readAllBytes(Paths.get("T:/Windows/DocumentosWin/tmp3/RedSocial/src/main/resources/co/edu/uniquindio/redsocial/productImg/v1/2.jpg"))));
        Producto p1 = new Producto("Mueble gris", img1, CategoriaProducto.MUEBLE, 200000, EstadoProducto.PUBLICADO);
        Producto p2 = new Producto("Armario café", img2, CategoriaProducto.MUEBLE, 150000, EstadoProducto.PUBLICADO);
        Post pt1 = new Post(v1, LocalDate.now(), p1, "Un mueble muy guapo, lo vendo por motivos de viaje");
        Post pt2 = new Post(v1, LocalDate.now(), p2, "Este armario lo fabriqué yo mismo, lo doy económico");
        v1.setProducto(p1);
        v1.setProducto(p2);
        v1.setPost(pt1);
        v1.setPost(pt2);

        //V2
        Image img3 = new Image(new ByteArrayInputStream(Files.readAllBytes(Paths.get("T:/Windows/DocumentosWin/tmp3/RedSocial/src/main/resources/co/edu/uniquindio/redsocial/productImg/v2/1.jpg"))));
        Image img4 = new Image(new ByteArrayInputStream(Files.readAllBytes(Paths.get("T:/Windows/DocumentosWin/tmp3/RedSocial/src/main/resources/co/edu/uniquindio/redsocial/productImg/v2/2.jpg"))));
        Producto p3 = new Producto("Cajonero base", img3, CategoriaProducto.MUEBLE, 180000, EstadoProducto.PUBLICADO);
        Producto p4 = new Producto("Repisa", img4, CategoriaProducto.MUEBLE, 100000, EstadoProducto.PUBLICADO);
        Post pt3 = new Post(v2, LocalDate.now(), p3, "Un cajonero para que pongan el televisor encima");
        Post pt4 = new Post(v2, LocalDate.now(), p4, "Una repisa to guapa para que adornes tu casa");
        v1.setProducto(p3);
        v1.setProducto(p4);
        v1.setPost(pt3);
        v1.setPost(pt4);

        //V3
        Image img5 = new Image(new ByteArrayInputStream(Files.readAllBytes(Paths.get("T:/Windows/DocumentosWin/tmp3/RedSocial/src/main/resources/co/edu/uniquindio/redsocial/productImg/v3/1.jpg"))));
        Image img6 = new Image(new ByteArrayInputStream(Files.readAllBytes(Paths.get("T:/Windows/DocumentosWin/tmp3/RedSocial/src/main/resources/co/edu/uniquindio/redsocial/productImg/v3/2.jpg"))));
        Producto p5 = new Producto("Auto rojo moderno", img5, CategoriaProducto.VEHICULO, 33000000, EstadoProducto.PUBLICADO);
        Producto p6 = new Producto("Auto rojo clásico", img6, CategoriaProducto.VEHICULO, 22000000, EstadoProducto.PUBLICADO);
        Post pt5 = new Post(v3, LocalDate.now(), p5, "Un coche para dar visaje en la calle");
        Post pt6 = new Post(v3, LocalDate.now(), p6, "Un coche especial que le encantará a tu abuelo");
        v1.setProducto(p5);
        v1.setProducto(p6);
        v1.setPost(pt5);
        v1.setPost(pt6);


        //V4
        Image img7 = new Image(new ByteArrayInputStream(Files.readAllBytes(Paths.get("T:/Windows/DocumentosWin/tmp3/RedSocial/src/main/resources/co/edu/uniquindio/redsocial/productImg/v4/1.jpg"))));
        Image img8 = new Image(new ByteArrayInputStream(Files.readAllBytes(Paths.get("T:/Windows/DocumentosWin/tmp3/RedSocial/src/main/resources/co/edu/uniquindio/redsocial/productImg/v4/2.jpg"))));
        Producto p7 = new Producto("Auto azul moderno", img7, CategoriaProducto.VEHICULO, 40000000, EstadoProducto.PUBLICADO);
        Producto p8 = new Producto("Auto blanco clásico", img8, CategoriaProducto.VEHICULO, 21000000, EstadoProducto.PUBLICADO);
        Post pt7 = new Post(v4, LocalDate.now(), p7, "Un carrito melo papi, sino lo compra usted lo compro yo");
        Post pt8 = new Post(v4, LocalDate.now(), p8, "Un carrito apenas pal cucho mi rey, está todo conservado");
        v1.setProducto(p7);
        v1.setProducto(p8);
        v1.setPost(pt7);
        v1.setPost(pt8);

        //V5
        Image img9 = new Image(new ByteArrayInputStream(Files.readAllBytes(Paths.get("T:/Windows/DocumentosWin/tmp3/RedSocial/src/main/resources/co/edu/uniquindio/redsocial/productImg/v5/1.jpg"))));
        Image img10 = new Image(new ByteArrayInputStream(Files.readAllBytes(Paths.get("T:/Windows/DocumentosWin/tmp3/RedSocial/src/main/resources/co/edu/uniquindio/redsocial/productImg/v5/2.jpg"))));
        Producto p9 = new Producto("Casita pequeña", img9, CategoriaProducto.BIENES_RAICES, 34000000, EstadoProducto.PUBLICADO);
        Producto p10 = new Producto("Casa moderna", img10, CategoriaProducto.BIENES_RAICES, 60000000, EstadoProducto.PUBLICADO);
        Post pt9 = new Post(v5, LocalDate.now(), p9, "Una casita como para una persona o para vivir en pareja");
        Post pt10 = new Post(v5, LocalDate.now(), p10, "Una casa como para estar en vacaciones");
        v1.setProducto(p9);
        v1.setProducto(p10);
        v1.setPost(pt9);
        v1.setPost(pt10);

        //V6
        Image img11 = new Image(new ByteArrayInputStream(Files.readAllBytes(Paths.get("T:/Windows/DocumentosWin/tmp3/RedSocial/src/main/resources/co/edu/uniquindio/redsocial/productImg/v6/1.jpg"))));
        Image img12 = new Image(new ByteArrayInputStream(Files.readAllBytes(Paths.get("T:/Windows/DocumentosWin/tmp3/RedSocial/src/main/resources/co/edu/uniquindio/redsocial/productImg/v6/2.jpg"))));
        Producto p11 = new Producto("Casa con piscina", img11, CategoriaProducto.BIENES_RAICES, 100000000, EstadoProducto.PUBLICADO);
        Producto p12 = new Producto("Casita mela", img12, CategoriaProducto.BIENES_RAICES, 80000000, EstadoProducto.PUBLICADO);
        Post pt11 = new Post(v6, LocalDate.now(), p11, "Una casa brutal, grande y con piscina, que más le pide a la vida?");
        Post pt12 = new Post(v6, LocalDate.now(), p12, "Una casita mela, apenas para parchar con la familia");
        v1.setProducto(p11);
        v1.setProducto(p12);
        v1.setPost(pt11);
        v1.setPost(pt12);

        //V7
        Image img13 = new Image(new ByteArrayInputStream(Files.readAllBytes(Paths.get("T:/Windows/DocumentosWin/tmp3/RedSocial/src/main/resources/co/edu/uniquindio/redsocial/productImg/v7/1.jpg"))));
        Image img14 = new Image(new ByteArrayInputStream(Files.readAllBytes(Paths.get("T:/Windows/DocumentosWin/tmp3/RedSocial/src/main/resources/co/edu/uniquindio/redsocial/productImg/v7/2.jpg"))));
        Producto p13 = new Producto("Casa campestre", img13, CategoriaProducto.BIENES_RAICES, 111000000, EstadoProducto.PUBLICADO);
        Producto p14 = new Producto("Casita campestre", img14, CategoriaProducto.BIENES_RAICES, 99000000, EstadoProducto.PUBLICADO);
        Post pt13 = new Post(v7, LocalDate.now(), p13, "Una casa campestre por si usted lo que busca es vivir fuera de la ciudad");
        Post pt14 = new Post(v7, LocalDate.now(), p14, "Una casa campestre como para vivir solo alejado del bullicio de la ciudad");
        v1.setProducto(p13);
        v1.setProducto(p14);
        v1.setPost(pt13);
        v1.setPost(pt14);

        //V8
        Image img15 = new Image(new ByteArrayInputStream(Files.readAllBytes(Paths.get("T:/Windows/DocumentosWin/tmp3/RedSocial/src/main/resources/co/edu/uniquindio/redsocial/productImg/v8/1.jpg"))));
        Image img16 = new Image(new ByteArrayInputStream(Files.readAllBytes(Paths.get("T:/Windows/DocumentosWin/tmp3/RedSocial/src/main/resources/co/edu/uniquindio/redsocial/productImg/v8/2.jpg"))));
        Producto p15 = new Producto("Celular Viejo", img15, CategoriaProducto.TECNOLOGIA, 150000, EstadoProducto.PUBLICADO);
        Producto p16 = new Producto("Nokia 1100", img16, CategoriaProducto.TECNOLOGIA, 190000, EstadoProducto.PUBLICADO);
        Post pt15 = new Post(v8, LocalDate.now(), p15, "Un celular viejo por si lo que quiere es solo llamar y recibir llamadas");
        Post pt16 = new Post(v8, LocalDate.now(), p16, "Un nokia 1100 para los amantes de los clásicos");
        v1.setProducto(p15);
        v1.setProducto(p16);
        v1.setPost(pt15);
        v1.setPost(pt16);

        //V9
        Image img17 = new Image(new ByteArrayInputStream(Files.readAllBytes(Paths.get("T:/Windows/DocumentosWin/tmp3/RedSocial/src/main/resources/co/edu/uniquindio/redsocial/productImg/v9/1.jpg"))));
        Image img18 = new Image(new ByteArrayInputStream(Files.readAllBytes(Paths.get("T:/Windows/DocumentosWin/tmp3/RedSocial/src/main/resources/co/edu/uniquindio/redsocial/productImg/v9/2.jpg"))));
        Producto p17 = new Producto("Computador con cola", img17, CategoriaProducto.TECNOLOGIA, 2000000, EstadoProducto.PUBLICADO);
        Producto p18 = new Producto("Computador de los viejos", img18, CategoriaProducto.TECNOLOGIA, 1800000, EstadoProducto.PUBLICADO);
        Post pt17 = new Post(v9, LocalDate.now(), p17, "Computador viejo, con windows 95, toda una reliquia");
        Post pt18 = new Post(v9, LocalDate.now(), p18, "Esta carcasa se ve vieja pero en realidad es un pc gamer");
        v1.setProducto(p17);
        v1.setProducto(p18);
        v1.setPost(pt17);
        v1.setPost(pt18);

        //V10
        Image img19 = new Image(new ByteArrayInputStream(Files.readAllBytes(Paths.get("T:/Windows/DocumentosWin/tmp3/RedSocial/src/main/resources/co/edu/uniquindio/redsocial/productImg/v10/1.jpg"))));
        Image img20 = new Image(new ByteArrayInputStream(Files.readAllBytes(Paths.get("T:/Windows/DocumentosWin/tmp3/RedSocial/src/main/resources/co/edu/uniquindio/redsocial/productImg/v10/2.jpg"))));
        Producto p19 = new Producto("Portatil moderno", img19, CategoriaProducto.TECNOLOGIA, 2500000, EstadoProducto.PUBLICADO);
        Producto p20 = new Producto("Portatil gamer", img20, CategoriaProducto.TECNOLOGIA, 3500000, EstadoProducto.PUBLICADO);
        Post pt19 = new Post(v10, LocalDate.now(), p19, "Un portatil moderno apenas para usar office y redes sociales");
        Post pt20 = new Post(v10, LocalDate.now(), p20, "Un portatil gamer para los amantes de los videojuegos y programas de la nasa");
        v1.setProducto(p19);
        v1.setProducto(p20);
        v1.setPost(pt19);
        v1.setPost(pt20);

        Grafo grafoVendedores = new Grafo(10);
        grafoVendedores.setUsuario(v1);
        grafoVendedores.setUsuario(v2);
        grafoVendedores.setUsuario(v3);
        grafoVendedores.setUsuario(v4);
        grafoVendedores.setUsuario(v5);
        grafoVendedores.setUsuario(v6);
        grafoVendedores.setUsuario(v7);
        grafoVendedores.setUsuario(v8);
        grafoVendedores.setUsuario(v9);
        grafoVendedores.setUsuario(v10);

        //Adyacencias
        grafoVendedores.agregarArista(v1, v2);
        grafoVendedores.agregarArista(v1, v3);
        grafoVendedores.agregarArista(v1, v10);
        grafoVendedores.agregarArista(v2, v5);
        grafoVendedores.agregarArista(v2, v7);
        grafoVendedores.agregarArista(v3, v5);
        grafoVendedores.agregarArista(v4, v5);
        grafoVendedores.agregarArista(v4, v10);
        grafoVendedores.agregarArista(v6, v7);
        grafoVendedores.agregarArista(v6, v9);
        grafoVendedores.agregarArista(v7, v8);
        grafoVendedores.agregarArista(v7, v10);
        grafoVendedores.agregarArista(v8, v9);

        base.put(admin.getId(),admin);
        base.put(v1.getId(),v1);
        base.put(v2.getId(),v2);
        base.put(v3.getId(),v3);
        base.put(v4.getId(),v4);
        base.put(v5.getId(),v5);
        base.put(v6.getId(),v6);
        base.put(v7.getId(),v7);
        base.put(v8.getId(),v8);
        base.put(v9.getId(),v9);
        base.put(v10.getId(),v10);

        Database.getInstance().guardarBase(base);



    }
}
