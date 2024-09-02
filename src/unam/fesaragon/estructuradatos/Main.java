package unam.fesaragon.estructuradatos;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de Integer
        ListaDoblementeLigada<Integer> enteros = new ListaDoblementeLigada<>();

        // Agregar elementos según el ejemplo
        // Agregar al inicio el 50
        enteros.agregar_al_inicio(50);
        // Agregar al final el 60
        enteros.agregar_al_final(60);
        // Agregar al final el 65
        enteros.agregar_al_final(65);
        // Agregar al final el 70
        enteros.agregar_al_final(70);
        // Agregar al final el 80
        enteros.agregar_al_final(80);
        // Agregar al final el 90
        enteros.agregar_al_final(90);

        // Imprimir el contenido
        System.out.println("Contenido de la lista:");
        enteros.transversal();

        // Eliminar el de la posición 2
        enteros.eliminar(2);

        // Volver a imprimir el contenido
        System.out.println("\nLista después de eliminar el elemento en la posición 2:");
        enteros.transversal();

        // Actualizar el cuarto elemento a 88
        enteros.actualizar(enteros.obtener(4), 88);

        // Volver a imprimir el contenido
        System.out.println("\nLista después de actualizar el cuarto elemento a 88:");
        enteros.transversal();

        // Buscar el valor 80 e imprimir su posición
        int posicion = enteros.buscar(80);
        System.out.println("\nEl valor 80 se encuentra en la posición: " + posicion);

    }
}
