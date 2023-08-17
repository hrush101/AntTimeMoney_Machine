package config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.osgi.service.useradmin.User;

import user.Userdetail;

public class Config {

	public SessionFactory Conn() {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Userdetail.class);
		SessionFactory sf=cfg.buildSessionFactory();
		return sf;
		
	}
}
