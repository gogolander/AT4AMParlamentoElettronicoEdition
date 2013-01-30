package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.MarkeroptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IntegerSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.HashMap;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import java.util.LinkedHashMap;
import java.util.Map;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class EolTypeComplexType extends MarkeroptComplexType  {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
        }
    };


// STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "eolTypeComplexType");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget eolTypeComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    public EolTypeComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    private IntegerSimpleType breakatAttr;

    public IntegerSimpleType getBreakatAttr() {
        if (breakatAttr == null) {
            breakatAttr = new IntegerSimpleType();
            breakatAttr.setValue(getElement().getAttribute("breakat"));
        }

        return breakatAttr;
     }
     //DSL Style get value
    public IntegerSimpleType breakatAttr() {
        return  getBreakatAttr();
    }

    public void setBreakatAttr(final IntegerSimpleType breakatAttr) {
        this.breakatAttr = breakatAttr;
    }
     //DSL Style set value
    public EolTypeComplexType breakatAttr(final IntegerSimpleType breakatAttr) {
        setBreakatAttr(breakatAttr);
        return this;
    }
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{};
    }

    @Override
    public Map<AmendableWidget, Occurrence> getAllowedSubTypes() {
        return ALLOWED_SUB_TYPES;
    }

/**
    * Returns the namespace URI of this amendable widget.
    */
    @Override
    public String getNamespaceURI() {
        return "http://www.akomantoso.org/2.0";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("breakat", getBreakatAttr() != null ? getBreakatAttr().getValue() : null);
        return attrs;
    }
}

