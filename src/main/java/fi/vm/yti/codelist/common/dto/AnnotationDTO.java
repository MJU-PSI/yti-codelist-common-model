package fi.vm.yti.codelist.common.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonView;

import io.swagger.v3.oas.annotations.media.Schema;
import static fi.vm.yti.codelist.common.constants.ApiConstants.LANGUAGE_CODE_EN;

@JsonFilter("annotation")
@XmlRootElement
@XmlType(propOrder = { "id", "codeValue", "prefLabel", "description", "created", "modified", "languageCodes" })
@Schema(name = "Annotation DTO", description = "Annotation DTO that represents data for all.")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AnnotationDTO extends AbstractIdentifyableCodeDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String codeValue;
    private Date created;
    private Date modified;
    private Map<String, String> prefLabel;
    private Map<String, String> description;
    private Set<CodeDTO> languageCodes;

    public AnnotationDTO() {
        prefLabel = new HashMap<>();
        description = new HashMap<>();
    }

    public AnnotationDTO(final String codeValue) {
        setCodeValue(codeValue);
        prefLabel = new HashMap<>();
    }

    @JsonView(Views.Normal.class)
    public String getCodeValue() {
        return codeValue;
    }

    public void setCodeValue(final String codeValue) {
        this.codeValue = codeValue;
    }

    @Schema(format = "dateTime")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSX")
    @JsonView(Views.Normal.class)
    public Date getModified() {
        if (modified != null) {
            return new Date(modified.getTime());
        }
        return null;
    }

    public void setModified(final Date modified) {
        if (modified != null) {
            this.modified = new Date(modified.getTime());
        } else {
            this.modified = null;
        }
    }

    @Schema(format = "dateTime")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSX")
    @JsonView(Views.Normal.class)
    public Date getCreated() {
        if (created != null) {
            return new Date(created.getTime());
        }
        return null;
    }

    public void setCreated(final Date created) {
        if (created != null) {
            this.created = new Date(created.getTime());
        } else {
            this.created = null;
        }
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
    public Set<CodeDTO> getLanguageCodes() {
        return languageCodes;
    }

    public void setLanguageCodes(final Set<CodeDTO> languageCodes) {
        this.languageCodes = languageCodes;
    }

}
