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
	public void addHoraire(int numeroH, String villeDepart, String villeArrivée, Date heureDépart, Date heureArrivee) {
		Horaire h = new Horaire(numeroH, villeDepart, villeArrivée, heureDépart, heureArrivee);
		horaireSessionLocal.addHoraire(h);
	}
	@WebMethod
	public void deleteHoraire(int numeroH, String villeDepart, String villeArrivée, Date heureDépart, Date heureArrivee) {
		Horaire h = new Horaire(numeroH, villeDepart, villeArrivée, heureDépart, heureArrivee);
		horaireSessionLocal.deleteHoraire(h);
	}
	public void updateHoraire(int numeroH, String villeDepart, String villeArrivée, Date heureDépart, Date heureArrivee){
		Horaire h = new Horaire(numeroH, villeDepart, villeArrivée, heureDépart, heureArrivee);
		horaireSessionLocal.updateHoraire(h);
	}
	public Horaire getHoraire(int numeroH) {
		return horaireSessionLocal.getHoraire(numeroH);
	}
	public List<Horaire> getAllHoraires(){
		return horaireSessionLocal.getAllHoraires();
	}

}
