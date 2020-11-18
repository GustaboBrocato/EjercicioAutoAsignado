package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Gustavo Brocato #202010030250
        //El programa trata de la pagina de un restaurante para ordenar comida. En la pagina se muestra al principio un menu y se la pregunta
        //al cliente cuantos productos desea ordenar, seguido que ingrese el indice del producto que desea, una vez tomada la orden de comida
        //se le pregunta si desea agregar una bebida. Esto sigue un proceso similar a la comida, una vez terminado se muestra lo que ordeno y
        //un subtotal y se le pregunta si la orden es para domicilio si reponde que si se cobra el cargo de domicilio y se pide la direccion y
        //numero de telefono del cliente luego se muestra el total y la informacion que se obtuvo tambien se ofrece un descuento del 10% en ordenes
        //de 500 o mas. Si la orden no es para domicilio se muestra el total. Una vez concluido se pregunta si desea ingresar otra orden

        Scanner r = new Scanner(System.in);
        boolean repetir = true;
        boolean orden_bebida = true;
        int N_Productos, eleccion, N_Bebidas, subtotal = 0, domicilio, Costo_Domicilio = 25, Nueva_Orden;
        double descuento, total;


        String direccion = new String();
        String telefono = new String();

        String[] Comida = new String[8];
        Comida[0] = "Carne asada";
        Comida[1] = "Tajadas con Pollo";
        Comida[2] = "Papas fritas con Pollo";
        Comida[3] = "Tortillas con quesillo";
        Comida[4] = "Tacos Flauta";
        Comida[5] = "Taquitos Mexicanos";
        Comida[6] = "Tajadas con Carne Molida";
        Comida[7] = "Enchiladas";

        int[] Precio_Comida = new int[8];
        Precio_Comida[0] = 90;
        Precio_Comida[1] = 80;
        Precio_Comida[2] = 80;
        Precio_Comida[3] = 30;
        Precio_Comida[4] = 35;
        Precio_Comida[5] = 50;
        Precio_Comida[6] = 65;
        Precio_Comida[7] = 40;

        String[] Bebidas = new String[8];
        Bebidas[0] = "CocaCola 3 Lts";
        Bebidas[1] = "Pepsi 3 Lts";
        Bebidas[2] = "CocaCola 2 Lts";
        Bebidas[3] = "Pepsi 2 Lts";
        Bebidas[4] = "CocaCola 500 ml";
        Bebidas[5] = "Pepsi 500 ml";
        Bebidas[6] = "Banana 500 ml";
        Bebidas[7] = "Sprite 500 ml";

        int[] Precio_Bebidas = new int[8];
        Precio_Bebidas[0] = 50;
        Precio_Bebidas[1] = 50;
        Precio_Bebidas[2] = 40;
        Precio_Bebidas[3] = 40;
        Precio_Bebidas[4] = 20;
        Precio_Bebidas[5] = 20;
        Precio_Bebidas[6] = 20;
        Precio_Bebidas[7] = 20;

        while (repetir == true) {
            subtotal = 0;
            System.out.println("Bienvenido a Albert's To Go");
            System.out.println("***** MENU *****");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("1. Carne asada -------------------------- 90 Lps");
            System.out.println("2. Tajadas con Pollo -------------------- 80 Lps");
            System.out.println("3. Papas fritas con Pollo --------------- 80 Lps");
            System.out.println("4. Tortillas con quesillo( 2 piezas ) --- 30 Lps");
            System.out.println("5. Tacos Flauta ( 2 piezas ) ------------ 35 Lps");
            System.out.println("6. Taquitos Mexicanos ( 2 piezas ) ------ 50 Lps");
            System.out.println("7. Tajadas con Carne Molida ------------- 65 Lps");
            System.out.println("8. Enchiladas ( 2 piezas ) -------------- 40 Lps");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Porfavor ingrese el numero de productos que desea ordenar: ");
            N_Productos = r.nextInt();
            int[] indice = new int[N_Productos];
            for (int x = 0; x <= (N_Productos - 1); x++) {
                System.out.println("Porfavor ingrese el indice del producto numero " + (x + 1) + " que desea ordenar: ");
                indice[x] = r.nextInt();
            }

            System.out.println("Desea agregar una bebida a su orden? ");
            System.out.println("1. Si -------------------- 2. No");
            eleccion = r.nextInt();
            if (eleccion == 1) {
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("El menu de bebidas es el siguiente: ");
                System.out.println("1. CocaCola 3 Lts --------------- 50 Lps");
                System.out.println("2. Pepsi 3 Lts ------------------ 50 Lps");
                System.out.println("3. CocaCola 2 Lts --------------- 40 Lps");
                System.out.println("4. Pepsi 2 Lts ------------------ 40 Lps");
                System.out.println("5. CocaCola 500 ml -------------- 20 Lps");
                System.out.println("6. Pepsi 500 ml ----------------- 20 Lps");
                System.out.println("7. Banana 500 ml ---------------- 20 Lps");
                System.out.println("8. Sprite 500 ml ---------------- 20 Lps");
                System.out.println(" ");
                System.out.println("Cuantas bebidas desea agregar a su orden? ");
                N_Bebidas = r.nextInt();
                int[] Indice_Bebidas = new int[N_Bebidas];
                for (int x = 0; x <= (N_Bebidas - 1); x++) {
                    System.out.println("Porfavor ingrese el indice del producto numero" + (x + 1) + " que desea ordenar: ");
                    Indice_Bebidas[x] = r.nextInt();
                }
                System.out.println("Los Productos ordenados son: ");
                for (int x = 0; x <= (N_Productos - 1); x++) {
                    subtotal = Precio_Comida[indice[x]-1] + subtotal;
                    System.out.println((x + 1) + ". " + Comida[indice[x]-1] + " ---------- " + Precio_Comida[indice[x]-1] + " Lps.");
                }
                for (int x = 0; x <= (N_Bebidas - 1); x++) {
                    subtotal = Precio_Bebidas[Indice_Bebidas[x]-1] + subtotal;
                    System.out.println((x + 1) + ". " + Bebidas[Indice_Bebidas[x]-1] + " ---------- " + Precio_Bebidas[Indice_Bebidas[x]-1] + " Lps.");
                }
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("El subtotal de su orden es: ---------- " + subtotal + " Lps.");
                System.out.println("Es su orden para pedido a domicilio?");
                System.out.println("1. Si --------- 2. No");
                domicilio = r.nextInt();
                if (domicilio == 1) {
                    r.nextLine();
                    System.out.println("El costo por el servicio a domicilio es: " + Costo_Domicilio + " Lps.");
                    subtotal = subtotal + Costo_Domicilio;
                    System.out.println("El nuevo subtotal es de: " + subtotal + " Lps;");
                    System.out.println("Porfavor ingrese la direccion de su domicilio: ");
                    direccion = r.nextLine();
                    System.out.println("Porfavor ingrese su numero de telefono: ");
                    telefono = r.nextLine();
                    if (subtotal >= 500) {
                        descuento = subtotal * 0.10;
                        total = subtotal - descuento;
                        System.out.println("Usted ha calificado para un descuento del 10%!");
                        System.out.println("El subtotal de su orden es: ---------- " + subtotal + " Lps");
                        System.out.println("El descuento de su orden es: --------- " + descuento + " Lps");
                        System.out.println("El total de su orden es: ------------- " + total + " Lps");
                        System.out.println("La direccion a la que se entregara el producto es: " + direccion);
                        System.out.println("Su numero de telefono es: " + telefono);
                        System.out.println("Desea ingresar otra orden?");
                        System.out.println("1. Si ---------- 2. No");
                        Nueva_Orden = r.nextInt();
                        if (Nueva_Orden == 1) {
                            repetir = true;
                        } else {
                            repetir = false;
                        }

                    } else {
                        total = subtotal;
                        System.out.println("El total de su orden es: ------------- " + total + " Lps");
                        System.out.println("La direccion a la que se entregara el producto es: " + direccion);
                        System.out.println("Su numero de telefono es: " + telefono);
                        System.out.println(" ");
                        System.out.println("Desea ingresar otra orden?");
                        System.out.println("1. Si ---------- 2. No");
                        Nueva_Orden = r.nextInt();
                        if (Nueva_Orden == 1) {
                            repetir = true;
                        } else {
                            repetir = false;
                        }

                    }

                } else if (domicilio == 2) {
                    if (subtotal >= 500) {
                        descuento = subtotal * 0.10;
                        total = subtotal - descuento;
                        System.out.println("Usted ha calificado para un descuento del 10%!");
                        System.out.println("El subtotal de su orden es: ---------- " + subtotal + " Lps");
                        System.out.println("El descuento de su orden es: --------- " + descuento + " Lps");
                        System.out.println("El total de su orden es: ------------- " + total + " Lps");
                        System.out.println("Desea ingresar otra orden?");
                        System.out.println("1. Si ---------- 2. No");
                        Nueva_Orden = r.nextInt();
                        if (Nueva_Orden == 1) {
                            repetir = true;
                        } else {
                            repetir = false;
                        }
                    } else {
                        total = subtotal;
                        System.out.println("El total a pagar es de: " + total);
                        System.out.println("Desea ingresar otra orden?");
                        System.out.println("1. Si ---------- 2. No");
                        Nueva_Orden = r.nextInt();
                        if (Nueva_Orden == 1) {
                            repetir = true;
                        } else {
                            repetir = false;
                        }
                    }
                } else {
                    System.out.println("La eleccion es invalida");
                    total = subtotal;
                    System.out.println("El total a pagar es de: " + total);
                    System.out.println("Desea ingresar otra orden?");
                    System.out.println("1. Si ---------- 2. No");
                    Nueva_Orden = r.nextInt();
                    if (Nueva_Orden == 1) {
                        repetir = true;
                    } else {
                        repetir = false;
                    }
                }
            } else if (eleccion == 2) {
                System.out.println("Los Productos ordenados son: ");
                for (int x = 0; x <= (N_Productos - 1); x++) {
                    subtotal = Precio_Comida[indice[x]-1] + subtotal;
                    System.out.println((x + 1) + ". " + Comida[indice[x]-1] + " ---------- " + Precio_Comida[indice[x]-1] + " Lps.");
                }
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("El subtotal de su orden es: ---------- " + subtotal + " Lps.");
                System.out.println("Es su orden para pedido a domicilio?");
                System.out.println("1. Si --------- 2. No");
                domicilio = r.nextInt();
                if (domicilio == 1) {
                    r.nextLine();
                    System.out.println("El costo por el servicio a domicilio es: " + Costo_Domicilio + " Lps.");
                    subtotal = subtotal + Costo_Domicilio;
                    System.out.println("El nuevo subtotal es de: " + subtotal + " Lps;");
                    System.out.println("Porfavor ingrese la direccion de su domicilio: ");
                    direccion = r.nextLine();
                    System.out.println("Porfavor ingrese su numero de telefono: ");
                    telefono = r.nextLine();
                    if (subtotal >= 500) {
                        descuento = subtotal * 0.10;
                        total = subtotal - descuento;
                        System.out.println("Usted ha calificado para un descuento del 10%!");
                        System.out.println("El subtotal de su orden es: ---------- " + subtotal + " Lps");
                        System.out.println("El descuento de su orden es: --------- " + descuento + " Lps");
                        System.out.println("El total de su orden es: ------------- " + total + " Lps");
                        System.out.println("La direccion a la que se entregara el producto es: " + direccion);
                        System.out.println("Su numero de telefono es: " + telefono);
                        System.out.println("Desea ingresar otra orden?");
                        System.out.println("1. Si ---------- 2. No");
                        Nueva_Orden = r.nextInt();
                        if (Nueva_Orden == 1) {
                            repetir = true;
                        } else {
                            repetir = false;
                        }

                    } else {
                        total = subtotal;
                        System.out.println("El total de su orden es: ------------- " + total + " Lps");
                        System.out.println("La direccion a la que se entregara el producto es: " + direccion);
                        System.out.println("Su numero de telefono es: " + telefono);
                        System.out.println(" ");
                        System.out.println("Desea ingresar otra orden?");
                        System.out.println("1. Si ---------- 2. No");
                        Nueva_Orden = r.nextInt();
                        if (Nueva_Orden == 1) {
                            repetir = true;
                        } else {
                            repetir = false;
                        }

                    }

                } else if (domicilio == 2) {
                    if (subtotal >= 500) {
                        descuento = subtotal * 0.10;
                        total = subtotal-descuento;
                        System.out.println("Usted ha calificado para un descuento del 10%!");
                        System.out.println("El subtotal de su orden es: ---------- " + subtotal + " Lps");
                        System.out.println("El descuento de su orden es: --------- " + descuento + " Lps");
                        System.out.println("El total de su orden es: ------------- " + total + " Lps");
                        System.out.println("Desea ingresar otra orden?");
                        System.out.println("1. Si ---------- 2. No");
                        Nueva_Orden = r.nextInt();
                        if (Nueva_Orden == 1) {
                            repetir = true;
                        } else {
                            repetir = false;
                        }
                    } else {
                        total = subtotal;
                        System.out.println("El total a pagar es de: " + total);
                        System.out.println("Desea ingresar otra orden?");
                        System.out.println("1. Si ---------- 2. No");
                        Nueva_Orden = r.nextInt();
                        if (Nueva_Orden == 1) {
                            repetir = true;
                        } else {
                            repetir = false;
                        }
                    }
                } else {
                    System.out.println("La eleccion es invalida");
                    total = subtotal;
                    System.out.println("El total a pagar es de: " + total);
                    System.out.println("Desea ingresar otra orden?");
                    System.out.println("1. Si ---------- 2. No");
                    Nueva_Orden = r.nextInt();
                    if (Nueva_Orden == 1) {
                        repetir = true;
                    } else {
                        repetir = false;
                    }
                }
            }
        }

    }
}