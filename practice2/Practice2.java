package practice2;
public class Practice2 {

    public static void main(String[] args) {

        // Instancia de la clase Country
        Country myCountry = new Country("Ecuador",
                "Quito",
                17_900_000,
                256_370,
                "USD");
                
        System.out.println("--- PAIS ANTES DE ACTUALIZAR ---");
        System.out.println(myCountry.getInformation());
        System.out.println("Densidad Poblacional: " + myCountry.calculatePopulationDensity());

        myCountry.setCurrency("EUR");
        myCountry.setCapital("Guayaquil");
        myCountry.setPopulation(18_000_000);

        System.out.println("--- PAIS DESPUES DE ACTUALIZAR ---");
        System.out.println(myCountry.getInformation());
        System.out.println("Densidad Poblacional: " + myCountry.calculatePopulationDensity());


    }
}
