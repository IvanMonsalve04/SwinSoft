package view;

public interface CustomEvent {
    public void retornarLogIn(String usuario, String contrasenia);
    public void retornarImpresionPersonas(String nombre, String apellido, String sexo, String identificacion, int cantidadNinos, int cantidadAdultos);
    public void retornarCalculo(int cocaCola, int agua, int jugo, int sandwitch, int cerveza, int empanada);
    public void retornarCalculoQuiosco(int cantidadTraje, int cantidadGafas, int cantidadAletas, int cantidadGorros, int cantidadProtector, int cantidadProtectorCelular);
    public void retornarCalculoFactura(String sendData);
}


