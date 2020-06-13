public class Principal {

	public static void main(String[] args) {
		
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

		pizza1.adicionaIngrediente("Mussarela");
		pizza1.adicionaIngrediente("Bacon");
		
		pizza2.adicionaIngrediente("Mussarela");
		pizza2.adicionaIngrediente("Provolone");
		pizza2.adicionaIngrediente("Catupiry");
		pizza2.adicionaIngrediente("Requeijão");
		
		pizza3.adicionaIngrediente("Mussarela");
		pizza3.adicionaIngrediente("Ovo");
		pizza3.adicionaIngrediente("Pimenta");
		pizza3.adicionaIngrediente("Cebola");
		pizza3.adicionaIngrediente("Presunto");
		
		carrinho.adicionaPizza(pizza1);
		carrinho.adicionaPizza(pizza2);
		carrinho.adicionaPizza(pizza3);
		
		System.out.println("Total de itens no carrinho: " + carrinho.totalDePizzas());
		System.out.println("Valor total do carrinho: "+carrinho.getPrecoTotal());
		System.out.println("Ingredientes utilizados: "+Pizza.getListaIngredientes());
	}

}
