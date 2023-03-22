import java.util.ArrayList;
import java.util.Scanner;

public class Generator {
    
    boolean launched = false;

    public void launch() {
        Generator generator = new Generator();
        if (!launched) {
            int prototype;
            this.launched = true;
            ArrayList<Object> mascotas = new ArrayList<Object>();
            ArrayList<Object> medicamentos = new ArrayList<Object>();
            ArrayList<Object> clientes = new ArrayList<Object>();
            try (Scanner parser = new Scanner(System.in)) {
                String outputChatbox = "¿Qué acción desea realizar? 1 = Leer | 2 = Ingresar | 3 = Editar | 4 = Eliminar";
                System.out.println(outputChatbox);
                prototype = parser.nextInt();
                String nombre;
                String data;
                int indexOftargetElement;
                switch (prototype) {
                    case 1:
                        outputChatbox = "¿Qué tipo de información deseas leer? 1 = Mascota | 2 = Medicamento | 3 = Cliente";
                        System.out.println(outputChatbox);
                        prototype = parser.nextInt();
                        switch (prototype) {
                            case 1:
                                if (mascotas.size() == 0) {
                                    outputChatbox = "No se han agregado mascotas a la lista.";
                                    System.out.println(outputChatbox);
                                    generator.reset();
                                }
                                for (int i = 0; i < mascotas.size(); i++) {
                                    System.out.println(i + ". " + mascotas.get(i));
                                }
                                break;
                            case 2:
                                if (medicamentos.size() == 0) {
                                    outputChatbox = "No se han agregado medicamentos a la lista.";
                                    System.out.println(outputChatbox);
                                    generator.reset();
                                }
                                for (int i = 0; i < medicamentos.size(); i++) {
                                    System.out.println(i + ". " + medicamentos.get(i));
                                }
                                break;
                            case 3:
                                if (clientes.size() == 0) {
                                    outputChatbox = "No se han agregado clientes a la lista.";
                                    System.out.println(outputChatbox);
                                    generator.reset();
                                }
                                for (int i = 0; i < clientes.size(); i++) {
                                    System.out.println(i + ". " + clientes.get(i));
                                }
                                break;
                            default:
                                generator.reset();
                                break;
                        }
                        break;
   
                    case 2:
                        outputChatbox = "¿Qué tipo de dato deseas ingresar? 1 = Mascota | 2 = Medicamento | 3 = Cliente";
                        System.out.println(outputChatbox);
                        prototype = parser.nextInt();
                        String[] dataValues;
                        switch (prototype) {
                            case 1:
                                outputChatbox = "Ingresa el nombre de la mascota:";
                                System.out.println(outputChatbox);
                                nombre = parser.next();
                                outputChatbox = "Ingresa la edad, peso, cédula del cliente, raza y medicamento. Asegurate de separar con coma:";
                                System.out.println(outputChatbox);
                                data = parser.next();
                                dataValues = data.split(",");
                                int edad = Integer.parseInt(dataValues[0]), peso = Integer.parseInt(dataValues[1]), cedula_cliente = Integer.parseInt(dataValues[2]);
                                String raza = dataValues[3], medicamento = dataValues[4];
                                Mascota mascota = new Mascota(mascotas.size(), edad, peso, cedula_cliente, nombre, raza, medicamento);
                                generator.addElement(mascotas, mascota);
                                System.out.println(mascotas.size());
                                break;
                            case 2:
                                outputChatbox = "Ingresa el nombre del cliente:";
                                System.out.println(outputChatbox);
                                nombre = parser.next();
                                outputChatbox = "Ingresa la teléfono, cédula del cliente, apellidos y dirección. Asegurate de separar con coma:";
                                System.out.println(outputChatbox);
                                data = parser.next();
                                dataValues = data.split(",");
                                int telefono = Integer.parseInt(dataValues[0]), cc = Integer.parseInt(dataValues[1]);
                                String apellidos = dataValues[2], direccion = dataValues[3];
                                Cliente cliente = new Cliente(cc, nombre, apellidos, direccion, telefono);
                                generator.addElement(clientes, cliente);
                                System.out.println(mascotas.size());
                                break;
                            case 3:
                                outputChatbox = "Ingresa el nombre del medicamento:";
                                System.out.println(outputChatbox);
                                nombre = parser.next();
                                outputChatbox = "Ingresa la dosis y la descripción. Asegurate de separar con coma:";
                                System.out.println(outputChatbox);
                                data = parser.next();
                                dataValues = data.split(",");
                                int dosis = Integer.parseInt(dataValues[0]);
                                String descripcion = dataValues[1];
                                Medicamento medicamentoClass = new Medicamento(dosis, nombre, descripcion);
                                generator.addElement(medicamentos, medicamentoClass);
                                System.out.println(mascotas.size());
                                break;
                        
                            default:
                                generator.reset();
                                break;
                        }
                        break;
                    case 3:
                        outputChatbox = "¿Qué tipo de información deseas editar? 1 = Mascota | 2 = Cliente | 3 = Medicamento";
                        System.out.println(outputChatbox);
                        prototype = parser.nextInt();
                        switch (prototype) {
                            case 1:
                                if (mascotas.size() == 0) {
                                    outputChatbox = "No se han agregado mascotas a la lista.";
                                    System.out.println(outputChatbox);
                                    generator.reset();
                                }
                                for (int i = 0; i < mascotas.size(); i++) {
                                    System.out.println("(" + i + ")" + mascotas.get(i));
                                }
                                outputChatbox = "Selecciona el indice del elemento que deseas editar:";
                                System.out.println(outputChatbox);
                                indexOftargetElement = parser.nextInt();
                                outputChatbox = "La mascota seleccionada a la cual se le cambiará la información es:";
                                System.out.println(outputChatbox);
                                System.out.println(mascotas.get(indexOftargetElement));
                                outputChatbox = "Ingresa el nombre de la mascota:";
                                System.out.println(outputChatbox);
                                nombre = parser.next();
                                outputChatbox = "Ingresa la edad, peso, cédula del cliente, raza y medicamento. Asegurate de separar con coma:";
                                System.out.println(outputChatbox);
                                data = parser.next();
                                dataValues = data.split(",");
                                int edad = Integer.parseInt(dataValues[0]), peso = Integer.parseInt(dataValues[1]), cedula_cliente = Integer.parseInt(dataValues[2]);
                                String raza = dataValues[3], medicamento = dataValues[4];
                                Mascota mascota = new Mascota(mascotas.size(), edad, peso, cedula_cliente, nombre, raza, medicamento);
                                mascotas.set(indexOftargetElement, mascota);
                                outputChatbox = "Información de la mascota actualizada con satisfacción.";
                                System.out.println(outputChatbox);

                                break;
                            case 2:
                                if (clientes.size() == 0) {
                                    outputChatbox = "No se han agregado clientes a la lista.";
                                    System.out.println(outputChatbox);
                                    generator.reset();
                                }
                                for (int i = 0; i < clientes.size(); i++) {
                                    System.out.println("(" + i + ")" + clientes.get(i));
                                }
                                outputChatbox = "Selecciona el indice del elemento que deseas editar:";
                                System.out.println(outputChatbox);
                                indexOftargetElement = parser.nextInt();
                                outputChatbox = "El cliente seleccionado al cual se le cambiará la información es:";
                                System.out.println(outputChatbox);
                                System.out.println(clientes.get(indexOftargetElement));
                                outputChatbox = "Ingresa el nombre del cliente:";
                                System.out.println(outputChatbox);
                                nombre = parser.next();
                                outputChatbox = "Ingresa la teléfono, cédula del cliente, apellidos y dirección. Asegurate de separar con coma:";
                                System.out.println(outputChatbox);
                                data = parser.next();
                                dataValues = data.split(",");
                                int telefono = Integer.parseInt(dataValues[0]), cc = Integer.parseInt(dataValues[1]);
                                String apellidos = dataValues[2], direccion = dataValues[3];
                                Cliente cliente = new Cliente(cc, nombre, apellidos, direccion, telefono);
                                clientes.set(indexOftargetElement, cliente);
                                outputChatbox = "Información del cliente actualizada con satisfacción.";
                                System.out.println(outputChatbox);
                                
                                break;
                            case 3:
                                if (medicamentos.size() == 0) {
                                    outputChatbox = "No se han agregado medicamentos a la lista.";
                                    System.out.println(outputChatbox);
                                    generator.reset();
                                }
                                for (int i = 0; i < medicamentos.size(); i++) {
                                    System.out.println("(" + i + ")" + medicamentos.get(i));
                                }
                                outputChatbox = "Selecciona el indice del elemento que deseas editar:";
                                System.out.println(outputChatbox);
                                indexOftargetElement = parser.nextInt();
                                outputChatbox = "El medicamento seleccionado al cual se le cambiará la información es:";
                                System.out.println(outputChatbox);
                                System.out.println(medicamentos.get(indexOftargetElement));
                                outputChatbox = "Ingresa el nombre del medicamento:";
                                System.out.println(outputChatbox);
                                nombre = parser.next();
                                outputChatbox = "Ingresa la dosis y la descripción. Asegurate de separar con coma:";
                                System.out.println(outputChatbox);
                                data = parser.next();
                                dataValues = data.split(",");
                                int dosis = Integer.parseInt(dataValues[0]);
                                String descripcion = dataValues[1];
                                Medicamento medicamentoClass = new Medicamento(dosis, nombre, descripcion);
                                medicamentos.set(indexOftargetElement, medicamentoClass);
                                outputChatbox = "Información del medicamentoactualizada con satisfacción.";
                                System.out.println(outputChatbox);
                                
                                break;
                            default:
                                break;
                        }
                        break;
                    case 4:
                        outputChatbox = "¿Qué tipo de información deseas eliminar? 1 = Mascota | 2 = Cliente | 3 = Medicamento";
                        System.out.println(outputChatbox);
                        prototype = parser.nextInt();
                        switch (prototype) {
                            case 1:
                                if (clientes.size() == 0) {
                                    outputChatbox = "No se han agregado clientes a la lista.";
                                    System.out.println(outputChatbox);
                                    generator.reset();
                                }
                                for (int i = 0; i < clientes.size(); i++) {
                                    System.out.println("(" + i + ")" + clientes.get(i));
                                }
                                outputChatbox = "Selecciona el indice del elemento que deseas eliminar:";
                                System.out.println(outputChatbox);
                                indexOftargetElement = parser.nextInt();
                                outputChatbox = "El cliente seleccionado que será eliminado es:";
                                System.out.println(outputChatbox);
                                clientes.remove(indexOftargetElement);
                                outputChatbox = "Cliente con indice (" + indexOftargetElement + ") eliminado satisfactoriamente.";
                                System.out.println(outputChatbox);
                                break;
                            case 2:
                                if (mascotas.size() == 0) {
                                    outputChatbox = "No se han agregado mascotas a la lista.";
                                    System.out.println(outputChatbox);
                                    generator.reset();
                                }
                                for (int i = 0; i < mascotas.size(); i++) {
                                    System.out.println("(" + i + ")" + mascotas.get(i));
                                }
                                outputChatbox = "Selecciona el indice del elemento que deseas eliminar:";
                                System.out.println(outputChatbox);
                                indexOftargetElement = parser.nextInt();
                                outputChatbox = "La mascota seleccionada que será eliminada es:";
                                System.out.println(outputChatbox);
                                mascotas.remove(indexOftargetElement);
                                outputChatbox = "Mascota con indice (" + indexOftargetElement + ") eliminada satisfactoriamente.";
                                System.out.println(outputChatbox);
                                break;
                            case 3:
                                if (medicamentos.size() == 0) {
                                    outputChatbox = "No se han agregado medicamentos a la lista.";
                                    System.out.println(outputChatbox);
                                    generator.reset();
                                }
                                for (int i = 0; i < medicamentos.size(); i++) {
                                    System.out.println("(" + i + ")" + medicamentos.get(i));
                                }
                                outputChatbox = "Selecciona el indice del elemento que deseas eliminar:";
                                System.out.println(outputChatbox);
                                indexOftargetElement = parser.nextInt();
                                outputChatbox = "El medicamento seleccionado que será eliminado es:";
                                System.out.println(outputChatbox);
                                medicamentos.remove(indexOftargetElement);
                                outputChatbox = "Mascota con indice (" + indexOftargetElement + ") eliminada satisfactoriamente.";
                                System.out.println(outputChatbox);
                                break;
                            default:
                                break;
                        }
                        break;
                    default:
                        generator.reset();
                        break;
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        generator.reset();
    }

    public void reset() {
        this.launched = false;
    }

    public void addElement(ArrayList<Object> targetArray, Object prototype) {
        targetArray.add(prototype);
    }

    public void updateAttribute(String classEl, String attribute, String value) {

    }

    // public boolean isElementInArray(ArrayList<Object> targetArray, int desiredIdToCompare) {
    //     boolean isInArray = false;
    //     for (int i = 0; i < targetArray.size(); i++) {
    //         int activeElementId = targetArray.get(i).id;
    //         if (desiredIdToCompare == activeElementId) {
    //             isInArray = true;
    //         }
    //     }
    //     return isInArray;
    // }

    public void deleteClassPrototype() {

    }
}
