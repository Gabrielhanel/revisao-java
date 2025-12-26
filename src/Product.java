/*
Crie uma classe Produto com:
nome
preco
estoque

Regras:
preco não pode ser negativo
Método vender(int qtd) reduz o estoque
Não permitir vender mais do que tem
*/

public class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String nameParam, double priceParam, int stockParam) {
        if (price <= 0) {
            throw new Error("O preço não pode ser menor que 0");
        }
        this.name = nameParam;
        this.price = priceParam;
        this.stock = stockParam;
    }

    public void RecalculeStockAfterSale(int qtd) {
        if (qtd > this.stock || this.stock == 0) {
            throw new IllegalArgumentException("Estoque insuficiente");
        } else this.stock -= qtd;
        System.out.println("Venda realizada! Estoque atual: " + this.stock);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Teclado", 150.0, 10);
        p1.RecalculeStockAfterSale(3);
    }
}