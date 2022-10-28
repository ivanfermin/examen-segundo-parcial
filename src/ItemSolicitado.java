public class ItemSolicitado extends Item{
    int codigoUNIv;

    @Override
    public String toString() {
        return "ItemSolicitado{" +
                "codigoUNIv=" + codigoUNIv +
                ", nombre='" + nombre + '\'' +
                ", cantidadSolicitada=" + cantidadSolicitada +
                ", unidadMedida='" + unidadMedida + '\'' +
                ", valorUn=" + valorUn +
                ", valorTOT=" + valorTOT +
                '}';
    }

    public void setCodigoUNIv(int codigoUNIv) {
        this.codigoUNIv = codigoUNIv;
    }

    public int getCodigoUNIv() {
        return codigoUNIv;
    }
}
