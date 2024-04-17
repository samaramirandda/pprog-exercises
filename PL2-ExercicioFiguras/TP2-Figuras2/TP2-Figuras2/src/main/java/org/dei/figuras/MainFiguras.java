package org.dei.figuras;

public class MainFiguras {

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
        Object[] figuras = new Object[10];

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
                System.out.printf("%s área=%.1f%n", figuras[i], ((Figura)figuras[i]).calcularArea());
            }
        }
        
        // figuras[4]="string";   // com esta instrução, o varrimento do array gera um erro em runtime
        System.out.println("\n### Listagem das Áreas das Figuras - 2 ###");
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] != null) {
                System.out.printf("%s área=%.1f%n", figuras[i], ((Figura)figuras[i]).calcularArea());
            }
        }
    }

}
