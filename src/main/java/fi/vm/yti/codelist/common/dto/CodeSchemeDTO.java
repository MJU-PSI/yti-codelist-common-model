package fi.vm.yti.codelist.common.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonView;

import fi.vm.yti.codelist.common.model.CodeSchemeListItem;
import io.swagger.v3.oas.annotations.media.Schema;
import static fi.vm.yti.codelist.common.constants.ApiConstants.LANGUAGE_CODE_EN;

@JsonFilter("codeScheme")
@XmlRootElement
@XmlType(propOrder = { "id", "codeValue", "uri", "url", "codesUrl", "extensionsUrl", "extensions", "codes", "prefLabel", "definition", "description", "changeNote", "startDate", "endDate", "created", "modified", "contentModified", "statusModified", "status", "version", "source", "legalBase", "governancePolicy", "infoDomains", "languageCodes", "defaultCode", "externalReferences", "conceptUriInVocabularies", "variantsOfThisCodeScheme", "variantMothersOfThisCodeScheme", "nextCodeschemeId", "prevCodeschemeId", "lastCodeschemeId", "allVersions", "organizations", "searchHits", "cumulative", "feedbackChannel", "codeSchemeAnnotations" })
@Schema(name = "CodeScheme DTO", description = "CodeScheme DTO that represents data for one single codescheme.")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CodeSchemeDTO extends AbstractHistoricalCodeDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String version;
    private String source;
    private String legalBase;
    private String governancePolicy;
    private Map<String, String> prefLabel;
    private Map<String, String> definition;
    private Map<String, String> description;
    private Map<String, String> changeNote;
    private Set<CodeDTO> codes;
    private String codesUrl;
    private String extensionsUrl;
    private Set<ExtensionDTO> extensions;
    private CodeRegistryDTO codeRegistry;
    private Set<CodeDTO> infoDomains;
    private Set<CodeDTO> languageCodes;
    private Set<ExternalReferenceDTO> externalReferences;
    private CodeDTO defaultCode;
    private Set<OrganizationDTO> organizations;
    private String conceptUriInVocabularies;
    private LinkedHashSet<CodeSchemeListItem> variantsOfThisCodeScheme = new LinkedHashSet<>();
    private LinkedHashSet<CodeSchemeListItem> variantMothersOfThisCodeScheme = new LinkedHashSet<>();
    private UUID nextCodeschemeId;
    private UUID prevCodeschemeId;
    private UUID lastCodeschemeId;
    private LinkedHashSet<CodeSchemeListItem> allVersions = new LinkedHashSet<>();
    private ArrayList<SearchHitDTO> searchHits = new ArrayList<>();
    private long totalNrOfSearchHitsCodes = 0;
    private long totalNrOfSearchHitsExtensions = 0;
    private boolean cumulative;
    private Map<String, String> feedbackChannel;
    private Date contentModified;
    private Date statusModified;
    private Set<CodeSchemeAnnotationDTO> codeSchemeAnnotations;

    public CodeSchemeDTO() {
        prefLabel = new HashMap<>();
        definition = new HashMap<>();
        description = new HashMap<>();
        changeNote = new HashMap<>();
        feedbackChannel = new HashMap<>();
    }

    public CodeSchemeDTO(final String codeValue,
                         final String url,
                         final String version,
                         final String status) {
        super.setCodeValue(codeValue);
        super.setUri(url);
        super.setStatus(status);
        this.version = version;
        prefLabel = new HashMap<>();
        feedbackChannel = new HashMap<>();
    }

    @Schema(format = "dateTime")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSX")
    @JsonView(Views.Normal.class)
    public Date getContentModified() {
        if (contentModified != null) {
            return new Date(contentModified.getTime());
        }
        return null;
    }

    public void setContentModified(final Date contentModified) {
        if (contentModified != null) {
            this.contentModified = new Date(contentModified.getTime());
        } else {
            this.contentModified = null;
        }
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
    public String getCodesUrl() {
        return this.getUrl() + "/codes/";
    }

    @JsonView(Views.Normal.class)
    public String getExtensionsUrl() {
        return this.getUrl() + "/extensions/";
    }

    @JsonView(Views.Normal.class)
    public Set<CodeDTO> getCodes() {
        return codes;
    }

    public void setCodes(final Set<CodeDTO> codes) {
        this.codes = codes;
    }

    @JsonView(Views.Normal.class)
    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    @JsonView(Views.Normal.class)
    public String getSource() {
        return source;
    }

    public void setSource(final String source) {
        this.source = source;
    }

    @JsonView(Views.Normal.class)
    public String getLegalBase() {
        return legalBase;
    }

    public void setLegalBase(final String legalBase) {
        this.legalBase = legalBase;
    }

    @JsonView(Views.Normal.class)
    public String getGovernancePolicy() {
        return governancePolicy;
    }

    public void setGovernancePolicy(final String governancePolicy) {
        this.governancePolicy = governancePolicy;
    }

    @JsonView(Views.Normal.class)
    public CodeRegistryDTO getCodeRegistry() {
        return codeRegistry;
    }

    public void setCodeRegistry(final CodeRegistryDTO codeRegistry) {
        this.codeRegistry = codeRegistry;
    }

    @JsonView(Views.Normal.class)
    public CodeDTO getDefaultCode() {
        return defaultCode;
    }

    public void setDefaultCode(final CodeDTO defaultCode) {
        this.defaultCode = defaultCode;
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
    public Map<String, String> getChangeNote() {
        if (changeNote == null) {
            changeNote = new HashMap<>();
        }
        return changeNote;
    }

    public void setChangeNote(final Map<String, String> changeNote) {
        this.changeNote = changeNote;
    }

    public String getChangeNote(final String language) {
        String changeNoteValue = null;
        if (this.changeNote != null && !this.changeNote.isEmpty()) {
            changeNoteValue = this.changeNote.get(language);
            if (changeNoteValue == null) {
                changeNoteValue = this.changeNote.get(LANGUAGE_CODE_EN);
            }
        }
        return changeNoteValue;
    }

    public void setChangeNote(final String language,
                              final String value) {
        if (this.changeNote == null) {
            this.changeNote = new HashMap<>();
        }
        if (language != null && value != null && !value.isEmpty()) {
            this.changeNote.put(language, value);
        } else if (language != null) {
            this.changeNote.remove(language);
        }
        setChangeNote(this.changeNote);
    }

    @JsonView(Views.ExtendedCodeScheme.class)
    public Set<ExternalReferenceDTO> getExternalReferences() {
        return this.externalReferences;
    }

    public void setExternalReferences(final Set<ExternalReferenceDTO> externalReferences) {
        this.externalReferences = externalReferences;
    }

    @JsonView(Views.ExtendedCodeScheme.class)
    public Set<CodeDTO> getInfoDomains() {
        return infoDomains;
    }

    public void setInfoDomains(final Set<CodeDTO> infoDomains) {
        this.infoDomains = infoDomains;
    }

    @JsonView(Views.Normal.class)
    public Set<CodeDTO> getLanguageCodes() {
        return languageCodes;
    }

    public void setLanguageCodes(final Set<CodeDTO> languageCodes) {
        this.languageCodes = languageCodes;
    }

    @JsonView(Views.Normal.class)
    public String getConceptUriInVocabularies() {
        return conceptUriInVocabularies;
    }

    public void setConceptUriInVocabularies(String conceptUriInVocabularies) {
        this.conceptUriInVocabularies = conceptUriInVocabularies;
    }

    @JsonView(Views.ExtendedCodeScheme.class)
    public Set<ExtensionDTO> getExtensions() {
        return extensions;
    }

    public void setExtensions(final Set<ExtensionDTO> extensions) {
        this.extensions = extensions;
    }

    @JsonView(Views.Normal.class)
    public LinkedHashSet<CodeSchemeListItem> getVariantsOfThisCodeScheme() {
        return variantsOfThisCodeScheme;
    }

    public void setVariantsOfThisCodeScheme(final LinkedHashSet<CodeSchemeListItem> variantsOfThisCodeScheme) {
        this.variantsOfThisCodeScheme = variantsOfThisCodeScheme;
    }

    @JsonView(Views.Normal.class)
    public LinkedHashSet<CodeSchemeListItem> getVariantMothersOfThisCodeScheme() {
        return variantMothersOfThisCodeScheme;
    }

    public void setVariantMothersOfThisCodeScheme(final LinkedHashSet<CodeSchemeListItem> variantMothersOfThisCodeScheme) {
        this.variantMothersOfThisCodeScheme = variantMothersOfThisCodeScheme;
    }

    @JsonView(Views.Normal.class)
    public UUID getNextCodeschemeId() {
        return nextCodeschemeId;
    }

    public void setNextCodeschemeId(final UUID nextCodeschemeId) {
        this.nextCodeschemeId = nextCodeschemeId;
    }

    @JsonView(Views.Normal.class)
    public UUID getPrevCodeschemeId() {
        return prevCodeschemeId;
    }

    public void setPrevCodeschemeId(final UUID prevCodeschemeId) {
        this.prevCodeschemeId = prevCodeschemeId;
    }

    @JsonView(Views.Normal.class)
    public UUID getLastCodeschemeId() {
        return lastCodeschemeId;
    }

    public void setLastCodeschemeId(final UUID lastCodeschemeId) {
        this.lastCodeschemeId = lastCodeschemeId;
    }

    @JsonView(Views.Normal.class)
    public LinkedHashSet<CodeSchemeListItem> getAllVersions() {
        return allVersions;
    }

    public void setAllVersions(final LinkedHashSet<CodeSchemeListItem> allVersions) {
        this.allVersions = allVersions;
    }

    @JsonView(Views.Normal.class)
    public Set<OrganizationDTO> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(final Set<OrganizationDTO> organizations) {
        this.organizations = organizations;
    }

    @JsonView(Views.Ignored.class)
    public ArrayList<SearchHitDTO> getSearchHits() {
        return searchHits;
    }

    public void setSearchHits(final ArrayList<SearchHitDTO> searchHits) {
        this.searchHits = searchHits;
    }

    @JsonView(Views.Ignored.class)
    public long getTotalNrOfSearchHitsCodes() {
        return totalNrOfSearchHitsCodes;
    }

    public void setTotalNrOfSearchHitsCodes(final long totalNrOfSearchHitsCodes) {
        this.totalNrOfSearchHitsCodes = totalNrOfSearchHitsCodes;
    }

    @JsonView(Views.Ignored.class)
    public long getTotalNrOfSearchHitsExtensions() {
        return totalNrOfSearchHitsExtensions;
    }

    public void setTotalNrOfSearchHitsExtensions(final long totalNrOfSearchHitsExtensions) {
        this.totalNrOfSearchHitsExtensions = totalNrOfSearchHitsExtensions;
    }

    @JsonView(Views.Normal.class)
    public boolean isCumulative() {
        return cumulative;
    }

    public void setCumulative(final boolean cumulative) {
        this.cumulative = cumulative;
    }

    @JsonView(Views.Normal.class)
    public Map<String, String> getFeedbackChannel() {
        return feedbackChannel;
    }

    public void setFeedbackChannel(final Map<String, String> feedbackChannel) {
        this.feedbackChannel = feedbackChannel;
    }

    public String getFeedbackChannel(final String language) {
        String feedbackChannelValue = null;
        if (this.feedbackChannel != null && !this.feedbackChannel.isEmpty()) {
            feedbackChannelValue = this.feedbackChannel.get(language);
            if (feedbackChannelValue == null) {
                feedbackChannelValue = this.feedbackChannel.get(LANGUAGE_CODE_EN);
            }
        }
        return feedbackChannelValue;
    }

    public void setFeedbackChannel(final String language,
                                   final String value) {
        if (this.feedbackChannel == null) {
            this.feedbackChannel = new HashMap<>();
        }
        if (language != null && value != null && !value.isEmpty()) {
            this.feedbackChannel.put(language, value);
        } else if (language != null) {
            this.feedbackChannel.remove(language);
        }
        setFeedbackChannel(this.feedbackChannel);
    }

   @JsonView(Views.Normal.class)
    public Set<CodeSchemeAnnotationDTO> getCodeSchemeAnnotations() {
        return codeSchemeAnnotations;
    }

    public void setCodeSchemeAnnotations(final Set<CodeSchemeAnnotationDTO> codeSchemeAnnotations) {
        this.codeSchemeAnnotations = codeSchemeAnnotations;
    }
}
