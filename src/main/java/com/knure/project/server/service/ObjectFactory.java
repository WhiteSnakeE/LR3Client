
package com.knure.project.server.service;

import javax.xml.namespace.QName;

import com.filmcatalog.movies.Movie;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import jakarta.xml.bind.annotation.XmlType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.knure.project.server.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DAOException_QNAME = new QName("http://service.server.project.knure.com/", "DAOException");
    private final static QName _AddMovie_QNAME = new QName("http://service.server.project.knure.com/", "addMovie");
    private final static QName _AddMovieResponse_QNAME = new QName("http://service.server.project.knure.com/", "addMovieResponse");
    private final static QName _Author_QNAME = new QName("http://service.server.project.knure.com/", "author");
    private final static QName _ChangeMovieName_QNAME = new QName("http://service.server.project.knure.com/", "changeMovieName");
    private final static QName _ChangeMovieNameResponse_QNAME = new QName("http://service.server.project.knure.com/", "changeMovieNameResponse");
    private final static QName _ClientToken_QNAME = new QName("http://service.server.project.knure.com/", "clientToken");
    private final static QName _GetAllMoviesByAuthor_QNAME = new QName("http://service.server.project.knure.com/", "getAllMoviesByAuthor");
    private final static QName _GetAllMoviesByAuthorResponse_QNAME = new QName("http://service.server.project.knure.com/", "getAllMoviesByAuthorResponse");
    private final static QName _GetMovieById_QNAME = new QName("http://service.server.project.knure.com/", "getMovieById");
    private final static QName _GetMovieByIdResponse_QNAME = new QName("http://service.server.project.knure.com/", "getMovieByIdResponse");
    private final static QName _Id_QNAME = new QName("http://service.server.project.knure.com/", "id");
    private final static QName _MovieID_QNAME = new QName("http://service.server.project.knure.com/", "movieID");
    private final static QName _RemoveMovie_QNAME = new QName("http://service.server.project.knure.com/", "removeMovie");
    private final static QName _RemoveMovieResponse_QNAME = new QName("http://service.server.project.knure.com/", "removeMovieResponse");
    private final static QName _ServerToken_QNAME = new QName("http://service.server.project.knure.com/", "serverToken");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.knure.project.server.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DAOException }
     * 
     */
    public DAOException createDAOException() {
        return new DAOException();
    }

    /**
     * Create an instance of {@link AddMovie }
     * 
     */
    public AddMovie createAddMovie() {
        return new AddMovie();
    }

    /**
     * Create an instance of {@link AddMovieResponse }
     * 
     */
    public AddMovieResponse createAddMovieResponse() {
        return new AddMovieResponse();
    }


    public Movie.Author createAuthor() {
        return new Movie.Author();
    }

    /**
     * Create an instance of {@link ChangeMovieName }
     * 
     */
    public ChangeMovieName createChangeMovieName() {
        return new ChangeMovieName();
    }

    /**
     * Create an instance of {@link ChangeMovieNameResponse }
     * 
     */
    public ChangeMovieNameResponse createChangeMovieNameResponse() {
        return new ChangeMovieNameResponse();
    }

    /**
     * Create an instance of {@link GetAllMoviesByAuthor }
     * 
     */
    public GetAllMoviesByAuthor createGetAllMoviesByAuthor() {
        return new GetAllMoviesByAuthor();
    }

    /**
     * Create an instance of {@link GetAllMoviesByAuthorResponse }
     * 
     */
    public GetAllMoviesByAuthorResponse createGetAllMoviesByAuthorResponse() {
        return new GetAllMoviesByAuthorResponse();
    }

    /**
     * Create an instance of {@link GetMovieById }
     * 
     */
    public GetMovieById createGetMovieById() {
        return new GetMovieById();
    }

    /**
     * Create an instance of {@link GetMovieByIdResponse }
     * 
     */
    public GetMovieByIdResponse createGetMovieByIdResponse() {
        return new GetMovieByIdResponse();
    }

    /**
     * Create an instance of {@link RemoveMovie }
     * 
     */
    public RemoveMovie createRemoveMovie() {
        return new RemoveMovie();
    }

    /**
     * Create an instance of {@link RemoveMovieResponse }
     * 
     */
    public RemoveMovieResponse createRemoveMovieResponse() {
        return new RemoveMovieResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DAOException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DAOException }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.project.knure.com/", name = "DAOException")
    public JAXBElement<DAOException> createDAOException(DAOException value) {
        return new JAXBElement<DAOException>(_DAOException_QNAME, DAOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMovie }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddMovie }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.project.knure.com/", name = "addMovie")
    public JAXBElement<AddMovie> createAddMovie(AddMovie value) {
        return new JAXBElement<AddMovie>(_AddMovie_QNAME, AddMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMovieResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddMovieResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.project.knure.com/", name = "addMovieResponse")
    public JAXBElement<AddMovieResponse> createAddMovieResponse(AddMovieResponse value) {
        return new JAXBElement<AddMovieResponse>(_AddMovieResponse_QNAME, AddMovieResponse.class, null, value);
    }


    @XmlElementDecl(namespace = "http://service.server.project.knure.com/", name = "author")
    public JAXBElement<Movie.Author> createAuthor(Movie.Author value) {
        return new JAXBElement<Movie.Author>(_Author_QNAME, Movie.Author.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeMovieName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeMovieName }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.project.knure.com/", name = "changeMovieName")
    public JAXBElement<ChangeMovieName> createChangeMovieName(ChangeMovieName value) {
        return new JAXBElement<ChangeMovieName>(_ChangeMovieName_QNAME, ChangeMovieName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeMovieNameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeMovieNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.project.knure.com/", name = "changeMovieNameResponse")
    public JAXBElement<ChangeMovieNameResponse> createChangeMovieNameResponse(ChangeMovieNameResponse value) {
        return new JAXBElement<ChangeMovieNameResponse>(_ChangeMovieNameResponse_QNAME, ChangeMovieNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.project.knure.com/", name = "clientToken")
    public JAXBElement<SecurityHeader> createClientToken(SecurityHeader value) {
        return new JAXBElement<SecurityHeader>(_ClientToken_QNAME, SecurityHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMoviesByAuthor }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllMoviesByAuthor }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.project.knure.com/", name = "getAllMoviesByAuthor")
    public JAXBElement<GetAllMoviesByAuthor> createGetAllMoviesByAuthor(GetAllMoviesByAuthor value) {
        return new JAXBElement<GetAllMoviesByAuthor>(_GetAllMoviesByAuthor_QNAME, GetAllMoviesByAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMoviesByAuthorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllMoviesByAuthorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.project.knure.com/", name = "getAllMoviesByAuthorResponse")
    public JAXBElement<GetAllMoviesByAuthorResponse> createGetAllMoviesByAuthorResponse(GetAllMoviesByAuthorResponse value) {
        return new JAXBElement<GetAllMoviesByAuthorResponse>(_GetAllMoviesByAuthorResponse_QNAME, GetAllMoviesByAuthorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovieById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMovieById }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.project.knure.com/", name = "getMovieById")
    public JAXBElement<GetMovieById> createGetMovieById(GetMovieById value) {
        return new JAXBElement<GetMovieById>(_GetMovieById_QNAME, GetMovieById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovieByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMovieByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.project.knure.com/", name = "getMovieByIdResponse")
    public JAXBElement<GetMovieByIdResponse> createGetMovieByIdResponse(GetMovieByIdResponse value) {
        return new JAXBElement<GetMovieByIdResponse>(_GetMovieByIdResponse_QNAME, GetMovieByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.project.knure.com/", name = "id")
    public JAXBElement<Integer> createId(Integer value) {
        return new JAXBElement<Integer>(_Id_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.project.knure.com/", name = "movieID")
    public JAXBElement<Integer> createMovieID(Integer value) {
        return new JAXBElement<Integer>(_MovieID_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveMovie }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveMovie }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.project.knure.com/", name = "removeMovie")
    public JAXBElement<RemoveMovie> createRemoveMovie(RemoveMovie value) {
        return new JAXBElement<RemoveMovie>(_RemoveMovie_QNAME, RemoveMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveMovieResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveMovieResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.project.knure.com/", name = "removeMovieResponse")
    public JAXBElement<RemoveMovieResponse> createRemoveMovieResponse(RemoveMovieResponse value) {
        return new JAXBElement<RemoveMovieResponse>(_RemoveMovieResponse_QNAME, RemoveMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.server.project.knure.com/", name = "serverToken")
    public JAXBElement<String> createServerToken(String value) {
        return new JAXBElement<String>(_ServerToken_QNAME, String.class, null, value);
    }

}
