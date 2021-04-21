import static org.junit.jupiter.api.Assertions.*;

class VectorHeapTest {

    @org.junit.jupiter.api.Test
    void add() {

        Pacientes siguientePaciente;

        VectorHeap<Pacientes> Pacientes = new VectorHeap<Pacientes>();

        Pacientes nuevoPaciente = new Pacientes("Juan Perez", "vih", "A");
        Pacientes.add(nuevoPaciente);

        assertEquals(false,Pacientes.isEmpty(), "Respuesta false no esta vacio");


    }

    @org.junit.jupiter.api.Test
    void remove() {

        Pacientes siguientePaciente;

        VectorHeap<Pacientes> Pacientes = new VectorHeap<Pacientes>();

        Pacientes nuevoPaciente = new Pacientes("Javier", "coronavirus", "A");
        Pacientes.add(nuevoPaciente);
        siguientePaciente = Pacientes.remove();

        assertEquals(true,Pacientes.isEmpty(), "Respuesta true esta vacio");

    }

    @org.junit.jupiter.api.Test
    void getFirst() {

        VectorHeap<Pacientes> Pacientes = new VectorHeap<Pacientes>();

        Pacientes nuevoPaciente = new Pacientes("Leo", "gripe", "E");
        Pacientes.add(nuevoPaciente);
        String expected = "Leo";
        String result = Pacientes.getFirst().getNombre();

        assertEquals(expected, result);

    }
}