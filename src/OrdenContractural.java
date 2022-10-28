import java.util.Date;

public class OrdenContractural {
    public void setNroOrdenContractural(int nroOrdenContractural) {
        this.nroOrdenContractural = nroOrdenContractural;
    }

    public OrdenContractural(int nroOrdenContractural, int nit, Provedor provedor, Date fechaOrden, double montoTotal, Date fechaEntrega, boolean direcitionAprove) {
        this.nroOrdenContractural = nroOrdenContractural;
        this.nit = nit;
        this.provedor = provedor;
        this.fechaOrden = fechaOrden;
        this.montoTotal = montoTotal;
        this.fechaEntrega = fechaEntrega;
        this.direcitionAprove = direcitionAprove;
    }

    int nroOrdenContractural;
    int nit;
    Provedor provedor;
    Date fechaOrden;
    double montoTotal;
    Date  fechaEntrega;
    List<itemcontract>;
    boolean direcitionAprove;
}
