import java.util.Stack;

class Accions {
    int id;
    String accion;

    public Accions(int id, String accion) {
        this.id = id;
        this.accion = accion;
    }

    @Override
    public String toString() {
        return "Accion{id=" + id + ", accion='" + accion + "'}";
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear la pila de acciones
        Stack<Accions> pila = new Stack<>();

        // Agregar las acciones
        pila.push(new Accions(1, "Escribir título"));
        pila.push(new Accions(2, "Escribir párrafo"));
        pila.push(new Accions(3, "Borrar párrafo"));

        // Deshacer la última acción (pop)
        Accions deshecha = pila.pop();
        System.out.println("Acción deshecha: " + deshecha);

        // Mostrar qué acción se desharía si vuelvo a deshacer (peek)
        if (!pila.isEmpty()) {
            Accions siguienteDeshacer = pila.peek();
            System.out.println("Siguiente acción a deshacer (peek): " + siguienteDeshacer);
        } else {
            System.out.println("No hay más acciones para deshacer (pila vacía).");
        }

        // Mostrar todas las acciones que quedan en la pila
        System.out.println("Acciones restantes en la pila:");
        for (Accions a : pila) {
            System.out.println(a);
        }
    }
}