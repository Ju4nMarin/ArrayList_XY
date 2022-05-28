
import java.text.DecimalFormat;


public class Punto {

    private float PuntoX1;
    private float PuntoY1;
    private float PuntoX2;
    private float PuntoY2;
    private float PuntoX;
    private String ID;
    
    public Punto() {
    }

    public Punto(float PuntoX1, float PuntoY1, float PuntoX2, float PuntoY2, float PuntoX, String ID) {
        this.PuntoX1 = PuntoX1;
        this.PuntoY1 = PuntoY1;
        this.PuntoX2 = PuntoX2;
        this.PuntoY2 = PuntoY2;
        this.PuntoX = PuntoX;
        this.ID = ID;
    }
    

    public float getPuntoX1() {
        return PuntoX1;
    }

    public float getPuntoY1() {
        return PuntoY1;
    }

    public float getPuntoX2() {
        return PuntoX2;
    }

    public float getPuntoY2() {
        return PuntoY2;
    }
    
    public float getPuntoX() {
        return PuntoX;
    }
    
     public void setPuntoX(float PuntoX) {
        this.PuntoX = PuntoX;
    }

    public void setPuntoX1(float PuntoX1) {
        this.PuntoX1 = PuntoX1;
    }

    public void setPuntoY1(float PuntoY1) {
        this.PuntoY1 = PuntoY1;
    }

    public void setPuntoX2(float PuntoX2) {
        this.PuntoX2 = PuntoX2;
    }

    public void setPuntoY2(float PuntoY2) {
        this.PuntoY2 = PuntoY2;
    }

    

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public float getM(){
        DecimalFormat formato1 = new DecimalFormat("#.00");
        float m = (PuntoY2 - PuntoY1)/(PuntoX2 - PuntoX1);
        formato1.format(m);
        return m;
    }
    
    public String getVer_EcuacionDeRecta(){
        String Ecu = "Y = ("+getM()+")"+PuntoX+"+("+PuntoY2+")";
        
        return Ecu;
    }
    
    public String getGenerarID() {
        int NumRandom = ((int) Math.floor(Math.random() * (1000)));
        int NumRandom2 = ((int) Math.floor(Math.random() * (1000)));
        int LetRandom = 0;
        int LetRandom2 = 0;
        char lDni = getLetra(LetRandom);
        char lDni2 = getLetra(LetRandom2);

        return ID = Integer.toString(NumRandom) + lDni + (NumRandom2) + lDni2;
    }

    public char getLetra(int LetRandom) {
        int Letra = ((int) Math.floor(Math.random() * (26)));
        char letras[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        return letras[Letra];
    }

}
