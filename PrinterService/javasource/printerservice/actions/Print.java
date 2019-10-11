// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package printerservice.actions;

import javax.print.PrintService;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import printerservice.PrinterHelper;

public class Print extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject __Job;
	private printerservice.proxies.PrintJob Job;

	public Print(IContext context, IMendixObject Job)
	{
		super(context);
		this.__Job = Job;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.Job = __Job == null ? null : printerservice.proxies.PrintJob.initialize(getContext(), __Job);

		// BEGIN USER CODE
		
		PrintService service = PrinterHelper.getPrintServices(this.Job.getPrinterName());
		PrinterHelper.printDocument(service, getContext(), Job).waitForDone();;
		
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "Print";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
