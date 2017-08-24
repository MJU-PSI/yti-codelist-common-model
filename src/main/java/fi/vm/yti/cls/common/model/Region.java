package fi.vm.yti.cls.common.model;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * Object model that represents a region entity.
 */
@Entity
@JsonFilter("region")
@Table(name = "region")
@XmlType(propOrder = { "code", "url", "id", "source", "status", "created", "modified", "names" })
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "Region", description = "Region model that represents data for one single region.")
public class Region extends AbstractCommonCode implements Serializable {

    private static final long serialVersionUID = 1L;


    public Region() {
    }


    public String toString() {
        return "(" +
                "m_code: " + getCode() + ", " +
                "m_url: " + getUrl() + ", " +
                "m_source: " + getSource() + ", " +
                "m_created: " + getCreated() + ", " +
                "m_modified: " + getModified() + ", " +
                "m_names: " + getNames() + ")";
    }

}
