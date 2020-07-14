public class service {
    
    final int TAILLE=10;
    private int nbreService=0;
    private int nbreEmploye=0;
    private Service tabservice[];
    private Employe [] tabEmploye;
 
     public Service(){
        tabservice=new Service[TAILLE];
        tabEmploye=new Employe[TAILLE];
 
     }

    public void ajoutService(Service service){
        if(nbreService<TAILLE){
            service.setId(nbreService+1);
            tabservice[nbreService]=service;
            nbreService++;
        }else{
            System.out.println("Tableau Rempli");
        }
    }
        
    public void listerService(){
        for(int i=0;i<nbreService;i++){
            System.out.println(tabservice[i].affiche());
        }
            
    }

    public void listerJournalier(){
        for(int i=0;i<nbreEmploye;i++){
            System.out.println(tabEmploye[journalier].affiche());
        }
            
    }

    public void listerEmbauche(){
        for(int i=0;i<nbreEmploye;i++){
            System.out.println(tabEmploye[embaucher].affiche());
        }
            
    }    

}