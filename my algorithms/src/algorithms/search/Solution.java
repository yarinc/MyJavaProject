package algorithms.search;

import java.io.Serializable;
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * Solution class represent a solution to a Searchable object. 
 * It's contain a list of the moves required to solve the Searchable object.
 * @author Yarin Cohen
 * @param <T> - The type of solution.
 */
public class Solution<T> implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The solution. */
	private ArrayList<T> solution;
	
	/** The nodes evaluated. */
	private int nodesEvaluated;
	
	/**
	 * Constructor of Solution class. 
	 * Initializing with ArrayList and number of nodeEvaluated to zero.
	 */
	public Solution() { 
		solution = new ArrayList<T>();
		nodesEvaluated = 0;
	}
	/**
	 * Getter to the nodesEvaluated attribute.
	 * @return The value of nodesEvaluated.
	 */
	public int getNodesEvaluated() {
		return nodesEvaluated;
	}
	/**
	 * Setter to the node Evaluated attribute.
	 * @param nodesEvaluated The value to set the attribute.
	 */
	public void setNodesEvaluated(int nodesEvaluated) {
		this.nodesEvaluated = nodesEvaluated;
	}
	/**
	 * Getter to the ArrayList attribute.
	 * @return The ArrayList.
	 */
	public ArrayList<T> getSolution() {
		return solution;
	}
	/**
	 * Adding a node to the ArrayList.
	 * @param node The node to be added to the ArrayList.
	 */
	public void add(T node) { 
		solution.add(node); 
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String print = new String();
		for(T place : solution)
			print = print + place + "\n";
		print = print + "Number of nodes evaluated: " + nodesEvaluated + "\n";
		return print;
	}
	
}
