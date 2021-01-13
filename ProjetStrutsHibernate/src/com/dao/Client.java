package com.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client implements Serializable{
	private Long code;
	private String nom;
	private String prenom;
	private int age;
	private String ville;
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Client(Long code, String nom, String prenom, int age, String ville) {
		super();
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.ville = ville;
	}


	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public String save() {
		Session session=null;
		try {
			SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(this);
			transaction.commit();
		}catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
			return "error";
		}finally {
			session.flush();
			session.close();
		}
		return "success";
	}

	public String update() {
		Session session=null;
		try {
			SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			System.out.println(code);
			Client client1=(Client)session.load(Client.class, this.getCode());
			client1.setAge(age);
			client1.setNom(nom);
			client1.setPrenom(prenom);
			client1.setVille(ville);
			session.save(client1);
			transaction.commit();
		}catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
			return "error";
		}finally {
			session.flush();
			session.close();
		}
		return "success";
	}

	public String delete() {
		Session session=null;
		try {
			SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			 Client client1=(Client)session.load(Client.class, this.getCode());
			session.delete(client1);
			transaction.commit();
		}catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
			return "error";
		}finally {
			session.flush();
			session.close();
		}
		return "success";
	}
}
