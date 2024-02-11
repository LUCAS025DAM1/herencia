package ejercicio5;

public class DispositivoElectronico {
	 String fabricante;
	    int añoDeFabricacion;

	    public DispositivoElectronico(String fabricante, int añoDeFabricacion) {
	        this.fabricante = fabricante;
	        this.añoDeFabricacion = añoDeFabricacion;
	    }
	}

	interface Telefono {
	    void llamar(String numero);
	    void recibirLlamadas();
	}

	class Smartphone extends DispositivoElectronico implements Telefono {

	    public Smartphone(String fabricante, int añoDeFabricacion) {
	        super(fabricante, añoDeFabricacion);
	    }


	    public void llamar(String numero) {
	        System.out.println("Llamando al número: " + numero);
	    }

	    public void recibirLlamadas() {
	        System.out.println("Recibiendo una llamada");
	    }

	    public void instalarAplicacion(String nombreApp) {
	        System.out.println("Instalando la aplicación: " + nombreApp);
	    }
}