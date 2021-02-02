package de.demmer.dennis;

public class Pikachu extends Pokemon implements VisualObject{

	
	
	@Override
	public void scream() {
		System.out.println("pika pika");
	}

	@Override
	public String getVisualRepresentation() {
		return "`;-.          ___,\r\n"
				+ "  `.`\\_...._/`.-\"`\r\n"
				+ "    \\        /      ,\r\n"
				+ "    /()   () \\    .' `-._\r\n"
				+ "   |)  .    ()\\  /   _.'\r\n"
				+ "   \\  -'-     ,; '. <\r\n"
				+ "    ;.__     ,;|   > \\\r\n"
				+ "   / ,    / ,  |.-'.-'\r\n"
				+ "  (_/    (_/ ,;|.<`\r\n"
				+ "    \\    ,     ;-`\r\n"
				+ "     >   \\    /\r\n"
				+ "    (_,-'`> .'\r\n"
				+ "         (_,'";
	}

}
