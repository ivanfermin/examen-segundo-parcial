public class ItemContrato extends Item{
    float cantidadDespachada;

    @Override
    public String toString() {
        return "ItemContrato{" +
                "cantidadDespachada=" + cantidadDespachada +
                '}';
    }

    public void setCantidadDespachada(float cantidadDespachada) {
        this.cantidadDespachada = cantidadDespachada;
    }

    public float getCantidadDespachada() {
        return cantidadDespachada;
    }

    public ItemContrato(float cantidadDespachada) {
        this.cantidadDespachada = cantidadDespachada;
    }
}
