package org.example.edu2home.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;


import java.time.LocalDateTime;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "blogs")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String image;
    private String author;
    private int commentCount;
    private String description;
    @CreationTimestamp
    private LocalDateTime createdTime;

//    public String dateFormatter(String dateTime){
//        dateTime.format(formatter);
//    }
//    String formattedDateTime = createdTime.format(formatter);

}
