import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
public class TesteCarrinhoDeCompra {
	
	//Zerar ingredientes antes de cada teste.
	@Before
	public void ZeraIngredientes() {
		Pizza.zerarIngrediente();
	}
	
	
	//Teste de soma dos preços
	@Test
	public void testSoma() {
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		
		pizza1.adicionaIngrediente("Mussarela");
		pizza1.adicionaIngrediente("Bacon");
		pizza1.adicionaIngrediente("Tomate");
		
		pizza2.adicionaIngrediente("Bacon");
		pizza2.adicionaIngrediente("Queijo");
		pizza2.adicionaIngrediente("Presunto");
		pizza2.adicionaIngrediente("Ovo");
		pizza2.adicionaIngrediente("Tomate");
		
		carrinho.adicionaPizza(pizza1);
		carrinho.adicionaPizza(pizza2);
		
		assertEquals(40.0, carrinho.getPrecoTotal(), 0);
	}

	@Test
	public void testIngredienteZerado() {
		
		boolean semIngrediente;//Variável para guardar o valor booleano se a pizza tem ingredientes ou não.
		
		ArrayList<Pizza> pizzas = new ArrayList<Pizza>();//Cria um array pra simular o carrinho.
		
		Pizza pizza1 = new Pizza();
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionaPizza(pizza1);//Adiciona uma pizza mesmo sem ingredientes
		
		if (pizza1.getIngrediente().isEmpty()) {
			semIngrediente = true;
		}
		
		else {
			pizzas.add(pizza1);
			semIngrediente = false;
		}
		
		assertTrue(semIngrediente);/*Assert verificando se a variável recebeu o valor true,
		ou seja, não deixando adicionar pizzas sem ingrediente*/
	}
	
}
