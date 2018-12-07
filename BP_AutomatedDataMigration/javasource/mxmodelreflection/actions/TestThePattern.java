// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package mxmodelreflection.actions;

import mxmodelreflection.DataParser;
import mxmodelreflection.proxies.TestPattern;
import mxmodelreflection.proxies.Token;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObjectMember;
import com.mendix.webui.CustomJavaAction;
import com.mendix.webui.FeedbackHelper;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class TestThePattern extends CustomJavaAction<Boolean>
{
	private IMendixObject __TestPatternObj;
	private mxmodelreflection.proxies.TestPattern TestPatternObj;

	public TestThePattern(IContext context, IMendixObject TestPatternObj)
	{
		super(context);
		this.__TestPatternObj = TestPatternObj;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		this.TestPatternObj = __TestPatternObj == null ? null : mxmodelreflection.proxies.TestPattern.initialize(getContext(), __TestPatternObj);

		// BEGIN USER CODE
		
		IMendixObjectMember<?> member = null;
		switch (this.TestPatternObj.getAttributeTypeEnum(getContext())) {
		case AutoNumber:
		case LongType:
			member = this.TestPatternObj.getMendixObject().getMember(getContext(), TestPattern.MemberNames.LongAttribute.toString());
			break;
		case BooleanType:
			member = this.TestPatternObj.getMendixObject().getMember(getContext(), TestPattern.MemberNames.BooleanAttribute.toString());
			break;
		case Currency:
		case FloatType:
			member = this.TestPatternObj.getMendixObject().getMember(getContext(), TestPattern.MemberNames.FloatAttribute.toString());
			break;
		case Decimal:
			member = this.TestPatternObj.getMendixObject().getMember(getContext(), TestPattern.MemberNames.DecimalAttribute.toString());
			break;
		case EnumType:
		case StringType:
		case HashString:
			member = this.TestPatternObj.getMendixObject().getMember(getContext(), TestPattern.MemberNames.StringAttribute.toString());
			break;
		case DateTime:
			member = this.TestPatternObj.getMendixObject().getMember(getContext(), TestPattern.MemberNames.DateTimeAttribute.toString());
			break;
		case IntegerType:
			member = this.TestPatternObj.getMendixObject().getMember(getContext(), TestPattern.MemberNames.IntegerAttribute.toString());
			break;
		}
		
		String replacementValue = DataParser.getStringValue(member, this.TestPatternObj.getDisplayPattern(), getContext());
		
		this.TestPatternObj.setResult( replacementValue );
		
		FeedbackHelper.addRefreshObjectFeedback(getContext(), this.TestPatternObj.getMendixObject().getId());
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "TestThePattern";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
