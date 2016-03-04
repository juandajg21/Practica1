
package practica1;

import java.util.Scanner;

public class Practica1 {

    public static void main(String[] args) {
        
        Libro Libros[] = new Libro[100];
        PrestamoLibro Prestamo[] = new PrestamoLibro[100];
        Scanner lector = new Scanner(System.in);
        String buscar=null;
        int opc, opci, opcio, opcion=0, cont1=0, cont2=0, aux1=-1, cant1;
        
        do{
            
          System.out.println("\nMenú Inicial\n");
          System.out.println("1. Gestionar Información de los libros");
          System.out.println("2. Gestión de préstamos");
          System.out.println("3. Salir");
          System.out.print("Digite la opción: ");
          opc = lector.nextInt();
          
          switch (opc){
              case 1:
                  
                  do{
                    System.out.println("\nGestión de Libros\n");
                    System.out.println("1. Ingresar Libro");
                    System.out.println("2. Actualizar Libro");
                    System.out.println("3. Eliminar Libro");
                    System.out.println("4. Buscar Libro");
                    System.out.println("5. Regresar al menú inicial");
                    System.out.print("Digite la opción: ");
                    opci = lector.nextInt();
                    
                    switch (opci){
                        
                        case 1:
                            Libros[cont1] = new Libro();
                            System.out.print("Digite el nombre del libro: ");
                            Libros[cont1].setNombre(lector.next());
                            
                            System.out.print("Digite el autor del libro: ");
                            Libros[cont1].setAutor(lector.next());
                            
                            System.out.print("Digite el año de publicación del libro: ");
                            Libros[cont1].setPublicacion(lector.next());
                            
                            System.out.print("Digite el código del libro: ");
                            Libros[cont1].setCodigo(lector.next());
                            
                            System.out.print("Digite la cantidad de libros: ");
                            Libros[cont1].setCantidad(lector.next());
                            
                            do{
                            
                            System.out.println("\nDigite el área del libro: (Registre el número según corresponda)\n");
                            System.out.println("1: Química");
                            System.out.println("2. Física");
                            System.out.println("3. Tecnología");
                            System.out.println("4. Cálculo");
                            System.out.println("5. Programación");
                            
                            opcion = lector.nextInt();
                                
                                switch (opcion){
                                
                                    case 1:
                                        Libros[cont1].setArea("Química");
                                        opcion=-1;
                                        break;
                                    case 2:
                                        Libros[cont1].setArea("Física");
                                        opcion=-1;
                                        break;
                                    case 3:
                                        Libros[cont1].setArea("Tecnología");
                                        opcion=-1;
                                        break;
                                    case 4:
                                        Libros[cont1].setArea("Cálculo");
                                        opcion=-1;
                                        break;
                                    case 5:
                                        Libros[cont1].setArea("Programación");
                                        opcion=-1;
                                        break;
                                    default:
                                        System.out.println("\nNo ha elegido una opción válida\n");
        
                                }
                                
                            }while(opcion!=-1);
                            
                            cont1++;
                            break;
                            
                        case 2: // Asumo que sólo cambia la cantidad de libros, ya que los otros datos son fijos.
                            
                            System.out.print("Digite el nombre del libro a actualizar: ");
                            buscar = lector.next();
                            
                            if (buscar.equals("---Eliminado---"))
                                System.out.println("No se puede actualizar un libro que ha sido eliminado");
                            else {
                                for (int i=0; i<cont1; i++){
                  
                                    if (buscar.equals(Libros[i].getNombre())){
                                        aux1 = 1;  
                                        System.out.print("Digite la cantidad de libros: ");
                                        Libros[i].setCantidad(lector.next());
                                    }
                                }
                                if(aux1==-1)   
                                    System.out.println("\nLibro no encontrado");
                                else
                                aux1=-1;
                            }
                            break;
                            
                        case 3:
                            System.out.print("Digite el nombre del libro a eliminar: ");
                            buscar = lector.next();
                                for (int i=0; i<cont1; i++){
                  
                                    if (buscar.equals(Libros[i].getNombre())){
                                        aux1 = 1;  
                                        Libros[i].setNombre("---Eliminado---");
                                        Libros[i].setAutor("---Eliminado---");
                                        Libros[i].setPublicacion("---Eliminado---");
                                        Libros[i].setCodigo("---Eliminado---");
                                        Libros[i].setCantidad("---Eliminado---");
                                        Libros[i].setArea("---Eliminado---");
                                        System.out.print("¡Eliminado!");
                                        
                                        
                                    }
                                }
                                    if(aux1==-1)   
                                    System.out.println("\nLibro no encontrado");
                                    else
                                    aux1=-1;

                            break;
                        case 4:
                            System.out.print("Digite el nombre del libro a buscar: ");
                            buscar = lector.next();
                            if (buscar.equals("---Eliminado---"))
                                System.out.println("No puede buscar un libro que ha sido eliminado");
                            else{
                                for (int i=0; i<cont1; i++){
                  
                                    if (buscar.equals(Libros[i].getNombre())){
                                        aux1 = 1;  
                                        System.out.println("Nombre: " + Libros[i].getNombre());
                                        System.out.println("Autor: " + Libros[i].getAutor());
                                        System.out.println("Año de publicación: " + Libros[i].getPublicacion());
                                        System.out.println("Código: " + Libros[i].getCodigo());
                                        System.out.println("Cantidad: " + Libros[i].getCantidad());
                                        System.out.println("Área: " + Libros[i].getArea());
                                    }
                                }
                                
                                    if(aux1==-1)   
                                    System.out.println("\nLibro no encontrado");
                                    else
                                    aux1=-1;
                            }
                            break;
                        case 5:
                            System.out.println("\nDe regreso al menú inicial...\n");
                            break;
                        default:
                            System.out.println("\nOpción incorrecta\n");
                            break;

                    }
                    
                  }while(opci!=5);
                  
                  break;
                case 2:
                    
                    do{
                        System.out.println("\nGestión de Préstamos\n");
                        System.out.println("1. Prestar Libro");
                        System.out.println("2. Devolver Libro");
                        System.out.println("3. Ver libros prestados");
                        System.out.println("4. Volver al menú inicial");
                        System.out.print("\nDigite la opción: ");
                        opcio = lector.nextInt();
                        switch (opcio){
                            case 1:
                                System.out.print("Digite el nombre del libro a prestar: ");
                                buscar = lector.next();
                                
                                if (buscar.equals("---Eliminado---"))
                                System.out.println("No se puede prestar un libro que ha sido eliminado");
                                else {
                                for (int i=0; i<cont1; i++){
                  
                                    if (buscar.equals(Libros[i].getNombre())){
                                        Prestamo[cont2] = new PrestamoLibro();
                                        aux1 = 1;  
                                        System.out.println("Digite la cédula del que presta el libro: ");
                                        Prestamo[cont2].setCedula(lector.next());
                                        Prestamo[cont2].setNombre(Libros[i].getNombre());
                                        cant1 = Integer.parseInt(Libros[i].getCantidad());
                                        cant1 = cant1-1;
                                        Libros[i].setCantidad(String.valueOf(cant1));
                                        cont2++;
                                    }
                                }
                                
                                    if(aux1==-1)   
                                    System.out.println("\nLibro no encontrado");
                                    else
                                    aux1=-1;
                                }
                                break;
                            case 2:
                                System.out.print("Digite el nombre del libro a devolver: ");
                                buscar = lector.next();
                                
                                if (buscar.equals("---Devuelto---"))
                                System.out.println("Error");
                                else {
                                for (int i=0; i<cont2; i++){
                  
                                    if (buscar.equals(Prestamo[i].getNombre())){
                                        aux1 = 1;
                                        
                                        for (int j=0; j<cont1; j++){
                                            if (buscar.equals(Libros[j].getNombre())){
                                                cant1 = Integer.parseInt(Libros[j].getCantidad());
                                                cant1 = cant1+1;
                                                Libros[j].setCantidad(String.valueOf(cant1));
                                            }
                                        }
                                        
                                        Prestamo[i].setCedula("---Devuelto---");
                                        Prestamo[i].setNombre("---Devuelto---");
                                    }
                                    }
                                if(aux1==-1)   
                                    System.out.println("\nLibro no encontrado");
                                    else
                                    aux1=-1;
                                }

                                break;
                            case 3:
                                System.out.println("\nLibros prestados: \n");
                                for (int i=0; i<cont2; i++){
                                    if (Prestamo[i].getCedula().equals("---Devuelto---"));
                                    else {
                                    System.out.println("Cédula: " + Prestamo[i].getCedula() + ", libro: " + Prestamo[i].getNombre());

                                            }
                                
                                }
                                
                                break;    
                            case 4:
                                System.out.println("Retornando al Menú Principal");
                                break;    
                        }
                    
                        
                    }while(opcio!=4);
                    
                  break;
                case 3:
                    System.out.println("\nGracias por usar nuestro servicio\n");
                  break;
                default:
                    System.out.println("\nOpción incorrecta\n");
                    break;    
  
          }
            
        }while(opc!=3);
        
       
    }
    
}
