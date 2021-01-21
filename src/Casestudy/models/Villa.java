package Casestudy.models;

public class Villa extends Services {
    private String villaStandar;
    private String poolArea;
    private String floors;

    public Villa(String id, String nameServices, String area, String price,
                 String people, String type, String villaStandar, String poolArea, String floors) {
        super(id, nameServices, area, price, people, type);
        this.villaStandar = villaStandar;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public Villa(String villaStandar, String poolArea, String floors) {
        this.villaStandar = villaStandar;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "villaStandar='" + villaStandar + '\'' +
                ", poolArea='" + poolArea + '\'' +
                ", floors='" + floors + '\'' +
                '}';
    }

    @Override
    public String showInfo() {
        return villaStandar+", "+ poolArea+ ", " + floors;
    }
}
