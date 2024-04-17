package org.dei.figuras;

public class MainFiguras2 {

    public static void main(String[] args) {

        System.out.println("\n### Figuras Construídas ###");
        Circulo c1 = new Circulo();
        System.out.println(c1);

        Circulo c2 = new Circulo(5, "amarelo");
        System.out.println(c2);

        Retangulo r1 = new Retangulo();
        System.out.println(r1);

        Retangulo r2 = new Retangulo(5, 2, "azul");
        System.out.println(r2);              
        
        System.out.println("\n### Variável do Tipo Object ###");
        Object obj;
        obj = c1;
        System.out.println(obj.toString());
        
        obj = r1;
        System.out.println(obj.toString()); 
        
        // Armazenamento de Objetos num Contentor do Tipo Array
        // Já não é possível adicionar uma String ao Contentor
        Figura[] figuras = new Figura[10];

        figuras[0] = c1;
        figuras[1] = c2;
        figuras[2] = r1;
        figuras[3] = r2;

        System.out.println("\n### Listagem de Figuras Armazenadas no Contentor ###");
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] != null) {
                System.out.println(figuras[i]);
            }
        }

        System.out.println("\n### Listagem das Áreas das Figuras ###");
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] != null) {
                System.out.printf("%s área=%.1f%n", figuras[i], figuras[i].calcularArea());
            }
        }

        System.out.println("\n### Listagem de Instâncias de Retangulo ###");
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] instanceof Retangulo) {
                System.out.println(figuras[i]);
            }
        }

        System.out.println("\n### Listagem de Instâncias de Circulo ###");
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] instanceof Circulo) {
                System.out.println(figuras[i]);
            }
        }
    }
}
