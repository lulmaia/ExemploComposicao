class DJ {
    private String nome;
    private Equipamento equipamento; // Composição

    public DJ(String nome, Equipamento equipamento) {
        this.nome = nome;
        this.equipamento = equipamento;
    }

    public void tocar() {
        System.out.println(nome + " está tocando com o equipamento " + equipamento);
    }
}