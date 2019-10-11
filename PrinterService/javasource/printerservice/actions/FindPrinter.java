// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package printerservice.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;

public class FindPrinter extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject __PrinterConfig;
	private printerservice.proxies.PrintConfiguration PrinterConfig;

	public FindPrinter(IContext context, IMendixObject PrinterConfig)
	{
		super(context);
		this.__PrinterConfig = PrinterConfig;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.PrinterConfig = __PrinterConfig == null ? null : printerservice.proxies.PrintConfiguration.initialize(getContext(), __PrinterConfig);

		// BEGIN USER CODE

//		IppPrintServiceLookup lookup = new IppPrintServiceLookup(new URI(this.PrinterConfig.getPrinterName()), this.PrinterConfig.getUsername(), this.PrinterConfig.getPassword());
//		PrintService ps = lookup.getDefaultPrintService();
//		
		
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "FindPrinter";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
