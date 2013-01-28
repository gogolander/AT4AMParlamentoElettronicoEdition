package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.IDSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.NMTOKENSimpleType;
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.LinkedHashMap;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class MetaoptComplexType extends AmendableWidgetImpl  {

// STATIC create method
public static Element create() {
com.google.gwt.user.client.Element span = DOM.createSpan();
span.setAttribute("type", "metaoptComplexType");
span.setAttribute("ns", "http://www.akomantoso.org/2.0");
span.setClassName("widget metaoptComplexType");
return span;
}

// CONSTRUCTORS ------------------

public MetaoptComplexType(Element element) {
super(element);
}

// FIELDS ------------------
private IDSimpleType idAttr;
private NMTOKENSimpleType evolvingIdAttr;
private String wildcardContentAttr;

        public IDSimpleType getIdAttr() {
        if (idAttr == null) {
                idAttr = new IDSimpleType();
                idAttr.setValue(getElement().getAttribute("id"));
        }

        return idAttr;
        }
        //DSL Style get value
        public IDSimpleType idAttr() {
        return  getIdAttr();
        }

        public void setIdAttr(final IDSimpleType idAttr) {
        this.idAttr = idAttr;
        }
        //DSL Style set value
        public MetaoptComplexType idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
        }
        public NMTOKENSimpleType getEvolvingIdAttr() {
        if (evolvingIdAttr == null) {
                evolvingIdAttr = new NMTOKENSimpleType();
                evolvingIdAttr.setValue(getElement().getAttribute("evolvingId"));
        }

        return evolvingIdAttr;
        }
        //DSL Style get value
        public NMTOKENSimpleType evolvingIdAttr() {
        return  getEvolvingIdAttr();
        }

        public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        this.evolvingIdAttr = evolvingIdAttr;
        }
        //DSL Style set value
        public MetaoptComplexType evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
        }
        public String getWildcardContentAttr() {
        if (wildcardContentAttr == null) {
            //hmm nothing to do here
        }

        return wildcardContentAttr;
        }
        //DSL Style get value
        public String wildcardContentAttr() {
        return  getWildcardContentAttr();
        }

        public void setWildcardContentAttr(final String wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
        }
        //DSL Style set value
        public MetaoptComplexType wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
        }
/**
* Returns possible children as a list of <tt>String</tt>s.
*/
@Override
public String[] getAllowedChildTypes() {
return new String[]{};
}

/**
* Returns the namespace URI of this amendable widget.
*/
@Override
public String getNamespaceURI() {
return "http://www.akomantoso.org/2.0";
}

@Override
public LinkedHashMap
<String, String> getAttributes() {
final LinkedHashMap
<String, String> attrs = new LinkedHashMap
<String, String>();
attrs.putAll(super.getAttributes());
        attrs.put("id", getIdAttr() != null ? getIdAttr().getValue() : null);
        attrs.put("evolvingId", getEvolvingIdAttr() != null ? getEvolvingIdAttr().getValue() : null);
        attrs.put("wildcardContent", getWildcardContentAttr() != null ? getWildcardContentAttr().toString() : null);
return attrs;
}
}

