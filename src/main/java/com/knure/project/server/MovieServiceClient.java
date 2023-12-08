package com.knure.project.server;


import com.filmcatalog.movies.Movie;
import com.knure.project.server.service.*;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.ws.handler.Handler;
import jakarta.xml.ws.handler.HandlerResolver;
import jakarta.xml.ws.handler.PortInfo;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MovieServiceClient {
    private static final String CLIENT_TOKEN = "clientToken";

    static class ClientHandlerResolver implements HandlerResolver {
        @SuppressWarnings("rawtypes")
        @Override
        public List<Handler> getHandlerChain(PortInfo portInfo) {
            List<Handler> list = new ArrayList<>();
            try {
                list.add(new SecurityHandler());
            } catch (JAXBException e) {
                System.err.println(e.getMessage());
            }
            return list;
        }
    }

    public static void main(String[] args) {
        try {

            MovieServiceImplService service = new MovieServiceImplService();

         //   service.setHandlerResolver(new ClientHandlerResolver());

            MovieService port = service.getMovieServiceImplPort();

            SecurityHeader clientToken = Util.createSecurityHeader(CLIENT_TOKEN);
//
//            RemoveMovie parametres = new RemoveMovie();
//
//            RemoveMovieResponse response = port.removeMovie(parametres,2, clientToken,null);
//
//            System.out.println(response.getReturn());

            System.out.println("_________________Get All Movies by Author_______________");

            GetAllMoviesByAuthor parameters = new GetAllMoviesByAuthor();

            Movie.Author author = new Movie.Author();
            author.setName("Kevin");
            author.setSurname("Feige");
            author.setBirthDate(new Date(1973 - 1900, Calendar.JULY, 2));

            GetAllMoviesByAuthorResponse response1 = port.getAllMoviesByAuthor(parameters, author);

            for (GetAllMoviesByAuthorResponse.Return movie : response1.getReturn()) {
                System.out.println("ID: " + movie.toString());
            }

            System.out.println("____________________ADD MOVIE _____________________");
            AddMovie addMovieParameter = new AddMovie();

            Movie.Author addAuthor = new Movie.Author();
            addAuthor.setName("Kevin");
            addAuthor.setSurname("Feige");
            addAuthor.setBirthDate(new Date(1973 - 1900, Calendar.JULY, 2));

            Movie newMovie = new Movie("Avangers 3", new Date(2019 - 1900, Calendar.MAY, 21)
                    , Genre.ACTION, addAuthor);
            addMovieParameter.setMovie(newMovie);
            Movie addMovieResponse = port.addMovie(addMovieParameter.getMovie());
            System.out.println(addMovieResponse);

            System.out.println("_________________CHANGE MOVIE NAME_______________");

            ChangeMovieName changeMovieNameParametres = new ChangeMovieName();
            changeMovieNameParametres.setNewName("Avangers 9999");

            ChangeMovieNameResponse changeMovieNameResponse = port.changeMovieName(changeMovieNameParametres, 2);
            System.out.println(changeMovieNameResponse.getReturn());


            System.out.println("_________________Get Movie By id_______________");

            GetMovieById getMovieByIdParametres = new GetMovieById();
            GetMovieByIdResponse getMovieByIdResponse = port.getMovieById(getMovieByIdParametres, 1);
            System.out.println(getMovieByIdResponse.getReturn());

            System.out.println("_________________Remove movie_______________");
            RemoveMovie removeMovieParametres = new RemoveMovie();
            RemoveMovieResponse removeMovieResponse = port.removeMovie(removeMovieParametres, 2, null, null);

            System.out.println(removeMovieResponse.getReturn());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
