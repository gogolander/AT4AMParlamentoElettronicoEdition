package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.MarkeroptComplexType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.StringSimpleType;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.PlacementTypeSimpleType;
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

public class NoteRef extends MarkeroptComplexType  {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
        }
    };


// STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "noteRef");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget noteRef");
        return span;
    }

// CONSTRUCTORS ------------------
    public NoteRef() {
        super(create());
        setType("noteRef");
    }

    public NoteRef(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AnyURISimpleType hrefAttr;
    private StringSimpleType markerAttr;
    private PlacementTypeSimpleType placementAttr;
    private AnyURISimpleType placementBaseAttr;

    public AnyURISimpleType getHrefAttr() {
        if (hrefAttr == null) {
            hrefAttr = new AnyURISimpleType();
            hrefAttr.setValue(getElement().getAttribute("href"));
        }

        return hrefAttr;
     }
     //DSL Style get value
    public AnyURISimpleType hrefAttr() {
        return  getHrefAttr();
    }

    public void setHrefAttr(final AnyURISimpleType hrefAttr) {
        this.hrefAttr = hrefAttr;
    }
     //DSL Style set value
    public NoteRef hrefAttr(final AnyURISimpleType hrefAttr) {
        setHrefAttr(hrefAttr);
        return this;
    }
    public StringSimpleType getMarkerAttr() {
        if (markerAttr == null) {
            markerAttr = new StringSimpleType();
            markerAttr.setValue(getElement().getAttribute("marker"));
        }

        return markerAttr;
     }
     //DSL Style get value
    public StringSimpleType markerAttr() {
        return  getMarkerAttr();
    }

    public void setMarkerAttr(final StringSimpleType markerAttr) {
        this.markerAttr = markerAttr;
    }
     //DSL Style set value
    public NoteRef markerAttr(final StringSimpleType markerAttr) {
        setMarkerAttr(markerAttr);
        return this;
    }
    public PlacementTypeSimpleType getPlacementAttr() {
        if (placementAttr == null) {
            placementAttr = PlacementTypeSimpleType.fromString(getElement().getAttribute("placement"));
        }

        return placementAttr;
     }
     //DSL Style get value
    public PlacementTypeSimpleType placementAttr() {
        return  getPlacementAttr();
    }

    public void setPlacementAttr(final PlacementTypeSimpleType placementAttr) {
        this.placementAttr = placementAttr;
    }
     //DSL Style set value
    public NoteRef placementAttr(final PlacementTypeSimpleType placementAttr) {
        setPlacementAttr(placementAttr);
        return this;
    }
    public AnyURISimpleType getPlacementBaseAttr() {
        if (placementBaseAttr == null) {
            placementBaseAttr = new AnyURISimpleType();
            placementBaseAttr.setValue(getElement().getAttribute("placementBase"));
        }

        return placementBaseAttr;
     }
     //DSL Style get value
    public AnyURISimpleType placementBaseAttr() {
        return  getPlacementBaseAttr();
    }

    public void setPlacementBaseAttr(final AnyURISimpleType placementBaseAttr) {
        this.placementBaseAttr = placementBaseAttr;
    }
     //DSL Style set value
    public NoteRef placementBaseAttr(final AnyURISimpleType placementBaseAttr) {
        setPlacementBaseAttr(placementBaseAttr);
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
        attrs.put("href", getHrefAttr() != null ? getHrefAttr().getValue() : null);
        attrs.put("marker", getMarkerAttr() != null ? getMarkerAttr().getValue() : null);
        attrs.put("placement", getPlacementAttr() != null ? getPlacementAttr().value() : null);
        attrs.put("placementBase", getPlacementBaseAttr() != null ? getPlacementBaseAttr().getValue() : null);
        return attrs;
    }
}

