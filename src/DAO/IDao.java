package DAO;

import java.util.Set;

import Carros.ICarro;

public interface IDao {

	public void add(ICarro carro);
	
	public Set<ICarro> getAll();
	
	public void remover();
	
	@Deprecated
	public void alterar();
	
}
