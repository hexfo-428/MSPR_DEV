/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programme1mspr;

import java.util.Objects;
/**
 *
 * @author PradoxLeFox
 */
public class Agent {
    private String nom;
    private String prenom;
    private String mission;
    private String mdp;
    private String objet1;
    private String objet2;
    private String objet3;
    

    public Agent(String nom, String prenom, String mission, String mdp, String objet1, String objet2, String objet3) {
        this.nom = nom;
        this.prenom = prenom;
        this.mission = mission;
        this.mdp = mdp;
        this.objet1 = objet1;
        this.objet2 = objet2;
        this.objet3 = objet3;
        
       
    }



  

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getObjet1() {
        return objet1;
    }

    public void setObjet1(String objet1) {
        this.objet1 = objet1;
    }

    public String getObjet2() {
        return objet2;
    }

    public void setObjet2(String objet2) {
        this.objet2 = objet2;
    }

    public String getObjet3() {
        return objet3;
    }

    public void setObjet3(String objet3) {
        this.objet3 = objet3;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.nom);
        hash = 59 * hash + Objects.hashCode(this.prenom);
        hash = 59 * hash + Objects.hashCode(this.mission);
        hash = 59 * hash + Objects.hashCode(this.mdp);
        hash = 59 * hash + Objects.hashCode(this.objet1);
        hash = 59 * hash + Objects.hashCode(this.objet2);
        hash = 59 * hash + Objects.hashCode(this.objet3);
                                
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Agent other = (Agent) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        if (!Objects.equals(this.mission, other.mission)) {
            return false;
        }
        if (!Objects.equals(this.mdp, other.mdp)) {
            return false;
        }
        if (!Objects.equals(this.objet1, other.objet1)) {
            return false;
        }
        if (!Objects.equals(this.objet2, other.objet2)) {
            return false;
        }
        return Objects.equals(this.objet3, other.objet3);
    }

    
    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + ", mission=" + mission + ", mdp=" + mdp + ", objet1=" + objet1 + ", objet2=" + objet2 + ", objet3=" + objet3 + '}';
    }
    
}
