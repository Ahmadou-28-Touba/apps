import entity.Employe;
import entity.Etudiant;

public class Main {
    public static void main(String[] args) {
        Employe E=new Employe();
        Etudiant e=new Etudiant();
        System.out.println();
        System.out.println("Employe :");
        E.saisie();
        System.out.println("Information de l'employe");
        E.affiche();
        System.out.println("------------------------------");
        System.out.println("Etudiant :");
        e.saisie();
        System.out.println("Information de l'etudiant");
        e.affiche();

    }
}