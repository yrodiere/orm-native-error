package com.acme;


import jakarta.annotation.Generated;
import jakarta.enterprise.inject.Vetoed;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import org.hibernate.annotations.*;
import org.hibernate.envers.Audited;
import org.hibernate.type.SqlTypes;

import java.io.Serial;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.UUID;


@NamedQueries(value = {
        @NamedQuery(name = "Aaaaaa.findAll", query = " SELECT o FROM Aaaaaa o ")

})


@NamedNativeQueries(value = {
        @NamedNativeQuery(name = "Aaaaaa.Native.findAll", query = " SELECT * FROM Aaaaaa ORDER BY id ")
})


@Table(name = "aaaaaa"
        , schema = "public"
        , uniqueConstraints = @UniqueConstraint(columnNames = "val")
)
@Where(clause = "enabled = true")
@SQLDelete(sql = "UPDATE aaaaaa SET enabled = false WHERE id = ? AND modified_on = ?", check = ResultCheckStyle.COUNT)
@Audited
@Cacheable
@Vetoed
@Entity
@Generated("Ant Build Script using Hibernate Tools (hbm2java)")
public class Aaaaaa implements Serializable {
    @Serial
    private final long serialVersionUID = 1L;


    public UUID id;
    public UUID uid;
    public Integer val;
    public Boolean enabled = true;
    public OffsetDateTime createdOn = OffsetDateTime.now(ZoneId.of("UTC"));
    public OffsetDateTime modifiedOn = OffsetDateTime.now(ZoneId.of("UTC"));

    public Aaaaaa() {
    }

    public Aaaaaa(UUID id, UUID uid, Integer val, Boolean enabled, OffsetDateTime createdOn, OffsetDateTime modifiedOn) {
        this.id = id;
        this.uid = uid;
        this.val = val;
        this.enabled = enabled;
        this.createdOn = createdOn;
        this.modifiedOn = modifiedOn;
    }

    @Id
    @GeneratedValue
    @UuidGenerator(style = UuidGenerator.Style.TIME)
    @Column(name = "id", unique = true, nullable = false)
    @JdbcTypeCode(SqlTypes.UUID)
    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }


    @Column(name = "uid", nullable = false)
    public UUID getUid() {
        return this.uid;
    }

    public void setUid(UUID uid) {
        this.uid = uid;
    }


    @Column(name = "val", unique = true, nullable = false)
    public Integer getVal() {
        return this.val;
    }

    public void setVal(Integer val) {
        this.val = val;
    }


    @Column(name = "enabled", nullable = false)
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }


    @CreationTimestamp
    @Column(name = "created_on", columnDefinition = "TIMESTAMP WITH TIME ZONE DEFAULT (now() AT TIME ZONE 'UTC') NOT NULL", length = 29, nullable = false, updatable = false, insertable = true, unique = false)
    public OffsetDateTime getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(OffsetDateTime createdOn) {
        this.createdOn = createdOn;
    }


    @UpdateTimestamp
    @Column(name = "modified_on", columnDefinition = "TIMESTAMP WITH TIME ZONE DEFAULT (now() AT TIME ZONE 'UTC') NOT NULL", length = 29, nullable = false, updatable = true, insertable = true, unique = false)
    public OffsetDateTime getModifiedOn() {
        return this.modifiedOn;
    }

    public void setModifiedOn(OffsetDateTime modifiedOn) {
        this.modifiedOn = modifiedOn;
    }


}


