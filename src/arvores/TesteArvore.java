package arvores;

public class TesteArvore {
    public static void main(String[] args) {

        ArvoreB arvore = new ArvoreB(3);

        arvore.inserir(8);
        arvore.inserir(9);
        arvore.inserir(10);
        arvore.inserir(11);
        arvore.inserir(15);
        arvore.inserir(20);
        arvore.inserir(17);

        arvore.mostrar();

        System.out.println(arvore.buscar(10));

        arvore.remover(10);

        arvore.mostrar();

        System.out.println(arvore.buscar(10));

    }
}