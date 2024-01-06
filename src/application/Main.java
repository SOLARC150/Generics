package application;

import Carros.chevrolet.*;
import Carros.honda.*;
import DAO.Dao;
import DAO.IDao;

public class Main {

	public static void main(String[] args) {
		IDao banco = new Dao();
		
		banco.add(new Civic());
		banco.add(new S10());
		banco.add(new Hrv());
		banco.add(new Camaro());
		
		System.out.println(banco.getAll());
	}
	
}
