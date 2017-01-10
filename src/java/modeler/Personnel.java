/**
 * This file was generated by the JPA Modeler
 */
package modeler;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author lapin
 */
@Entity
public class Personnel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String nom;

    @Basic
    private String prenom;

    @ManyToOne(targetEntity = Service.class)
    private Service service;

    @ManyToOne(targetEntity = Adresse.class)
    private Adresse adresse;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Service getService() {
        return this.service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Adresse getAdresse() {
        return this.adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString(){
        return "nom = " + this.nom + "<br/>prenom " + this.prenom + " <br/>adresse " + this.adresse.getAdresse()+"<br/>";
    }

}
