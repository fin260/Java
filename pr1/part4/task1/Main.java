package pr1.part4.task1;

public class Main {
    static void sayAboutSeason(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }

    public static void main(String[] args) {
        Season favorite = Season.SUMMER;
        System.out.println("Любимое время года: " + favorite
                + ", средняя температура: " + favorite.getAvgTemperature()
                + ", описание: " + favorite.getDescription());
        sayAboutSeason(favorite);

        System.out.println("--- Все времена года ---");
        for (Season season : Season.values()) {
            System.out.println(season + ": " + season.getAvgTemperature()
                    + " °C, " + season.getDescription());
        }
    }
}
