import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.entities.Avion;
import com.service.AvionSessionLocal;

@WebService
public class ServiceAvion {
	@EJB
	AvionSessionLocal avionSessionLocal;
	
	@WebMethod
	public void addAvion(int numeroA, String compagnie, String constructeur, String modele, int capacite) {
		Avion a = new Avion(numeroA, compagnie, constructeur, modele, capacite);
		avionSessionLocal.addAvion(a);
	}
	@WebMethod
	public void deleteAvion(int numeroA, String compagnie, String constructeur, String modele, int capacite) {
		Avion a = new Avion(numeroA, compagnie, constructeur, modele, capacite);
		avionSessionLocal.deleteAvion(a);
	}
	@WebMethod
	public void updateAvion(int numeroA, String compagnie, String constructeur, String modele, int capacite) {
		Avion a = new Avion(numeroA, compagnie, constructeur, modele, capacite);
		avionSessionLocal.updateAvion(a);
	}
	@WebMethod
	public Avion getAvion(int numeroA) {
		return avionSessionLocal.getAvion(numeroA);
	}
	@WebMethod
	public List<Avion> getAllAvions(){
		return avionSessionLocal.getAllAvions();
	}
}
