import java.util.HashMap;
import java.util.Set;

/**
 * Table de hashage avec une valeur par d�faut
 * @author user
 *
 */
public class Dictionnaire extends HashMap<String,Integer> {
  
	/**
	 * Valeur par d�faut
	 */
	protected Integer defaultValue;
	
	/**
	 * Constructeur
	 * @param defaultValue
	 */
  public Dictionnaire(Integer defaultValue) {
    this.defaultValue = defaultValue;
  }
  
  /**
   * Obtenir la valeur d'une cl�
   */
  @Override
  public Integer get(Object k) {
    Integer v = super.get(k);
    return ((v == null) && !this.containsKey(k)) ? this.defaultValue : v;
  }
  
}