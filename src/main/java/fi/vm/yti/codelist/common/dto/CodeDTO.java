package fi.vm.yti.codelist.common.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonView;

import io.swagger.v3.oas.annotations.media.Schema;
import static fi.vm.yti.codelist.common.constants.ApiConstants.LANGUAGE_CODE_EN;

@JsonFilter("code")
@XmlRootElement
@XmlType(propOrder = { "id", "codeValue", "uri", "url", "status", "order", "hierarchyLevel", "startDate", "endDate", "created", "modified", "statusModified", "prefLabel", "description", "definition", "codeScheme", "shortName", "externalReferences", "broaderCode", "membersUrl", "members", "conceptUriInVocabularies", "codeExtensions", "subCodeScheme", "codeAnnotations" })
@Schema(name = "Code", description = "Code DTO that represents data for one single code.")
@JsonIgnoreProperties(value = { "expanded" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CodeDTO extends AbstractHistoricalCodeDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private CodeSchemeDTO codeScheme;
    private String shortName;
    private Integer hierarchyLevel;
    private Map<String, String> prefLabel;
    private Map<String, String> description;
    private Map<String, String> definition;
    private Set<ExternalReferenceDTO> externalReferences;
    private CodeDTO broaderCode;
    private Integer order;
    private String conceptUriInVocabularies;
    private String membersUrl;
    private Set<MemberDTO> members;
    private Set<ExtensionDTO> codeExtensions;
    private CodeSchemeDTO subCodeScheme;
    private Date statusModified;
    private Set<CodeAnnotationDTO> codeAnnotations;

    public CodeDTO() {
        prefLabel = new HashMap<>();
        description = new HashMap<>();
        definition = new HashMap<>();
    }

    @Schema(format = "dateTime")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSX")
    @JsonView(Views.Normal.class)
    public Date getStatusModified() {
        if (statusModified != null) {
            return new Date(statusModified.getTime());
        }
        return null;
    }

    public void setStatusModified(final Date statusModified) {
        if (statusModified != null) {
            this.statusModified = new Date(statusModified.getTime());
        } else {
            this.statusModified = null;
        }
    }

    @JsonView(Views.Normal.class)
    public String getMembersUrl() {
        return this.getUrl() + "/members/";
    }

    @JsonView({ Views.ExtendedCode.class, Views.ExtendedMember.class })
    public CodeSchemeDTO getCodeScheme() {
        return codeScheme;
    }

    public void setCodeScheme(final CodeSchemeDTO codeScheme) {
        this.codeScheme = codeScheme;
    }

    @JsonView(Views.Normal.class)
    public Integer getHierarchyLevel() {
        return hierarchyLevel;
    }

    public void setHierarchyLevel(final Integer hierarchyLevel) {
        this.hierarchyLevel = hierarchyLevel;
    }

    @JsonView(Views.Normal.class)
    public String getShortName() {
        return shortName;
    }

    public void setShortName(final String shortName) {
        this.shortName = shortName;
    }

    @JsonView(Views.Normal.class)
    public Map<String, String> getPrefLabel() {
        return prefLabel;
    }

    public void setPrefLabel(final Map<String, String> prefLabel) {
        this.prefLabel = prefLabel;
    }

    public String getPrefLabel(final String language) {
        String prefLabelValue = null;
        if (this.prefLabel != null && !this.prefLabel.isEmpty()) {
            prefLabelValue = this.prefLabel.get(language);
            if (prefLabelValue == null) {
                prefLabelValue = this.prefLabel.get(LANGUAGE_CODE_EN);
            }
        }
        return prefLabelValue;
    }

    public void setPrefLabel(final String language,
                             final String value) {
        if (this.prefLabel == null) {
            this.prefLabel = new HashMap<>();
        }
        if (language != null && value != null && !value.isEmpty()) {
            this.prefLabel.put(language, value);
        } else if (language != null) {
            this.prefLabel.remove(language);
        }
        setPrefLabel(this.prefLabel);
    }

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
        String definitionValue = null;
        if (this.definition != null && !this.definition.isEmpty()) {
            definitionValue = this.definition.get(language);
            if (definitionValue == null) {
                definitionValue = this.definition.get(LANGUAGE_CODE_EN);
            }
        }
        return definitionValue;
    }

    public void setDefinition(final String language,
                              final String value) {
        if (this.definition == null) {
            this.definition = new HashMap<>();
        }
        if (language != null && value != null && !value.isEmpty()) {
            this.definition.put(language, value);
        } else if (language != null) {
            this.definition.remove(language);
        }
        setDefinition(this.definition);
    }

    @JsonView(Views.Normal.class)
    public Map<String, String> getDescription() {
        if (description == null) {
            description = new HashMap<>();
        }
        return description;
    }

    public void setDescription(final Map<String, String> description) {
        this.description = description;
    }

    public String getDescription(final String language) {
        String descriptionValue = null;
        if (this.description != null && !this.description.isEmpty()) {
            descriptionValue = this.description.get(language);
            if (descriptionValue == null) {
                descriptionValue = this.description.get(LANGUAGE_CODE_EN);
            }
        }
        return descriptionValue;
    }

    public void setDescription(final String language,
                               final String value) {
        if (this.description == null) {
            this.description = new HashMap<>();
        }
        if (language != null && value != null && !value.isEmpty()) {
            this.description.put(language, value);
        } else if (language != null) {
            this.description.remove(language);
        }
        setDescription(this.description);
    }

    @JsonView(Views.Normal.class)
    public Integer getOrder() {
        return order;
    }

    public void setOrder(final Integer order) {
        this.order = order;
    }

    @JsonView(Views.ExtendedCode.class)
    public Set<ExternalReferenceDTO> getExternalReferences() {
        return this.externalReferences;
    }

    public void setExternalReferences(final Set<ExternalReferenceDTO> externalReferences) {
        this.externalReferences = externalReferences;
    }

    @JsonView(Views.Normal.class)
    public String getConceptUriInVocabularies() {
        return conceptUriInVocabularies;
    }

    public void setConceptUriInVocabularies(String conceptUriInVocabularies) {
        this.conceptUriInVocabularies = conceptUriInVocabularies;
    }

    @JsonView(Views.ExtendedCode.class)
    public Set<MemberDTO> getMembers() {
        return members;
    }

    public void setMembers(final Set<MemberDTO> members) {
        this.members = members;
    }

    public CodeDTO getBroaderCode() {
        return broaderCode;
    }

    public void setBroaderCode(final CodeDTO broaderCode) {
        this.broaderCode = broaderCode;
    }

    @JsonView(Views.ExtendedCode.class)
    public Set<ExtensionDTO> getCodeExtensions() {
        return codeExtensions;
    }

    public void setCodeExtensions(final Set<ExtensionDTO> codeExtensions) {
        this.codeExtensions = codeExtensions;
    }

    @JsonView(Views.ExtendedCode.class)
    public CodeSchemeDTO getSubCodeScheme() {
        return subCodeScheme;
    }

    public void setSubCodeScheme(final CodeSchemeDTO subCodeScheme) {
        this.subCodeScheme = subCodeScheme;
    }

    @JsonView(Views.Normal.class)
     public Set<CodeAnnotationDTO> getCodeAnnotations() {
         return codeAnnotations;
     }
 
     public void setCodeAnnotations(final Set<CodeAnnotationDTO> codeAnnotations) {
         this.codeAnnotations = codeAnnotations;
     }
}
