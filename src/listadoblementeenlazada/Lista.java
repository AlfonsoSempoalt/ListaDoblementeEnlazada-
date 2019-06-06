 
package listadoblementeenlazada;

/**
 *
 * @author Alfonso Sempoalt
 */
public class Lista {
   
    public static void main(String[] args) {
        ListaDoblementeEnlazada listita = new ListaDoblementeEnlazada();
        listita.agregarInicio(25);
        listita.agregarInicio(34);
        listita.agregarInicio(87);
        listita.agregarFinal(73);
        listita.agregarFinal(46);
        System.out.println("Tamaño: "+listita.getTamaño());
        listita.imprimirListaInicioFin();
        listita.imprimirListaFinInicio();
        listita.eliminarPos(3);
        listita.actualizarDato(1, 88);
        listita.imprimirListaInicioFin();
        System.out.println("Contiene el 25: "+ listita.contiene(25));
        System.out.println("Buscar la posición del 73: " + listita.buscarPos(73));
        System.out.println("Buscar la posición del 34: " + listita.buscarPos(34));
        listita.vaciar();
        System.out.println("Tamaño: "+ listita.getTamaño());
    }
    
}
