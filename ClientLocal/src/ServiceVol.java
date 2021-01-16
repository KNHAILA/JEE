import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;
import com.entities.Vol;
import com.service.VolSessionLocal;

@WebService
public class ServiceVol {
	@EJB
	VolSessionLocal volSessionLocal;
	@WebMethod
	public void addVol(int numeroV, int jourSem, int jour, int placesLibres) {
		Vol a = new Vol(numeroV, jourSem, jour, placesLibres);
		volSessionLocal.addVol(a);
	}
	@WebMethod
	public void deleteVol(int numeroV, int jourSem, int jour, int placesLibres)  {
		Vol a = new Vol(numeroV, jourSem, jour, placesLibres);
		volSessionLocal.deleteVol(a);
		
	}
	@WebMethod
	public void updateVol(int numeroV, int jourSem, int jour, int placesLibres)  {
		Vol a = new Vol(numeroV, jourSem, jour, placesLibres);
		volSessionLocal.updateVol(a);
	}
	@WebMethod
	public Vol getVol(int numeroV) {
		return volSessionLocal.getVol(numeroV);
	}
	@WebMethod
	public List<Vol> getAllVols(){
		return volSessionLocal.getAllVols();
		
	}

}

