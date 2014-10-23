package screens;

import javax.swing.text.MaskFormatter;

public abstract class MaskFactory {

	public static MaskFormatter createPortMask() {
		MaskFormatter formatter = null;
	    try {
	        formatter = new MaskFormatter("####");
	    } catch (java.text.ParseException exc) {
	        System.exit(-1);
	    }
	    return formatter;
	}
	
}
