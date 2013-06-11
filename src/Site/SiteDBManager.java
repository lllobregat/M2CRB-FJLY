/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Site;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tiphaine
 */
public class SiteDBManager {
    private Connection conn = null;
    private Statement  smt  = null;
    private String nomDB = ""; 
    
    //-- Constructeur
    public SiteDBManager(String nomBD){
        this.nomDB = nomBD;
        try {
            // Connexion
            conn = DriverManager.getConnection("jdbc:mysql://localhost/"+this.nomDB,"root","");
            smt = conn.createStatement();            
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //-- Méthodes
    
    // -- Getters
    public int getIdSite(){
        int idSite = 0;
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT idSite FROM InfoSite");
            // récupération des données 
            result.first();
            idSite = result.getInt("idSite");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idSite;
    }
    
    public String getNomSite(){
        String nomSite = "";
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT nomSite FROM InfoSite");
            // récupération des données 
            result.first();
            nomSite = result.getString("nomSite");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nomSite;
    }
    
    public float getCoordLatitudeSite(){
        float coordLatitude = 0;
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT coordLatitude FROM InfoSite");
            // récupération des données 
            result.first();
            coordLatitude = result.getFloat("coordLatitude");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return coordLatitude;
    }
    
    public float getCoordLongitudeSite(){
        float coordLongitude = 0;
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT coordLongitude FROM InfoSite");
            // récupération des données 
            result.first();
            coordLongitude = result.getFloat("coordLongitude");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return coordLongitude;
    }
    
    public float getAffluenceCouranteSite(){
        float affluenceCourante = 0;
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT affluenceCourante FROM InfoSite");
            // récupération des données 
            result.first();
            affluenceCourante = result.getFloat("affluenceCourante");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return affluenceCourante;
    }
         
    public String getHoraireOuvertureSite(){        
        String heureOuverture = "";
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT heureOuverture FROM InfoSite");
            // récupération des données 
            result.first();
            heureOuverture = result.getString("heureOuverture");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return heureOuverture;
    }
    
    public String getHoraireFermetureSite(){
        String heureFermeture = "";
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT heureFermeture FROM InfoSite");
            // récupération des données 
            result.first();
            heureFermeture = result.getString("heureFermeture");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return heureFermeture;
    }
    
    public String getDescriptionSite(){
        String description = "";
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT description FROM InfoSite");
            // récupération des données 
            result.first();
            description = result.getString("description");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return description;
    }
    
    public String getAdresseSite(){
        String adresse = "";
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT adresse FROM InfoSite");
            // récupération des données 
            result.first();
            adresse = result.getString("adresse");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return adresse;
    }
    
    public String getTelephoneSite(){
        String telephone = "";
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT telephone FROM InfoSite");
            // récupération des données 
            result.first();
            telephone = result.getString("telephone");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return telephone;
    }
    
    public float getAffluenceQuotidienneSite(){
        float affluenceQuotidienne = 0;
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT affluenceQuotidienne FROM InfoSite");
            // récupération des données 
            result.first();
            affluenceQuotidienne = result.getFloat("affluenceQuotidienne");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return affluenceQuotidienne;
    }
    
    public int getDureeMoyenneVisiteSite(){
        int dureeMoyenneVisite = 0;
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT dureeMoyenneVisite FROM InfoSite");
            // récupération des données 
            result.first();
            dureeMoyenneVisite = result.getInt("dureeMoyenneVisite");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dureeMoyenneVisite;
    }
    
    public int getDureeMinimaleVisiteSite(){
        int dureeMinimaleVisite = 0;
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT dureeMinimaleVisite FROM InfoSite");
            // récupération des données 
            result.first();
            dureeMinimaleVisite = result.getInt("dureeMinimaleVisite");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dureeMinimaleVisite;
    }
    
    public int getDureeMaximaleVisiteSite(){
        int dureeMaximaleVisite = 0;
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT dureeMaximaleVisite FROM InfoSite");
            // récupération des données 
            result.first();
            dureeMaximaleVisite = result.getInt("dureeMaximaleVisite");
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dureeMaximaleVisite;
    }
    
    //-- 
    // enregistre l'idCarte comme étant autorisée à entrer dans le site
    // date sous format "dd/mm/YYYY"
    public void autoriserEntree(int idCarte, String dateDebut, String dateFin){
        try {
            if(dateDebut != null && dateFin != null){
                // requete sql insert avec dates
                String query = "INSERT INTO CartesAutorisees VALUES("
                    + idCarte + ",STR_TO_DATE('" + dateDebut + "', '%d/%m/%Y') ,"
                        + "STR_TO_DATE('" + dateFin + "', '%d/%m/%Y'))";
                smt.executeUpdate(query);
            }
            else{
                // requete sql insert sans les dates
                smt.executeUpdate("INSERT INTO CartesAutorisees VALUES("
                    + idCarte + ",null,null)");
            }            
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // renvoie vrai si l'idCarte passée en paramètre est enregistrée comme autorisée
    public boolean estAutoriseeEntree(int idCarte){
        boolean estAutorisee = false;
        try {
            // requete sql 
            ResultSet result = smt.executeQuery("SELECT * FROM CartesAutorisees WHERE idCarte = " + idCarte);
            // si une donnée correspond, l'entrée est autorisée, sinon non
            estAutorisee = result.first();
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return estAutorisee;
    }
    
    // revoie l'idVisite qui vient d'être initialisée
    public int debuterVisite(int idCarte){
        int idVisite = 0;
        try {
            // requete sql insert 
            String query = "INSERT INTO Visites VALUES(null," + idCarte + 
                    ",NOW() ,null, null)";            
            smt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);                     
            
            // récupère l'idVisite créé
            ResultSet rSetIdGenerees = smt.getGeneratedKeys();
            if (rSetIdGenerees.next()) {
                idVisite = rSetIdGenerees.getInt(1);                
            }            
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idVisite;
    }
    
    // MAJ la visite avec la date de sortie
    public void finirVisite(int idVisite){
        try {
            // requete sql insert 
            String query = "UPDATE Visites SET dateHeureSortie = NOW()"
                    + "WHERE idVisite = " + idVisite;            
            smt.executeUpdate(query);      
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // MAJ la viste en ajoutant l'avis (taux de satisfaction)
    public void setTauxSatisfactionVisite(int idVisite, float tauxSatisfaction){
        try {
            // requete sql insert 
            String query = "UPDATE Visites SET tauxSatisfaction = " + tauxSatisfaction
                    + "WHERE idVisite = " + idVisite;            
            smt.executeUpdate(query);      
        } catch (SQLException ex) {
            Logger.getLogger(SiteDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}

