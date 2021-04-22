public class Telefono {

    private Integer prefijo;
    private Integer area;
    private Integer numero;

    public Telefono(Integer prefijo, Integer area, Integer numero) {
        this.prefijo = prefijo;
        this.area = area;
        this.numero = numero;
    }

    public Integer getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(Integer prefijo) {
        this.prefijo = prefijo;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
