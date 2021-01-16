import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.entities.Horaire;
import com.service.HoraireSessionLocal;

@WebService
public class ServiceHoraire {
	@EJB
	HoraireSessionLocal horaireSessionLocal;
	@WebMethod
	public void addHoraire(int numeroH, String villeDepart, String villeArriv�e, Date heureD�part, Date heureArrivee) {
		Horaire h = new Horaire(numeroH, villeDepart, villeArriv�e, heureD�part, heureArrivee);
		horaireSessionLocal.addHoraire(h);
	}
	@WebMethod
	public void deleteHoraire(int numeroH, String villeDepart, String villeArriv�e, Date heureD�part, Date heureArrivee) {
		Horaire h = new Horaire(numeroH, villeDepart, villeArriv�e, heureD�part, heureArrivee);
		horaireSessionLocal.deleteHoraire(h);
	}
	public void updateHoraire(int numeroH, String villeDepart, String villeArriv�e, Date heureD�part, Date heureArrivee){
		Horaire h = new Horaire(numeroH, villeDepart, villeArriv�e, heureD�part, heureArrivee);
		horaireSessionLocal.updateHoraire(h);
	}
	public Horaire getHoraire(int numeroH) {
		return horaireSessionLocal.getHoraire(numeroH);
	}
	public List<Horaire> getAllHoraires(){
		return horaireSessionLocal.getAllHoraires();
	}

}
