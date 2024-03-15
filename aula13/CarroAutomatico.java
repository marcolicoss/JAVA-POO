
package aula13;


public class CarroAutomatico extends Carro implements IAutomatico{

    @Override
    public void mudaMarchaAutomaticamente() {
        System.out.println("Carro Mudando marcha automaticamente");
    }
    
}
