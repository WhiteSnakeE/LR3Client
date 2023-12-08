
package com.knure.project.server.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.xml.datatype.XMLGregorianCalendar;

import com.filmcatalog.movies.Movie;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllMoviesByAuthorResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="getAllMoviesByAuthorResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" maxOccurs="unbounded" minOccurs="0" form="qualified"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="releaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                   &lt;element name="genre" type="{http://service.server.project.knure.com/}genre"/&gt;
 *                   &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllMoviesByAuthorResponse", propOrder = {
        "_return"
})
public class GetAllMoviesByAuthorResponse {

    @XmlElement(name = "return", namespace = "http://service.server.project.knure.com/")
    protected List<GetAllMoviesByAuthorResponse.Return> _return;

    /**
     * Gets the value of the return property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the return property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturn().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetAllMoviesByAuthorResponse.Return }
     *
     *
     */
    public List<GetAllMoviesByAuthorResponse.Return> getReturn() {
        if (_return == null) {
            _return = new ArrayList<GetAllMoviesByAuthorResponse.Return>();
        }
        return this._return;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="releaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
     *         &lt;element name="genre" type="{http://service.server.project.knure.com/}genre"/&gt;
     *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class Return {

        @XmlElement(required = true)
        protected String title;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar releaseDate;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected Genre genre;
        protected Movie.Author author;
        @XmlAttribute(name = "id", required = true)
        protected int id;

        @Override
        public String toString() {
            return "Return{" +
                    "title='" + title + '\'' +
                    ", releaseDate=" + releaseDate +
                    ", genre=" + genre +
                    ", author=" + author +
                    ", id=" + id +
                    '}';
        }

        /**
         * Gets the value of the title property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getTitle() {
            return title;
        }

        /**
         * Sets the value of the title property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * Gets the value of the releaseDate property.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getReleaseDate() {
            return releaseDate;
        }

        /**
         * Sets the value of the releaseDate property.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setReleaseDate(XMLGregorianCalendar value) {
            this.releaseDate = value;
        }

        /**
         * Gets the value of the genre property.
         *
         * @return
         *     possible object is
         *     {@link Genre }
         *
         */
        public Genre getGenre() {
            return genre;
        }

        /**
         * Sets the value of the genre property.
         *
         * @param value
         *     allowed object is
         *     {@link Genre }
         *
         */
        public void setGenre(Genre value) {
            this.genre = value;
        }

        /**
         * Gets the value of the author property.
         *
         * @return
         *     possible object is
         *     {@link Object }
         *
         */
        public Object getAuthor() {
            return author;
        }

        /**
         * Sets the value of the author property.
         *
         * @param value
         *     allowed object is
         *     {@link Object }
         *
         */
        public void setAuthor(Movie.Author value) {
            this.author = value;
        }

        /**
         * Gets the value of the id property.
         *
         */
        public int getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         *
         */
        public void setId(int value) {
            this.id = value;
        }

    }

}
