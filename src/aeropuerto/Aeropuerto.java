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
  public static void main(String[] args) {
    Vuelo vuelo1 = new Vuelo("AV123", "Bogotá", "Miami", 500.0, 150);
    Vuelo vuelo2 = new Vuelo("AV456", "Bogotá", "Madrid", 800.0, 200);
    Vuelo vuelo3 = new Vuelo("AV789", "Rionegro", "Londres", 900.0, 180);
    Compania compania1 = new Compania("Avianca");
    Compania compania2 = new Compania("Latam");
    compania1.agregarVuelo(vuelo1);
    compania1.agregarVuelo(vuelo2);
    compania2.agregarVuelo(vuelo3);
    Aeropuerto aeropuerto = new Aeropuerto("El Dorado", "Bogotá", "Colombia");
    aeropuerto.agregarCompania(compania1);
    aeropuerto.agregarCompania(compania2);
    for (Compania compañia : aeropuerto.getCompanias()) {
      System.out.println("Compañia: " + compañia.getNombre());
      for (Vuelo vuelo : compañia.getVuelos()) {
        System.out.println("Vuelo: " + vuelo.getIdentificador() + " - " + vuelo.getCiudadOrigen()
            + " -> " + vuelo.getCiudadDestino());
      }

    }
  }
}

