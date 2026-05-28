import exceptions.ProdutoException;
import entities.Produto;

void main() {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.of("en", "US"));




    System.out.println("Digite o nome do produto: ");
    String nome = sc.nextLine();
    System.out.println("Digite o preço do produto: ");
    double preco = sc.nextDouble();
    System.out.println("Digite a quantidade de produto: ");
    int quantidade = sc.nextInt();

    try {
        Produto produto = new Produto(nome, preco, quantidade);
        System.out.println(produto);
    }
    catch(ProdutoException e) {
        System.out.println("Erro detectado: " + e.getMessage());
    }




}