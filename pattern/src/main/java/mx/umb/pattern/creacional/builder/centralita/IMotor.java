package mx.umb.pattern.creacional.builder.centralita;

public interface IMotor {

    String consumirCombustible();
    String inyectarCombustible(int cantidad);
    String realizarEscape();
    String realizarExpansion();
    
}
