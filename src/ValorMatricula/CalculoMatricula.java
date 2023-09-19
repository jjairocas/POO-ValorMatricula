package ValorMatricula;

public class CalculoMatricula {

    String Nombres;
    int NumInscripcion;
    int Patrimonio;
    int EstratoSocial;


    public CalculoMatricula(String nombres, int numInscripcion, int patrimonio, int estratoSocial) {
        Nombres = nombres;
        NumInscripcion = numInscripcion;
        Patrimonio = patrimonio;
        EstratoSocial = estratoSocial;
    }
    int CalcMatricula(){
        double CostMatricula;
        if((Patrimonio>2000000) && (EstratoSocial>3)){
            CostMatricula=50000+(Patrimonio*0.03);
            return (int) CostMatricula;
        }
        else{
            CostMatricula=50000;
            return (int) CostMatricula;
        }
    }
}
