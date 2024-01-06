package DAO;

import java.util.HashSet;
import java.util.Set;

import Carros.*;

public class Dao implements IDao{
	
	private Set<ICarro> lista;
	
	public Dao() {
		lista = new HashSet<ICarro>();
	}

	@Override
	public void add(ICarro carro) {
		lista.add(carro);
	}

	@Override
	public Set<ICarro> getAll() {
		return lista;
	}

	@Override
	@Deprecated
	public void remover() {
		
	}

	@Override
	@Deprecated
	public void alterar() {
		
	}

	
}
