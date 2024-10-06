package pres;
import dao.DaoImpl;
import ext.DaoImpl2;
import metier.IMetierImpl;

public class Presentation {
    public static void main(String[] args) {
        /*
        Injection des dépendances par
        instanciation statique => new
         */
        DaoImpl dao = new DaoImpl();
        IMetierImpl metier = new IMetierImpl();
        metier.setDao(dao);
        System.out.println("Résultat = "+metier.calcul());
    }
}
