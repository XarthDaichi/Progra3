package sucursales.logic;

import sucursales.data.SucursalDao;
import java.util.List;

public class Service {
    private static Service theInstance;

    public static Service instance(){
        if (theInstance == null){
            theInstance = new Service();
        }
        return theInstance;
    }

    private SucursalDao sucursalDao;

    private Service(){
        sucursalDao= new SucursalDao();
    }

    public Sucursal sucursalGet(String codigo) throws Exception{
        return sucursalDao.read(codigo);
    }

    public void sucursalAdd(Sucursal sucursal) throws Exception{
        sucursalDao.create(sucursal);
    }

    public void sucursalUpdate(Sucursal sucursal) throws Exception{
        sucursalDao.update(sucursal);
    }

    public List<Sucursal> sucursalSearch(Sucursal filtro) throws Exception {
        return  sucursalDao.findByReferencia(filtro.getReferencia());
     }

 }
