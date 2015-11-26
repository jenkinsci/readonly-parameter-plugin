// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   StringParameterValue.java

package com.wangyin.ams.cms.abs.ParaReadOnly;

import hudson.model.StringParameterValue;
import org.kohsuke.stapler.DataBoundConstructor;

/**
* @author zheng weina
*/
public class WReadonlyStringParameterValue extends StringParameterValue {
	
	private static final long serialVersionUID = 6926027508686211675L;

	@DataBoundConstructor
    public WReadonlyStringParameterValue(String name, String value) {
        super(name, value);
    }

    public WReadonlyStringParameterValue(String name, String value, String description) {
        super(name, value, description);
    }

    @Override
    public String toString() {
        return "(WReadonlyStringParameterValue) " + getName() + "='" + value + "'";
    }
}