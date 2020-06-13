import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;


public class TestePizza {
	
	//Limpa os registros de ingredientes já existentes.
	
	@Before
	public void limparRegPizza() {
		Pizza.zerarIngrediente();
	}
	
	
	//Teste para ver se o valor está certo de acordo com os ingredientes.
	
	@Test
	public void testValor() {
		
		Pizza pizza1 = new Pizza();
		
		pizza1.adicionaIngrediente("Mussarela");
		pizza1.adicionaIngrediente("Bacon");
		pizza1.adicionaIngrediente("Tomate");
		
		assertEquals(20.00, pizza1.getPreco(), 0);
	}
	
	//Teste para verificar o registro de ingredientes.
	
	@Test
	public void testIngrediente() {
		
		Pizza pizza1 = new Pizza();
		
		pizza1.adicionaIngrediente("Bacon");
		pizza1.adicionaIngrediente("Queijo");
		pizza1.adicionaIngrediente("Presunto");
		pizza1.adicionaIngrediente("Ovo");
		
		ArrayList<String> ingredientes = new ArrayList<String>();
		ingredientes.addAll(pizza1.getIngrediente());
		
		assertEquals(ingredientes, pizza1.getIngrediente());
	}
}
