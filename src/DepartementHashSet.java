import java.util.*;

public class DepartementHashSet implements IDepartement<Departement>{

    Set<Departement> HashSet=new HashSet<>();

    public void ajouterDepartement(Departement d){

        HashSet.add(d);


    }
    public boolean rechercherDepartement(String nom){
        for(Departement departement :HashSet){
            if(departement.getNomDepartement().equals(nom)){
                return true;
            }
        }
        return false;
    }
    public boolean rechercherDepartement(Departement d){
        return  HashSet.contains(d);
    }
    public void supprimerDepartement(Departement d){
        while(HashSet.remove(d)){
            System.out.println("departement supprimé avec succes");
        }
        System.out.println("echec lors de la suppression de la departement");


    }
    public void displayDepartement(){
        for(Departement departement:HashSet){
            System.out.println(departement.toString());
        }

    }
    Comparator<Departement> compar1 = new Comparator<Departement>() {
        @Override
        public int compare(Departement D1, Departement D2) {
            return D1.getId() -D2.getId();
        }
    };
    public TreeSet<Departement>trierDepartementById(){

        TreeSet<Departement> SortedSet = new TreeSet<>(compar1);
        SortedSet.addAll(HashSet);
        return SortedSet;
    }
}
