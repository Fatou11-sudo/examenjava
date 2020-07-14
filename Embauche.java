import java.time.LocalDate;

public class Embauche extends Employe {


    private String salaire;
    private String dateEmb;

    
     private Service  embaucheEm;
   
    
           public Service(){
          }
      
          public Embauche(String salaire,LocalDate dateEmb ){

             super(dateEmb);
             this.salaire=salaire;
             
          }


     public Service getService(){
        return this.embaucheEm;
     }

     public void setService(Service service){
           this.embaucheEm=Service;
   }


    @Override
    public String affiche(){
    
       return super.affiche() +" salaire: "+salaire
                   
    }

}