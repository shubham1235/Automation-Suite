package org.umberella.Utils;


/**
 * OS Validation Class Verify Operating System Type.
 * 
 * @author shubhamverma
 * @Method isWindows Method for Windows OS @type Static
 * @Method isMac Method for Mac OS   @type Static
 * @Method isUnix Method for Unix based OS  @type Static
 * 
 */

public class OSValidation {

	private static String OS = System.getProperty("os.name").toLowerCase();

	public static boolean isWindows() {
		return (OS.indexOf("win") >= 0);

	}

	public static boolean isMac() {

		return (OS.indexOf("mac") >= 0);

	}

	public static boolean isUnix() {

		return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0);

	}
}
