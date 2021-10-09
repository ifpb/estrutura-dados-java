public class No {

    Object carga;
    No prox;

    public No(Object carga){
        this.carga = carga;
    }

    public No(Object carga, No prox) {
        this.carga = carga;
        this.prox = prox;
    }

    public String toString() {
        return String.valueOf(this.carga);
    }

}