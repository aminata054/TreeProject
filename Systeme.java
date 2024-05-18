public class Systeme {
    public static void main(String[] args) {
        Fichier fichier1 = new Fichier("toto", "png");
        Fichier fichier2 = new Fichier("icon", "jpg");
        Fichier fichier3 = new Fichier("blondy", "mp4");
        Fichier fichier4 = new Fichier("guite", "mp3");
        Fichier fichier5 = new Fichier("image3", "png");
        Fichier fichier6 = new Fichier("java", "pdf");
        Fichier fichier7 = new Fichier("veilleTech", "pdf");
        Fichier fichier8 = new Fichier("uml", "pdf");
        Fichier fichier9 = new Fichier("music4", "mp3");
        Fichier fichier10 = new Fichier("didi", "jpeg");

        Fichier fichier11 = new Fichier("exo1", "java");
        Fichier fichier12 = new Fichier("Etudiant", "java");
        Fichier fichier13 = new Fichier("Directeur", "java");
        Fichier fichier14 = new Fichier("Etudiant", "class");
        Fichier fichier15 = new Fichier("Directeur", "class");
        Fichier fichier16 = new Fichier("exo1", "class");
        Fichier fichier17 = new Fichier("exo2", "class");
        Fichier fichier18 = new Fichier("exo2", "java");

        Fichier fichier19 = new Fichier("music5", "mp3");
        Fichier fichier20 = new Fichier("abdouguitte", "mp4");


        Dossier dossier1 =  new Dossier("Image");
        dossier1.ajouter(fichier1);
        dossier1.ajouter(fichier2);
        dossier1.ajouter(fichier10);
        dossier1.ajouter(fichier5);

        Dossier dossier5 = new Dossier("Musique senegalaise");
        dossier5.ajouter(fichier19);
        dossier5.ajouter(fichier20);

        Dossier dossier2 =  new Dossier("Music");
        dossier2.ajouter(fichier3);
        dossier2.ajouter(fichier4);
        dossier2.ajouter(fichier9);
        dossier2.ajouter(dossier5);

        Dossier dossier3 =  new Dossier("PDF");
        dossier3.ajouter(fichier6);
        dossier3.ajouter(fichier7);

        Dossier dossier4 =  new Dossier("JAVA");
        dossier4.ajouter(fichier11);
        dossier4.ajouter(fichier12);
        dossier4.ajouter(fichier13);
        dossier4.ajouter(fichier14);
        dossier4.ajouter(fichier15);
        dossier4.ajouter(fichier16);
        dossier4.ajouter(fichier17);
        dossier4.ajouter(fichier18);

        Dossier dossier = new Dossier("Disque Local C");
        dossier.ajouter(fichier8);
        dossier.ajouter(dossier1);
        dossier.ajouter(dossier2);
        dossier.ajouter(dossier3);
        dossier.ajouter(dossier4);

        dossier.afficher();
    }


}
