public class Fichier extends Composant {

    String nom, extension;  


 public Fichier(String nom, String extension) {
        this.nom = nom;
        this.extension = extension;

    }

    public String getNom() {
        return this.nom;
    }
    
    public String getExtension() {
        return this.extension;
    }


    public void setExtension(String extension) {
        this.extension = extension;
    }
    

    // Cette methode est une redefinition de la methode afficher
    @Override
    public void afficher() {
        System.err.printf("\t%s.%s\n", this.nom, this.extension);
    }
}
