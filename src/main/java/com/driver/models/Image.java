package com.driver.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity
@Table(name = "Image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    private String dimensions; // in the format HXD, for example: 720X480
    @ManyToOne
    @JoinColumn
    private Blog blog;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDimensions() {
        return dimensions;
    }
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }
}


//package com.driver.models;
//
//import io.swagger.models.auth.In;
//
//import javax.persistence.*;
//
//@Entity
//@Table(
//        name = "image"
//)
//public class Image{
//
//    @Id
//    @GeneratedValue(
//            strategy = GenerationType.IDENTITY
//    )
//    private int id;
//    private String description;
//    private String dimension;
//
//    @ManyToOne
//    @JoinColumn
//    private Blog blog;
//
//    public Blog getBlog() {
//        return blog;
//    }
//
//    public void setBlog(Blog blog) {
//        this.blog = blog;
//    }
//
//    public Image(){
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getDimension() {
//        return dimension;
//    }
//
//    public void setDimension(String dimension) {
//        this.dimension = dimension;
//    }
//
//    public Image(String description, String dimension){
//        this.description = description;
//        this.dimension = dimension;
//    }
//
//}