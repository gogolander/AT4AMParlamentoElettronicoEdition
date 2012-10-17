package org.nsesa.editor.gwt.an.client.ui.overlay.document.akomantoso20.gen;

import com.google.gwt.dom.client.Element;
import org.nsesa.editor.gwt.core.client.ui.overlay.xml.AnyURI;
import org.nsesa.editor.gwt.core.client.ui.overlay.xml.Language;
import org.nsesa.editor.gwt.core.client.ui.overlay.xml.NMTOKEN;
import org.nsesa.editor.gwt.core.client.ui.overlay.xml.StatusType;

import java.util.ArrayList;

/**
 * This file is generated.
 */
public class MainBody extends org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl {

// FIELDS ------------------

    private Language langAttribute;
    private AnyURI refersToAttribute;
    private AnyURI alternativeToAttribute;
    private NMTOKEN evolvingIdAttribute;
    private String styleAttribute;
    private String classAttribute;
    private String titleAttribute;
    private StatusType statusAttribute;
    private AnyURI periodAttribute;
    private java.util.List<Introduction> introductionElements = new ArrayList<Introduction>();
    private java.util.List<Background> backgroundElements = new ArrayList<Background>();
    private java.util.List<MainBody> mainBodyElements = new ArrayList<MainBody>();
    private java.util.List<Motivation> motivationElements = new ArrayList<Motivation>();
    private java.util.List<Decision> decisionElements = new ArrayList<Decision>();

// CONSTRUCTORS ------------------

    public MainBody(final Element amendableElement) {
        super(amendableElement);
    }

// ACCESSORS ------------------

    public Language getLangAttribute() {
        return langAttribute;
    }

    public void setLangAttribute(final Language langAttribute) {
        this.langAttribute = langAttribute;
    }

    public AnyURI getRefersToAttribute() {
        return refersToAttribute;
    }

    public void setRefersToAttribute(final AnyURI refersToAttribute) {
        this.refersToAttribute = refersToAttribute;
    }

    public AnyURI getAlternativeToAttribute() {
        return alternativeToAttribute;
    }

    public void setAlternativeToAttribute(final AnyURI alternativeToAttribute) {
        this.alternativeToAttribute = alternativeToAttribute;
    }

    public NMTOKEN getEvolvingIdAttribute() {
        return evolvingIdAttribute;
    }

    public void setEvolvingIdAttribute(final NMTOKEN evolvingIdAttribute) {
        this.evolvingIdAttribute = evolvingIdAttribute;
    }

    public String getStyleAttribute() {
        return styleAttribute;
    }

    public void setStyleAttribute(final String styleAttribute) {
        this.styleAttribute = styleAttribute;
    }

    public String getClassAttribute() {
        return classAttribute;
    }

    public void setClassAttribute(final String classAttribute) {
        this.classAttribute = classAttribute;
    }

    public String getTitleAttribute() {
        return titleAttribute;
    }

    public void setTitleAttribute(final String titleAttribute) {
        this.titleAttribute = titleAttribute;
    }

    public StatusType getStatusAttribute() {
        return statusAttribute;
    }

    public void setStatusAttribute(final StatusType statusAttribute) {
        this.statusAttribute = statusAttribute;
    }

    public AnyURI getPeriodAttribute() {
        return periodAttribute;
    }

    public void setPeriodAttribute(final AnyURI periodAttribute) {
        this.periodAttribute = periodAttribute;
    }

    public java.util.List<Introduction> getIntroductionElement() {
        return introductionElements;
    }

    public void setIntroductionElement(final java.util.List<Introduction> introductionElements) {
        this.introductionElements = introductionElements;
    }

    public java.util.List<Background> getBackgroundElement() {
        return backgroundElements;
    }

    public void setBackgroundElement(final java.util.List<Background> backgroundElements) {
        this.backgroundElements = backgroundElements;
    }

    public java.util.List<MainBody> getMainBodyElement() {
        return mainBodyElements;
    }

    public void setMainBodyElement(final java.util.List<MainBody> mainBodyElements) {
        this.mainBodyElements = mainBodyElements;
    }

    public java.util.List<Motivation> getMotivationElement() {
        return motivationElements;
    }

    public void setMotivationElement(final java.util.List<Motivation> motivationElements) {
        this.motivationElements = motivationElements;
    }

    public java.util.List<Decision> getDecisionElement() {
        return decisionElements;
    }

    public void setDecisionElement(final java.util.List<Decision> decisionElements) {
        this.decisionElements = decisionElements;
    }

}

