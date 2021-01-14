package Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import DAO.Etudiant;
import Service.EtudiantService;
import org.springframework.ui.Model;

@Controller
public class EtudiantController {	
	@Autowired
	private EtudiantService etudiantService;
	@RequestMapping (value="/Vues/index")
	private String index(){ 
		return "index";
	}
	@RequestMapping (value="/Vues/saisir")
	private String saisir(@RequestParam Long code,@RequestParam String nom,@RequestParam  String prenom, @RequestParam  int age, String ville){
		etudiantService.addEtudiant(new Etudiant(code, nom, prenom, age, ville));
		return "saisir";
	}
	@RequestMapping (value="/Vues/affichage")
	private String affiche(Model model){ 
		model.addAttribute("list",etudiantService.getAllEtudiants());
		return "affichage";
	}
	@RequestMapping (value="/Vues/recherche")
	private String recherche(Model model,@RequestParam Long code){
		List<Etudiant> le=new ArrayList();
		le.add(etudiantService.getEtudiantByCode(code));
		model.addAttribute("list",le);
		return "affichage";
	}
	@RequestMapping (value="/Vues/delete")
	private String delete(Model model,@RequestParam Long code){
		etudiantService.deleteEtudiant(code);
		model.addAttribute("list",etudiantService.getAllEtudiants());
		return "affichage";
	}
}



