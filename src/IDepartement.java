import java.util.TreeSet;

public interface IDepartement<Departement> {

    public void ajouterDepartement(Departement d);
    public boolean rechercherDepartement(String nom);
    public boolean rechercherDepartement(Departement d);
    public void supprimerDepartement(Departement d);
    public void displayDepartement();
    public TreeSet<Departement> trierDepartementById();


}
