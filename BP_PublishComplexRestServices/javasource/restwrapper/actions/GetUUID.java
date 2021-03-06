// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package restwrapper.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * This action generates a unique ID that is 36 characters long, for example: "123e4567-e89b-12d3-a456-556642440000"
 */
public class GetUUID extends CustomJavaAction<java.lang.String>
{
	public GetUUID(IContext context)
	{
		super(context);
	}

	@Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		return java.util.UUID.randomUUID().toString();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "GetUUID";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
