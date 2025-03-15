package model.dao;

import Db.Db;
import model.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(Db.getConnection());
    }
}
