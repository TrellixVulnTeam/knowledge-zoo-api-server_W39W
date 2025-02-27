package edu.monash.knowledgezoo.api.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity(label = "Certificate(Fingerprint)")
public class FingerprintCertificate {

    public static final String PROPERTY_NAME = "certificate(fingerprint)";

    @Id
    @GeneratedValue
    @JsonIgnore
    private Long id;

    @Index(unique = true)
    @JsonProperty("Name")
    private String name;

    public FingerprintCertificate() {
    }

    public FingerprintCertificate(String name) {
        this.name = name;
    }

    public FingerprintCertificate(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
