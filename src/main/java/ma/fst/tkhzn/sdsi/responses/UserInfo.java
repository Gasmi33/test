package ma.fst.tkhzn.sdsi.responses;

import ma.fst.tkhzn.sdsi.entities.Departement;
import ma.fst.tkhzn.sdsi.entities.Enseignant;
import ma.fst.tkhzn.sdsi.entities.Utilisateur;

import java.io.Serializable;

public class UserInfo implements Serializable {
	// Envoyer tous types d'utilisateurs
	private String login;
	private String nom;
	private String prenom;

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	private String nomLab;
	private String role;
	private Departement departement;
	private Boolean active;

	// Utilisation pour renvoyer des données aux utilisateurs
	private String firstName;
	private String lastName;
	private String userName;
	private Object roles;

	public UserInfo() {}

	public UserInfo(Utilisateur user) {
		this.login = user.getLogin();
		this.nom = user.getNom();
		this.prenom = user.getPrenom();
		if(user.getDepartement() == null) this.departement = null;
		else {
			this.departement = user.getDepartement();
		}
		this.role = user.getRole();
		this.active = user.getActive();
	}
	public UserInfo(Enseignant user) {
		this.login = user.getLogin();
		this.nom = user.getNom();
		this.prenom = user.getPrenom();
		if(user.getDepartement() == null) this.departement = null;
		else {
			this.departement = user.getDepartement();
		}
		this.role = user.getRole();
		this.active = user.getActive();
		this.nomLab = user.getNomLab();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
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

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	public String getNomLab() {
		return nomLab;
	}

	public void setNomLab(String nomLab) {
		this.nomLab = nomLab;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Object getRoles() {
		return roles;
	}

	public void setRoles(Object roles) {
		this.roles = roles;
	}
	
	
}
