package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.HierarchyComplexType;
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

public class List extends HierarchyComplexType  {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
            put(new Intro(), new Occurrence(0,1));
            put(new ComponentRef(), new Occurrence(1,1));
            put(new Wrap(), new Occurrence(0,1));
            put(new Content(), new Occurrence(1,1));
            put(new Hcontainer(), new Occurrence(0,-1));
            put(new Clause(), new Occurrence(0,-1));
            put(new Section(), new Occurrence(0,-1));
            put(new Part(), new Occurrence(0,-1));
            put(new Paragraph(), new Occurrence(0,-1));
            put(new Chapter(), new Occurrence(0,-1));
            put(new Title(), new Occurrence(0,-1));
            put(new Article(), new Occurrence(0,-1));
            put(new Book(), new Occurrence(0,-1));
            put(new Tome(), new Occurrence(0,-1));
            put(new Division(), new Occurrence(0,-1));
            put(new List(), new Occurrence(0,-1));
            put(new Point(), new Occurrence(0,-1));
            put(new Indent(), new Occurrence(0,-1));
            put(new Alinea(), new Occurrence(0,-1));
            put(new Subsection(), new Occurrence(0,-1));
            put(new Subpart(), new Occurrence(0,-1));
            put(new Subparagraph(), new Occurrence(0,-1));
            put(new Subchapter(), new Occurrence(0,-1));
            put(new Subtitle(), new Occurrence(0,-1));
            put(new Subclause(), new Occurrence(0,-1));
            put(new Sublist(), new Occurrence(0,-1));
            put(new Num(), new Occurrence(0,1));
            put(new Heading(), new Occurrence(0,1));
            put(new Subheading(), new Occurrence(0,1));
        }
    };


// STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "list");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget list");
        return span;
    }

// CONSTRUCTORS ------------------
    public List() {
        super(create());
        setType("list");
    }

    public List(Element element) {
        super(element);
    }

// FIELDS ------------------

    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"alinea","article","book","chapter","clause","componentRef","content","division","hcontainer","heading","indent","intro","list","num","paragraph","part","point","section","subchapter","subclause","subheading","sublist","subparagraph","subpart","subsection","subtitle","title","tome","wrap"};
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
        return attrs;
    }
}

