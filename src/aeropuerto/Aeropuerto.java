package aeropuerto;

import java.util.ArrayList;

public class Aeropuerto {
  private String nombre;
  private String ciudad;
  private String pais;
  private ArrayList<Compania> companias;

  public Aeropuerto(String nombre, String ciudad, String pais) {
    this.nombre = nombre;
    this.ciudad = ciudad;
    this.pais = pais;
    this.companias = new ArrayList<>();
  }

  public String getnombre() {
    return nombre;
  }

  public String getCiudad() {
    return ciudad;
  }

  public String getPais() {
    return pais;
  }

  public ArrayList<Compania> getCompanias() {
    return companias;
  }

  // agregar una compañía
  public void agregarCompania(Compania compania) {
    companias.add(compania);
  }

  @Override
  public String toString() {
    return nombre + " (" + ciudad + ", " + pais + ")" + " - Compañías: " + companias.size();
  }

  // agregar clase abstracta a aeropuerto (mejor dicho,convertirlo)

}


