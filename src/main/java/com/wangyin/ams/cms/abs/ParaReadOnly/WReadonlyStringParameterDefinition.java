/**
 * 
 */
package com.wangyin.ams.cms.abs.ParaReadOnly;

import hudson.Extension;
import hudson.model.ParameterDefinition;
import hudson.model.ParameterValue;
import net.sf.json.JSONObject;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.StaplerRequest;

/**
 * @author zheng weina
 * 
 */
public class WReadonlyStringParameterDefinition extends ParameterDefinition {

	private static final long serialVersionUID = 8296806777255584941L;
	private String defaultValue;

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
 
    @DataBoundConstructor
	public WReadonlyStringParameterDefinition(String name,String defaultValue, String description) {
		super(name, description);
		this.defaultValue = defaultValue;
	}
 
    @Extension
	public static class DescriptorImpl extends ParameterDescriptor {
        @Override
        public String getDisplayName() {
            return "Readonly String Parameter";
        }
    }

    @Override
	public WReadonlyStringParameterValue getDefaultParameterValue() {
    	WReadonlyStringParameterValue v = new WReadonlyStringParameterValue(getName(),defaultValue, getDescription());
		return v;
	}



	public ParameterValue createValue(StaplerRequest req) {
        String[] value = req.getParameterValues(getName());
        if (value == null) {
            return getDefaultParameterValue();
        } else if (value.length != 1) {
            throw new IllegalArgumentException("Illegal number of parameter values for " + getName() + ": " + value.length);
        } else {
            return new WReadonlyStringParameterValue(getName(), value[0], getDescription());
        } 
	}


	public ParameterValue createValue(StaplerRequest req, JSONObject jo) {
		WReadonlyStringParameterValue value = req.bindJSON(WReadonlyStringParameterValue.class, jo);
        value.setDescription(getDescription());
		return value;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) { 

	}

}
