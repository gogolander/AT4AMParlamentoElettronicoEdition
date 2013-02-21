/**
 * Copyright 2013 European Parliament
 *
 * Licensed under the EUPL, Version 1.1 or – as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.AnyURISimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.OverlayWidgetImpl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class FragmentStructureComplexType extends OverlayWidgetImpl {
    private static Map<OverlayWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<OverlayWidget, Occurrence>() {
        {
            put(new Meta(), new Occurrence(1, 1));
            put(new FragmentBody(), new Occurrence(1, 1));
        }
    };


    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "fragmentStructureComplexType");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget fragmentStructureComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    public FragmentStructureComplexType(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private AnyURISimpleType includedInAttr;

    public AnyURISimpleType getIncludedInAttr() {
        if (includedInAttr == null) {
            includedInAttr = new AnyURISimpleType();
            includedInAttr.setValue(getElement().getAttribute("includedIn"));
        }

        return includedInAttr;
    }

    //DSL Style get value
    public AnyURISimpleType includedInAttr() {
        return getIncludedInAttr();
    }

    public void setIncludedInAttr(final AnyURISimpleType includedInAttr) {
        this.includedInAttr = includedInAttr;
        getElement().setAttribute("includedIn", includedInAttr.getValue());
    }

    //DSL Style set value
    public FragmentStructureComplexType includedInAttr(final AnyURISimpleType includedInAttr) {
        setIncludedInAttr(includedInAttr);
        return this;
    }

    public Meta getMeta() {
        Meta result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("Meta".equalsIgnoreCase(widget.getType())) {
                result = (Meta) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public Meta setMeta(Meta metaElem) {
        Meta result = getMeta();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(metaElem);

        return metaElem;
    }

    public FragmentBody getFragmentBody() {
        FragmentBody result = null;
        for (OverlayWidget widget : getChildOverlayWidgets()) {
            if ("FragmentBody".equalsIgnoreCase(widget.getType())) {
                result = (FragmentBody) widget;
                break;
            }
        }
        return result;
    }
    //DSL Style get value already exists

    //DSL Style set value
    public FragmentBody setFragmentBody(FragmentBody fragmentBodyElem) {
        FragmentBody result = getFragmentBody();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeOverlayWidget(result);
        }
        this.addOverlayWidget(fragmentBodyElem);

        return fragmentBodyElem;
    }
//Override all attributes methods to be conformant with DSL approach

    /**
     * Returns possible children as a map of <tt>OverlayWidget, Occurrence</tt>s.
     */
    @Override
    public Map<OverlayWidget, Occurrence> getAllowedChildTypes() {
        return java.util.Collections.unmodifiableMap(ALLOWED_SUB_TYPES);
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
        attrs.put("includedIn", getIncludedInAttr() != null ? getIncludedInAttr().getValue() : null);
        return attrs;
    }

    //DSL Style for html method
    @Override
    public FragmentStructureComplexType html(String s) {
        super.html(s);
        return this;
    }
}

