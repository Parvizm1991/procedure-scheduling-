package com.caresyntax.scheduling.domain.entity;

import com.caresyntax.scheduling.domain.BaseEntity;
import lombok.*;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;

/**
 * Created by Parviz on 10.05.2018.
 */
@Entity
@Table(name = "rooms")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RoomEntity extends BaseEntity{

    @NotBlank
    @Column(nullable = false, length = 128)
    private String name;

    public RoomEntity(Long id){
        this.setId(id);
    }
}
