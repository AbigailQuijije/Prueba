public class TipoPiedra 
{
    float CALIZA = 1200F;
    float MARMOL = 1423.55F;
    float PIZARRA= 1325F;
    float CUARZITA = 1466.22F;

private final float pesoEspecifico;
//metodo constructor 
TipoPiedra(float pesoEspecifico){
    this.pesoEspecifico=pesoEspecifico;
}

public float getPesoEspecifico(){
    return pesoEspecifico;
}
    
   }
  