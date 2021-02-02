package de.demmer.dennis;

public class Renderer {
	
	
	public void render(VisualObject visualObject) {
		String visual = visualObject.getVisualRepresentation();
		
		
		System.out.println(visual);
	}

}
