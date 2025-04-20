public class Participante {
    private int votoInternet;
    private int votoRadio;
    private int votoTelevision;
    private int votoTotalParticipante;
    private double costoCampania;
    private double costoInternet;
    private double costoRadio;
    private double costoTelevision;

    public Participante() {
    }

    public Participante(int votoInternet, int votoRadio, int votoTelevision, int votoTotalParticipante, double costoCampania) {
        this.votoInternet = votoInternet;
        this.votoRadio = votoRadio;
        this.votoTelevision = votoTelevision;
        this.votoTotalParticipante = votoTotalParticipante;
        this.costoCampania = costoCampania;
    }

    public int getVotoInternet() {
        return votoInternet;
    }

    public void setVotoInternet(int votoInternet) {
        this.votoInternet = votoInternet+getVotoInternet();
    }

    public int getVotoRadio() {
        return votoRadio;
    }

    public void setVotoRadio(int votoRadio) {
        this.votoRadio = votoRadio+getVotoRadio();
    }

    public int getVotoTelevision() {
        return votoTelevision;
    }

    public void setVotoTelevision(int votoTelevision) {
        this.votoTelevision = votoTelevision+getVotoTelevision();
    }

    public int getVotoTotalParticipante() {
        return votoTotalParticipante;
    }

    public void setVotoTotalParticipante(int votoTotalParticipante) {
        this.votoTotalParticipante = votoTotalParticipante;
    }

    public double getCostoCampania() {
        campaniaCosto();
        return costoCampania;
    }

    public void setCostoCampania(double costoCampania) {
        this.costoCampania = costoCampania;
    }

    public double getCostoInternet() {
        costoInternet();
        return costoInternet;
    }

    public void setCostoInternet(double costoInternet) {
        this.costoInternet = costoInternet;
    }

    public double getCostoRadio() {
        costoRadio();
        return costoRadio;
    }

    public void setCostoRadio(double costoRadio) {
        this.costoRadio = costoRadio;
    }

    public double getCostoTelevision() {
        costoTelevision();
        return costoTelevision;
    }

    public void setCostoTelevision(double costoTelevision) {
        this.costoTelevision = costoTelevision;
    }

    public void totalVotos(){
        votoTotalParticipante = getVotoInternet()+getVotoRadio()+getVotoTelevision();
    }
    public void costoInternet(){
        costoInternet = getVotoInternet()*700000;
    }
    public void costoRadio(){
        costoRadio = getVotoRadio()*200000;
    }
    public void costoTelevision(){
        costoTelevision = getVotoTelevision()*600000;
    }
    public void campaniaCosto(){
        costoCampania = getCostoInternet()+getCostoRadio()+getCostoTelevision();
    }
    public void reiniciar(){
        this.votoInternet = 0;
        this.votoRadio = 0;
        this.votoTelevision = 0;
        this.votoTotalParticipante = 0;
        this.costoCampania = 0;
    }

    @Override
    public String toString() {
        return
                "\nVotos Internet: " + votoInternet +
                "\nVotos Radio: " + votoRadio +
                "\nVotos Television: " + votoTelevision +
                "\nVotos Totales: " + votoTotalParticipante;
    }
}
