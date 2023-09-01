package fi.vm.yti.codelist.common.dto;

public class Views {

    private Views() {
    }

    public static class Normal{}

    public static class Extended extends Normal{}

    public static class ExtendedExternalReference extends Normal{}

    public static class ExtendedPropertyType extends Normal{}

    public static class ExtendedCode extends Normal{}

    public static class ExtendedCodeScheme extends Normal{}

    public static class ExtendedAnnotation extends Normal{}

    public static class ExtendedCodeSchemeAnnotation extends Normal{}

    public static class ExtendedCodeAnnotation extends Normal{}

    public static class ExtendedCodeRegistry extends Normal{}

    public static class ExtendedOrganization extends Normal{}

    public static class ExtendedMember extends Normal{}

    public static class ExtendedExtension extends Normal{}

    public static class ExtendedValueType extends Normal{}

    public static class Ignored{}
}
