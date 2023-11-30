public class Prosit10 {

    public static void main(String[] args){

        DepartementHashSet departementHashSet = new DepartementHashSet();
        Departement departement1=new Departement(1,"i",233);
        Departement departement2=new Departement(2,"g",211);
        Departement departement3=new Departement(3,"k",111);
        Departement departement4=new Departement(4,"m",1000);
        departementHashSet.ajouterDepartement(departement1);
        departementHashSet.ajouterDepartement(departement2);
        departementHashSet.ajouterDepartement(departement3);


        departementHashSet.supprimerDepartement(departement4);
        departementHashSet.displayDepartement();
        System.out.println(departementHashSet.trierDepartementById());

    }
}
