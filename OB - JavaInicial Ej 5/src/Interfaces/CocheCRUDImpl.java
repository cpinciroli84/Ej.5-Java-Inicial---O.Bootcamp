package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{
    private List<Coche> vehiculos = new ArrayList<>();

    @Override
    public void save(Coche coche) {
        vehiculos.add(coche);
    }

    @Override
    public List<Coche> findAll() {
        return vehiculos;
    }

    @Override
    public void delete(Coche coche){
        vehiculos.remove(coche);
    }
}
