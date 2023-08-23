package fi.vm.yti.codelist.common.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonView;

import io.swagger.v3.oas.annotations.media.Schema;
import static fi.vm.yti.codelist.common.constants.ApiConstants.LANGUAGE_CODE_EN;

@JsonFilter("CodeSchemeAnnotation")
@XmlRootElement
@XmlType(propOrder = { "codeschemeId", "annotationId", "value" })
@Schema(name = "CodeSchemeAnnotation DTO", description = "Codescheme Annotation DTO that represents data for all.")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CodeSchemeAnnotationDTO implements Serializable {

    private UUID codeschemeId;
    private UUID annotationId;
    private AnnotationDTO annotation;
    private Map<String, String> value;

    public CodeSchemeAnnotationDTO() {
        value = new HashMap<>();
    }

    @JsonView(Views.Normal.class)
    public UUID getCodeschemeId() {
        return codeschemeId;
    }

    public void setCodeschemeId(final UUID codeschemeId) {
        this.codeschemeId = codeschemeId;
    }

    @JsonView(Views.Normal.class)
    public UUID getAnnotationId() {
        return annotationId;
    }

    public void setAnnotationId(final UUID annotationId) {
        this.annotationId = annotationId;
    }

    @JsonView(Views.Normal.class)
    public AnnotationDTO getAnnotation() {
        return annotation;
    }

    public void setAnnotation(final AnnotationDTO annotation) {
        this.annotation = annotation;
    }

    @JsonView(Views.Normal.class)
    public Map<String, String> getValue() {
        return value;
    }

    public void setValue(final Map<String, String> value) {
        this.value = value;
    }

    public String getValue(final String language) {
        String valueLang = null;
        if (this.value != null && !this.value.isEmpty()) {
            valueLang = this.value.get(language);
            if (valueLang == null) {
                valueLang = this.value.get(LANGUAGE_CODE_EN);
            }
        }
        return valueLang;
    }

    public void setValue(final String language,
                             final String value) {
        if (this.value == null) {
            this.value = new HashMap<>();
        }
        if (language != null && value != null && !value.isEmpty()) {
            this.value.put(language, value);
        } else if (language != null) {
            this.value.remove(language);
        }
        setValue(this.value);
    }

}
