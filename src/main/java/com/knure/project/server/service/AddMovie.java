
package com.knure.project.server.service;

import com.filmcatalog.movies.Movie;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addMovie complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="addMovie"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="movie" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addMovie1", propOrder = {
        "movie"
})
public class AddMovie {

    @XmlElement(namespace = "http://service.server.project.knure.com/")
    protected Movie movie;

    /**
     * Gets the value of the movie property.
     *
     * @return
     *     possible object is
     *     {@link Object }
     *
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * Sets the value of the movie property.
     *
     * @param value
     *     allowed object is
     *     {@link Object }
     *
     */
    public void setMovie(Movie value) {
        this.movie = value;
    }

}
