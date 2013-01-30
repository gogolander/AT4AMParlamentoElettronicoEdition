package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20;

import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.QuorumVerification;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Voting;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso20.Recount;
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

public class ParliamentaryAnalysisComplexType extends AmendableWidgetImpl  {
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
            put(new QuorumVerification(), new Occurrence(1,1));
            put(new Voting(), new Occurrence(1,1));
            put(new Recount(), new Occurrence(1,1));
        }
    };


// STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "parliamentaryAnalysisComplexType");
        span.setAttribute("ns", "http://www.akomantoso.org/2.0");
        span.setClassName("widget parliamentaryAnalysisComplexType");
        return span;
    }

// CONSTRUCTORS ------------------

    public ParliamentaryAnalysisComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------

    public java.util.List<QuorumVerification> getQuorumVerifications() {
        java.util.List<QuorumVerification> result = new ArrayList<QuorumVerification>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("QuorumVerification".equalsIgnoreCase(widget.getType())) {
                result.add((QuorumVerification)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<QuorumVerification> getQuorumVerificationList() {
        return  getQuorumVerifications();
    }
     //DSL Style set value
    public QuorumVerification addQuorumVerification(QuorumVerification quorumVerificationElem) {
        this.addAmendableWidget(quorumVerificationElem);
        return quorumVerificationElem;
    }

    public java.util.List<Voting> getVotings() {
        java.util.List<Voting> result = new ArrayList<Voting>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Voting".equalsIgnoreCase(widget.getType())) {
                result.add((Voting)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Voting> getVotingList() {
        return  getVotings();
    }
     //DSL Style set value
    public Voting addVoting(Voting votingElem) {
        this.addAmendableWidget(votingElem);
        return votingElem;
    }

    public java.util.List<Recount> getRecounts() {
        java.util.List<Recount> result = new ArrayList<Recount>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Recount".equalsIgnoreCase(widget.getType())) {
                result.add((Recount)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public java.util.List<Recount> getRecountList() {
        return  getRecounts();
    }
     //DSL Style set value
    public Recount addRecount(Recount recountElem) {
        this.addAmendableWidget(recountElem);
        return recountElem;
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
        return attrs;
    }
}

