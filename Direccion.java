public class Direccion{
    private String calle;
    private String no_casa;
    private String colonia;
    private String ciudad;
    private String estado;
    private String pais;
    private String codigoPostal;

    public Direccion(String calle, String no_casa, String colonia, String ciudad, String estado, String pais, String codigoPostal){
        this.calle = calle;
        this.no_casa = no_casa;
        this.colonia = colonia;
        this.ciudad = ciudad;
        this.estado = estado;
        this.pais = pais;
        this.codigoPostal = codigoPostal;
    }

    public String getCalle(){
        return this.calle;
    }

    public String getNoCasa(){
        return this.no_casa;
    }

    public String getColonia(){
        return this.colonia;
    }

    public String getCiudad(){
        return this.ciudad;
    }

    public String getEstado(){
        return this.estado;
    }

    public String getPais(){
        return this.pais;
    }

    public String getCodigoPostal(){
        return this.codigoPostal;
    }

    public void setCalle(String calle){
        this.calle = calle;
    }

    public void setNoCasa(String no_casa){
        this.no_casa = no_casa;
    }

    public void setColonia(String colonia){
        this.colonia = colonia;
    }

    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public void setCodigoPostal(String codigoPostal){
        this.calle = codigoPostal;
    }

    @Override
    public String toString(){
        return String.format("Calle y No de Casa: %s %s. \nColonia: %s. \nCiudad: %s. Estado: %s. País: %s. \nC.P.:%S", this.calle, this.no_casa, this.colonia, this.ciudad, this.estado, this.pais, this.codigoPostal);
    }
}