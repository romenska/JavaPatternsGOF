package romenska.patterns.structura.сomposite;

import org.junit.jupiter.api.Test;

public class GraphicTest {
	
	
	@Test
	public void testGraphic(){
		
	    //Initialize leaf graphics
		
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        Rectangle rectangle3 = new Rectangle();
        
        //Initialize three composite graphics
        
        CompositeGraphic graphic = new CompositeGraphic();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();
        CompositeGraphic graphic3 = new CompositeGraphic();
        CompositeGraphic graphic4 = new CompositeGraphic();

        //Composes the graphics
        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(rectangle1);

        graphic2.add(rectangle2);
        graphic2.add(graphic3);
        graphic3.add(graphic4);
        graphic4.add(rectangle3);
        graphic4.add(ellipse3);
        
        graphic.add(graphic1);
        graphic.add(graphic2);
        
        graphic.print();
        
	}

}
