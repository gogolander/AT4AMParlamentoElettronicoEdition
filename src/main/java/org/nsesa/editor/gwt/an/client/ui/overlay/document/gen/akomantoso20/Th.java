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
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.*;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
 */

public class Th extends BlocksoptComplexType {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
            put(new Foreign(), new Occurrence(0, -1));
            put(new Block(), new Occurrence(0, -1));
            put(new BlockList(), new Occurrence(0, -1));
            put(new Toc(), new Occurrence(0, -1));
            put(new Tblock(), new Occurrence(0, -1));
            put(new Ul(), new Occurrence(0, -1));
            put(new Ol(), new Occurrence(0, -1));
            put(new Table(), new Occurrence(0, -1));
            put(new P(), new Occurrence(0, -1));
        }
    };


    // STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "th");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget th");
        return span;
    }

    // CONSTRUCTORS ------------------
    public Th() {
        super(create());
        setType("th");
    }

    public Th(Element element) {
        super(element);
    }

    // FIELDS ------------------
    private IntegerSimpleType rowspanAttr;
    private IntegerSimpleType colspanAttr;

    public IntegerSimpleType getRowspanAttr() {
        if (rowspanAttr == null) {
            rowspanAttr = new IntegerSimpleType();
            rowspanAttr.setValue(getElement().getAttribute("rowspan"));
        }

        return rowspanAttr;
    }

    //DSL Style get value
    public IntegerSimpleType rowspanAttr() {
        return getRowspanAttr();
    }

    public void setRowspanAttr(final IntegerSimpleType rowspanAttr) {
        this.rowspanAttr = rowspanAttr;
    }

    //DSL Style set value
    public Th rowspanAttr(final IntegerSimpleType rowspanAttr) {
        setRowspanAttr(rowspanAttr);
        return this;
    }

    public IntegerSimpleType getColspanAttr() {
        if (colspanAttr == null) {
            colspanAttr = new IntegerSimpleType();
            colspanAttr.setValue(getElement().getAttribute("colspan"));
        }

        return colspanAttr;
    }

    //DSL Style get value
    public IntegerSimpleType colspanAttr() {
        return getColspanAttr();
    }

    public void setColspanAttr(final IntegerSimpleType colspanAttr) {
        this.colspanAttr = colspanAttr;
    }

    //DSL Style set value
    public Th colspanAttr(final IntegerSimpleType colspanAttr) {
        setColspanAttr(colspanAttr);
        return this;
    }

    //Override all attributes methods to be conformant with DSL approach
    //DSL Style set value
    public Th refersToAttr(final AnyURISimpleType refersToAttr) {
        setRefersToAttr(refersToAttr);
        return this;
    }

    //DSL Style set value
    public Th idAttr(final IDSimpleType idAttr) {
        setIdAttr(idAttr);
        return this;
    }

    //DSL Style set value
    public Th evolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        setEvolvingIdAttr(evolvingIdAttr);
        return this;
    }

    //DSL Style set value
    public Th wildcardContentAttr(final String wildcardContentAttr) {
        setWildcardContentAttr(wildcardContentAttr);
        return this;
    }

    //DSL Style set value
    public Th classAttr(final StringSimpleType classAttr) {
        setClassAttr(classAttr);
        return this;
    }

    //DSL Style set value
    public Th styleAttr(final StringSimpleType styleAttr) {
        setStyleAttr(styleAttr);
        return this;
    }

    //DSL Style set value
    public Th titleAttr(final StringSimpleType titleAttr) {
        setTitleAttr(titleAttr);
        return this;
    }

    //DSL Style set value
    public Th langAttr(final LanguageSimpleType langAttr) {
        setLangAttr(langAttr);
        return this;
    }

    //DSL Style set value
    public Th alternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        setAlternativeToAttr(alternativeToAttr);
        return this;
    }

    //DSL Style set value
    public Th statusAttr(final StatusTypeSimpleType statusAttr) {
        setStatusAttr(statusAttr);
        return this;
    }

    //DSL Style set value
    public Th periodAttr(final AnyURISimpleType periodAttr) {
        setPeriodAttr(periodAttr);
        return this;
    }

    /**
     * Returns possible children as a map of <tt>AmendableWidget, Occurrence</tt>s.
     */
    @Override
    public Map<AmendableWidget, Occurrence> getAllowedChildTypes() {
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
        attrs.put("rowspan", getRowspanAttr() != null ? getRowspanAttr().getValue() : null);
        attrs.put("colspan", getColspanAttr() != null ? getColspanAttr().getValue() : null);
        return attrs;
    }
}

