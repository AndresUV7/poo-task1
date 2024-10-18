package practice2;
import java.util.Currency;

//Clase Pais
public class Country {
    // atributo nombre
    private String name;
    // Atributo capital
    private String capital;
    // Atributo poblacion
    private int population;
    // Atributo superficie
    private int area;
    // Atributo moneda (clase Currency para divisas)
    private Currency currency;

    // Constructor
    public Country(String name,
            String capital,
            int population,
            int area,
            String currency) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
        this.currency = Currency.getInstance(currency);
    }

    // Método obtenerInformacion()
    public String getInformation() {
        return "Nombre: "
                + this.name
                + "\nCapital: "
                + this.capital
                + "\nPoblacion: "
                + this.population +" hab."
                + "\nArea: "
                + this.area +" km²."
                + "\nMoneda: "
                + this.currency;
    }

    // Método actualizarCapital()
    public void setCapital(String newCapital) {
        this.capital = newCapital;
    }

    // Método actualizarPoblacion()
    public void setPopulation(int newPopulation) {
        this.population = newPopulation;
    }

    // Método actualizarMoneda()
    public void setCurrency(String newCurrency) {
        // Actualiza moneda por el código de la ISO 4217
        this.currency = Currency.getInstance(newCurrency);
    }

    // Método calcularDensidadPoblacional()
    public double calculatePopulationDensity() {
        // Fórmula para calcular la densidad poblacional
        return Math
        .round((this.population / this.area) * 100.0)
        / 100.0;
    }

}