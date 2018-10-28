
public interface PlagiarismChecker {

	// returns a double value which is a score based on the similarity of the two programs
	// NOTE: "Program" class to be implemented
	public double compare(Program program1, Program program2);
}
