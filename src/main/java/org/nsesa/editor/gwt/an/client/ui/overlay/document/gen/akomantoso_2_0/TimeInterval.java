package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.DurationSimpleType;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class TimeInterval extends MetaoptComplexType  {

// CONSTRUCTORS ------------------
    public TimeInterval() {
        super(DOM.createElement("timeInterval"));
    }

    public TimeInterval(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType startAttr;
    private AnyURISimpleType endAttr;
    private DurationSimpleType durationAttr;
    private AnyURISimpleType refersToAttr;
    public AnyURISimpleType getStartAttr() {
        return startAttr;
    }
    public void setStartAttr(final AnyURISimpleType startAttr) {
        this.startAttr = startAttr;
    }
    public AnyURISimpleType getEndAttr() {
        return endAttr;
    }
    public void setEndAttr(final AnyURISimpleType endAttr) {
        this.endAttr = endAttr;
    }
    public DurationSimpleType getDurationAttr() {
        return durationAttr;
    }
    public void setDurationAttr(final DurationSimpleType durationAttr) {
        this.durationAttr = durationAttr;
    }
    public AnyURISimpleType getRefersToAttr() {
        return refersToAttr;
    }
    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{};
    }

}

