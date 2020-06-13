import java.util.ArrayList;
public class CarrinhoDeCompras {
		
	private ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
	private double precoTotal = 0;

	public void adicionaPizza(Pizza a) {
		
		if (a.getIngrediente().isEmpty()) {
		}
		
		else
			pizzas.add(a);
		}
	
	public int totalDePizzas() {
		
		return pizzas.size();
	}
	
	public double getPrecoTotal() {
		
		for (int i = 0; i < pizzas.size(); i++) {
			precoTotal += pizzas.get(i).getPreco();
		}
		
		return precoTotal;
	}
}