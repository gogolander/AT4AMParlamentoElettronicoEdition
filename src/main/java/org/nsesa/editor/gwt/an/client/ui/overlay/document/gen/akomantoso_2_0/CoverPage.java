package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class CoverPage extends BasicoptComplexType  {

// CONSTRUCTORS ------------------
    public CoverPage() {
        super(DOM.createElement("coverPage"));
    }

    public CoverPage(Element element) {
        super(element);
    }

// FIELDS ------------------
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"ul","toc","tblock","blockList","container","p","block","table","ol","foreign","formula"};
    }

}

