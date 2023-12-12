package arvores;

public class TesteArvore {
    public static void main(String[] args) {

        ArvoreB arvore = new ArvoreB(2); // Árvore de grau mínimo 2

        arvore.inserir(8);
        arvore.inserir(9);
        arvore.inserir(10);
        arvore.inserir(11);
        arvore.inserir(7);
        arvore.inserir(15);
        arvore.inserir(20);
        arvore.inserir(3);
        arvore.inserir(1);
        arvore.inserir(2);

        arvore.mostrar();

        System.out.println(arvore.buscar(10));
        System.out.println(arvore.buscar(15));
        System.out.println(arvore.buscar(1));

        arvore.remover(10);
        arvore.remover(15);
        arvore.remover(1);

        arvore.mostrar();

        System.out.println(arvore.buscar(10));
        System.out.println(arvore.buscar(15));
        System.out.println(arvore.buscar(1));

    }
}