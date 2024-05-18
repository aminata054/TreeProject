import java.util.*;

public class Dossier extends Composant {
    public String nom;
    private ArrayList<Composant> contenu;

    public Dossier(String nom) {
        this.nom = nom;
        this.contenu = new ArrayList<Composant>();
    }

    public void ajouter(Composant element) {
        this.contenu.add(element);
    }

    public void supprimer(Composant element) {
        this.contenu.remove(element);
    }

    @Override
    public void afficher() {
        afficherArborescence(this, 0);
    }

    private void afficherArborescence(Dossier dossier, int niveau) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < niveau; i++) {
            sb.append("  "); 
        }
        sb.append(dossier.nom);
        System.out.println(sb.toString());

        for (Composant c : dossier.contenu) {
            if (c instanceof Fichier) {
                afficherFichier((Fichier) c, niveau + 1);
            } else if (c instanceof Dossier) {
                afficherArborescence((Dossier) c, niveau + 1);
            }
        }
    }

    private void afficherFichier(Fichier fichier, int niveau) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < niveau; i++) {
            sb.append("  "); 
        }
        sb.append("|-- ");
        sb.append(fichier.getNom()).append(".").append(fichier.getExtension());
        System.out.println(sb.toString());
    }
}


