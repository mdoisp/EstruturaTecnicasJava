package pilhavetor;

public class Main {
    public static void main(String[] args) {
        PilhaVetor pilhaA = new PilhaVetor(4);
        pilhaA.empilhar("A");
        pilhaA.empilhar("B");
        pilhaA.empilhar("C");
        pilhaA.empilhar("D");
        pilhaA.empilhar("E");
        System.out.println("Desempilhar "+pilhaA.desempilha());
        System.out.println("Desempilhar "+pilhaA.desempilha());
        System.out.println("Desempilhar "+pilhaA.desempilha());
        System.out.println("Desempilhar "+pilhaA.desempilha());
        System.out.println("Desempilhar "+pilhaA.desempilha());
        System.out.println(pilhaA.empilhar(""));
    }
}
