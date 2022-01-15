package edu.agh.northwind.databaseproject.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(exclude = {"territories"})
@ToString(exclude = {"territories"})
@Getter
@Table(name = "Region")
public class RegionEntity{
    @Id
    private short regionId;
    @Column(columnDefinition = "bpchar")
    private String regionDescription;

    @OneToMany(mappedBy = "region")
    private List<TeritoryEntity> territories;
}
