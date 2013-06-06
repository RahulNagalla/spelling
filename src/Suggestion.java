/**
 * Mots sugg�r�s pour correction avec leur probabilit�
 *
 */
class Suggestion implements Comparable {
   
	/**
	 * La suggestion
	 */
	private final String mot;
	
	/**
	 * Probabilit� de la suggestion
	 */
    private double probabilite;

    /**
     * Constructeur
     * @param mot
     * @param probabilite
     */
    public Suggestion(String mot, double probabilite) {
        this.mot = mot;
        this.probabilite = probabilite;
    }

    /**
     * Renvoie la suggestion
     * @return mot
     */
    public String getMot() {
        return mot;
    }

    /**
     * Renvoie la probabilit� de la suggestion
     * @return probabilit� suggestion
     */
    public double getProbabilite() {
        return probabilite;
    }

    /**
     * Fixe la probabilit� donn�e
     * @param probabilite
     */
    public void setProbabilite(double probabilite) {        
        this.probabilite = probabilite;        
    }

    /**
     * Compare la probabilit� de notre suggestion � celle d'une autre suggestion. Renvoie 1 si proba sup�rieur � celle ente parenth�ses, -1 si inf�rieur, z�ro si �gale.
     */
	@Override
	public int compareTo(Object o) {
		double autre = ((Suggestion)o).probabilite;
		if (probabilite > autre)
			return 1;
		else if (probabilite < autre)
			return -1;
		else 
			return 0;
	}
    
}