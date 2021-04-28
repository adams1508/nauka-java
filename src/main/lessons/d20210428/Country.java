package main.lessons.d20210428;

public class Country {
    private String name;
    private long population;
    private double areaInKm;

    public Country(String name, long population, double areaInKm ){
        this.name= name;
        this.population= population;
        this.areaInKm= areaInKm;
    }

    public String getName(){
        return this.name;
    }

    public long getPopulation(){
        return this.population;
    }

    public double getAreaInKm() {
        return this.areaInKm;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setPopulation(long population){
        this.population= population;
    }

    public void setAreaInKm(double areaInKm){
        this.areaInKm= areaInKm;
    }
}




