import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "navigationController",eager = true)
@RequestScoped
public class navigationController implements Serializable{
	
	public String moveToPage() {
		return "affichage";
	}

}
