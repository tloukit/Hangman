
public class Noose {
	
	private static String[] STAGES = {
			" ------\\\n   |   |\n       |\n       |\n       |\n       |\n       |\n========",
            " ------\\\n   |   |\n   O   |\n       |\n       |\n       |\n       |\n========",
            " ------\\\n   |   |\n   O   |\n   |   |\n   |   |\n       |\n       |\n========",
            " ------\\\n   |   |\n   O   |\n --+   |\n   |   |\n       |\n       |\n========",
            " ------\\\n   |   |\n   O   |\n --+-- |\n   |   |\n       |\n       |\n========",
            " ------\\\n   |   |\n   O   |\n --+-- |\n   |   |\n  /    |\n       |\n========",
            " ------\\\n   |   |\n   O   |\n --+-- |\n   |   |\n  / \\  |\n       |\n========"
	};
	
	public static final int NB_STAGES = STAGES.length;
	
	int stage;
	
	public boolean isComplete() {
		return stage == NB_STAGES - 1;
	}
	
	public void advance() {
		if(!isComplete()) {
			stage++;
		}
	}
	
	@Override
	public String toString() {
		return STAGES[stage];
	}
	
	
}
