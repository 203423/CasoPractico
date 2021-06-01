public class Regla {
    private String regla;
    private String clave;

    public Regla(String clave, String regla) {
        this.clave = clave;
        this.regla = regla;
    }

    public String getRegla() {
        return this.regla;
    }

    public void setRegla(String regla) {
        this.regla = regla;
    }

    public String getClave() {
        return this.clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

}
