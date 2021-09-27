package proyecto.fiinal;

import java.util.Arrays;
import java.util.Scanner;

public class MainBibilioteca extends Libro{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		Scanner inInt = new Scanner(System.in);
		
		String opcion = "";
		String oEstu = "";
		String oBib = "";
		String cedula = "";
		
	
		
		do {
			System.out.println("Elija una Opcion: ");
			System.out.println("1. Estudiante ");
			System.out.println("2. Bibliotecario ");
			System.out.println("3. SALIR ");
			opcion = inInt.nextLine();
			
			switch(opcion) {
			
			case"1":
				 System.out.println("a. Consultar Libros");
				 System.out.println("b. Reservar Libros");
				 oEstu = in.nextLine();
			 if(oEstu.equals("a")){
				 System.out.println("Ingrese el nombre y/o autor: ");
				 String palabra = in.nextLine();
				 
				 String libro = "";
				 
				 boolean resultado = libro.contains(palabra);  
				 System.out.println("Libros: " +resultado);
				 
				 
				
				 
			 }else {
					 System.out.println("Ingrese codigo del libro a reservar: ");
					 String codigoLibro = in.nextLine();
					 System.out.println("Ingrese su Cedula: ");
					 cedula = in.nextLine();
					 
					 break;
			 }
			case"2":
				System.out.println("a. Ingresar un Libro");
				System.out.println("b. Prestar un Libro");
				System.out.println("c. Aplazar Fecha de Entrega");
				
				oBib = in.nextLine();
					 if(oBib.equals("a")){
						System.out.println("Ingrese Codigo: ");
						String codigo = in.nextLine();
						System.out.println("Ingrese Nombre: ");
						String nombre = in.nextLine();
						System.out.println("Ingrese Auntor: ");
						String autor = in.nextLine();
						System.out.println("Ingrese anio de publicacion: ");
						int anio = in.nextInt();
						System.out.println("Ingrese la Editorial: ");
						String editorial = in.next();
						System.out.println("Ingrese Cantidad de Paginas: ");
						int canPag = in.nextInt();
						System.out.println("Ingrese el Precio: ");
						double precio = in.nextDouble();
						System.out.println("*********************************");
						
						Libro libro1 =  new Libro();
						libro1.setCodigo (codigo);
						libro1.setNombre (nombre);
						libro1.setAutor (autor);
						libro1.setAnio(anio);
						libro1.setEditorial(editorial);
						libro1.setCantidadPaginas(canPag);
						libro1.setPrecio(precio);
						
						Libro libro2 =  new Libro();
						libro2.setCodigo (codigo);
						libro2.setNombre (nombre);
						libro2.setAutor (autor);
						libro2.setAnio(anio);
						libro2.setEditorial(editorial);
						libro2.setCantidadPaginas(canPag);
						libro2.setPrecio(precio);
						
						Libro libro3 =  new Libro();
						libro3.setCodigo (codigo);
						libro3.setNombre (nombre);
						libro3.setAutor (autor);
						libro3.setAnio(anio);
						libro3.setEditorial(editorial);
						libro3.setCantidadPaginas(canPag);
						libro3.setPrecio(precio);
						
						Libro libro4 =  new Libro();
						libro4.setCodigo (codigo);
						libro4.setNombre (nombre);
						libro4.setAutor (autor);
						libro4.setAnio(anio);
						libro4.setEditorial(editorial);
						libro4.setCantidadPaginas(canPag);
						libro4.setPrecio(precio);
						
						Libro libro5 =  new Libro();
						libro5.setCodigo (codigo);
						libro5.setNombre (nombre);
						libro5.setAutor (autor);
						libro5.setAnio(anio);
						libro5.setEditorial(editorial);
						libro5.setCantidadPaginas(canPag);
						libro5.setPrecio(precio);
						
						Libro libro6 =  new Libro();
						libro6.setCodigo (codigo);
						libro6.setNombre (nombre);
						libro6.setAutor (autor);
						libro6.setAnio(anio);
						libro6.setEditorial(editorial);
						libro6.setCantidadPaginas(canPag);
						libro6.setPrecio(precio);
						
						Libro libro7 =  new Libro();
						libro7.setCodigo (codigo);
						libro7.setNombre (nombre);
						libro7.setAutor (autor);
						libro7.setAnio(anio);
						libro7.setEditorial(editorial);
						libro7.setCantidadPaginas(canPag);
						libro7.setPrecio(precio);
						
						Libro libro8 =  new Libro();
						libro8.setCodigo (codigo);
						libro8.setNombre (nombre);
						libro8.setAutor (autor);
						libro8.setAnio(anio);
						libro8.setEditorial(editorial);
						libro8.setCantidadPaginas(canPag);
						libro8.setPrecio(precio);
						
						Libro libro9 =  new Libro();
						libro9.setCodigo (codigo);
						libro9.setNombre (nombre);
						libro9.setAutor (autor);
						libro9.setAnio(anio);
						libro9.setEditorial(editorial);
						libro9.setCantidadPaginas(canPag);
						libro9.setPrecio(precio);
					
						Libro libro10 =  new Libro();
						libro10.setCodigo (codigo);
						libro10.setNombre (nombre);
						libro10.setAutor (autor);
						libro10.setAnio(anio);
						libro10.setEditorial(editorial);
						libro10.setCantidadPaginas(canPag);
						libro10.setPrecio(precio);
						
						Libro libro11 =  new Libro();
						libro11.setCodigo (codigo);
						libro11.setNombre (nombre);
						libro11.setAutor (autor);
						libro11.setAnio(anio);
						libro11.setEditorial(editorial);
						libro11.setCantidadPaginas(canPag);
						libro11.setPrecio(precio);
						
						Libro libro12 =  new Libro();
						libro12.setCodigo (codigo);
						libro12.setNombre (nombre);
						libro12.setAutor (autor);
						libro12.setAnio(anio);
						libro12.setEditorial(editorial);
						libro12.setCantidadPaginas(canPag);
						libro12.setPrecio(precio);
						
						Libro libro13 =  new Libro();
						libro13.setCodigo (codigo);
						libro13.setNombre (nombre);
						libro13.setAutor (autor);
						libro13.setAnio(anio);
						libro13.setEditorial(editorial);
						libro13.setCantidadPaginas(canPag);
						libro13.setPrecio(precio);
						
						Libro libro14 =  new Libro();
						libro14.setCodigo (codigo);
						libro14.setNombre (nombre);
						libro14.setAutor (autor);
						libro14.setAnio(anio);
						libro14.setEditorial(editorial);
						libro14.setCantidadPaginas(canPag);
						libro14.setPrecio(precio);
						
						Libro libro15 =  new Libro();
						libro15.setCodigo (codigo);
						libro15.setNombre (nombre);
						libro15.setAutor (autor);
						libro15.setAnio(anio);
						libro15.setEditorial(editorial);
						libro15.setCantidadPaginas(canPag);
						libro15.setPrecio(precio);
						
						Libro libro16 =  new Libro();
						libro16.setCodigo (codigo);
						libro16.setNombre (nombre);
						libro16.setAutor (autor);
						libro16.setAnio(anio);
						libro16.setEditorial(editorial);
						libro16.setCantidadPaginas(canPag);
						libro16.setPrecio(precio);
						
						Libro libro17 =  new Libro();
						libro17.setCodigo (codigo);
						libro17.setNombre (nombre);
						libro17.setAutor (autor);
						libro17.setAnio(anio);
						libro17.setEditorial(editorial);
						libro17.setCantidadPaginas(canPag);
						libro17.setPrecio(precio);
						
						Libro libro18 =  new Libro();
						libro18.setCodigo (codigo);
						libro18.setNombre (nombre);
						libro18.setAutor (autor);
						libro18.setAnio(anio);
						libro18.setEditorial(editorial);
						libro18.setCantidadPaginas(canPag);
						libro18.setPrecio(precio);
						
						Libro libro19 =  new Libro();
						libro19.setCodigo (codigo);
						libro19.setNombre (nombre);
						libro19.setAutor (autor);
						libro19.setAnio(anio);
						libro19.setEditorial(editorial);
						libro19.setCantidadPaginas(canPag);
						libro19.setPrecio(precio);
					
						Libro libro20 =  new Libro();
						libro20.setCodigo (codigo);
						libro20.setNombre (nombre);
						libro20.setAutor (autor);
						libro20.setAnio(anio);
						libro20.setEditorial(editorial);
						libro20.setCantidadPaginas(canPag);
						libro20.setPrecio(precio);
						
						Libro libro21 =  new Libro();
						libro21.setCodigo (codigo);
						libro21.setNombre (nombre);
						libro21.setAutor (autor);
						libro21.setAnio(anio);
						libro21.setEditorial(editorial);
						libro21.setCantidadPaginas(canPag);
						libro21.setPrecio(precio);
						
						Libro libro22 =  new Libro();
						libro22.setCodigo (codigo);
						libro22.setNombre (nombre);
						libro22.setAutor (autor);
						libro22.setAnio(anio);
						libro22.setEditorial(editorial);
						libro22.setCantidadPaginas(canPag);
						libro22.setPrecio(precio);
						
						Libro libro23 =  new Libro();
						libro23.setCodigo (codigo);
						libro23.setNombre (nombre);
						libro23.setAutor (autor);
						libro23.setAnio(anio);
						libro23.setEditorial(editorial);
						libro23.setCantidadPaginas(canPag);
						libro23.setPrecio(precio);
						
						Libro libro24 =  new Libro();
						libro24.setCodigo (codigo);
						libro24.setNombre (nombre);
						libro24.setAutor (autor);
						libro24.setAnio(anio);
						libro24.setEditorial(editorial);
						libro24.setCantidadPaginas(canPag);
						libro24.setPrecio(precio);
						
						Libro libro25 =  new Libro();
						libro25.setCodigo (codigo);
						libro25.setNombre (nombre);
						libro25.setAutor (autor);
						libro25.setAnio(anio);
						libro25.setEditorial(editorial);
						libro25.setCantidadPaginas(canPag);
						libro25.setPrecio(precio);
						
						Libro libro26 =  new Libro();
						libro26.setCodigo (codigo);
						libro26.setNombre (nombre);
						libro26.setAutor (autor);
						libro26.setAnio(anio);
						libro26.setEditorial(editorial);
						libro26.setCantidadPaginas(canPag);
						libro26.setPrecio(precio);
						
						Libro libro27 =  new Libro();
						libro27.setCodigo (codigo);
						libro27.setNombre (nombre);
						libro27.setAutor (autor);
						libro27.setAnio(anio);
						libro27.setEditorial(editorial);
						libro27.setCantidadPaginas(canPag);
						libro27.setPrecio(precio);
						
						Libro libro28 =  new Libro();
						libro28.setCodigo (codigo);
						libro28.setNombre (nombre);
						libro28.setAutor (autor);
						libro28.setAnio(anio);
						libro28.setEditorial(editorial);
						libro28.setCantidadPaginas(canPag);
						libro28.setPrecio(precio);
						
						Libro libro29 =  new Libro();
						libro29.setCodigo (codigo);
						libro29.setNombre (nombre);
						libro29.setAutor (autor);
						libro29.setAnio(anio);
						libro29.setEditorial(editorial);
						libro29.setCantidadPaginas(canPag);
						libro29.setPrecio(precio);
						
						Libro libro30 =  new Libro();
						libro30.setCodigo (codigo);
						libro30.setNombre (nombre);
						libro30.setAutor (autor);
						libro30.setAnio(anio);
						libro30.setEditorial(editorial);
						libro30.setCantidadPaginas(canPag);
						libro30.setPrecio(precio);
						
						Libro libro31 =  new Libro();
						libro31.setCodigo (codigo);
						libro31.setNombre (nombre);
						libro31.setAutor (autor);
						libro31.setAnio(anio);
						libro31.setEditorial(editorial);
						libro31.setCantidadPaginas(canPag);
						libro31.setPrecio(precio);
						
						Libro libro32 =  new Libro();
						libro32.setCodigo (codigo);
						libro32.setNombre (nombre);
						libro32.setAutor (autor);
						libro32.setAnio(anio);
						libro32.setEditorial(editorial);
						libro32.setCantidadPaginas(canPag);
						libro32.setPrecio(precio);
						
						Libro libro33 =  new Libro();
						libro33.setCodigo (codigo);
						libro33.setNombre (nombre);
						libro33.setAutor (autor);
						libro33.setAnio(anio);
						libro33.setEditorial(editorial);
						libro33.setCantidadPaginas(canPag);
						libro33.setPrecio(precio);
						
						Libro libro34 =  new Libro();
						libro34.setCodigo (codigo);
						libro34.setNombre (nombre);
						libro34.setAutor (autor);
						libro34.setAnio(anio);
						libro34.setEditorial(editorial);
						libro34.setCantidadPaginas(canPag);
						libro34.setPrecio(precio);
						
						Libro libro35 =  new Libro();
						libro35.setCodigo (codigo);
						libro35.setNombre (nombre);
						libro35.setAutor (autor);
						libro35.setAnio(anio);
						libro35.setEditorial(editorial);
						libro35.setCantidadPaginas(canPag);
						libro35.setPrecio(precio);
						
						Libro libro36 =  new Libro();
						libro36.setCodigo (codigo);
						libro36.setNombre (nombre);
						libro36.setAutor (autor);
						libro36.setAnio(anio);
						libro36.setEditorial(editorial);
						libro36.setCantidadPaginas(canPag);
						libro36.setPrecio(precio);
						
						Libro libro37 =  new Libro();
						libro37.setCodigo (codigo);
						libro37.setNombre (nombre);
						libro37.setAutor (autor);
						libro37.setAnio(anio);
						libro37.setEditorial(editorial);
						libro37.setCantidadPaginas(canPag);
						libro37.setPrecio(precio);
						
						Libro libro38 =  new Libro();
						libro38.setCodigo (codigo);
						libro38.setNombre (nombre);
						libro38.setAutor (autor);
						libro38.setAnio(anio);
						libro38.setEditorial(editorial);
						libro38.setCantidadPaginas(canPag);
						libro38.setPrecio(precio);
						
						Libro libro39 =  new Libro();
						libro39.setCodigo (codigo);
						libro39.setNombre (nombre);
						libro39.setAutor (autor);
						libro39.setAnio(anio);
						libro39.setEditorial(editorial);
						libro39.setCantidadPaginas(canPag);
						libro39.setPrecio(precio);
						
						Libro libro40 =  new Libro();
						libro40.setCodigo (codigo);
						libro40.setNombre (nombre);
						libro40.setAutor (autor);
						libro40.setAnio(anio);
						libro40.setEditorial(editorial);
						libro40.setCantidadPaginas(canPag);
						libro40.setPrecio(precio);
						
						Libro libro41 =  new Libro();
						libro41.setCodigo (codigo);
						libro41.setNombre (nombre);
						libro41.setAutor (autor);
						libro41.setAnio(anio);
						libro41.setEditorial(editorial);
						libro41.setCantidadPaginas(canPag);
						libro41.setPrecio(precio);
						
						Libro libro42 =  new Libro();
						libro42.setCodigo (codigo);
						libro42.setNombre (nombre);
						libro42.setAutor (autor);
						libro42.setAnio(anio);
						libro42.setEditorial(editorial);
						libro42.setCantidadPaginas(canPag);
						libro42.setPrecio(precio);
						
						Libro libro43 =  new Libro();
						libro43.setCodigo (codigo);
						libro43.setNombre (nombre);
						libro43.setAutor (autor);
						libro43.setAnio(anio);
						libro43.setEditorial(editorial);
						libro43.setCantidadPaginas(canPag);
						libro43.setPrecio(precio);
						
						Libro libro44 =  new Libro();
						libro44.setCodigo (codigo);
						libro44.setNombre (nombre);
						libro44.setAutor (autor);
						libro44.setAnio(anio);
						libro44.setEditorial(editorial);
						libro44.setCantidadPaginas(canPag);
						libro44.setPrecio(precio);
						
						Libro libro45 =  new Libro();
						libro45.setCodigo (codigo);
						libro45.setNombre (nombre);
						libro45.setAutor (autor);
						libro45.setAnio(anio);
						libro45.setEditorial(editorial);
						libro45.setCantidadPaginas(canPag);
						libro45.setPrecio(precio);
						
						Libro libro46 =  new Libro();
						libro46.setCodigo (codigo);
						libro46.setNombre (nombre);
						libro46.setAutor (autor);
						libro46.setAnio(anio);
						libro46.setEditorial(editorial);
						libro46.setCantidadPaginas(canPag);
						libro46.setPrecio(precio);
						
						Libro libro47 =  new Libro();
						libro47.setCodigo (codigo);
						libro47.setNombre (nombre);
						libro47.setAutor (autor);
						libro47.setAnio(anio);
						libro47.setEditorial(editorial);
						libro47.setCantidadPaginas(canPag);
						libro47.setPrecio(precio);
						
						Libro libro48 =  new Libro();
						libro48.setCodigo (codigo);
						libro48.setNombre (nombre);
						libro48.setAutor (autor);
						libro48.setAnio(anio);
						libro48.setEditorial(editorial);
						libro48.setCantidadPaginas(canPag);
						libro48.setPrecio(precio);
						
						Libro libro49 =  new Libro();
						libro49.setCodigo (codigo);
						libro49.setNombre (nombre);
						libro49.setAutor (autor);
						libro49.setAnio(anio);
						libro49.setEditorial(editorial);
						libro49.setCantidadPaginas(canPag);
						libro49.setPrecio(precio);
						
						Libro libro50 =  new Libro();
						libro50.setCodigo (codigo);
						libro50.setNombre (nombre);
						libro50.setAutor (autor);
						libro50.setAnio(anio);
						libro50.setEditorial(editorial);
						libro50.setCantidadPaginas(canPag);
						libro50.setPrecio(precio);
						
						Libro listaLibros[] = new Libro[50];
						listaLibros[0] = libro1;
						listaLibros[1] = libro2;
						listaLibros[2] = libro3;
						listaLibros[3] = libro4;
						listaLibros[4] = libro5;
						listaLibros[5] = libro6;
						listaLibros[6] = libro7;
						listaLibros[7] = libro8;
						listaLibros[8] = libro9;
						listaLibros[9] = libro10;
						listaLibros[10] = libro11;
						listaLibros[11] = libro12;
						listaLibros[12] = libro13;
						listaLibros[13] = libro14;
						listaLibros[14] = libro15;
						listaLibros[15] = libro16;
						listaLibros[16] = libro17;
						listaLibros[17] = libro18;
						listaLibros[18] = libro19;
						listaLibros[19] = libro20;
						listaLibros[20] = libro21;
						listaLibros[21] = libro22;
						listaLibros[22] = libro23;
						listaLibros[23] = libro24;
						listaLibros[24] = libro25;
						listaLibros[25] = libro26;
						listaLibros[26] = libro27;
						listaLibros[27] = libro28;
						listaLibros[28] = libro29;
						listaLibros[29] = libro30;
						listaLibros[30] = libro31;
						listaLibros[31] = libro32;
						listaLibros[32] = libro33;
						listaLibros[33] = libro34;
						listaLibros[34] = libro35;
						listaLibros[35] = libro36;
						listaLibros[36] = libro37;
						listaLibros[37] = libro38;
						listaLibros[38] = libro39;
						listaLibros[39] = libro40;
						listaLibros[40] = libro41;
						listaLibros[41] = libro42;
						listaLibros[42] = libro43;
						listaLibros[43] = libro44;
						listaLibros[44] = libro45;
						listaLibros[45] = libro46;
						listaLibros[46] = libro47;
						listaLibros[47] = libro48;
						listaLibros[48] = libro49;
						listaLibros[49] = libro50;
						
						for(int i=0; i<50; i++) {
							Libro libro = listaLibros[i];
						}
						
						
						System.out.println("Lista de Libros ");
						System.out.println(Arrays.toString(listaLibros));
						
					System.out.println("Elija que tipo de libro es");
					System.out.println("1. Libro de Trabajo");
					System.out.println("2. Libro de Lectura");
					int tipoLibro = inInt.nextInt();
					 	if(tipoLibro==1) {
					 		System.out.println("Ingrese codigo de autorizacion: ");
					 		String codigoau = in.next();
					 	
					 		System.out.println("Tiempo aproximado de lectura(minutos)");
					 		int tiempo = in.nextInt();
					 	}
					 	
					 	System.out.println("La informacion ha sido guardada exitosamente");
					 
					 }else if(oBib.equals("b")){
						 System.out.println("Ingrese el codigo del libro: ");
						 String codLibro = in.nextLine();
					
						 System.out.println("1. Prestar");
						 System.out.println("2. No Prestar");
						 int eleccion = in.nextInt();
						 
					 }else if(oBib.equals("c")){
						 System.out.println("Ingrese el codigo del libro: ");
						 String codLibro = in.nextLine();	 
						 System.out.println("Ingrese Cedula Estudiante: ");
						 String cedulaEstu = in.nextLine();
						 
						 System.out.println("1. Aplazar");
						 System.out.println("2. No Aplazar");
						 int eleccion = in.nextInt();
						 	if(eleccion==1) {
						 		System.out.println("La fecha de entrega ha cambiado");
						 	}else {
						 		System.out.println("No Aplazado");
						 	}
						 	
						 	System.out.println("Libro no encontrado");
						 	}
					 break;
			
						 
				case "3":
				System.out.println("Usted ha salido del sistema");
				System.out.println("Gracias por preferirnos");
				break;
			}
		
			}while(!opcion.equals("3"));
				System.out.println("Elija una opcion");
					
		}
	}


