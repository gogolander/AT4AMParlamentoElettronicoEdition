package org.nsesa.editor.gwt.an.client.ui.overlay.document.gen.akomantoso_2_0;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.*;
import org.nsesa.editor.gwt.an.client.ui.overlay.document.gen._2001_xmlschema.LanguageSimpleType;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;

import java.util.ArrayList;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/
public class Table extends AmendableWidgetImpl  {

// CONSTRUCTORS ------------------
    public Table() {
        super(DOM.createElement("table"));
    }

    public Table(Element element) {
        super(element);
    }

// FIELDS ------------------
    private IntegerSimpleType widthAttr;
    private IntegerSimpleType borderAttr;
    private IntegerSimpleType cellspacingAttr;
    private IntegerSimpleType cellpaddingAttr;
    private AnyURISimpleType refersToAttr;
    private LanguageSimpleType langAttr;
    private StatusTypeSimpleType statusAttr;
    private AmendableWidgetImpl wildcardContentAttr;
    private IDSimpleType idAttr;
    private NMTOKENSimpleType evolvingIdAttr;
    private StringSimpleType classAttr;
    private StringSimpleType styleAttr;
    private StringSimpleType titleAttr;
    private AnyURISimpleType alternativeToAttr;
    private AnyURISimpleType periodAttr;
    public IntegerSimpleType getWidthAttr() {
        return widthAttr;
    }
    public void setWidthAttr(final IntegerSimpleType widthAttr) {
        this.widthAttr = widthAttr;
    }
    public IntegerSimpleType getBorderAttr() {
        return borderAttr;
    }
    public void setBorderAttr(final IntegerSimpleType borderAttr) {
        this.borderAttr = borderAttr;
    }
    public IntegerSimpleType getCellspacingAttr() {
        return cellspacingAttr;
    }
    public void setCellspacingAttr(final IntegerSimpleType cellspacingAttr) {
        this.cellspacingAttr = cellspacingAttr;
    }
    public IntegerSimpleType getCellpaddingAttr() {
        return cellpaddingAttr;
    }
    public void setCellpaddingAttr(final IntegerSimpleType cellpaddingAttr) {
        this.cellpaddingAttr = cellpaddingAttr;
    }
    public Caption getCaption() {
        Caption result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Caption".equalsIgnoreCase(widget.getType())) {
                result = (Caption)widget;
                break;
            }
        }
        return result;
    }
    public java.util.List<Tr> getTrs() {
        java.util.List<Tr> result = new ArrayList<Tr>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("Tr".equalsIgnoreCase(widget.getType())) {
                result.add((Tr)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
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
    public AmendableWidgetImpl getWildcardContentAttr() {
        return wildcardContentAttr;
    }
    public void setWildcardContentAttr(final AmendableWidgetImpl wildcardContentAttr) {
        this.wildcardContentAttr = wildcardContentAttr;
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
    public AnyURISimpleType getPeriodAttr() {
        return periodAttr;
    }
    public void setPeriodAttr(final AnyURISimpleType periodAttr) {
        this.periodAttr = periodAttr;
    }
    /**
    * Returns possible children as list of String
    */
    @Override
    public String[] getAllowedChildTypes() {
        return new String[]{"tr","caption"};
    }

}

