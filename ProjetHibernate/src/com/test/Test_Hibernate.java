	package com.test;
	
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;
	import com.dao.Client;
	
	public class Test_Hibernate {
		public static void main(String[] args) {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			Session session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			Client client1=new Client((long) 1, "NHAILA", "Kaoutar", 22,"KHOURIBGA");
			Client client2=new Client((long) 2, "NHAILA", "Hamza", 26,"KHOURIBGA");
			session.save(client1);
			session.save(client2);
			transaction.commit();
			/*
			 * Client client1=(Client)session.load(Client.class, (long)2);
			 * session.delete(client1);
			 * ******************************************* *
			 * Client client1=(Client)session.load(Client.class, (long)1);
			 * client1.setNom("Selloum");
			 * session.save(client1);
			 */
		}
	}
	
	
	
	
	
