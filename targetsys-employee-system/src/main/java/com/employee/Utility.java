package com.employee;

public class Utility {
	 public static String toCamelCase(final String init) {
		    if (init == null)
		        return "";

		    final StringBuilder res = new StringBuilder(init.length());

		    for (final String word : init.split(" ")) {
		        if (!word.isEmpty()) {
		            res.append(Character.toUpperCase(word.charAt(0)));
		            res.append(word.substring(1).toLowerCase());
		        }
		        if (!(res.length() == init.length()))
		            res.append(" ");
		    }

		    return res.toString();
		}
}
