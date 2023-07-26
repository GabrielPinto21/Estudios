public enum Genero {
    MASCULINO("Masculino"),
    FEMENINO("Femenino"),
    NO_BINARIO("No Binario"),
    OTRO("Otro");

    private final String genero;

    Genero (String genero){
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return this.genero;
    }
}
