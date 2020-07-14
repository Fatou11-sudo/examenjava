public abstract class Employe implements IService {

    protected int id;
    protected String nomComplet;

    public Employe (String nomComplet,Int id ){
      this.nomComplet=nomComplet;
    }

    public Employe (){

    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public isEmbauche(){
        if (Employe = Embauche.dateEmb){
            System.out.println("L'employe est embauché");
        }else{
            System.out.println("L'employe est n'est pas embauché");
        }
    
    }

    public isJournalier(){
        if (Employe = Journalier.forfait){
            System.out.println("L'employe est Journalier");
        }else{
            System.out.println("L'employe est n'est pas Journalier");
        }
    
    }

    @Override
    public String affiche(){
       return "Id: "+id+" Nom et Prenom : "+nomComplet;
    }
}