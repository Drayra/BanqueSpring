package tn.mine.banque.entites;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="GROUPES")
public class Groupe implements Serializable{

	
	
	//private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeGroupe;
	private String nomGroupe;
	
	//une asso bdirectionnelle doit etre ignoree soit ds un sens ou ds l'autre : @JsonIgnore
	@ManyToMany(mappedBy="groupes")
	private Collection<Employe> employes;
	
	
	
	public Groupe() {
		super();
	}
	
	public Groupe(String nomGroupe) {
		super();
		this.nomGroupe = nomGroupe;
	}





	public Long getCodeGroupe() {
		return codeGroupe;
	}
	public void setCodeGroupe(Long codeGroupe) {
		this.codeGroupe = codeGroupe;
	}
	public String getNomGroupe() {
		return nomGroupe;
	}
	public void setNomGroupe(String nomGroupe) {
		this.nomGroupe = nomGroupe;
	}
	public Collection<Employe> getEmployes() {
		return employes;
	}
	public void setEmployes(Collection<Employe> employes) {
		this.employes = employes;
	}
	
	
}
