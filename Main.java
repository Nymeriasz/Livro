package Livro;

public class Main {
    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0]=new Pessoa("Pamella",19,"F");
        p[1]=new Pessoa("Maria", 20, "F");

        l[0]=new Livro("Pedra Filosofal", "JK", 208, p[0]);
        l[1]=new Livro("Câmara Secreta", "JK", 224, p[1]);
        l[2]=new Livro("Prisioneiro de Azkaban", "JK", 288, p[0]);

        l[0].abrir();
        l[0].folhear(100);
        System.out.println(l[0].detalhes());
        l[1].avancarPag();
        System.out.println(l[1].detalhes());
    }
}
