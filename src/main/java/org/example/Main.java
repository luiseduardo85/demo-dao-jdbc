package org.example;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        SellerDao sellerDao = DaoFactory.createSellerDao();


        Seller seller = sellerDao.findById(3);

        Department department = new Department(2, null);
        List<Seller> list =  sellerDao.findByDepartment(department);
        for(Seller obj : list){
            System.out.println(obj);
        }

//        List<Seller> list =  sellerDao.findAll();
//        for(Seller obj : list){
//            System.out.println(obj);
//        }

        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
        sellerDao.insert(newSeller);
        System.out.println(newSeller.getId());


    }
}