package model;
//Composicion

public class Direccion {

    //Encapsulamiento
    private String calle;
    private String ciudad;
    private String region;

    //Parametros
    public Direccion(String calle, String ciudad, String region){
        this.calle = calle;
        this.ciudad=ciudad;
        this.region=region;
    }
    //Sin parametros
    public Direccion(){
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
