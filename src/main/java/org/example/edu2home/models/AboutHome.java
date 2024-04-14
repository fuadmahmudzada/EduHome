package org.example.edu2home.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "aboutHome")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AboutHome {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String secondTitle;
    private String subTitle;
    private String subTitle2;
}
