public class FaturaCliente {
    private int id;
    private Cliente cliente;
    private double valor;

    public FaturaCliente(int id, Cliente cliente, double valor) {
        this.id = id;
        this.cliente = cliente;
        this.valor = valor;
    }

    public FaturaCliente(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorComDesconto() {
        if (cliente != null) {
            double desconto = cliente.getDesconto();
            return valor - (valor * desconto / 100);
        }
        return valor;
    }

    @Override
    public String toString() {
        String nome = (cliente != null) ? cliente.getNome() : "N/A";
        int clienteId = (cliente != null) ? cliente.getId() : 0;
        double desconto = (cliente != null) ? cliente.getDesconto() : 0.0;
        return "Fatura [id=" + id + ", cliente=" + nome + "(" + clienteId + ")(" + desconto + "%), valor=" + valor
                + " ]";
    }
}
