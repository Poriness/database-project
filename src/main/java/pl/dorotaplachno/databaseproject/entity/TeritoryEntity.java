package pl.dorotaplachno.databaseproject.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
@Getter
@Table(name = "Territories")
public class TeritoryEntity {
    @Id
    @Column(columnDefinition = "bpchar")
    private String territoryId;
    @Column(columnDefinition = "bpchar")
    private String territoryDescription;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private RegionEntity region;
}
