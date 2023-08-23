package fi.vm.yti.codelist.common.constants;

public class ApiConstants {

    public static final String METHOD_GET = "GET";
    public static final String METHOD_POST = "POST";
    public static final String METHOD_PUT = "PUT";
    public static final String METHOD_DELETE = "DELETE";
    public static final String METHOD_PATCH = "PATCH";

    public static final String SOURCE_INTERNAL = "internal";
    public static final String DATA_CODEREGISTRIES = "coderegistries";
    public static final String DATA_CODESCHEMES = "codeschemes";
    public static final String DATA_CODES = "codes";
    public static final String DATA_PROPERTYTYPES = "propertytypes";
    public static final String DATA_VALUETYPES = "valuetypes";
    public static final String DATA_EXTERNALREFERENCES = "externalreferences";

    public static final String FILTER_NAME_CODEREGISTRY = "codeRegistry";
    public static final String FILTER_NAME_CODESCHEME = "codeScheme";
    public static final String FILTER_NAME_CODE = "code";
    public static final String FILTER_NAME_PROPERTYTYPE = "propertyType";
    public static final String FILTER_NAME_EXTERNALREFERENCE = "externalReference";
    public static final String FILTER_NAME_INFODOMAIN = "infoDomain";
    public static final String FILTER_NAME_ORGANIZATION = "organization";
    public static final String FILTER_NAME_EXTENSION = "extension";
    public static final String FILTER_NAME_MEMBER = "member";
    public static final String FILTER_NAME_RESOURCE = "resource";
    public static final String FILTER_NAME_VALUETYPE = "valueType";
    public static final String FILTER_NAME_MEMBERVALUE = "memberValue";
    public static final String FILTER_NAME_SEARCHHIT = "searchHit";
    public static final String FILTER_NAME_USER = "user";
    public static final String FILTER_NAME_ANNOTATION = "annotation";

    public static final String FIELD_NAME_URI = "uri";
    public static final String FIELD_NAME_URL = "url";
    public static final String FIELD_NAME_ID = "id";

    public static final String ELASTIC_INDEX_CODEREGISTRY = "coderegistry";
    public static final String ELASTIC_INDEX_CODESCHEME = "codescheme";
    public static final String ELASTIC_INDEX_ANNOTATIONE = "annotation";
    public static final String ELASTIC_INDEX_CODE = "code";
    public static final String ELASTIC_INDEX_PROPERTYTYPE = "propertytype";
    public static final String ELASTIC_INDEX_EXTERNALREFERENCE = "externalreference";
    public static final String ELASTIC_INDEX_EXTENSION = "extension";
    public static final String ELASTIC_INDEX_MEMBER = "member";
    public static final String ELASTIC_INDEX_VALUETYPE = "valuetype";
    public static final String ELASTIC_TYPE_CODEREGISTRY = "coderegistry";
    public static final String ELASTIC_TYPE_CODESCHEME = "codescheme";
    public static final String ELASTIC_TYPE_ANNOTATIONE = "annotation";
    public static final String ELASTIC_TYPE_CODE = "code";
    public static final String ELASTIC_TYPE_PROPERTYTYPE = "propertytype";
    public static final String ELASTIC_TYPE_EXTERNALREFERENCE = "externalreference";
    public static final String ELASTIC_TYPE_EXTENSION = "extension";
    public static final String ELASTIC_TYPE_MEMBER = "member";
    public static final String ELASTIC_TYPE_VALUETYPE = "valuetype";

    public static final String API_VERSION = "v1";
    public static final String API_CONTEXT_PATH_INTAKE = "/codelist-intake";
    public static final String API_CONTEXT_PATH_RESTAPI = "/codelist-api";

    public static final String API_BASE_PATH = "/api";
    public static final String API_PATH_VERSION_V1 = "/v1";
    public static final String API_PATH_ADMIN = "/admin";
    public static final String API_PATH_AUTHENTICATED_USER = "/authenticated-user";
    public static final String API_PATH_CONFIGURATION = "/configuration";
    public static final String API_PATH_CODEREGISTRIES = "/coderegistries";
    public static final String API_PATH_CODESCHEMES = "/codeschemes";
    public static final String API_PATH_INFODOMAINS = "/infodomains";
    public static final String API_PATH_EXTERNALREFERENCES = "/externalreferences";
    public static final String API_PATH_IMPERSONABLE_USERS = "/fakeableUsers";
    public static final String API_PATH_GROUPMANAGEMENT = "/groupmanagement";
    public static final String API_PATH_REQUEST = "/request";
    public static final String API_PATH_REQUESTS = "/requests";
    public static final String API_PATH_EXTENSIONS = "/extensions";
    public static final String API_PATH_MEMBERS = "/members";
    public static final String API_PATH_INTEGRATION = "/integration";
    public static final String API_PATH_CONTAINERS = "/containers";
    public static final String API_PATH_RESOURCES = "/resources";
    public static final String API_PATH_PROPERTYTYPES = "/propertytypes";
    public static final String API_PATH_VALUETYPES = "/valuetypes";
    public static final String API_PATH_ORGANIZATIONS = "/organizations";
    public static final String API_PATH_CODES = "/codes";
    public static final String API_PATH_PING = "/ping";
    public static final String API_PATH_VERSION = "/version";
    public static final String API_PATH_SWAGGER_JSON = "/swagger.json";

    public static final String API_PATH_TERMINOLOGY = "/terminology";
    public static final String API_PATH_VOCABULARIES = "/vocabularies";
    public static final String API_PATH_CONCEPTS = "/searchconcept";
    public static final String TERMINOLOGY_API_BASE_PATH = "/terminology-api/api";
    public static final String TERMINOLOGY_PRIVATE_API_BASE_PATH = "/terminology-api/private";
    public static final String TERMINOLOGY_API_CONCEPT_SUGGESTION_PATH = "/terminology/conceptSuggestion";

    public static final String DEFAULT_CODEREGISTRY_NAME_PREFIX = "testregistry";
    public static final String DEFAULT_CODESCHEME_NAME = "testscheme";

    public static final String EXCEL_SHEET_CODEREGISTRIES = "CodeRegistries";
    public static final String EXCEL_SHEET_CODESCHEMES = "CodeSchemes";
    public static final String EXCEL_SHEET_CODES = "Codes";
    public static final String EXCEL_SHEET_PROPERTYTYPES = "PropertyTypes";
    public static final String EXCEL_SHEET_LINKS = "Links";
    public static final String EXCEL_SHEET_EXTENSIONS = "Extensions";
    public static final String EXCEL_SHEET_MEMBERS = "Members";
    public static final String EXCEL_SHEET_VALUETYPES = "ValueTypes";

    public static final String CONTENT_HEADER_ID = "ID";
    public static final String CONTENT_HEADER_URL = "URL";
    public static final String CONTENT_HEADER_HREF = "HREF";
    public static final String CONTENT_HEADER_CODEVALUE = "CODEVALUE";
    public static final String CONTENT_HEADER_STATUS = "STATUS";
    public static final String CONTENT_HEADER_BROADER = "BROADER";
    public static final String CONTENT_HEADER_VERSION = "VERSION";
    public static final String CONTENT_HEADER_INFODOMAIN = "INFORMATIONDOMAIN";
    public static final String CONTENT_HEADER_LANGUAGECODE = "LANGUAGECODE";
    public static final String CONTENT_HEADER_LOCALNAME = "LOCALNAME";
    public static final String CONTENT_HEADER_VALUETYPE = "VALUETYPE";
    public static final String CONTENT_HEADER_TYPEURI = "TYPEURI";
    public static final String CONTENT_HEADER_REQUIRED = "REQUIRED";
    public static final String CONTENT_HEADER_TYPEVALUE = "TYPEVALUE";
    public static final String CONTENT_HEADER_REGEXP = "REGEXP";
    public static final String CONTENT_HEADER_URI = "URI";
    public static final String CONTENT_HEADER_PROPERTYTYPE = "PROPERTYTYPE";
    public static final String CONTENT_HEADER_CONTEXT = "CONTEXT";
    public static final String CONTENT_HEADER_LEGALBASE = "LEGALBASE";
    public static final String CONTENT_HEADER_GOVERNANCEPOLICY = "GOVERNANCEPOLICY";
    public static final String CONTENT_HEADER_SOURCE = "SOURCE";
    public static final String CONTENT_HEADER_TITLE_PREFIX = "TITLE_";
    public static final String CONTENT_HEADER_PREFLABEL_PREFIX = "PREFLABEL_";
    public static final String CONTENT_HEADER_CODE_PREFLABEL_PREFIX = "CODE_PREFLABEL_";
    public static final String CONTENT_HEADER_DEFINITION_PREFIX = "DEFINITION_";
    public static final String CONTENT_HEADER_DESCRIPTION_PREFIX = "DESCRIPTION_";
    public static final String CONTENT_HEADER_CHANGENOTE_PREFIX = "CHANGENOTE_";
    public static final String CONTENT_HEADER_SHORTNAME = "SHORTNAME";
    public static final String CONTENT_HEADER_HIERARCHYLEVEL = "HIERARCHYLEVEL";
    public static final String CONTENT_HEADER_STARTDATE = "STARTDATE";
    public static final String CONTENT_HEADER_ENDDATE = "ENDDATE";
    public static final String CONTENT_HEADER_PARENTCODESCHEMEID = "PARENTCODESCHEMEID";
    public static final String CONTENT_HEADER_PARENTCODESCHEME = "PARENTCODESCHEME";
    public static final String CONTENT_HEADER_CODESCHEMES = "CODESCHEMES";
    public static final String CONTENT_HEADER_ORGANIZATION = "ORGANIZATION";
    public static final String CONTENT_HEADER_ORDER = "ORDER";
    public static final String CONTENT_HEADER_MEMBERVALUE = "MEMBERVALUE";
    public static final String CONTENT_HEADER_RELATION = "RELATION";
    public static final String CONTENT_HEADER_CODE = "CODE";
    public static final String CONTENT_HEADER_CODESCHEMESSHEET = "CODESCHEMESSHEET";
    public static final String CONTENT_HEADER_EXTENSIONSSHEET = "EXTENSIONSSHEET";
    public static final String CONTENT_HEADER_MEMBERSSHEET = "MEMBERSSHEET";
    public static final String CONTENT_HEADER_CODESSHEET = "CODESSHEET";
    public static final String CONTENT_HEADER_CREATED = "CREATED";
    public static final String CONTENT_HEADER_MODIFIED = "MODIFIED";
    public static final String CONTENT_HEADER_DEFAULTCODE = "DEFAULTCODE";
    public static final String CONTENT_HEADER_CONCEPTURI = "CONCEPTURI";
    public static final String CONTENT_HEADER_LINKSSHEET = "LINKSSHEET";
    public static final String CONTENT_HEADER_SUBCODESCHEME = "SUBCODESCHEME";
    public static final String CONTENT_HEADER_URI1 = "CODE1";
    public static final String CONTENT_HEADER_URI2 = "CODE2";
    public static final String CONTENT_HEADER_CUMULATIVE = "CUMULATIVE";
    public static final String CONTENT_HEADER_MEMBER_ID = "MEMBER_ID";
    public static final String CONTENT_HEADER_FEEDBACK_CHANNEL_PREFIX = "FEEDBACK_CHANNEL_";

    public static final String FORMAT_JSON = "json";
    public static final String FORMAT_CSV = "csv";
    public static final String FORMAT_EXCEL = "excel";
    public static final String FORMAT_EXCEL_XLS = "xls";
    public static final String FORMAT_EXCEL_XLSX = "xlsx";

    public static final String LANGUAGE_CODE_FI = "fi";
    public static final String LANGUAGE_CODE_SV = "sv";
    public static final String LANGUAGE_CODE_EN = "en";

    public static final String GROUPMANAGEMENT_API_CONTEXT_PATH = "/public-api";
    public static final String GROUPMANAGEMENT_API_PRIVATE_CONTEXT_PATH = "/private-api";
    public static final String GROUPMANAGEMENT_API_USERS = "/users";
    public static final String GROUPMANAGEMENT_API_REQUEST = "/request";
    public static final String GROUPMANAGEMENT_API_REQUESTS = "/requests";
    public static final String GROUPMANAGEMENT_API_ORGANIZATIONS = "/organizations";

    public static final String CODE_EXTENSION = "CodeExtension";
    public static final String EXTENSION = "Extension";

    public static final String SEARCH_HIT_TYPE_CODE = "code";
    public static final String SEARCH_HIT_TYPE_EXTENSION = "extension";

    private ApiConstants() {
    }
}
