import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.entities.Passager;
import com.service.PassagerSessionLocal;

@WebService
public class ServicePassager {
	@EJB
	PassagerSessionLocal passagerSessionLocal;
	
	@WebMethod
	public void addPassager(int numeroP,String nom,String  prenom) {
		Passager p = new Passager(numeroP, nom, prenom);
		passagerSessionLocal.addPassager(p);
		
	}
	@WebMethod
	public void deletePassager(int numeroP,String nom,String  prenom) {
		Passager p = new Passager(numeroP, nom, prenom);
		passagerSessionLocal.deletePassager(p);
		
	}
	@WebMethod
	public void updatePassager(int numeroP,String nom,String  prenom) {
		Passager p = new Passager(numeroP, nom, prenom);
		passagerSessionLocal.updatePassager(p);
	}
	public Passager getPassager(int numeroP) {
		return passagerSessionLocal.getPassager(numeroP);
	}
	public List<Passager> getAllPassagers(){
		return passagerSessionLocal.getAllPassagers();
	}
}
