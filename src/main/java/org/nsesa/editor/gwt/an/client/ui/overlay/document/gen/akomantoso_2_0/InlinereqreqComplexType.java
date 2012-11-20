package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.*;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;

import java.util.ArrayList;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class InlinereqreqComplexType extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------

    public InlinereqreqComplexType(Element element) {
        super(element);
    }

// FIELDS ------------------
    private AmendableWidgetImpl wildcardContentAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private AnyURISimpleType alternativeToAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private AnyURISimpleType refersToAttr;
    private LanguageSimpleType langAttr;
    private StatusTypeSimpleType statusAttr;
    private AnyURISimpleType periodAttr;
    public AmendableWidgetImpl getWildcardContentAttr() {
        return wildcardContentAttr;
    }
    public void setWildcardContentAttr(final AmendableWidgetImpl wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
    }
    public StringSimpleType getClassAttr() {
        return classAttr;
    }
    public void setClassAttr(final StringSimpleType classAttr) {
        this.classAttr = classAttr;
    }
    public StringSimpleType getStyleAttr() {
        return styleAttr;
    }
    public void setStyleAttr(final StringSimpleType styleAttr) {
        this.styleAttr = styleAttr;
    }
    public StringSimpleType getTitleAttr() {
        return titleAttr;
    }
    public void setTitleAttr(final StringSimpleType titleAttr) {
        this.titleAttr = titleAttr;
    }
    public AnyURISimpleType getAlternativeToAttr() {
        return alternativeToAttr;
    }
    public void setAlternativeToAttr(final AnyURISimpleType alternativeToAttr) {
        this.alternativeToAttr = alternativeToAttr;
    }
    public IDSimpleType getIdAttr() {
        return idAttr;
    }
    public void setIdAttr(final IDSimpleType idAttr) {
        this.idAttr = idAttr;
    }
    public NMTOKENSimpleType getEvolvingIdAttr() {
        return evolvingIdAttr;
    }
    public void setEvolvingIdAttr(final NMTOKENSimpleType evolvingIdAttr) {
        this.evolvingIdAttr = evolvingIdAttr;
    }
    public AnyURISimpleType getRefersToAttr() {
        return refersToAttr;
    }
    public void setRefersToAttr(final AnyURISimpleType refersToAttr) {
        this.refersToAttr = refersToAttr;
    }
    public LanguageSimpleType getLangAttr() {
        return langAttr;
    }
    public void setLangAttr(final LanguageSimpleType langAttr) {
        this.langAttr = langAttr;
    }
    public StatusTypeSimpleType getStatusAttr() {
        return statusAttr;
    }
    public void setStatusAttr(final StatusTypeSimpleType statusAttr) {
        this.statusAttr = statusAttr;
    }
    public java.util.List<Inline> getInlines() {
        java.util.List<Inline> result = new ArrayList<Inline>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Inline".equalsIgnoreCase(widget.getType())) {
                result.add((Inline)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Marker> getMarkers() {
        java.util.List<Marker> result = new ArrayList<Marker>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Marker".equalsIgnoreCase(widget.getType())) {
                result.add((Marker)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Popup> getPopups() {
        java.util.List<Popup> result = new ArrayList<Popup>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Popup".equalsIgnoreCase(widget.getType())) {
                result.add((Popup)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public AnyURISimpleType getPeriodAttr() {
        return periodAttr;
    }
    public void setPeriodAttr(final AnyURISimpleType periodAttr) {
        this.periodAttr = periodAttr;
    }
    public java.util.List<Ref> getRefs() {
        java.util.List<Ref> result = new ArrayList<Ref>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Ref".equalsIgnoreCase(widget.getType())) {
                result.add((Ref)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Mref> getMrefs() {
        java.util.List<Mref> result = new ArrayList<Mref>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Mref".equalsIgnoreCase(widget.getType())) {
                result.add((Mref)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Rref> getRrefs() {
        java.util.List<Rref> result = new ArrayList<Rref>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Rref".equalsIgnoreCase(widget.getType())) {
                result.add((Rref)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Mod> getMods() {
        java.util.List<Mod> result = new ArrayList<Mod>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Mod".equalsIgnoreCase(widget.getType())) {
                result.add((Mod)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Mmod> getMmods() {
        java.util.List<Mmod> result = new ArrayList<Mmod>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Mmod".equalsIgnoreCase(widget.getType())) {
                result.add((Mmod)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Rmod> getRmods() {
        java.util.List<Rmod> result = new ArrayList<Rmod>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Rmod".equalsIgnoreCase(widget.getType())) {
                result.add((Rmod)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Remark> getRemarks() {
        java.util.List<Remark> result = new ArrayList<Remark>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Remark".equalsIgnoreCase(widget.getType())) {
                result.add((Remark)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<RecordedTime> getRecordedTimes() {
        java.util.List<RecordedTime> result = new ArrayList<RecordedTime>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("RecordedTime".equalsIgnoreCase(widget.getType())) {
                result.add((RecordedTime)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Vote> getVotes() {
        java.util.List<Vote> result = new ArrayList<Vote>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Vote".equalsIgnoreCase(widget.getType())) {
                result.add((Vote)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Outcome> getOutcomes() {
        java.util.List<Outcome> result = new ArrayList<Outcome>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Outcome".equalsIgnoreCase(widget.getType())) {
                result.add((Outcome)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Ins> getInses() {
        java.util.List<Ins> result = new ArrayList<Ins>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Ins".equalsIgnoreCase(widget.getType())) {
                result.add((Ins)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Del> getDels() {
        java.util.List<Del> result = new ArrayList<Del>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Del".equalsIgnoreCase(widget.getType())) {
                result.add((Del)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Omissis> getOmissises() {
        java.util.List<Omissis> result = new ArrayList<Omissis>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Omissis".equalsIgnoreCase(widget.getType())) {
                result.add((Omissis)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<ExtractText> getExtractTexts() {
        java.util.List<ExtractText> result = new ArrayList<ExtractText>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("ExtractText".equalsIgnoreCase(widget.getType())) {
                result.add((ExtractText)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<ExtractStructure> getExtractStructures() {
        java.util.List<ExtractStructure> result = new ArrayList<ExtractStructure>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("ExtractStructure".equalsIgnoreCase(widget.getType())) {
                result.add((ExtractStructure)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Placeholder> getPlaceholders() {
        java.util.List<Placeholder> result = new ArrayList<Placeholder>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Placeholder".equalsIgnoreCase(widget.getType())) {
                result.add((Placeholder)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<FillIn> getFillIns() {
        java.util.List<FillIn> result = new ArrayList<FillIn>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("FillIn".equalsIgnoreCase(widget.getType())) {
                result.add((FillIn)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<B> getBs() {
        java.util.List<B> result = new ArrayList<B>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("B".equalsIgnoreCase(widget.getType())) {
                result.add((B)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<I> getIs() {
        java.util.List<I> result = new ArrayList<I>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("I".equalsIgnoreCase(widget.getType())) {
                result.add((I)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<A> getAs() {
        java.util.List<A> result = new ArrayList<A>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("A".equalsIgnoreCase(widget.getType())) {
                result.add((A)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<U> getUs() {
        java.util.List<U> result = new ArrayList<U>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("U".equalsIgnoreCase(widget.getType())) {
                result.add((U)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Sub> getSubs() {
        java.util.List<Sub> result = new ArrayList<Sub>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Sub".equalsIgnoreCase(widget.getType())) {
                result.add((Sub)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Sup> getSups() {
        java.util.List<Sup> result = new ArrayList<Sup>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Sup".equalsIgnoreCase(widget.getType())) {
                result.add((Sup)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Span> getSpans() {
        java.util.List<Span> result = new ArrayList<Span>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Span".equalsIgnoreCase(widget.getType())) {
                result.add((Span)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<DocType> getDocTypes() {
        java.util.List<DocType> result = new ArrayList<DocType>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DocType".equalsIgnoreCase(widget.getType())) {
                result.add((DocType)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<DocTitle> getDocTitles() {
        java.util.List<DocTitle> result = new ArrayList<DocTitle>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DocTitle".equalsIgnoreCase(widget.getType())) {
                result.add((DocTitle)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<DocNumber> getDocNumbers() {
        java.util.List<DocNumber> result = new ArrayList<DocNumber>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DocNumber".equalsIgnoreCase(widget.getType())) {
                result.add((DocNumber)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<DocProponent> getDocProponents() {
        java.util.List<DocProponent> result = new ArrayList<DocProponent>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DocProponent".equalsIgnoreCase(widget.getType())) {
                result.add((DocProponent)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<DocDate> getDocDates() {
        java.util.List<DocDate> result = new ArrayList<DocDate>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DocDate".equalsIgnoreCase(widget.getType())) {
                result.add((DocDate)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Legislature> getLegislatures() {
        java.util.List<Legislature> result = new ArrayList<Legislature>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Legislature".equalsIgnoreCase(widget.getType())) {
                result.add((Legislature)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Session> getSessions() {
        java.util.List<Session> result = new ArrayList<Session>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Session".equalsIgnoreCase(widget.getType())) {
                result.add((Session)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<ShortTitle> getShortTitles() {
        java.util.List<ShortTitle> result = new ArrayList<ShortTitle>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("ShortTitle".equalsIgnoreCase(widget.getType())) {
                result.add((ShortTitle)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<DocPurpose> getDocPurposes() {
        java.util.List<DocPurpose> result = new ArrayList<DocPurpose>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DocPurpose".equalsIgnoreCase(widget.getType())) {
                result.add((DocPurpose)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<DocCommittee> getDocCommittees() {
        java.util.List<DocCommittee> result = new ArrayList<DocCommittee>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DocCommittee".equalsIgnoreCase(widget.getType())) {
                result.add((DocCommittee)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<DocIntroducer> getDocIntroducers() {
        java.util.List<DocIntroducer> result = new ArrayList<DocIntroducer>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DocIntroducer".equalsIgnoreCase(widget.getType())) {
                result.add((DocIntroducer)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<DocStage> getDocStages() {
        java.util.List<DocStage> result = new ArrayList<DocStage>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DocStage".equalsIgnoreCase(widget.getType())) {
                result.add((DocStage)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<DocStatus> getDocStatuses() {
        java.util.List<DocStatus> result = new ArrayList<DocStatus>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DocStatus".equalsIgnoreCase(widget.getType())) {
                result.add((DocStatus)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<DocJurisdiction> getDocJurisdictions() {
        java.util.List<DocJurisdiction> result = new ArrayList<DocJurisdiction>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DocJurisdiction".equalsIgnoreCase(widget.getType())) {
                result.add((DocJurisdiction)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<DocketNumber> getDocketNumbers() {
        java.util.List<DocketNumber> result = new ArrayList<DocketNumber>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("DocketNumber".equalsIgnoreCase(widget.getType())) {
                result.add((DocketNumber)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Date> getDates() {
        java.util.List<Date> result = new ArrayList<Date>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Date".equalsIgnoreCase(widget.getType())) {
                result.add((Date)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Person> getPersons() {
        java.util.List<Person> result = new ArrayList<Person>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Person".equalsIgnoreCase(widget.getType())) {
                result.add((Person)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Organization> getOrganizations() {
        java.util.List<Organization> result = new ArrayList<Organization>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Organization".equalsIgnoreCase(widget.getType())) {
                result.add((Organization)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Concept> getConcepts() {
        java.util.List<Concept> result = new ArrayList<Concept>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Concept".equalsIgnoreCase(widget.getType())) {
                result.add((Concept)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Object> getObjects() {
        java.util.List<Object> result = new ArrayList<Object>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Object".equalsIgnoreCase(widget.getType())) {
                result.add((Object)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Event> getEvents() {
        java.util.List<Event> result = new ArrayList<Event>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Event".equalsIgnoreCase(widget.getType())) {
                result.add((Event)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Location> getLocations() {
        java.util.List<Location> result = new ArrayList<Location>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Location".equalsIgnoreCase(widget.getType())) {
                result.add((Location)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Process> getProcesses() {
        java.util.List<Process> result = new ArrayList<Process>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Process".equalsIgnoreCase(widget.getType())) {
                result.add((Process)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Role> getRoles() {
        java.util.List<Role> result = new ArrayList<Role>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Role".equalsIgnoreCase(widget.getType())) {
                result.add((Role)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Term> getTerms() {
        java.util.List<Term> result = new ArrayList<Term>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Term".equalsIgnoreCase(widget.getType())) {
                result.add((Term)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Quantity> getQuantities() {
        java.util.List<Quantity> result = new ArrayList<Quantity>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Quantity".equalsIgnoreCase(widget.getType())) {
                result.add((Quantity)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Def> getDefs() {
        java.util.List<Def> result = new ArrayList<Def>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Def".equalsIgnoreCase(widget.getType())) {
                result.add((Def)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Entity> getEntities() {
        java.util.List<Entity> result = new ArrayList<Entity>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Entity".equalsIgnoreCase(widget.getType())) {
                result.add((Entity)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<CourtType> getCourtTypes() {
        java.util.List<CourtType> result = new ArrayList<CourtType>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("CourtType".equalsIgnoreCase(widget.getType())) {
                result.add((CourtType)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<NeutralCitation> getNeutralCitations() {
        java.util.List<NeutralCitation> result = new ArrayList<NeutralCitation>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("NeutralCitation".equalsIgnoreCase(widget.getType())) {
                result.add((NeutralCitation)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Party> getParties() {
        java.util.List<Party> result = new ArrayList<Party>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Party".equalsIgnoreCase(widget.getType())) {
                result.add((Party)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Judge> getJudges() {
        java.util.List<Judge> result = new ArrayList<Judge>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Judge".equalsIgnoreCase(widget.getType())) {
                result.add((Judge)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Lawyer> getLawyers() {
        java.util.List<Lawyer> result = new ArrayList<Lawyer>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Lawyer".equalsIgnoreCase(widget.getType())) {
                result.add((Lawyer)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Signature> getSignatures() {
        java.util.List<Signature> result = new ArrayList<Signature>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Signature".equalsIgnoreCase(widget.getType())) {
                result.add((Signature)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Opinion> getOpinions() {
        java.util.List<Opinion> result = new ArrayList<Opinion>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Opinion".equalsIgnoreCase(widget.getType())) {
                result.add((Opinion)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<AffectedDocument> getAffectedDocuments() {
        java.util.List<AffectedDocument> result = new ArrayList<AffectedDocument>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("AffectedDocument".equalsIgnoreCase(widget.getType())) {
                result.add((AffectedDocument)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<RelatedDocument> getRelatedDocuments() {
        java.util.List<RelatedDocument> result = new ArrayList<RelatedDocument>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("RelatedDocument".equalsIgnoreCase(widget.getType())) {
                result.add((RelatedDocument)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Change> getChanges() {
        java.util.List<Change> result = new ArrayList<Change>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Change".equalsIgnoreCase(widget.getType())) {
                result.add((Change)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<NoteRef> getNoteRefs() {
        java.util.List<NoteRef> result = new ArrayList<NoteRef>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("NoteRef".equalsIgnoreCase(widget.getType())) {
                result.add((NoteRef)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Eol> getEols() {
        java.util.List<Eol> result = new ArrayList<Eol>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Eol".equalsIgnoreCase(widget.getType())) {
                result.add((Eol)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Eop> getEops() {
        java.util.List<Eop> result = new ArrayList<Eop>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Eop".equalsIgnoreCase(widget.getType())) {
                result.add((Eop)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<Img> getImgs() {
        java.util.List<Img> result = new ArrayList<Img>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Img".equalsIgnoreCase(widget.getType())) {
                result.add((Img)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    public java.util.List<AuthorialNote> getAuthorialNotes() {
        java.util.List<AuthorialNote> result = new ArrayList<AuthorialNote>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("AuthorialNote".equalsIgnoreCase(widget.getType())) {
                result.add((AuthorialNote)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"person","neutralCitation","docType","remark","docStatus","location","change","entity","authorialNote","img","party","legislature","event","eol","role","opinion","quantity","extractStructure","eop","fillIn","signature","docStage","mmod","docCommittee","vote","ins","mod","noteRef","docNumber","rref","marker","session","recordedTime","lawyer","docPurpose","extractText","span","sub","concept","courtType","docJurisdiction","object","sup","docProponent","date","omissis","rmod","organization","def","docketNumber","judge","popup","inline","docTitle","del","docDate","relatedDocument","affectedDocument","mref","docIntroducer","b","placeholder","a","outcome","i","process","ref","u","term","shortTitle"};
    }

}

