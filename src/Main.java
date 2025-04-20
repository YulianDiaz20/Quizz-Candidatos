import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Participante>lstParticipantes = new ArrayList<>();
        Scanner dato = new Scanner(System.in);
        int opc,can,pub;
        int votosInternet=0, votosRadio=0, votosTelevision=0, votosTotales=0,porInternet, porRadio, porTelev;
        double costoInternet=0, costoRadio=0, costotelevision=0, costoTotales=0;
        boolean m=true, n=true;

        lstParticipantes.add(new Participante());
        lstParticipantes.add(new Participante());
        lstParticipantes.add(new Participante());
        do{
        System.out.println(
                "====================\n        MENÚ        \n===================="
                +"\nVotar Candidato ->(1)"
                +"\nCosto Campaña Candidato ->(2)"
                +"\nVaciar Urnas ->(3)"
                +"\nVotos totales ->(4)"
                +"\nPorcentaje de Votos ->(5)"
                +"\nCosto Total Campaña ->(6)"
                +"\nFinalizar ->(7)"
        );
        opc = dato.nextInt();
        switch (opc){
            case 1 ->{
                do{
                System.out.println(
                        ">>>|Selecciona Candidato|<<<\n[1]-[2]-[3]"
                );
                can = dato.nextInt();
                do {
                    System.out.println(
                            "-}Influenciado por{-"
                                    + "\n->(1) Internet."
                                    + "\n->(2) Radio."
                                    + "\n->(3) Television."
                    );
                    pub = dato.nextInt();
                    if(pub!=1 && pub!=2 && pub!=3){
                        System.out.println("Ingresa una opción valida...");
                    }
                }while(pub!=1 && pub!=2 && pub!=3);
                switch (can){
                    case 1->{
                        if(pub==1){
                            lstParticipantes.get(0).setVotoInternet(1);
                        }else if(pub==2){
                            lstParticipantes.get(0).setVotoRadio(1);
                        }else if(pub==3) {
                            lstParticipantes.get(0).setVotoTelevision(1);
                        }
                    }
                    case 2->{
                        if(pub==1){
                            lstParticipantes.get(1).setVotoInternet(1);
                        }else if(pub==2){
                            lstParticipantes.get(1).setVotoRadio(1);
                        }else if(pub==3) {
                            lstParticipantes.get(1).setVotoTelevision(1);
                        }
                    }
                    case 3->{
                        if(pub==1){
                            lstParticipantes.get(2).setVotoInternet(1);
                        }else if(pub==2){
                            lstParticipantes.get(2).setVotoRadio(1);
                        }else if(pub==3) {
                            lstParticipantes.get(2).setVotoTelevision(1);
                        }
                    }
                    default -> {
                        System.out.println("Ingresa un candidato valido....");
                        n=false;
                    }
                }}while(n==false);
            }
            case 2->{
                n=true;
                do{
                System.out.println(
                        ">>>|Selecciona Candidato|<<<\n[1]-[2]-[3]"
                );
                can = dato.nextInt();
                switch (can){
                    case 1->{
                        System.out.println(
                                "--------------------"
                                        +"\nCosto por Internet: $"+lstParticipantes.get(0).getCostoInternet()
                                        +"\nCosto por Radio: $"+lstParticipantes.get(0).getCostoRadio()
                                        +"\nCosto por Televisión: $"+lstParticipantes.get(0).getCostoTelevision()
                                        +"\nCosto Total: $"+lstParticipantes.get(0).getCostoCampania()
                        );
                    }
                    case 2->{
                        System.out.println(
                                "--------------------"
                                        +"\nCosto por Internet: $"+lstParticipantes.get(1).getCostoInternet()
                                        +"\nCosto por Radio: $"+lstParticipantes.get(1).getCostoRadio()
                                        +"\nCosto por Televisión: $"+lstParticipantes.get(1).getCostoTelevision()
                                        +"\nCosto Total: $"+lstParticipantes.get(1).getCostoCampania()
                        );
                    }
                    case 3->{
                        System.out.println(
                                "--------------------"
                                        +"\nCosto por Internet: $"+lstParticipantes.get(2).getCostoInternet()
                                        +"\nCosto por Radio: $"+lstParticipantes.get(2).getCostoRadio()
                                        +"\nCosto por Televisión: $"+lstParticipantes.get(2).getCostoTelevision()
                                        +"\nCosto Total: $"+lstParticipantes.get(2).getCostoCampania()
                        );
                    }
                    default -> {
                        System.out.println("Ingrese una opción valida....");
                        n=false;
                    }
                }}while (n==false);
            }
            case 3->{
                for(int i=1;i<=3;i++){
                    lstParticipantes.get(i-1).reiniciar();
                    System.out.println("Se vacio el candidato "+i);
                }
            }
            case 4->{
                for(int i=1;i<=3;i++){
                    System.out.println(
                            "--------------------\nCANDIDATO "+i+"\n--------------------"
                            +lstParticipantes.get(i-1).toString()
                    );
                }
                for(int i=1;i<=3;i++){
                    votosInternet = votosInternet+lstParticipantes.get(i-1).getVotoInternet();
                    votosRadio = votosRadio+lstParticipantes.get(i-1).getVotoRadio();
                    votosTelevision = votosTelevision+lstParticipantes.get(i-1).getVotoTelevision();
                    votosTotales = votosInternet+votosRadio+votosTelevision;
                }
                System.out.println(
                        "--------------------\nTOTAL\n--------------------"
                        +"\nTotal Votos Internet: "+votosInternet
                        +"\nTotal Votos Radio: "+votosRadio
                        +"\nTotal Votos Televisión: "+votosTelevision
                        +"\nTotal Votos: "+votosTotales
                );
                votosInternet = 0;
                votosRadio = 0;
                votosTelevision = 0;
                votosTotales = 0;
            }
            case 5->{
                for(int i=1;i<=3;i++){
                    if(lstParticipantes.get(i-1).getVotoTotalParticipante()==0){
                        porInternet=1;
                    }else{
                        porInternet=lstParticipantes.get(i-1).getVotoTotalParticipante();
                    }
                    if(lstParticipantes.get(i-1).getVotoTotalParticipante()==0){
                       porRadio=1;
                    }else{
                        porRadio=lstParticipantes.get(i-1).getVotoTotalParticipante();
                    }
                    if(lstParticipantes.get(i-1).getVotoTotalParticipante()==0){
                        porTelev=1;
                    }else{
                        porTelev=lstParticipantes.get(i-1).getVotoTotalParticipante();
                    }
                    System.out.println(
                            "--------------------\nCANDIDATO "+i+"\n--------------------"
                            +"\nVotos Internet: "+(lstParticipantes.get(i-1).getVotoInternet()*100)/porInternet
                            +"%\nVotos Radio: "+(lstParticipantes.get(i-1).getVotoRadio()*100)/porRadio
                            +"%\nVotos Televisio: "+(lstParticipantes.get(i-1).getVotoTelevision()*100)/porTelev
                            +"%"
                    );
                }
                for(int i=1;i<=3;i++){
                    votosInternet = votosInternet+lstParticipantes.get(i-1).getVotoInternet();
                    votosRadio = votosRadio+lstParticipantes.get(i-1).getVotoRadio();
                    votosTelevision = votosTelevision+lstParticipantes.get(i-1).getVotoTelevision();
                    votosTotales = votosInternet+votosRadio+votosTelevision;
                }
                if(votosTotales==0){
                    votosTotales=1;
                }
                System.out.println(
                        "--------------------\nTOTAL\n--------------------"
                        +"\nVotos Internet: "+(votosInternet*100)/votosTotales
                        +"%\nVotos Radio: "+(votosRadio*100)/votosTotales
                        +"%\nVotos Televisión: "+(votosTelevision*100)/votosTotales
                        +"%\nCandidato 1: "+(lstParticipantes.get(0).getVotoTotalParticipante()*100)/votosTotales
                                +"%\nCandidato 2: "+(lstParticipantes.get(1).getVotoTotalParticipante()*100)/votosTotales
                                +"%\nCandidato 3: "+(lstParticipantes.get(2).getVotoTotalParticipante()*100)/votosTotales
                        +"%"
                );
                votosInternet = 0;
                votosRadio = 0;
                votosTelevision = 0;
                votosTotales = 0;
            }
            case 6->{
                costoTotales = lstParticipantes.get(0).getCostoCampania()+lstParticipantes.get(1).getCostoCampania()+lstParticipantes.get(2).getCostoCampania();
                System.out.println(
                        "Costo campaña total: $"+costoTotales
                );

            }
            case 7->{
                System.out.println("Finalización completa...");
                m=false;
            }
            default -> {
                System.out.println("Porfavor ingrese una opción valida....");
            }
        }}while(m==true);
    }
}