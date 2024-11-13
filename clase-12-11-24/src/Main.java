import java.io.*;

public class Main {
    public static void main(String[] args) {
                                            //TXT
        //ESCRIBIR EN EL ARCHIVO
        /*try (BufferedWriter writer = new BufferedWriter(new FileWriter("prueba.txt"))){
            writer.write("ESTE ES EL PRIMER ARCHIVO CREADO\n");
            writer.write("PRMERA LINEA\n");
        }catch (IOException e){
            System.out.println("ERROR AL LEER EL ARCHIVO" + e);
        }

        //LEER EL ARCHIVO
        try (BufferedReader reader = new BufferedReader(new FileReader("prueba.txt"))) {
            String lectura;
            while ((lectura = reader.readLine()) != null) {
                System.out.println(lectura);
            }
        } catch (IOException e){
            System.out.println("ERROR AL LEER EL ARCHIVO" + e.getMessage());
        }*/

                                    //BINARIO
        //CREAR
        /*byte [] a = {1,2,3,4,5,6,7,8,9};
        try (BufferedOutputStream bin = new BufferedOutputStream(new FileOutputStream("pruebaBinario.dat"))){
           bin.write(a);
            System.out.println("SE AGREGO LA IFORMACION AL ACHIVO");
        }catch (IOException e){
            System.out.println("ERROR AL LEER EL ARCHIVO " + e.getMessage());
        }

        //LEER
        try (BufferedInputStream bin = new BufferedInputStream(new FileInputStream("pruebaBinario.dat"))){
            int b = 0;

            while ((b = bin.read()) != -1){ //ESTE TIPO DE ARCHIVOS SIEMPRE REGRESA UN -1 CUANDO SE TERMINA DE LEER
                System.out.print(b);
            }

        } catch (IOException e){
            System.out.println("ERROR AL LEER EL ARCHIVO " + e.getMessage());
        }*/

                                    //SOBREESCRIBIR
        try (FileWriter writer = new FileWriter("prueba.txt",true); BufferedWriter bw = new BufferedWriter(writer)){
            bw.write("OTRA SENTENCIA");
        }catch (IOException e){
            System.out.println("ERROR AL SOBREESCRIBIR EL ARCHIVO" + e.getMessage());
        }

        


    }
}