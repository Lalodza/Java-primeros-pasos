import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.*;

public class Colecciones {
	public static void main(String[] args) {
		// Las colecciones nos sirven para almacenar un conjunto
		// de objetos
		// La diferencia entre las colecciones y los arreglos
		// es que las colecciones son dinamicas, pueden cambiar
		// el numero de objetos agregados 
		
		
		// Set tiene 3 implementaciones
		
		/*
		 * --------------HashSet------------------
		 * No puede contener elementos repetidos (en todos los Set's)
		 * Los elementos no mantiene un orden
		 * Es la implementacion mas rapida 
		 */
		
		/*
		Set<String> frutas = new HashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("sandia");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		*/
		
		// for each, puede recorrer una coleccion y en cada
		// recorrido recupera el valor y lo podemos almacenar
		// en una variable 
		// Sintaxis 
		// for(tipoDeDatoElemento variable : elementoARecorrer)
		
		//for( String fruta : frutas) {   
		//	System.out.println(fruta);
		//}
		
		/*
		 * TreeSet
		 * es la implementacion mas lenta
		 * estan en ORDEN alfabetico
		 */
		
		/*
		Set<String> frutas = new TreeSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("sandia");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for( String fruta : frutas) {   
			System.out.println(fruta);
		}
		*/	
		
		/*
		 * LinkedHashSet
		 * Ordena los elementos en orden de INSERCCION
		 * Es mas costoso que HashSet
		 * 
		 */
		
		
		Set<String> frutas = new LinkedHashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("sandia");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for( String fruta : frutas) {   
			System.out.println(fruta);
		}
		System.out.println("\n-------------------------------\n\n\n\n\n");
		System.out.println("LISTAS\n------------------");
		
		/*
		 * LISTAS
		 * Se permiten elementos duplicados
		 * Acceder a elementos especificos 
		 * Buscar elemnetos
		 * 
		 */
		
		/* 
		 * ArrayList
		 * 
		 */
		List<String> pokemones = new ArrayList<String>();
		pokemones.add("Chicorita");
		pokemones.add("Eevee");
		pokemones.add("Magicarp");
		pokemones.add("Dragonita");
		pokemones.add("Charizard");
		pokemones.add("Gengar");
		pokemones.add("Flygon");
		pokemones.add("Caguamon");
		pokemones.add("Psyduck");
		pokemones.add("Pikachu");
		pokemones.add("Gengar");
		
		//add si agrega un indice y un elemento, posiciona
		//el elemento ene le indice y realiza un desplazamiento
		//no borra el elemento si no que lo desplaza
		
		pokemones.add(2,"Bulbasaur");
		
		for(String pokemon : pokemones) {
			System.out.println(pokemon);
		}
		System.out.println("*******************");
		System.out.println(pokemones.get(2));
		
		/*
		 * indexOf, nos va a devolver la posicion del elemento
		 * y si no se encuentra nos devuelve -1
		 */
		System.out.println(pokemones.indexOf("Lugia"));
		System.out.println(pokemones.indexOf("Gengar")); // solo devuelve el primer valor enconrtado
		System.out.println(pokemones.lastIndexOf("Gengar")); //Devuelve el valor del ultimo valor encontrado
		
		//remove.- remueve el elemento de la posicion especifica
		
		System.out.println("**************\nMetodo remove\n");
		pokemones.remove(11);
		
		for(String pokemon : pokemones) {
			System.out.println(pokemon);
		}
		
		//Set.- reemplaza el elemento en la posicion especifica
		System.out.println("\n\n**************\nMetodo Set\n");
		pokemones.set(0, "Pidgeotto");
		for(String pokemon : pokemones) {
			System.out.println(pokemon);
		}
		
		System.out.println("*****************\n\n\n\n\n*************");
		System.out.println("Lista LinkedList\nEs una lista doblemente enlazada\n");
		
		List<String> digimones = new LinkedList<String>();
		digimones.add("Aguamon");
		digimones.add("Patamon");
		digimones.add("Angemon");
		digimones.add("Andromon");
		digimones.add("Greymon");
		
		for(String digimon : digimones) {
			System.out.println(digimon);
		}
		
		/*
		 * Map 
		 * Asocia claves a valore
		 * No puede contener claves duplicadas
		 * Solo puede tener un valor asociado
		 */
		
		/*
		 * HashMap
		 * Tiene mejor rendimiento pero no garantiza un 
		 * orden a la hora de hacer iteraciones
		 */
		System.out.println("*****************\n\n\n\n\n*************");
		System.out.println("MAP \nHashMap\n");
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1919, "Eduardo");
		usuarios.put(4545, "Raul");
		usuarios.put(8989, "Joceline");
		
		System.out.println(usuarios.get(4545));
		
		/*
		 * KeySet 
		 * nos permite recuperar el nombre de la clave
		 * values
		 * nos permite recuperar el valor directamente
		 */
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		
		/*
		 * TreeMap
		 */
		System.out.println("*****************\n\n\n\n\n*************");
		System.out.println("MAP \nTreeMap\n");
		
		
		Map<String, String> tamales = new TreeMap<String, String>();
		tamales.put("Oaxaqueño", "Rajas");
		tamales.put("Torta", "Verde");
		tamales.put("Dulce", "Gansito");
		tamales.put("Salado", "Cochinita");
		tamales.put("Casero", "Salsa Verde");
		
		System.out.println(tamales.keySet());
		System.out.println(tamales.values());
		System.out.println(tamales);
		
		tamales.entrySet().forEach(elemento -> {  //funcion lambda
			//System.out.println(elemento.getKey().toString() + elemento.getValue().toString());
			//System.out.println(elemento);
			System.out.println(elemento.getKey());
			System.out.println(elemento.getValue());
		});
		
		
		
		/*
		 * LinkedHashMap
		 * 
		 */
		Map<Integer, String> carros = new LinkedHashMap<Integer, String>();
		carros.put(1, "Volvo");
		carros.put(15, "Pointer");
		carros.put(3, "Mustang");
		
		System.out.println("*******************");
		System.out.println(carros.keySet());
		System.out.println(carros.values());
		
		
		
	}
}
