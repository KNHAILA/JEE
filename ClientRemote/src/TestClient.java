

import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.entities.Avion;
import com.entities.Horaire;
import com.session.IRemote_Avion;
import com.session.IRemote_Horaire;

public class TestClient {
	public static void main(String[] args) {
		try {
		

			Context context = new InitialContext();
			IRemote_Avion iremoteAvion=(IRemote_Avion) context.lookup("EJBProject/ImpAvion!com.session.IRemote_Avion");
			Avion avion1=new Avion();
			avion1.setCapacite(14);
			avion1.setCompagnie("compagnie");
			Avion avion2=new Avion(8, "compagnie2", "constructeur2", "modele2", 100);
			iremoteAvion.addAvion(avion1);
			iremoteAvion.updateAvion(avion2);
			//iremoteAvion.deleteAvion(avion2);
			//Context context = new InitialContext();
			IRemote_Horaire iremoteHoraire=(IRemote_Horaire) context.lookup("EJBProject/ImpHoraire!com.session.IRemote_Horaire");
			Horaire a=new Horaire(1, "villeDepart", "villeArrivée",new Date(), new Date());
			//a.setVilleArrivée("ville arrivée");
			//a.setVilleDepart("villeDepart");
			iremoteHoraire.addHoraire(a);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
