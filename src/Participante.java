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

    public Participante(int votoInternet, int votoRadio, int votoTelevision, int votoTotalParticipante, double costoCampaña) {
        this.votoInternet = votoInternet;
        this.votoRadio = votoRadio;
        this.votoTelevision = votoTelevision;
        this.votoTotalParticipante = votoTotalParticipante;
        this.costoCampania = costoCampaña;
    }

    public int getVotoInternet() {
        return votoInternet;
    }

    public void setVotoInternet(int votoInternet) {
        this.votoInternet = votoInternet;
    }

    public int getVotoRadio() {
        return votoRadio;
    }

    public void setVotoRadio(int votoRadio) {
        this.votoRadio = votoRadio;
    }

    public int getVotoTelevision() {
        return votoTelevision;
    }

    public void setVotoTelevision(int votoTelevision) {
        this.votoTelevision = votoTelevision;
    }

    public int getVotoTotalParticipante() {
        return votoTotalParticipante;
    }

    public void setVotoTotalParticipante(int votoTotalParticipante) {
        this.votoTotalParticipante = votoTotalParticipante;
    }

    public double getCostoCampaña() {
        return costoCampania;
    }

    public void setCostoCampaña(double costoCampaña) {
        this.costoCampania = costoCampaña;
    }

    public double getCostoInternet() {
        return costoInternet;
    }

    public void setCostoInternet(double costoInternet) {
        this.costoInternet = costoInternet;
    }

    public double getCostoRadio() {
        return costoRadio;
    }

    public void setCostoRadio(double costoRadio) {
        this.costoRadio = costoRadio;
    }

    public double getCostoTelevision() {
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
    public void campañaCosto(){
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
        return "Participante{" +
                "votoInternet=" + votoInternet +
                ", votoRadio=" + votoRadio +
                ", votoTelevision=" + votoTelevision +
                ", votoTotalParticipante=" + votoTotalParticipante +
                ", costoCampaña=" + costoCampania +
                '}';
    }
}
