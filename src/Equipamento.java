class Equipamento {
    private String tipo;
    private String marca;

    public Equipamento(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return tipo + " da marca " + marca;
    }
}