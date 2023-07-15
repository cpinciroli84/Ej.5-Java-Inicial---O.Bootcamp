package Interfaces;

import java.util.List;

public class main {
    static CocheCRUD cocheCrud = new CocheCRUDImpl();

    public static void main(String[] args) {

        Coche Ferrari460 = new Coche("Ferrari","460",2021);
        Coche AudiA6 = new Coche("Audi","A6",2022);
        Coche Ferrari470 = new Coche("Ferrari","470",2021);
        Coche AudiA3 = new Coche("Audi","A3",2020);

        cocheCrud.save(Ferrari460);
        cocheCrud.save(AudiA6);
        cocheCrud.save(Ferrari470);
        cocheCrud.save(AudiA3);

        List<Coche> vehiculos = cocheCrud.findAll();
        System.out.println(vehiculos);

        cocheCrud.delete(AudiA3);
        System.out.println(vehiculos);
    }
}
