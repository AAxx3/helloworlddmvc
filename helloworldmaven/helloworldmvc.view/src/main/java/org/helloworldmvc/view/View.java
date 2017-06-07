package org.helloworldmvc.view;

import org.helloworldmvc.Contract.IView;

public class View implements IView{
public void displayMessage(String message) {
	System.out.println(message);
		}
}

