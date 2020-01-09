package eecs2030.lab5;

/**
 * A word puzzle where the puzzle word is formed by taking the letters of the
 * solution word in reverse order. For example the puzzle word "elzzup" has the
 * solution "puzzle".
 * 
 *
 */
public class ReverseWordPuzzle extends AbstractWordPuzzle {

	/**
	 * The solution to the puzzle
	 */
	private String solution;

	/**
	 * Creates a reverse word puzzle. The solution word is simply the puzzle word in
	 * reverse.
	 * 
	 * @param puzzleWord the puzzle word
	 */
	public ReverseWordPuzzle(String puzzleWord) {
		// COMPLETE THIS
		super(puzzleWord);
		this.solution = puzzleWord;
	}

	/**
	 * Get the solution for this reverse word puzzle.
	 * 
	 * @return the solution for this reverse word puzzle
	 */
	@Override
	public String getSolution() {
		// COMPLETE THIS
		String result = "";
		StringBuilder stringBuilder = new StringBuilder(solution);
		result += stringBuilder.reverse();
		return result;
	}

}