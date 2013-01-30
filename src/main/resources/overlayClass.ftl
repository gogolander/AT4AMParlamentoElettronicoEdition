<#-- @ftlvariable name="overlayClass" type="org.nsesa.editor.app.xsd.model.OverlayClass" -->
package ${packageNameGenerator.getPackageName(overlayClass)};

<#list overlayClass.getImports(packageNameGenerator) as import>
import ${import};
</#list>
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
import java.util.Arrays;
<#if overlayClass.complex || overlayClass.element || overlayClass.hasWildCardProperties()>
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidget;
import java.util.HashMap;
import org.nsesa.editor.gwt.core.client.ui.overlay.document.Occurrence;
</#if>
import java.util.LinkedHashMap;
import java.util.Map;
import com.google.gwt.user.client.DOM;

/**
* This file is generated. Rather than changing this file, correct the template called <tt>overlayClass.ftl</tt>.
*/

public class ${overlayClass.className?cap_first} <#if overlayClass.parent?? && (overlayClass.parent.complex || overlayClass.parent.element || overlayClass.parent.simple)>extends ${overlayClass.parent.className?cap_first}<#else><#if overlayClass.complex || overlayClass.element>extends AmendableWidgetImpl</#if></#if>  <#if overlayClass.interfaces??>implements <#list overlayClass.interfaces as interface>${interface.getSimpleName()}<#if interface_has_next>, </#if></#list> </#if>{
<#if overlayClass.complex || overlayClass.element>
    private static Map<AmendableWidget, Occurrence> ALLOWED_SUB_TYPES = new HashMap<AmendableWidget, Occurrence>() {
        {
            <#list overlayClass.allNonAttributesProperties as prop>
                <#if prop.wildCard>
            put(null, new Occurrence(${prop.minOccurs},${prop.maxOccurs}));
                <#else>
            put(new ${prop.className?cap_first}(), new Occurrence(${prop.minOccurs},${prop.maxOccurs}));
                </#if>
            </#list>
        }
    };
</#if>


// STATIC create method
    public static Element create() {
        com.google.gwt.user.client.Element span = DOM.createSpan();
        span.setAttribute("type", "${overlayClass.className}");
        span.setAttribute("ns", "${overlayClass.nameSpace}");
        span.setClassName("widget ${overlayClass.className}");
        return span;
    }

// CONSTRUCTORS ------------------
<#if overlayClass.element>
    public ${overlayClass.className?cap_first}() {
        super(create());
        setType("${overlayClass.className}");
    }
</#if>

<#if overlayClass.complex || overlayClass.element>
    public ${overlayClass.className?cap_first}(Element element) {
        super(element);
    }
</#if>
<#if overlayClass.simple>
    public ${overlayClass.className?cap_first}() {
        super();
    }
</#if>

// FIELDS ------------------
<#if overlayClass.complex || overlayClass.element>
    <#list overlayClass.properties as property>
        <#if property.attribute>
            <@generateField property=property/>
        </#if>
    </#list>
</#if>
<#if overlayClass.simple>
    <#list overlayClass.properties as property>
        <@generateField property=property/>
    </#list>
</#if>
<#if overlayClass.complex || overlayClass.element>

    <#list overlayClass.properties as property>
        <#if property.attribute>
    public <@propertyClassName property=property/> <#if property.className?cap_first == "Boolean">is<#else>get</#if><@propertyNameCap property = property/>() {
        if (<@propertyName property = property/> == null) {
            <#if property.baseClass?? && !property.baseClass.enumeration>
            <@propertyName property = property/> = new ${property.className?cap_first}();
            <@propertyName property = property/>.setValue(getElement().getAttribute("${property.name}"));
            <#elseif property.baseClass?? && property.baseClass.enumeration>
            <@propertyName property = property/> = ${property.className?cap_first}.fromString(getElement().getAttribute("${property.name}"));
            <#elseif !property.wildCard>
            <@propertyName property = property/> = getElement().getAttribute("${property.name}");
            <#else>
            //hmm nothing to do here
            </#if>
        }

        return <@propertyName property = property/>;
     }
     //DSL Style get value
    public <@propertyClassName property=property/> <@propertyName property = property/>() {
        return  <#if property.className?cap_first == "Boolean">is<#else>get</#if><@propertyNameCap property = property/>();
    }

    public void set<@propertyNameCap property = property/>(final <@propertyClassName property=property/> <@propertyName property = property/>) {
        this.<@propertyName property = property/> = <@propertyName property = property/>;
    }
     //DSL Style set value
    public ${overlayClass.className?cap_first} <@propertyName property = property/>(final <@propertyClassName property=property/> <@propertyName property = property/>) {
        set<@propertyNameCap property = property/>(<@propertyName property = property/>);
        return this;
    }
        <#else>
            <#if property.collection>
    public <@propertyClassName property=property/> <#if property.className?cap_first == "Boolean">is<#else>get</#if><@propertyNameCap property = property/>() {
        <@propertyClassName property=property/> result = new ArrayList<<@elementClassName property=property/>>();
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("<@elementClassName property=property/>".equalsIgnoreCase(widget.getType())) {
                result.add((<@elementClassName property=property/>)widget);
            }
        }
        return java.util.Collections.unmodifiableList(result);
    }

     //DSL Style get value
    public <@propertyClassName property=property/> get${property.javaName?cap_first}List() {
        return  <#if property.className?cap_first == "Boolean">is<#else>get</#if><@propertyNameCap property = property/>();
    }
     //DSL Style set value
    public ${property.className?cap_first} add${property.javaName?cap_first}(${property.className?cap_first} ${property.javaName}Elem) {
                <#if property.wildCard>
        throw new RuntimeException("Adding wildcard content is not supported yet");
                <#else>
        this.addAmendableWidget(${property.javaName}Elem);
        return ${property.javaName}Elem;
                </#if>
    }

            <#else>
    public <@propertyClassName property=property/> <#if property.className?cap_first == "Boolean">is<#else>get</#if><@propertyNameCap property = property/>() {
        <@propertyClassName property=property/> result = null;
        for (AmendableWidget widget : getChildAmendableWidgets()) {
            if ("<@propertyClassName property=property/>".equalsIgnoreCase(widget.getType())) {
                result = (<@propertyClassName property=property/>)widget;
                break;
            }
         }
         return result;
    }
     //DSL Style get value already exists

     //DSL Style set value
    public ${property.className?cap_first} set${property.javaName?cap_first}(${property.className?cap_first} ${property.javaName}Elem) {
                <#if property.wildCard>
        throw new RuntimeException("Setting wildcard content is not supported yet");
                <#else>
        <@propertyClassName property=property/> result = <#if property.className?cap_first == "Boolean">is<#else>get</#if><@propertyNameCap property = property/>();
        // remove the child of the same type if exist
        if (result != null) {
            this.removeAmendableWidget(result);
        }
        this.addAmendableWidget(${property.javaName}Elem);

        return ${property.javaName}Elem;
                </#if>
    }
            </#if>
        </#if>
    </#list>
    /**
    * Returns possible children as a list of <tt>String</tt>s.
    */
    @Override
    public String[] getAllowedChildTypes() {
        <#assign delimiter = "">
        return new String[]{<#list overlayClass.allowedSubTypes?sort as child>${delimiter}"${child}"<#assign delimiter = ","></#list>};
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
        return "${overlayClass.nameSpace}";
    }

    @Override
    public LinkedHashMap<String, String> getAttributes() {
        final LinkedHashMap<String, String> attrs = new LinkedHashMap<String, String>();
        attrs.putAll(super.getAttributes());
    <#list overlayClass.properties as property>
        <#if property.attribute>
            <#assign stripped><@propertyName property=property/></#assign>
        attrs.put("<#if stripped?ends_with("Attr")>${stripped?substring(0, stripped?length - 4)}<#else>${stripped}</#if>", <#if property.className?cap_first == "Boolean">is<#else>get</#if><@propertyNameCap property = property/>() != null ? <#if property.className?cap_first == "Boolean">is<#else>get</#if><@propertyNameCap property = property/>()<#if property.baseClass?? && property.baseClass.enumeration>.value()<#elseif property.baseClass?? && property.baseClass.simple>.getValue()<#elseif property.wildCard && !property.attribute>.getContent()<#else>.toString()</#if> : null);
        </#if>
    </#list>
        return attrs;
    }
</#if>
<#if overlayClass.simple>
    <#list overlayClass.properties as property>
    public <@propertyClassName property=property/> <#if property.className?cap_first == "Boolean">is<#else>get</#if><@propertyNameCap property = property/>() {
        return <@propertyName property = property/>;
    }
    public void set<@propertyNameCap property = property/>(final <@propertyClassName property=property/> <@propertyName property = property/>) {
        this.<@propertyName property = property/> = <@propertyName property = property/>;
    }
    </#list>
</#if>
}

<#macro propertyClassName property><#compress>
    <#assign propName="AmendableWidgetImpl">
    <#if property.wildCard>
        <#if property.attribute>
            <#assign propName="String">
        <#else>
            <#assign propName="AmendableWidgetImpl">
        </#if>
    <#else>
        <#assign propName=property.className?cap_first>
    </#if>
    <#if property.collection>
    java.util.List<${propName}>
    <#else>
    ${propName}
    </#if>
</#compress></#macro>

<#macro elementClassName property><#compress>
    <#assign propName="AmendableWidgetImpl">
    <#if property.wildCard>
        <#if property.attribute>
            <#assign propName="String">
        <#else>
            <#assign propName="AmendableWidgetImpl">
        </#if>
    <#else>
        <#assign propName=property.className?cap_first>
    </#if>
${propName}
</#compress></#macro>

<#macro propertyName property><#compress>
    <#if property.javaName == "class">
    className
    <#elseif property.javaName == "extends">
    extendz
    <#elseif property.javaName == "for">
    forURI
    <#elseif property.javaName == "new">
    newEl
    <#else>
        <#if property.collection><@pl property=property/><#else>${property.javaName}</#if>
    </#if>
</#compress></#macro>

<#macro propertyNameCap property><#compress>
    <#if property.javaName == "class">
    ClassName
    <#else>
        <#if property.collection><@plural propertyName=property.javaName?cap_first/><#else>${property.javaName?cap_first}</#if>
    </#if>
</#compress></#macro>

<#macro generateField property>
    private <@propertyClassName property=property/> <#if property.collection><@pl property=property/> = new ArrayList
        <<#if property.wildCard && !property.attribute>AmendableWidgetImpl>
        ();<#elseif property.wildCard && property.attribute> String>()<#else>${property.className?cap_first}
        >();</#if><#else><@propertyName property = property/>;</#if>
</#macro>

<#macro pl property><#compress>
    <@plural propertyName=property.javaName/>
</#compress></#macro>

<#macro plural propertyName><#compress><#if propertyName?ends_with("y")>${propertyName?substring(0, propertyName?length - 1)}ies<#elseif propertyName?ends_with("s")>${propertyName}es<#else>${propertyName}s</#if></#compress></#macro>