public class Coche {
    String matricula;
    int anyoMat;

    public Coche (String matricula, int anyo){
        this.matricula = matricula;
        this.anyoMat = anyo;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public int getanyoMat(){
        return this.anyoMat;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setanyo( int anyo){
        this.anyoMat = anyo;
    }
    


}
