package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.MetaoptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.DateSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
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
public class Publication extends MetaoptComplexType  {

// CONSTRUCTORS ------------------
    public Publication() {
        super(DOM.createElement("publication"));
    }

    public Publication(Element element) {
        super(element);
    }

// FIELDS ------------------
    private StringSimpleType showAsAttr;
    private StringSimpleType shortFormAttr;
    private DateSimpleType dateAttr;
    private AnyURISimpleType refersToAttr;
    private StringSimpleType numberAttr;
    private StringSimpleType nameAttr;
    public StringSimpleType getShowAsAttr() {
        if (showAsAttr == null) {
            showAsAttr = new StringSimpleType();
            showAsAttr.setValue(amendableElement.getAttribute("showAs"));
        }

        return showAsAttr;
    }
    //DSL Style get value
    public StringSimpleType showAsAttr() {
         return  getShowAsAttr();
    }

    public void setShowAsAttr(final StringSimpleType showAsAttr) {
        this.showAsAttr = showAsAttr;
    }
    //DSL Style set value
    public Publication showAsAttr(final StringSimpleType showAsAttr) {
        setShowAsAttr(showAsAttr);
        return this;
    }
    public StringSimpleType getShortFormAttr() {
        if (shortFormAttr == null) {
            shortFormAttr = new StringSimpleType();
            shortFormAttr.setValue(amendableElement.getAttribute("shortForm"));
        }

        return shortFormAttr;
    }
    //DSL Style get value
    public StringSimpleType shortFormAttr() {
         return  getShortFormAttr();
    }

    public void setShortFormAttr(final StringSimpleType shortFormAttr) {
        this.shortFormAttr = shortFormAttr;
    }
    //DSL Style set value
    public Publication shortFormAttr(final StringSimpleType shortFormAttr) {
        setShortFormAttr(shortFormAttr);
        return this;
    }
    public DateSimpleType getDateAttr() {
        if (dateAttr == null) {
            dateAttr = new DateSimpleType();
            dateAttr.setValue(amendableElement.getAttribute("date"));
        }

        return dateAttr;
    }
    //DSL Style get value
    public DateSimpleType dateAttr() {
         return  getDateAttr();
    }

    public void setDateAttr(final DateSimpleType dateAttr) {
        this.dateAttr = dateAttr;
    }
    //DSL Style set value
    public Publication dateAttr(final DateSimpleType dateAttr) {
        setDateAttr(dateAttr);
        return this;
    }
    public AnyURISimpleType getRefersToAttr() {
        if (refersToAttr == null) {
            refersToAttr = new AnyURISimpleType();
            refersToAttr.setValue(amendableElement.getAttribute("refersTo"));
        }

        return refersToAttr;
    }
    //DSL Style get value
    public AnyURISimpleType refersToAttr() {
         return  getRefersToAttr();
    }

    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
    }
    //DSL Style set value
    public Publication refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }
    public StringSimpleType getNumberAttr() {
        if (numberAttr == null) {
            numberAttr = new StringSimpleType();
            numberAttr.setValue(amendableElement.getAttribute("number"));
        }

        return numberAttr;
    }
    //DSL Style get value
    public StringSimpleType numberAttr() {
         return  getNumberAttr();
    }

    public void setNumberAttr(final StringSimpleType numberAttr) {
        this.numberAttr = numberAttr;
    }
    //DSL Style set value
    public Publication numberAttr(final StringSimpleType numberAttr) {
        setNumberAttr(numberAttr);
        return this;
    }
    public StringSimpleType getNameAttr() {
        if (nameAttr == null) {
            nameAttr = new StringSimpleType();
            nameAttr.setValue(amendableElement.getAttribute("name"));
        }

        return nameAttr;
    }
    //DSL Style get value
    public StringSimpleType nameAttr() {
         return  getNameAttr();
    }

    public void setNameAttr(final StringSimpleType nameAttr) {
        this.nameAttr = nameAttr;
    }
    //DSL Style set value
    public Publication nameAttr(final StringSimpleType nameAttr) {
        setNameAttr(nameAttr);
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
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
        attrs.put("showAsAttr", getShowAsAttr() != null ? getShowAsAttr().getValue() : null);
        attrs.put("shortFormAttr", getShortFormAttr() != null ? getShortFormAttr().getValue() : null);
        attrs.put("dateAttr", getDateAttr() != null ? getDateAttr().getValue() : null);
        attrs.put("refersToAttr", getRefersToAttr() != null ? getRefersToAttr().getValue() : null);
        attrs.put("numberAttr", getNumberAttr() != null ? getNumberAttr().getValue() : null);
        attrs.put("nameAttr", getNameAttr() != null ? getNameAttr().getValue() : null);
        return attrs;
    }

}
