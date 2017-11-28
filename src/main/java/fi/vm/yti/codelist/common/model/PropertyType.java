package fi.vm.yti.codelist.common.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonView;

import io.swagger.annotations.ApiModel;
import static fi.vm.yti.codelist.common.constants.ApiConstants.LANGUAGE_CODE_EN;

@Entity
@JsonFilter("propertyType")
@Table(name = "propertytype")
@XmlRootElement
@XmlType(propOrder = {"id", "uri", "context", "propertyUri", "localName", "type", "prefLabel", "definition"})
@ApiModel(value = "PropertyType", description = "PropertyType model for data relation typing.")
public class PropertyType extends AbstractIdentifyableCode implements Serializable {

    private static final long serialVersionUID = 1L;

    private String uri;
    private String propertyUri;
    private String localName;
    private String context;
    private String type;
    private Map<String, String> prefLabel;
    private Map<String, String> definition;

    @Column(name = "localname")
    @JsonView(Views.Normal.class)
    public String getLocalName() {
        return localName;
    }

    public void setLocalName(final String localName) {
        this.localName = localName;
    }

    @Column(name = "context")
    @JsonView(Views.Normal.class)
    public String getContext() {
        return context;
    }

    public void setContext(final String context) {
        this.context = context;
    }

    @Column(name = "type")
    @JsonView(Views.Normal.class)
    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Column(name = "uri")
    @JsonView(Views.Normal.class)
    public String getUri() {
        return uri;
    }

    public void setUri(final String uri) {
        this.uri = uri;
    }

    @Column(name = "propertyuri")
    @JsonView(Views.Normal.class)
    public String getPropertyUri() {
        return propertyUri;
    }

    public void setPropertyUri(final String propertyUri) {
        this.propertyUri = propertyUri;
    }

    @ElementCollection(targetClass = String.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "propertytype_preflabel", joinColumns = @JoinColumn(name = "propertytype_id", referencedColumnName = "id"))
    @MapKeyColumn(name = "language")
    @Column(name = "preflabel")
    @OrderColumn
    @JsonView(Views.Normal.class)
    public Map<String, String> getPrefLabel() {
        if (prefLabel == null) {
            prefLabel = new HashMap<>();
        }
        return prefLabel;
    }

    public void setPrefLabel(final Map<String, String> prefLabel) {
        this.prefLabel = prefLabel;
    }

    public String getPrefLabel(final String language) {
        String prefLabel = this.prefLabel.get(language);
        if (prefLabel == null) {
            prefLabel = this.prefLabel.get(LANGUAGE_CODE_EN);
        }
        return prefLabel;
    }

    public void setPrefLabel(final String language, final String name) {
        if (prefLabel == null) {
            prefLabel = new HashMap<>();
        }
        if (language != null && name != null && !name.isEmpty()) {
            prefLabel.put(language, name);
        } else if (language != null && name == null) {
            prefLabel.remove(language);
        }
        setPrefLabel(prefLabel);
    }

    @ElementCollection(targetClass = String.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "propertytype_definition", joinColumns = @JoinColumn(name = "propertytype_id", referencedColumnName = "id"))
    @MapKeyColumn(name = "language")
    @Column(name = "definition")
    @OrderColumn
    @JsonView(Views.Normal.class)
    public Map<String, String> getDefinition() {
        if (definition == null) {
            definition = new HashMap<>();
        }
        return definition;
    }

    public void setDefinition(final Map<String, String> definition) {
        this.definition = definition;
    }

    public String getDefinition(final String language) {
        String definition = this.definition.get(language);
        if (definition == null) {
            definition = this.definition.get(LANGUAGE_CODE_EN);
        }
        return definition;
    }

    public void setDefinition(final String language, final String name) {
        if (definition == null) {
            definition = new HashMap<>();
        }
        if (language != null && name != null && !name.isEmpty()) {
            definition.put(language, name);
        } else if (language != null && name == null) {
            definition.remove(language);
        }
        setDefinition(definition);
    }
}
