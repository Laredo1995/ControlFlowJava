package controlFlowProject;

public class AsciiChars {
	  public static void printNumbers()
	  {
	    // TODO: print valid numeric input
		  for (int i = 0; i <= 127; i++) {
			    if (Character.isDigit((char) i)) {
			        System.out.println("Numeric value of " + (char) i + " in ASCII is " + i);
			    }
			}
	  }

	  public static void printLowerCase()
	  {
	    // TODO: print valid lowercase alphabetic input
		  for (int i = 0; i <= 127; i++) {
			    if (Character.isLowerCase((char) i)) {
			        System.out.println("Numeric value of " + (char) i + " in ASCII is " + i);
			    }
			}
	  }

	  public static void printUpperCase()
	  {
	    // TODO: print valid uppercase alphabetic input
		  for (int i = 0; i <= 127; i++) {
			    if (Character.isUpperCase((char) i)) {
			        System.out.println("Numeric value of " + (char) i + " in ASCII is " + i);
			    }
			}
	  }
	}

