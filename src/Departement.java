import java.util.Objects;

public class Departement {

    private int id,nombreEmployes;
    String nomDepartement;

    public Departement(){}
    public Departement(int id,String nomDepartement,int nombreEmployes){
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nombreEmployes = nombreEmployes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nombreEmployes=" + nombreEmployes +
                ", nomDepartement='" + nomDepartement + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return id == that.id &&  Objects.equals(nomDepartement, that.nomDepartement);
    }


}