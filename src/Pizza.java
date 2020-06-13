import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;	

public class Pizza {
	
	public static int contIngrediente = 0;
	public static Map<String, Integer> ingredienteMap = new HashMap<String, Integer>();
	private ArrayList<String> ingredientePizza = new ArrayList<String>();
	
	public ArrayList<String> getIngrediente(){
		return ingredientePizza;
	}
	
	public static Map<String, Integer> getListaIngredientes() {
		return ingredienteMap;
	}
	
	public void adicionaIngrediente(String novoIngrediente){
		this.ingredientePizza.add(novoIngrediente);
		contabilizaIngrediente(novoIngrediente);
	}

	public void contabilizaIngrediente(String novoIngrediente) {
		if (ingredienteMap.containsKey(novoIngrediente)) {
			int value = ingredienteMap.get(novoIngrediente);
			ingredienteMap.put(novoIngrediente, value + 1);
		} else {
			ingredienteMap.put(novoIngrediente, 1);
		}
		contIngrediente++;	
	}
	
	public double getPreco() {
		double preco;
		if(ingredientePizza.size() <= 2) {
			preco = 15.00;
		}
		else if((ingredientePizza.size() >= 3) && (ingredientePizza.size() <= 5)) {
			preco = 20.00;
		}else {
			preco = 23.00;
		}
		return preco;
	}
	
	public static void zerarIngrediente() {
		contIngrediente = 0;
	}
	
}
