import java.time.LocalDate;

public class Journalier extends Employe {


    private String duree;
    private String forfait;

    
     private Service  journalierEm;
   
    
           public Employe(){
          }
      
          public Journalier(String duree,String forfait ){

             
             this.duree=duree;
             this.forfait=forfait;
             
          }


     public Employe getEmploye(){
        return this.journalierEm;
     }

     public void setEmploye(Employe employe ){
           this.journalierEm=Employe;
   }


    @Override
    public String affiche(){
    
       return " duree: "+duree + " forfait: "+forfait
                   
    }

}